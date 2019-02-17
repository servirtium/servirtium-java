package com.paulhammant.servirtium.undertow;

import com.paulhammant.servirtium.InteractionManipulations;
import com.paulhammant.servirtium.Interactor;
import com.paulhammant.servirtium.ServerMonitor;
import com.paulhammant.servirtium.ServiceResponse;
import com.paulhammant.servirtium.ServirtiumServer;
import io.undertow.Undertow;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.server.handlers.BlockingHandler;
import io.undertow.util.HeaderMap;
import io.undertow.util.HeaderValues;
import io.undertow.util.Headers;
import io.undertow.util.HttpString;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static com.paulhammant.servirtium.JsonAndXmlUtilities.prettifyDocOrNot;

public class UndertowServirtiumServer extends ServirtiumServer {

    Undertow undertowServer;
    private Interactor interactor;
    private int interactionNum = -1;
    boolean failed = false;

    private UndertowServirtiumServer() {
    }

    public UndertowServirtiumServer(ServerMonitor monitor, int port, boolean ssl,
                                    InteractionManipulations interactionManipulations,
                                    Interactor interactor) {
        this.interactor = interactor;

        undertowServer = Undertow.builder()
                .addHttpListener(port, "localhost")
                .setHandler(new BlockingHandler(new HttpHandler() {
                    public void handleRequest(HttpServerExchange exchange)
                            throws Exception {

                        interactionNum++;

                        String method = exchange.getRequestMethod().toString();

                        final String url = (exchange.getRequestURL().startsWith("http://") || exchange.getRequestURL().startsWith("https://"))
                                ? exchange.getRequestURL()
                                : "http://" + exchange.getHostAndPort() + exchange.getRequestURI();

                        //String bodyToReal = "";
                        List<String> headersToReal = new ArrayList<>();

                        try {

                            if (method.equals("CONNECT")) {
                                exchange.getResponseSender().send("Servirtium does not support CONNECT yet");
                                exchange.getResponseHeaders().add(Headers.CONTENT_TYPE, "text/plain");
                                exchange.setStatusCode(500);
                                return;
                            }

                            Interactor.Interaction interaction = interactor.newInteraction(method, exchange.getRequestURI(), interactionNum, url, getContext());

                            monitor.interactionStarted(interactionNum, interaction);

                            final HeaderValues headerValues = exchange.getRequestHeaders().get(Headers.CONTENT_TYPE_STRING);
                            String contentType;
                            if (headerValues == null) {
                                contentType = "";
                            } else {
                                contentType = headerValues.getFirst();
                                ;

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

                            final String requestUrl = prepareHeadersAndBodyForReal(exchange, method, url, headersToReal, interaction, contentType, interactionManipulations);

                            // INTERACTION
                            ServiceResponse realResponse = interactor.getServiceResponseForRequest(method, requestUrl, headersToReal, interaction);

                            realResponse = processHeadersAndBodyBackFromReal(interaction, realResponse, interactionManipulations);

                            interactor.addInteraction(interaction);

                            exchange.setStatusCode(realResponse.statusCode);

                            for (String header : realResponse.headers) {
                                int ix = header.indexOf(": ");
                                String hdrKey = header.substring(0, ix);
                                String hdrVal = header.substring(ix + 2);
                                exchange.getResponseHeaders().add(new HttpString(hdrKey), hdrVal);
                            }

                            if (realResponse.contentType != null) {
                                exchange.getResponseHeaders().add(Headers.CONTENT_TYPE, realResponse.contentType);
                            }

                            if (realResponse.body instanceof String) {
                                exchange.getResponseSender().send((String) realResponse.body);
                            } else {
                                exchange.getOutputStream().write((byte[]) realResponse.body);
                            }

                            monitor.interactionFinished(interactionNum, method, url, getContext());
                        } catch (AssertionError assertionError) {
                            failed = true;
                            exchange.setStatusCode(500);
                            exchange.getResponseHeaders().add(Headers.CONTENT_TYPE, "text/plain");
                            exchange.getResponseSender().send("Servirtium Server AssertionError: " + assertionError.getMessage());
                            monitor.interactionFailed(interactionNum, method, url, assertionError, getContext());
                        } catch (Throwable throwable) {
                            failed = true;
                            exchange.setStatusCode(500);
                            exchange.getResponseHeaders().add(Headers.CONTENT_TYPE, "text/plain");
                            exchange.getResponseSender().send("Servirtium Server unexpected Throwable: " + throwable.getMessage());
                            monitor.unexpectedRequestError(throwable, getContext());
                            throw throwable; // stick your debugger here
                        } finally {
                        }
                    }
                })).build();

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

        interaction.recordResponseHeaders(realResponse.headers);

        interaction.recordResponseBody(realResponse.body, realResponse.statusCode, realResponse.contentType);
        return realResponse;
    }

    private String prepareHeadersAndBodyForReal(HttpServerExchange exchange, String method, String url, List<String> headersToReal, Interactor.Interaction interaction, String contentType, InteractionManipulations interactionManipulations) throws IOException {

        final HeaderMap requestHeaders = exchange.getRequestHeaders();
        Iterator<HttpString> hdrs = requestHeaders.getHeaderNames().iterator();

        exchange.startBlocking();
        InputStream is = exchange.getInputStream();

        Object bodyToReal = null;

        if (is.available() > 0) {

            if (isText(contentType)) {
                bodyToReal = null;
                String characterEncoding = exchange.getRequestCharset();
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
                ;
            }
        }

        while (hdrs.hasNext()) {
            String hdr = hdrs.next().toString();
            String hdrVal = requestHeaders.getFirst(hdr);
            hdrVal = interactionManipulations.headerReplacement(hdr, hdrVal);
            headersToReal.add(hdr + ": " + hdrVal);
            interactionManipulations.changeSingleHeaderForRequestToReal(method, hdr, headersToReal);
        }

        interactionManipulations.changeAllHeadersForRequestToReal(headersToReal);

        interaction.recordRequestHeaders(headersToReal);

        if (bodyToReal instanceof String) {
            bodyToReal = interactionManipulations.changeBodyForRequestToReal((String) bodyToReal);
        }

        if (bodyToReal == null) {
            bodyToReal = "";
        }

        interaction.recordRequestBody(bodyToReal, contentType);

        return interactionManipulations.changeUrlForRequestToReal(url);
    }

    public ServirtiumServer start() throws Exception {
        undertowServer.start();
        return this;
    }

    protected int getInteractionNum() {
        return interactionNum;
    }

    protected void resetInteractionNumber() {
        interactionNum = -1;
    }

    public void stop() {
        try {
            interactor.finishedScript(getInteractionNum(), failed); // just in case
        } finally {
            undertowServer.stop();
        }
    }

    public void finishedScript() {
        interactor.finishedScript(getInteractionNum(), failed);
    }


}
