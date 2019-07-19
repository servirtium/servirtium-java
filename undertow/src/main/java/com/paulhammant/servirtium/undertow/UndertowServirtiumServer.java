package com.paulhammant.servirtium.undertow;

import com.paulhammant.servirtium.InteractionManipulations;
import com.paulhammant.servirtium.InteractionMonitor;
import com.paulhammant.servirtium.ServiceMonitor;
import com.paulhammant.servirtium.ServiceResponse;
import com.paulhammant.servirtium.ServirtiumServer;
import io.undertow.Undertow;
import io.undertow.server.HttpServerExchange;
import io.undertow.server.handlers.BlockingHandler;
import io.undertow.util.HeaderValues;
import io.undertow.util.Headers;
import io.undertow.util.HttpString;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static com.paulhammant.servirtium.JsonAndXmlUtilities.prettifyDocOrNot;

public class UndertowServirtiumServer extends ServirtiumServer {

    private Undertow undertowServer;
    private boolean failed = false;

    public UndertowServirtiumServer(ServiceMonitor monitor, int port,
                                    InteractionManipulations interactionManipulations, InteractionMonitor interactionMonitor) {
        super(interactionManipulations, interactionMonitor);

        undertowServer = Undertow.builder()
                .addHttpListener(port, "localhost")
                .setHandler(new BlockingHandler(exchange ->
                        UndertowServirtiumServer.this.handleExchange(exchange, monitor)))
                .build();
    }

    private void handleExchange(HttpServerExchange exchange, ServiceMonitor monitor) throws IOException {
        bumpInteractionNum();

        String method = exchange.getRequestMethod().toString();

        String uri = exchange.getRequestURI();
        String url = exchange.getRequestURL();

        String qs = exchange.getQueryString();
        if (!qs.equals("")) {
            uri = uri + "?" + qs;
            url = url + "?" + qs;
        }

        // Fixes for Proxy server case - Jetty and Undertow are different here.
        if (uri.startsWith("https://") || uri.startsWith("http://")) {
            uri = uri.substring(url.indexOf("/",7));
        }

        url = (url.startsWith("http://") || url.startsWith("https://")) ? url : "http://" + exchange.getHostAndPort() + uri;

        //String clientRequestBody = "";
        List<String> clientRequestHeaders = new ArrayList<>();

        try {

            if (method.equals("CONNECT")) {
                exchange.getResponseSender().send("Servirtium does not support CONNECT yet");
                exchange.getResponseHeaders().add(Headers.CONTENT_TYPE, "text/plain");
                exchange.setStatusCode(500);
                return;
            }

            InteractionMonitor.Interaction interaction = interactionMonitor.newInteraction(method, uri, getInteractionNum(), url, getContext());

            monitor.interactionStarted(getInteractionNum(), interaction);

            final HeaderValues headerValues = exchange.getRequestHeaders().get(Headers.CONTENT_TYPE_STRING);
            String clientRequestContentType;
            if (headerValues == null) {
                clientRequestContentType = "";
            } else {
                clientRequestContentType = headerValues.getFirst();
                ;

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

            final String requestUrl = prepareHeadersAndBodyForService(exchange, method, url, clientRequestHeaders,
                    interaction, clientRequestContentType, interactionManipulations);

            // INTERACTION
            ServiceResponse serviceResponse = interactionMonitor.getServiceResponseForRequest(method, requestUrl, clientRequestHeaders,
                    interaction, useLowerCaseHeaders());

            serviceResponse = processHeadersAndBodyBackFromService(interaction, serviceResponse, interactionManipulations);

            interaction.complete();

            exchange.setStatusCode(serviceResponse.statusCode);

            for (String header : serviceResponse.headers) {
                int ix = header.indexOf(": ");
                String hdrKey = header.substring(0, ix);
                String hdrVal = header.substring(ix + 2);
                exchange.getResponseHeaders().add(new HttpString(hdrKey), hdrVal);
            }

            if (serviceResponse.contentType != null) {
                exchange.getResponseHeaders().add(Headers.CONTENT_TYPE, serviceResponse.contentType);
            }

            if (serviceResponse.body instanceof String) {
                exchange.getResponseSender().send((String) serviceResponse.body);
            } else {
                exchange.getOutputStream().write((byte[]) serviceResponse.body);
            }

            monitor.interactionFinished(getInteractionNum(), method, url, getContext());
        } catch (AssertionError assertionError) {
            failed = true;
            exchange.setStatusCode(500);
            exchange.getResponseHeaders().add(Headers.CONTENT_TYPE, "text/plain");
            exchange.getResponseSender().send("UndertowServirtiumServer AssertionError: " + assertionError.getMessage());
            monitor.interactionFailed(getInteractionNum(), method, url, assertionError, getContext());
        } catch (Throwable throwable) {
            failed = true;
            exchange.setStatusCode(500);
            exchange.getResponseHeaders().add(Headers.CONTENT_TYPE, "text/plain");
            exchange.getResponseSender().send("UndertowServirtiumServer unexpected Throwable: " + throwable.getMessage());
            monitor.unexpectedRequestError(throwable, getContext());
            throw throwable; // stick your debugger here
        } finally {
        }
    }

    private ServiceResponse processHeadersAndBodyBackFromService(InteractionMonitor.Interaction interaction,
                                                                 ServiceResponse serviceResponse,
                                                                 InteractionManipulations interactionManipulations) {

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

    private String prepareHeadersAndBodyForService(HttpServerExchange exchange, String method, String url,
                                                   List<String> clientRequestHeaders, InteractionMonitor.Interaction interaction,
                                                   String clientRequestContentType,
                                                   InteractionManipulations interactionManipulations) throws IOException {

        exchange.startBlocking();
        InputStream is = exchange.getInputStream();

        Object clientRequestBody = null;

        if (is.available() > 0) {

            if (isText(clientRequestContentType)) {
                clientRequestBody = null;
                String characterEncoding = exchange.getRequestCharset();
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
                ;
            }
        }

        exchange.getRequestHeaders().forEach(header -> {
            String hdrName = header.getHeaderName().toString();
            header.forEach(hdrVal -> {
                hdrVal = interactionManipulations.headerValueManipulation(hdrName, hdrVal);
                final String newHeader = (useLowerCaseHeaders() ? hdrName.toLowerCase() : hdrName) + ": " + hdrVal;
                clientRequestHeaders.add(newHeader);
                interactionManipulations.changeSingleHeaderForRequestToRealService(newHeader, clientRequestHeaders);
            });
        });


        if (clientRequestBody instanceof String) {
            clientRequestBody = interactionManipulations.changeBodyForRequestToRealService((String) clientRequestBody);
        }

        if (clientRequestBody == null) {
            clientRequestBody = "";
        }

        interaction.noteClientRequestHeadersAndBody(interactionManipulations, clientRequestHeaders, clientRequestBody, clientRequestContentType, method, useLowerCaseHeaders());

        return interactionManipulations.changeUrlForRequestToRealService(url);
    }

    public ServirtiumServer start() throws Exception {
        undertowServer.start();
        return this;
    }

    public void stop() {
        try {
            interactionMonitor.finishedScript(getInteractionNum(), failed); // just in case
        } finally {
            undertowServer.stop();
        }
    }

    public void finishedScript() {
        interactionMonitor.finishedScript(getInteractionNum(), failed);
    }


}
