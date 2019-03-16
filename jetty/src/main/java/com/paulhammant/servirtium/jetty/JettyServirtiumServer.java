package com.paulhammant.servirtium.jetty;

import com.paulhammant.servirtium.InteractionManipulations;
import com.paulhammant.servirtium.Interactor;
import com.paulhammant.servirtium.ServiceMonitor;
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
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Scanner;

import static com.paulhammant.servirtium.JsonAndXmlUtilities.prettifyDocOrNot;

public class JettyServirtiumServer extends ServirtiumServer {

    private Server jettyServer;
    boolean failed = false;

    public JettyServirtiumServer(ServiceMonitor monitor, int port,
                                 InteractionManipulations interactionManipulations,
                                 Interactor interactor) {
        super(interactionManipulations, interactor);

        jettyServer = new Server(port);
        // How the f*** do you turn off Embedded Jetty's logging???
        // Everything I tried (mostly static operations on Log) didn't work.

        jettyServer.setHandler(new AbstractHandler() {

            @Override
            public void handle(String target, org.eclipse.jetty.server.Request baseRequest,
                               HttpServletRequest request, HttpServletResponse response) throws IOException {
                handleExchange(baseRequest, request, response, monitor);
            }
        });
    }

    private void handleExchange(Request baseRequest, HttpServletRequest request, HttpServletResponse response,
                                ServiceMonitor monitor) throws IOException {

        bumpInteractionNum();

        String method = request.getMethod();

        String url = request.getRequestURL().toString();
        final String uri = request.getRequestURI();

        url = (url.startsWith("http://") || url.startsWith("https://"))
                ? url : "http://" + request.getRemoteHost() + ":" + request.getRemotePort() + uri;

//        List<String> clientRequestHeaders = new ArrayList<>();

        try {

            if (method.equals("CONNECT")) {
                response.getWriter().write("Servirtium does not support CONNECT yet");
                response.setContentType("text/plain");
                response.setStatus(500);
                return;
            }

            Interactor.Interaction interaction = interactor.newInteraction(method, uri, getInteractionNum(), url, getContext());

            monitor.interactionStarted(getInteractionNum(), interaction);

            String clientRequestContentType = request.getContentType();
            if (clientRequestContentType == null) {
                clientRequestContentType = "";
            }

//                    if (isText(contentType)) {
//                        BufferedReader reader = baseRequest.getReader();
//                        clientRequestBody = reader.lines().collect(Collectors.joining("\n"));
//                    } else {
//                        ServletInputStream is = baseRequest.getInputStream();
//                        clientRequestBody = new byte[is.available()];
//
//                    }
//

            final UrlAndHeaders urlAndHeaders = prepareHeadersAndBodyForService(request, method, url,
                    interaction, clientRequestContentType, interactionManipulations);

            // INTERACTION
            ServiceResponse serverResponse = interactor.getServiceResponseForRequest(method, urlAndHeaders.url, urlAndHeaders.clientRequestHeaders,
                    interaction, getLowerCaseHeaders());

            serverResponse = processHeadersAndBodyBackFromService(interaction, serverResponse);

            interactor.addInteraction(interaction);

            response.setStatus(serverResponse.statusCode);

            for (String header : serverResponse.headers) {
                int ix = header.indexOf(": ");
                String hdrKey = header.substring(0, ix);
                String hdrVal = header.substring(ix + 2);
                response.setHeader(hdrKey, hdrVal);
            }

            if (serverResponse.contentType != null) {
                response.setContentType(serverResponse.contentType);
            }

            if (serverResponse.body instanceof String) {
                response.getWriter().write((String) serverResponse.body);
            } else {
                response.getOutputStream().write((byte[]) serverResponse.body);
            }

            monitor.interactionFinished(getInteractionNum(), method, url, getContext());
        } catch (AssertionError assertionError) {
            failed = true;
            response.setStatus(500);
            response.setContentType("text/plain");
            response.getWriter().write("JettyServirtiumServer AssertionError: " + assertionError.getMessage());
            monitor.interactionFailed(getInteractionNum(), method, url, assertionError, getContext());
        } catch (Throwable throwable) {
            failed = true;
            response.setStatus(500);
            response.setContentType("text/plain");
            response.getWriter().write("JettyServirtiumServer unexpected Throwable: " + throwable.getMessage());
            monitor.unexpectedRequestError(throwable, getContext());
            throw throwable; // stick your debugger here
        } finally {
            // Inform jetty that this request has now been handled
            baseRequest.setHandled(true);
        }
    }

