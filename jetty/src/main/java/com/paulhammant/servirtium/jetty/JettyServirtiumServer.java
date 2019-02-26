package com.paulhammant.servirtium.jetty;

import com.paulhammant.servirtium.InteractionManipulations;
import com.paulhammant.servirtium.Interactor;
import com.paulhammant.servirtium.ServerMonitor;
import com.paulhammant.servirtium.ServiceResponse;
import com.paulhammant.servirtium.ServirtiumServer;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.eclipse.jetty.util.log.Logger;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Scanner;

import static com.paulhammant.servirtium.JsonAndXmlUtilities.prettifyDocOrNot;

public class JettyServirtiumServer extends ServirtiumServer {

    private Server jettyServer;
    private Interactor interactor;
    boolean failed = false;

    public JettyServirtiumServer(ServerMonitor monitor, int port, boolean ssl,
                                 InteractionManipulations interactionManipulations,
                                 Interactor interactor) {
        this.interactor = interactor;

        jettyServer = new Server(port);
        // How the f*** do you turn off Embedded Jetty's logging???
        // Everything I tried (mostly static operations on Log) didn't work.

        jettyServer.setHandler(new AbstractHandler() {

            @Override
            public void handle(String target, org.eclipse.jetty.server.Request baseRequest,
                               HttpServletRequest request, HttpServletResponse response) throws IOException {
                handleExchange(baseRequest, request, response, monitor, interactionManipulations);
            }
        });
    }

    int ctr = 0;
    private void handleExchange(Request baseRequest, HttpServletRequest request, HttpServletResponse response, ServerMonitor monitor, InteractionManipulations interactionManipulations) throws IOException {
        bumpInteractionNum();

        String method = request.getMethod();

        String url = request.getRequestURL().toString();
        final String uri = request.getRequestURI();

        url = (url.startsWith("http://") || url.startsWith("https://"))
                ? url : "http://" + request.getRemoteHost() + ":" + request.getRemotePort() + uri;

        //String bodyToReal = "";
        List<String> clientRquestHeaders = new ArrayList<>();

        try {

            if (method.equals("CONNECT")) {
                response.getWriter().write("Servirtium does not support CONNECT yet");
                response.setContentType("text/plain");
                response.setStatus(500);
                return;
            }

            Interactor.Interaction interaction = interactor.newInteraction(method, uri, getInteractionNum(), url, getContext());

            monitor.interactionStarted(getInteractionNum(), interaction);

            String contentType = request.getContentType();
            if (contentType == null) {
                contentType = "";
            }

//                    if (isText(contentType)) {
//                        BufferedReader reader = baseRequest.getReader();
//                        bodyToReal = reader.lines().collect(Collectors.joining("\n"));
//                    } else {
//                        ServletInputStream is = baseRequest.getInputStream();
//                        bodyToReal = new byte[is.available()];
//
//                    }
//

            final String requestUrl = prepareHeadersAndBodyForReal(request, method, url, clientRquestHeaders, interaction, contentType, interactionManipulations);

            // INTERACTION
            ServiceResponse realResponse = interactor.getServiceResponseForRequest(method, requestUrl, clientRquestHeaders, interaction, getLowerCaseHeaders());

            realResponse = processHeadersAndBodyBackFromReal(interaction, realResponse, interactionManipulations);

            interactor.addInteraction(interaction);

            response.setStatus(realResponse.statusCode);

            for (String header : realResponse.headers) {
                int ix = header.indexOf(": ");
                String hdrKey = header.substring(0, ix);
                String hdrVal = header.substring(ix + 2);
                response.setHeader(hdrKey, hdrVal);
            }

            if (realResponse.contentType != null) {
                response.setContentType(realResponse.contentType);
            }

            if (realResponse.body instanceof String) {
                response.getWriter().write((String) realResponse.body);
            } else {
                response.getOutputStream().write((byte[]) realResponse.body);
            }

            monitor.interactionFinished(getInteractionNum(), method, url, getContext());
        } catch (AssertionError assertionError) {
            failed = true;
            response.setStatus(500);
            response.setContentType("text/plain");
            response.getWriter().write("Servirtium Server AssertionError: " + assertionError.getMessage());
            monitor.interactionFailed(getInteractionNum(), method, url, assertionError, getContext());
        } catch (Throwable throwable) {
            failed = true;
            response.setStatus(500);
            response.setContentType("text/plain");
            response.getWriter().write("Servirtium Server unexpected Throwable: " + throwable.getMessage());
            monitor.unexpectedRequestError(throwable, getContext());
            throw throwable; // stick your debugger here
        } finally {
            // Inform jetty that this request has now been handled
            baseRequest.setHandled(true);
        }
    }

