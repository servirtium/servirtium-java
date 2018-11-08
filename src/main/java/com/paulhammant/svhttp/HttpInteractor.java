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

import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class HttpInteractor {

    OkHttpClient okHttpClient = new OkHttpClient();
    private String contentTypeIfNotGet;

    public HttpInteractor(String contentTypeIfNotGet) {
        this.contentTypeIfNotGet = contentTypeIfNotGet;
    }

    public HttpResponse invokeOnRealAndRecordResult(String method, String bodyToReal, String url, Map<String, String> headersToReal, HeaderManipulator headerManipulator) throws IOException {
        RequestBody nonGetBody = null;
        if (!method.equals("GET")) {
            nonGetBody = RequestBody.create(MediaType.parse(contentTypeIfNotGet), bodyToReal);
        }

        Response response = null;
        try {
            response = okHttpClient.newCall(new okhttp3.Request.Builder()
                    .url(url)
                    .method(method, nonGetBody)
                    .headers(Headers.of(headersToReal))
                    .build()).execute();
        } catch (IOException e) {
            System.err.println("HttpInteractor.invokeOnRealAndRecordResult() Failed delegate to " + url);
            throw e;
        }

        ResponseBody body = response.body();
        String responseBody = body.string();
        String contentType = response.header("Content-Type");
        int statusCode = response.code();
        String[] responseHeaders = response.headers().toString().split("\n");
        ArrayList<String> responseHeaders2 = new ArrayList<>();
        for (String hdrLine : responseHeaders) {
            int ix = hdrLine.indexOf(": ");
            String hdrKey = hdrLine.substring(0, ix);
            String hdrVal = hdrLine.substring(ix + 2);
            responseHeaders2.add(hdrKey + ": " + headerManipulator.headerReplacement(hdrKey, hdrVal));
        }

        return new HttpResponse(responseBody, contentType, statusCode, responseHeaders2.toArray(new String[responseHeaders.length]));
    }
}
