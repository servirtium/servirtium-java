package com.paulhammant.servirtium;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.paulhammant.servirtium.IsJsonEqual.prettifyJson;
import static org.hamcrest.MatcherAssert.assertThat;

public class ServirtiumServer {

    private InteractionManipulations interactionManipulations;
    private Server jettyServer;
    private InteractionsDelegate interactionsDelegate;
    private int interactionNum = -1;
    private boolean pretty = false;

    private ServirtiumServer() {
    }

    public ServirtiumServer(ServerMonitor monitor, int port, boolean ssl,
                            InteractionManipulations interactionManipulations,
                            InteractionsDelegate interactionsDelegate) {
        this.interactionManipulations = interactionManipulations;
        this.interactionsDelegate = interactionsDelegate;

        jettyServer = new Server(port);
        // How the f*** do you turn off Embedded Jetty's logging???
        // Everything I tried (mostly static operations on Log) didn't work.

        jettyServer.setHandler(new AbstractHandler() {

            @Override
            public void handle(String target, org.eclipse.jetty.server.Request baseRequest,
                               HttpServletRequest request,
                               HttpServletResponse response)
                    throws IOException, ServletException {

                interactionNum++;

                String method = request.getMethod();
                final String url = (request.getRequestURL().toString().startsWith("http://") || request.getRequestURL().toString().startsWith("https://"))
                        ? request.getRequestURL().toString()
                        : "http://" + request.getRemoteHost() + ":" + request.getRemotePort() + request.getRequestURI();

                String bodyToReal = "";
                Map<String, String> headersToReal = new HashMap<>();

                monitor.interactionStarted(interactionNum, method, url);

                try {

                    InteractionsDelegate.Context context = interactionsDelegate.newInteraction(method, request.getRequestURI().toString(), interactionNum);
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
                            if (pretty) {
                                bodyToReal = prettifyJson(bodyToReal);
                            }
                        } else {
                            byte[] targetArray = new byte[is.available()];
                            is.read(targetArray);
                            bodyToReal = "//SERVIRTIUM+Base64: " + Base64.getEncoder().encodeToString(targetArray)
                                    .replaceAll("(.{60})", "$1\n");
                            ;
                        }
                    }

                    while (hdrs.hasMoreElements()) {
                        String hdr = hdrs.nextElement();
                        String hdrVal = request.getHeader(hdr);
                        hdrVal = interactionManipulations.headerReplacement(hdr, hdrVal);
                        headersToReal.put(hdr, hdrVal);
                        interactionManipulations.changeSingleHeaderForRequestToReal(method, hdr, headersToReal);
                    }

                    interactionManipulations.changeAllHeadersForRequestToReal(headersToReal);

                    context.recordRequestHeaders(headersToReal);

                    bodyToReal = interactionManipulations.changeBodyForRequestToReal(bodyToReal);
                    interactionsDelegate.recordRequestBody(bodyToReal, contentType, context);

                    final String requestUrl = interactionManipulations.changeUrlForRequestToReal(url);

                    // INTERACTION
                    ServiceResponse realResponse = interactionsDelegate.getServiceResponseForRequest(method, requestUrl,
                            headersToReal, context);

                    ArrayList<String > newHeaders = new ArrayList<>();
                    for (int i = 0; i < realResponse.headers.length; i++) {
                        String headerBackFromReal = realResponse.headers[i];
                        String potentiallyChangedHeader = interactionManipulations.changeSingleHeaderReturnedBackFromReal(i, headerBackFromReal);
                        if (potentiallyChangedHeader != null) {
                            newHeaders.add(potentiallyChangedHeader);
                        }
                    }
                    interactionManipulations.changeAllHeadersReturnedBackFromReal(newHeaders);

                    // recreate response
                    response.setStatus(realResponse.statusCode);

                    if (realResponse.body instanceof String) {
                        if (pretty) {
                            String body = prettifyJson((String) realResponse.body);
                            if (!body.equals(realResponse.body)) {
//                                realResponse.headers
                                realResponse = realResponse.withRevisedBody(body);
                                ArrayList<String> tmp = new ArrayList<>();
                                for (String header : newHeaders) {
                                    if (header.startsWith("Content-Length")) {
                                        tmp.add("Content-Length: " + body.length());
                                    } else {
                                        tmp.add(header);
                                    }
                                }
                                newHeaders = tmp;

                            }

                        }
                    }

                    realResponse = realResponse.withRevisedHeaders(newHeaders.toArray(new String[0]));

                    for (String header : newHeaders) {
                        int ix = header.indexOf(": ");
                        String hdrKey = header.substring(0, ix);
                        String hdrVal = header.substring(ix + 2);
                        response.setHeader(hdrKey, hdrVal);
                    }

                    interactionsDelegate.recordResponseHeaders(context, realResponse.headers);

                    interactionsDelegate.recordResponseBody(context, realResponse.body, realResponse.statusCode, realResponse.contentType);

                    if (realResponse.contentType != null) {
                        response.setContentType(realResponse.contentType);
                        if (realResponse.body instanceof String) {
                            response.getWriter().write((String) realResponse.body);
                        } else {
                            response.getOutputStream().write((byte[]) realResponse.body);
                        }
                    }

                    monitor.interactionFinished(interactionNum, method, url);
                } catch (Throwable throwable) {
                    monitor.unexpectedRequestError(throwable);
                    throw throwable; // stick your debugger here
                } finally {
                    // Inform jetty that this request has now been handled
                    baseRequest.setHandled(true);
                }
            }
        });
    }

    public ServirtiumServer withPrettyPrintedTextBodies() {
        pretty = true;
        return this;
    }

    public static boolean isText(String contentType) {
        return contentType.startsWith("text/") ||
                contentType.startsWith("image/svg") ||
                contentType.startsWith("multipart/form-data") ||
                contentType.startsWith("application/json") ||
                (contentType.startsWith("application/") && contentType.contains("script")) ||
                contentType.startsWith("application/xhtml+xml");
    }

    public ServirtiumServer startApp() throws Exception {
        jettyServer.start();
        return this;
    }

    protected int getInteractionNum() {
        return interactionNum;
    }

    protected void resetInteractionNumber() {
        interactionNum = -1;
    }

    public void stop() {
        interactionsDelegate.finishedScript(getInteractionNum()); // just in case
        try {
            jettyServer.setStopTimeout(1);
            jettyServer.stop();
            System.out.println("STOPPED? Jetty State: " + jettyServer.getState());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String classAndTestName() {
        return classAndTestName(0);
    }

    public static String classAndTestName(int numRemovedFromCaller) {
        StackTraceElement[] stes = Thread.currentThread().getStackTrace();
        int ix = 0;
        for (int j = 0; j < stes.length; j++) {
            StackTraceElement ste = stes[j];
            if (!ste.getClassName().startsWith("sun.")
                    && !ste.getClassName().startsWith("java")
                    && !ste.getMethodName().equals("classAndTestName")) {
                if (ix++ == numRemovedFromCaller) {
                    return ste.getClassName() + "." + ste.getMethodName();
                }
            }
        }
        throw new UnsupportedOperationException("could net get method name");
    }

    public void finishedScript() {
        interactionsDelegate.finishedScript(getInteractionNum());
    }

    public static class NullObject extends ServirtiumServer {
        @Override
        public ServirtiumServer withPrettyPrintedTextBodies() {
            return this;
        }

        @Override
        public ServirtiumServer startApp() {
            return this;
        }

        @Override
        protected int getInteractionNum() {
            return -1;
        }

        @Override
        protected void resetInteractionNumber() {
        }

        @Override
        public void stop() {
        }

        @Override
        public void finishedScript() {
        }
    }

}
