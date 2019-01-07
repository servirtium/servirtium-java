/*
        SvHTTP: Service Virtualized HTTP

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
        either expressed or implied, of the SvHTTP project.
*/

package com.paulhammant.svhttp;

import com.mashape.unirest.http.Headers;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;
import com.mashape.unirest.request.body.RawBody;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ServiceInteroperationViaUniRest implements ServiceInteroperation {

    public static class InteractionException extends RuntimeException {
        public InteractionException(Throwable cause) {
            super(cause);
        }
    }

    public ServiceResponse invokeServiceEndpoint(String method, String bodyToReal, String contentTypeToReal, String url, Map<String, String> headersToReal, HeaderManipulator headerManipulator) throws InteractionException {

        com.mashape.unirest.http.Headers realResponseHeaders;
        com.mashape.unirest.http.HttpResponse<InputStream> httpResponse;

        try {
            switch (method) {
                case "GET": {
                    GetRequest get = Unirest.get(url).headers(headersToReal);
                    httpResponse = get.asBinary();

                    realResponseHeaders = httpResponse.getHeaders();

                    List<String> hdrs = getHeaders(headerManipulator, realResponseHeaders);

                    String contentType = httpResponse.getHeaders().get("Content-Type").get(0);

                    Object body = null;

                    InputStream responseBody = httpResponse.getBody();

                    if (contentType.startsWith("text/")) {
                        Scanner scanner = new Scanner(responseBody, StandardCharsets.UTF_8.name());
                        body = scanner.useDelimiter("\\A").next();
                    } else {
                        try {
                            byte[] targetArray = new byte[responseBody.available()];
                            responseBody.read(targetArray);
                            body = targetArray;
                        } catch (IOException e) {
                            throw new UnsupportedOperationException(e);
                        }
                    }

                    return new ServiceResponse(body,
                            realResponseHeaders.get("Content-Type").get(0),
                            httpResponse.getStatus(),
                            hdrs.toArray(new String[0]));
                }
                default: {

                    Unirest.clearDefaultHeaders();
                    RawBody body1 = Unirest.post(url).headers(headersToReal).body(bodyToReal.getBytes());
                    httpResponse = body1.asObject(InputStream.class);

                    realResponseHeaders = httpResponse.getHeaders();

                    List<String> hdrs = getHeaders(headerManipulator, realResponseHeaders);

                    return new ServiceResponse(null,
                            realResponseHeaders.get("Content-Type").get(0),
                            httpResponse.getStatus(),
                            hdrs.toArray(new String[0]));
                }
            }
        } catch (UnirestException e) {
            e.printStackTrace();
            throw new InteractionException(e);
        }

    }

    private List<String> getHeaders(HeaderManipulator headerManipulator, Headers realResponseHeaders) {
        List<String> hdrs = new ArrayList<>();
        realResponseHeaders.forEach((k, v) -> {
            for (String s : v) {
                hdrs.add(k + ": " + headerManipulator.headerReplacement(k, s));
            }
        });
        return hdrs;
    }
}
