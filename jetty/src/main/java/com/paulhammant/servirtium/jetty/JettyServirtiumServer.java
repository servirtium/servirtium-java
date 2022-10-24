package com.paulhammant.servirtium.jetty;

import com.paulhammant.servirtium.InteractionManipulations;
import com.paulhammant.servirtium.InteractionMonitor;
import com.paulhammant.servirtium.ServiceMonitor;
import com.paulhammant.servirtium.ServiceResponse;
import com.paulhammant.servirtium.ServirtiumServer;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.eclipse.jetty.util.log.Logger;

import jakarta.servlet.ServletInputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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
                                 InteractionMonitor interactionMonitor) {
        super(interactionManipulations, interactionMonitor);

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
        String uri = request.getRequestURI();

        String qs = request.getQueryString();
        if (qs != null) {
            uri = uri + "?" + qs;
            url = url + "?" + qs;
        }

        if (uri.contains("://")) {
            uri = uri.substring(uri.indexOf("/", 8));
        }

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

            InteractionMonitor.Interaction interaction = interactionMonitor.newInteraction(getInteractionNum(), getContext(), method, uri, url);

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
            ServiceResponse serviceResponse = interactionMonitor.getServiceResponseForRequest(method, urlAndHeaders.url,
                    interaction, useLowerCaseHeaders());

            serviceResponse = processHeadersAndBodyBackFromRealService(interaction, serviceResponse);

            interaction.complete();

            response.setStatus(serviceResponse.statusCode);

            for (String header : serviceResponse.headers) {
                int ix = header.indexOf(": ");
                String hdrKey = header.substring(0, ix);
                String hdrVal = header.substring(ix + 2);
                if (!header.contains("Content-Length")) {
                    response.setHeader(hdrKey, hdrVal);
                }
            }

            if (serviceResponse.contentType != null) {
                response.setContentType(serviceResponse.contentType);
            }

            if (serviceResponse.body instanceof String) {
                response.getWriter().write((String) serviceResponse.body);
            } else {
                response.getOutputStream().write((byte[]) serviceResponse.body);
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

    private ServiceResponse processHeadersAndBodyBackFromRealService(InteractionMonitor.Interaction interaction, ServiceResponse serviceResponse) {

        interaction.debugOriginalServiceResponseHeaders(serviceResponse.headers);

        ServiceResponse originalResponse = serviceResponse;

        List<String> newHeaders = new ArrayList<>();
        Collections.addAll(newHeaders, serviceResponse.headers);

        // Change of headers back from service

        ArrayList<String> newHeadersTmp = new ArrayList<>();
        for (int i = 0; i < newHeaders.size(); i++) {
            String headerBackFromService = newHeaders.get(i);
            String potentiallyChangedHeader = interactionManipulations.changeSingleHeaderReturnedBackFromRealServiceForRecording(i, headerBackFromService);
            if (potentiallyChangedHeader != null) {
                newHeadersTmp.add(potentiallyChangedHeader);
            }
        }

        newHeaders = newHeadersTmp;

        interactionManipulations.changeAnyHeadersReturnedBackFromRealServiceForRecording(newHeaders);

        if (serviceResponse.body instanceof String) {
            serviceResponse = serviceResponse.withRevisedBody(
                    interactionManipulations.changeBodyReturnedBackFromRealServiceForRecording((String) serviceResponse.body));
            // recreate response

            if (shouldHavePrettyPrintedTextBodies()) {
                String body = prettifyDocOrNot((String) serviceResponse.body);
                if (!body.equals(serviceResponse.body)) {
//                                realResponse.headers
                    serviceResponse = serviceResponse.withRevisedBody(body);
                }
            }
        }

        serviceResponse = serviceResponse.withRevisedHeaders(newHeaders.toArray(new String[0]));

        interaction.noteServiceResponseHeaders(serviceResponse.headers);

        serviceResponse = serviceResponse.withRevisedHeaders(
                interactionManipulations.changeHeadersForClientResponseAfterRecording(serviceResponse.headers));

        interaction.debugClientsServiceResponseHeaders(serviceResponse.headers);

        interaction.debugOriginalServiceResponseBody(originalResponse.body, originalResponse.statusCode, originalResponse.contentType);

        interaction.noteServiceResponseBody(serviceResponse.body, serviceResponse.statusCode, serviceResponse.contentType);


        if (serviceResponse.body instanceof String) {
            final String b = (String) serviceResponse.body;
            serviceResponse = serviceResponse.withRevisedBody(interactionManipulations.changeBodyForClientResponseAfterRecording(b));
        }

        interaction.debugClientsServiceResponseBody(originalResponse.body, originalResponse.statusCode, originalResponse.contentType);

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
                                                   InteractionMonitor.Interaction interaction,
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

        List<String> clientRequestHeaders2 = interaction.noteClientRequestHeadersAndBody(interactionManipulations, clientRequestHeaders, clientRequestBody, clientRequestContentType, method, useLowerCaseHeaders());

        final String chgdURL = interactionManipulations.changeUrlForRequestToRealService(url);

        int ixU = url.indexOf("/", url.indexOf(":") + 3);
        int ixC = chgdURL.indexOf("/", chgdURL.indexOf(":") + 3);

        if (ixU != -1 && ixC != -1 && !url.substring(ixU).equals(chgdURL.substring(ixC))) {
            interaction.noteChangedResourceForRequestToClient(url.substring(ixU), chgdURL.substring(ixC));
        }

        return new UrlAndHeaders(chgdURL, clientRequestHeaders2);
    }

    public ServirtiumServer start() throws Exception {
        jettyServer.start();
        return this;
    }

    public void stop() {
        try {
            interactionMonitor.finishedScript(getInteractionNum(), failed); // just in case
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
        interactionMonitor.finishedScript(getInteractionNum(), failed);
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