    private ServiceResponse processHeadersAndBodyBackFromReal(Interactor.Interaction interaction, ServiceResponse realResponse, InteractionManipulations interactionManipulations) {
        ArrayList<String > newHeaders = new ArrayList<>();
        for (int i = 0; i < realResponse.headers.length; i++) {
            String headerBackFromReal = realResponse.headers[i];
            String potentiallyChangedHeader = interactionManipulations.changeSingleHeaderReturnedBackFromReal(i, headerBackFromReal);
            if (potentiallyChangedHeader != null) {
                newHeaders.add(potentiallyChangedHeader);
            }
        }
        interactionManipulations.changeAllHeadersReturnedBackFromReal(newHeaders);

        if (realResponse.body instanceof String) {
            realResponse = realResponse.withRevisedBody(interactionManipulations.changeBodyReturnedBackFromReal((String) realResponse.body));
            // recreate response

            if (shouldHavePrettyPrintedTextBodies()) {
                String body = prettifyDocOrNot((String) realResponse.body);
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

        interaction.noteResponseHeadersAndBody(realResponse.headers, realResponse.body, realResponse.statusCode, realResponse.contentType);

        return realResponse;
    }

    private String prepareHeadersAndBodyForReal(HttpServletRequest request, String method, String url, List<String> clientRquestHeaders, Interactor.Interaction interaction, String contentType, InteractionManipulations interactionManipulations) throws IOException {
        Enumeration<String> hdrs = request.getHeaderNames();

        ServletInputStream is = request.getInputStream();

        Object bodyToReal = null;

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
                if (shouldHavePrettyPrintedTextBodies() && bodyToReal != null) {
                    bodyToReal = prettifyDocOrNot((String) bodyToReal);
                }
            } else {
                byte[] targetArray = new byte[is.available()];
                is.read(targetArray);
                bodyToReal = targetArray;
            }
        }

        while (hdrs.hasMoreElements()) {
            // TODO - make this cater for multiple lines with the same name
            String hdrName = hdrs.nextElement();
            String hdrVal = request.getHeader(hdrName);
            hdrVal = interactionManipulations.headerReplacement(hdrName, hdrVal);
            final String fullHeader = (getLowerCaseHeaders() ? hdrName.toLowerCase() : hdrName) + ": " + hdrVal;
            clientRquestHeaders.add(fullHeader);
            interactionManipulations.changeSingleHeaderForRequestToReal(method, fullHeader, clientRquestHeaders);
        }

        interactionManipulations.changeAllHeadersForRequestToReal(clientRquestHeaders);

        if (bodyToReal instanceof String) {
            bodyToReal = interactionManipulations.changeBodyForRequestToReal((String) bodyToReal);
        }

        if (bodyToReal == null) {
            bodyToReal = "";
        }

        interaction.noteClientRequestHeadersAndBody(clientRquestHeaders, bodyToReal, contentType);

        return interactionManipulations.changeUrlForRequestToReal(url);
    }

    public ServirtiumServer start() throws Exception {
        jettyServer.start();
        return this;
    }

    public void stop() {
        try {
            interactor.finishedScript(getInteractionNum(), failed); // just in case
        } finally {
            try {
                jettyServer.setStopTimeout(1);
                jettyServer.stop();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void finishedScript() {
        interactor.finishedScript(getInteractionNum(), failed);
    }

    public static void disableJettyLogging() {
        System.setProperty("org.eclipse.jetty.util.log.class", "org.eclipse.jetty.util.log.StdErrLog");
        System.setProperty("org.eclipse.jetty.LEVEL", "OFF");
        org.eclipse.jetty.util.log.Log.setLog(new NoLogging());

    }
    public static class NoLogging implements Logger {
        @Override public String getName() { return "no"; }
        @Override public void warn(String msg, Object... args) { }
        @Override public void warn(Throwable thrown) { }
        @Override public void warn(String msg, Throwable thrown) { }
        @Override public void info(String msg, Object... args) { }
        @Override public void info(Throwable thrown) { }
        @Override public void info(String msg, Throwable thrown) { }
        @Override public boolean isDebugEnabled() { return false; }
        @Override public void setDebugEnabled(boolean enabled) { }
        @Override public void debug(String msg, Object... args) { }
        @Override public void debug(Throwable thrown) { }
        @Override public void debug(String msg, Throwable thrown) { }
        @Override public Logger getLogger(String name) { return this; }
        @Override public void ignore(Throwable ignored) { }
        @Override public void debug(String s, long l) { }
    }

}
