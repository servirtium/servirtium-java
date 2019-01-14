/*
        SvHttp: Service Virtualized HTTP

        Copyright (c) 2018, Paul Hammant
        All rights reserved.

        Redistribution and use in source and binary forms, with or without
        modification, are permitted provided that the following conditions are met:

        1. Redistributions of source code must retain the above copyright notice, this
        list of conditions and the following disclaimer.
        2. Redistributions in binary form must reproduce the above copyright notice,
        this list of conditions and the following disclaimer in the documentation
        and/or other materials provided with the distribution.

        THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
        ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
        WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
        DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
        ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
        (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
        LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
        ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
        (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
        SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

        The views and conclusions contained in the software and documentation are those
        of the authors and should not be interpreted as representing official policies,
        either expressed or implied, of the SvHttp project.
*/

package com.paulhammant.svhttp;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class SvHttpServer {

    private final int port;
    protected final HeaderManipulator headerManipulator;

    private Server jettyServer;
    private int counter = -1;

    public SvHttpServer(ServerMonitor monitor, int port, boolean ssl, HeaderManipulator headerManipulator) {
        this.port = port;
        this.headerManipulator = headerManipulator;

        jettyServer = new Server(port);
        // How the f*** do you turn off Embedded Jetty's logging???
        // Everything I tried (mostly static operations on Log) didn't work.

        jettyServer.setHandler(new AbstractHandler() {

            @Override
            public void handle(String target, org.eclipse.jetty.server.Request baseRequest,
                               HttpServletRequest request,
                               HttpServletResponse response)
                    throws IOException, ServletException {

                counter++;

                String method = request.getMethod();
                final String url = (request.getRequestURL().toString().startsWith("http://") || request.getRequestURL().toString().startsWith("https://"))
                        ? request.getRequestURL().toString()
                        : "http://" + request.getRemoteHost() + ":" + request.getRemotePort() + request.getRequestURI();

                String bodyToReal = "";
                Map<String, String> headersToReal = new HashMap<>();

                monitor.interactionStarted(counter, method, url);

                try {

                    Context ctx = newInteraction(method, request.getRequestURI().toString(), counter);
                    String contentType = request.getContentType();
                    if (contentType == null) {
                        contentType = "";
                    }

                    Enumeration<String> hdrs = request.getHeaderNames();

                    ServletInputStream is = request.getInputStream();

                    if (is.available() > 0) {

                        if (isText(contentType)) {
                            bodyToReal = null;
                            String characterEncoding = request.getCharacterEncoding();
                            if (characterEncoding == null) {
                                characterEncoding = "utf-8";
                            }
                            try (Scanner scanner = new Scanner(is, characterEncoding)) {
                                bodyToReal = scanner.useDelimiter("\\A").next();
                            }
                        } else {
                            byte[] targetArray = new byte[is.available()];
                            is.read(targetArray);
                            bodyToReal = "//svHttp+Base64: " + Base64.getEncoder().encodeToString(targetArray)
                                    .replaceAll("(.{60})", "$1\n");
                            ;
                        }
                    }


                    while (hdrs.hasMoreElements()) {
                        String hdr = hdrs.nextElement();
                        String hdrVal = request.getHeader(hdr);
                        hdrVal = headerManipulator.headerReplacement(hdr, hdrVal);
                        headersToReal.put(hdr, hdrVal);
                        headerManipulator.potentiallyManipulateHeader(method, hdr, headersToReal);
                    }

                    headerManipulator.changeHeadersToSendToReal(headersToReal);

                    requestHeaders(headersToReal, ctx);

                    requestBody(bodyToReal, contentType, ctx);


                    final String requestUrl = headerManipulator.changeUrlForRequestToReal(url);
                    ServiceResponse realResponse = getServiceResponse(method, requestUrl,
                            headersToReal, ctx);


                    ArrayList<String > newHeaders = new ArrayList<>();
                    for (int i = 0; i < realResponse.headers.length; i++) {
                        String headerBackFromReal = realResponse.headers[i];
                        String potentiallyChangedHeader = headerManipulator.changeHeaderBackFromReal(i, headerBackFromReal);
                        if (potentiallyChangedHeader != null) {
                            newHeaders.add(potentiallyChangedHeader);
                        }
                    }
                    headerManipulator.messWithHeadersBackFromReal(newHeaders);
                    for (String header : newHeaders) {
                        int ix = header.indexOf(": ");
                        String hdrKey = header.substring(0, ix);
                        String hdrVal = header.substring(ix + 2);
                        response.setHeader(hdrKey, hdrVal);
                    }

                    ServiceResponse revisedResponse = realResponse.withRevisedHeaders(newHeaders.toArray(new String[0]));

                    response.setStatus(revisedResponse.statusCode);

                    responseHeaders(ctx, revisedResponse.headers);

                    responseBody(ctx, revisedResponse.body, revisedResponse.statusCode, revisedResponse.contentType);

                    if (revisedResponse.contentType != null) {
                        response.setContentType(revisedResponse.contentType);
                        if (revisedResponse.body instanceof String) {
                            response.getWriter().write((String) revisedResponse.body);
                        } else {
                            response.getOutputStream().write((byte[]) revisedResponse.body);
                        }
                    }

                    monitor.interactionFinished(counter, method, url);
                } catch (Throwable throwable) {
                    throw throwable; // stick your debugger here
                }

                // Inform jetty that this request has now been handled
                baseRequest.setHandled(true);
            }
        });
    }

    public static interface ServerMonitor{

        default void interactionFinished(int counter, String method, String url) {}

        default void interactionStarted(int counter, String method, String url){}

        class Default implements ServerMonitor {
        }

        class Console implements ServerMonitor {

            @Override
            public void interactionFinished(int counter, String method, String url) {
                System.out.println(">> SvHttp >> interaction " + counter + " " + method + " " + url + " DONE");
            }

            @Override
            public void interactionStarted(int counter, String method, String url) {
                System.out.println(">> SvHttp >> interaction " + counter + " " + method + " " + url + " STARTED");
            }
        }
    }

    public static boolean isText(String contentType) {
        return contentType.startsWith("text/") ||
                contentType.startsWith("image/svg") ||
                contentType.startsWith("multipart/form-data") ||
                contentType.startsWith("application/json") ||
                (contentType.startsWith("application/") && contentType.contains("script")) ||
                contentType.startsWith("application/xhtml+xml");
    }

    public SvHttpServer startApp() {
        try {
            jettyServer.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    public abstract void finishedMarkdownScript();


    protected int getCounter() {
        return counter;
    }

    protected void resetCounter() {
        counter = -1;
    }

    protected abstract ServiceResponse getServiceResponse(String method, String url,
                                                          Map<String, String> headersToReal, Context ctx) throws IOException;

    protected abstract void responseBody(Context ctx, Object body, int statusCode, String contentType) ;

    protected abstract void responseHeaders(Context ctx, String[] headers);

    protected abstract void requestBody(String bodyToReal, String contentType, Context ctx);

    protected abstract void requestHeaders(Map<String, String> headers, Context ctx);

    protected abstract Context newInteraction(String method, String path, int counter);

    public static class Context {

    }


    public void stop() {
        finishedMarkdownScript(); // just in case
        try {
            final Socket s = new Socket("localhost", port);
            OutputStream opStream = s.getOutputStream();
            s.close();
            // expected
        } catch (IOException e) {
            throw new AssertionError("There should have a socket jettyServer on the port");

        }
        try {
            jettyServer.stop();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        while (true) {
            try {
                final Socket s = new Socket("localhost", port);
                OutputStream opStream = s.getOutputStream();
                s.close();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                return;
            }
        }

    }

}
