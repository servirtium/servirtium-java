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

import static com.paulhammant.svhttp.ServiceInteractionDelegate.isText;

public class OkHttpRealServiceInteractor implements RealServiceInteractor {

    private OkHttpClient okHttpClient = new OkHttpClient();

    @Override
    public ServiceResponse invokeOnRealAndRecordResult(String method, String bodyToReal, String contentTypeToReal, String url, Map<String, String> headersToReal, HeaderManipulator headerManipulator) throws InteractionException {

        RequestBody nonGetBody = null;
        if (!method.equals("GET")) {
            MediaType mediaType = MediaType.parse(contentTypeToReal);
            nonGetBody = RequestBody.create(mediaType, bodyToReal);
        }


        Response response = null;
        try {

            response = okHttpClient.newCall(new okhttp3.Request.Builder()
                    .url(url)
                    .method(method, nonGetBody)
                    .headers(Headers.of(headersToReal))
                    .build()).execute();
            ResponseBody body = response.body();
            Object responseBody = null;
            String contentType;
            final MediaType mediaType = body.contentType();
            if (mediaType == null) {
                contentType = "";
            } else {
                contentType = mediaType.toString();
                if (contentType == null) {
                    contentType = "";
                }
            }
            if (isText(contentType)) {
                responseBody = body.string();
            } else {
                responseBody = body.bytes();
            }
            String responseContentType = response.header("Content-Type");
            int statusCode = response.code();
            String[] responseHeaders = response.headers().toString().split("\n");
            ArrayList<String> responseHeaders2 = new ArrayList<>();
            for (String hdrLine : responseHeaders) {
                int ix = hdrLine.indexOf(": ");
                String hdrKey = hdrLine.substring(0, ix);
                String hdrVal = hdrLine.substring(ix + 2);
                responseHeaders2.add(hdrKey + ": " + headerManipulator.headerReplacement(hdrKey, hdrVal));
            }
            return new ServiceResponse(responseBody, responseContentType, statusCode, responseHeaders2.toArray(new String[responseHeaders.length]));

        } catch (IOException e) {
            throw new InteractionException(e);
        }

    }
}
