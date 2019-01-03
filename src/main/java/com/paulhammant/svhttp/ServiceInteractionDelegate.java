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

import org.jooby.Jooby;
import org.jooby.Mutant;
import org.jooby.Request;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public abstract class ServiceInteractionDelegate extends Jooby {

    protected final HeaderManipulator headerManipulator;

    private boolean appStarted;
    private boolean appStopped;

    public ServiceInteractionDelegate(int port, boolean ssl, HeaderManipulator headerManipulator) {
        this.headerManipulator = headerManipulator;

        onStarted(() -> {
            appStarted = true;
        });

        onStop(() -> {
            appStopped = true;
        });

        if (ssl) {
            port(23456);
            securePort(port);
        } else {
            port(port);
        }

        use("*", "*", (req, rsp, chain) -> {

            String method = req.method();
            String bodyToReal = "";
            Map<String, String> headersToReal = new HashMap<>();

            try {

                newMethod(req, method);
                String contentType = req.type().toString();

                Map<String, Mutant> headers = req.headers();
                try {
                    if (contentType.equals("application/octet-stream")) {
                        bodyToReal = "//svHttp+Base64: " + Base64.getEncoder().encodeToString(req.body(byte[].class))
                                .replaceAll("(.{60})", "$1\n");;
                    } else {
                        bodyToReal = req.body().value();
                    }
                } catch (org.jooby.Err e) {
                    // ignore - works fine
                }

                for (String hdrKey : headers.keySet()) {
                    String hdrVal = headers.get(hdrKey).value();
                    hdrVal = headerManipulator.headerReplacement(hdrKey, hdrVal);
                    headersToReal.put(hdrKey, hdrVal);
                    headerManipulator.potentiallyManipulateHeaders(method, hdrKey, headersToReal);
                }

                headersReceived(headers);

                bodyReceived(bodyToReal, contentType);

                ServiceResponse realResponse = getRealResponse(method,
                        headerManipulator.changeToRealURL("http://" + req.hostname() + ":" + req.port() + req.rawPath()),
                        headersToReal);

                for (int i = 0; i < realResponse.headers.length; i++) {
                    String headerBackFromReal = realResponse.headers[i];
                    headerBackFromReal = headerManipulator.changeHeaderBackFromReal(i, headerBackFromReal);
                    int ix = headerBackFromReal.indexOf(": ");
                    String hdrKey = headerBackFromReal.substring(0, ix);
                    String hdrVal = headerBackFromReal.substring(ix + 2);
                    hdrVal = headerManipulator.headerReplacement(hdrKey, hdrVal);
                    rsp.header(hdrKey, hdrVal);
                }

                rsp.status(realResponse.statusCode);

                if (realResponse.contentType != null) {
                    rsp.type(realResponse.contentType);
                    rsp.send(realResponse.body);
                }

                headersToReturn(realResponse);

                bodyToReturn(realResponse);

            } catch (Throwable throwable) {
                throw throwable; // stick your debugger here
            }
        });



    }

    public ServiceInteractionDelegate startApp() {
        this.start("server.join=false");
        int ctr = 0;
        while (!this.appStarted && ctr < 300) {
            try {
                Thread.sleep(15);
                ctr++;
            } catch (InterruptedException e) {
            }
        }
        return this;
    }

    public abstract void finished();

    protected abstract ServiceResponse getRealResponse(String method,
                                                       String url, Map<String, String> headersToReal) throws IOException;

    protected abstract void bodyToReturn(ServiceResponse rv) ;

    protected abstract void headersToReturn(ServiceResponse rv);

    protected abstract void bodyReceived(String bodyToReal, String contentType);

    protected abstract void headersReceived(Map<String, Mutant> headers);

    protected abstract void newMethod(Request req, String method);

}