    private ServiceResponse processHeadersAndBodyBackFromService(Interactor.Interaction interaction,
                                                                 ServiceResponse serviceResponse) {

        interaction.debugRawServiceResponse(serviceResponse.headers, serviceResponse.body, serviceResponse.statusCode,
                serviceResponse.contentType);

        List<String> newHeaders = new ArrayList<>();
        Collections.addAll(newHeaders, serviceResponse.headers);

        // Change of headers back from service

        ArrayList<String> newHeadersTmp = new ArrayList<>();
        for (int i = 0; i < newHeaders.size(); i++) {
            String headerBackFromService = newHeaders.get(i);
            String potentiallyChangedHeader = interactionManipulations.changeSingleHeaderReturnedBackFromService(i, headerBackFromService);
            if (potentiallyChangedHeader != null) {
                newHeadersTmp.add(potentiallyChangedHeader);
            }
        }

        newHeaders = newHeadersTmp;

        interactionManipulations.changeAnyHeadersReturnedBackFromService(newHeaders);

        if (serviceResponse.body instanceof String) {
            serviceResponse = serviceResponse.withRevisedBody(
                    interactionManipulations.changeBodyReturnedBackFromServiceForRecording((String) serviceResponse.body));
            // recreate response

            if (shouldHavePrettyPrintedTextBodies()) {
                String body = prettifyDocOrNot((String) serviceResponse.body);
                if (!body.equals(serviceResponse.body)) {
//                                realResponse.headers
                    serviceResponse = serviceResponse.withRevisedBody(body);
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

        serviceResponse = serviceResponse.withRevisedHeaders(newHeaders.toArray(new String[0]));

        interaction.noteServiceResponse(serviceResponse.headers, serviceResponse.body, serviceResponse.statusCode,
                serviceResponse.contentType);

        if (serviceResponse.body instanceof String) {
            serviceResponse = serviceResponse.withRevisedBody(
                    interactionManipulations.changeServiceResponseBodyForClientPostRecording((String) serviceResponse.body));
        }

        return serviceResponse;
    }

    private class UrlAndHeaders {
        String url;
        List<String> clientRequestHeaders;

        public UrlAndHeaders(String url, List<String> clientRequestHeaders) {
            this.url = url;
            this.clientRequestHeaders = clientRequestHeaders;
        }
    }

    private UrlAndHeaders prepareHeadersAndBodyForService(HttpServletRequest request, String method, String url,
                                                   Interactor.Interaction interaction,
                                                   String clientRequestContentType,
                                                   InteractionManipulations interactionManipulations) throws IOException {
        Enumeration<String> hdrs = request.getHeaderNames();

        ServletInputStream is = request.getInputStream();

        Object clientRequestBody = null;

        if (is.available() > 0) {

            if (isText(clientRequestContentType)) {
                clientRequestBody = null;
                String characterEncoding = request.getCharacterEncoding();
                if (characterEncoding == null) {
                    characterEncoding = "utf-8";
                }
                try (Scanner scanner = new Scanner(is, characterEncoding)) {
                    clientRequestBody = scanner.useDelimiter("\\A").next();
                }
                if (shouldHavePrettyPrintedTextBodies() && clientRequestBody != null) {
                    clientRequestBody = prettifyDocOrNot((String) clientRequestBody);
                }
            } else {
                byte[] targetArray = new byte[is.available()];
                is.read(targetArray);
                clientRequestBody = targetArray;
            }
        }

        List<String> clientRequestHeaders = new ArrayList<>();
         while (hdrs.hasMoreElements()) {
            String hdrName = hdrs.nextElement();
            Enumeration<String> hdrVals = request.getHeaders(hdrName);
            while (hdrVals.hasMoreElements()) {
                String s = hdrVals.nextElement();
                clientRequestHeaders.add(hdrName + ": " + s);
            }
        }

        List<String> clientRequestHeaders2 = interaction.noteClientRequestHeadersAndBody(interactionManipulations, clientRequestHeaders, clientRequestBody, clientRequestContentType, method, getLowerCaseHeaders());

        return new UrlAndHeaders(interactionManipulations.changeUrlForRequestToService(url), clientRequestHeaders2);
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
