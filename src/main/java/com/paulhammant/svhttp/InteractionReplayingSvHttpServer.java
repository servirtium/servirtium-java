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

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;

import static java.nio.file.Files.readAllBytes;

public class InteractionReplayingSvHttpServer extends SvHttpServer {

    private String markdownConversation;
    private int ix;
    private String bodyToReal;
    private String contentTypeToReal;
    private String headers;
    private int num = -1;
    private String filename;
    private boolean forgivingOrderOfClientRquestHeaders = false;

    public InteractionReplayingSvHttpServer(int port, boolean ssl, HeaderManipulator headerManipultor) {
        super(port, ssl, headerManipultor);
    }

    public InteractionReplayingSvHttpServer withForgivingOrderOfClientRquestHeaders() {
        forgivingOrderOfClientRquestHeaders = true;
        return this;
    }

    public void setMarkdownScriptFilename(String filename) {
        try {
            setPlaybackConversation(new String(readAllBytes(Paths.get(filename))));
            this.filename = filename;
        } catch (IOException e) {
            throw new UnsupportedOperationException();
        }
    }

    public void setPlaybackConversation(String conversation) {
        this.filename = "n/a";
        ix = 0;
        markdownConversation = conversation;
    }

    @Override
    public void finishedMarkdownScript() {
        if (markdownConversation.length() - ix > 1) {
            throw makeAssertionError("There are more recorded interactions after #" + num + " in " + filename + ", yet calling finishedMarkdownScript() implies there should be no more. Fail!!");
        }
    }

    @Override
    protected ServiceResponse getServiceResponse(String method, String url, Map<String, String> headersToReal) throws IOException {

        int expectedNum = num + 1;
        try {
            final String SVHTTP_INTERACTION = "## Interaction ";
            ix = markdownConversation.indexOf(SVHTTP_INTERACTION + expectedNum + ":", 0);
            if (ix == -1) {
                throw makeAssertionError("Could not find interactions #" + expectedNum + " in file '" + filename + "'");
            }
            int lineEnd = markdownConversation.indexOf("\n", ix);
            String line = markdownConversation.substring(ix + SVHTTP_INTERACTION.length(), lineEnd);
            String[] parts = line.split(" ");
            num = Integer.parseInt(parts[0].replace(":",""));
            String mdMethod = parts[1];
//            if (!method.equals(mdMethod)) {
//                throw makeAssertionError("Method " + num + " (" + mdMethod + ") in " + filename + ": " + url + " expected to be " + method);
//            }

            if (!method.equals(mdMethod)) {
                throw makeAssertionError(methodAndFilePrefix(mdMethod) + ", method from the client that should be sent to real server are not the same as expected: " + method);
            }
            String mdUrl = parts[2];
            if (!url.endsWith(mdUrl)) {
                throw makeAssertionError("Method " + num + " (" + mdMethod + ") in " + filename + ": " + url + " does not end in previously recorded " + mdUrl);
            }

            final String HEADERS_SENT_TO_REAL_SERVER = "### Request headers sent to the real server";
            ix = markdownConversation.indexOf(HEADERS_SENT_TO_REAL_SERVER, ix);
            if (ix == -1) {
                throw makeAssertionError("Expected '" + HEADERS_SENT_TO_REAL_SERVER + "' for interaction #" + num + " in " + filename + ", but it was not there");
            }

            String headersReceived = getCodeBlock();

            final String BODY_SENT_TO_REAL_SERVER = "### Body sent to the real server";
            ix = markdownConversation.indexOf(BODY_SENT_TO_REAL_SERVER, ix);
            if (ix == -1) {
                throw makeAssertionError("Expected '" + BODY_SENT_TO_REAL_SERVER + "' for interaction #" + num + " in " + filename + ", but it was not there");
            }
            lineEnd = markdownConversation.indexOf("\n", ix);
            line = markdownConversation.substring(ix +4, lineEnd);
            String contentType = line.substring(line.indexOf("(") + 1, line.indexOf(")"));

            // TODO remove trim()
            if (!this.reorderMaybe(headersReceived).equals(reorderMaybe(headers.trim()))) {
                throw makeAssertionError(methodAndFilePrefix(mdMethod) + ", headers from the client that should be sent to real server are not the same as those previously recorded");
            }
            String bodyReceived = getCodeBlock();
            if (!this.bodyToReal.equals(bodyReceived)) {
                throw makeAssertionError(methodAndFilePrefix(mdMethod) + ", body from the client that should be sent to real server are not the same those previously recorded");
            }
            if (!this.contentTypeToReal.equals(contentType)) {
                throw makeAssertionError(methodAndFilePrefix(mdMethod) + ", content-Type of body from the client that should be sent to real server are not the same those previously recorded");
            }
            final String RESULTING_HEADERS_BACK_FROM_REAL_SERVER = "### Resulting headers back from the real server";
            ix = markdownConversation.indexOf(RESULTING_HEADERS_BACK_FROM_REAL_SERVER, ix);
            if (ix == -1) {
                throw makeAssertionError("Expected '" + RESULTING_HEADERS_BACK_FROM_REAL_SERVER + "' for interaction #" + num + " in " + filename + ", but it was not there");
            }
            String[] headersToReturn = getCodeBlock().split("\n");
            final String RESULTING_BODY_BACK_FROM_REAL_SERVER = "### Resulting body back from the real server";
            ix = markdownConversation.indexOf(RESULTING_BODY_BACK_FROM_REAL_SERVER, ix);
            if (ix == -1) {
                throw makeAssertionError("Expected '" + RESULTING_BODY_BACK_FROM_REAL_SERVER + "' for interaction #" + num + " in " + filename + ", but it was not there");
            }
            lineEnd = markdownConversation.indexOf("\n", ix);
            line = markdownConversation.substring(ix +4, lineEnd);
            String statusContent = line.substring(line.indexOf("(") + 1, line.indexOf(")"));
            parts = statusContent.split(": ");
            int statusCode = Integer.parseInt(parts[0]);
            contentType = parts[1];
            Object bodyToReturn;
            if (contentType.endsWith("- Base64 below")) {
                contentType = contentType.substring(0, contentType.indexOf(" "));
                bodyToReturn = Base64.getDecoder().decode(getCodeBlock());
            } else {
                bodyToReturn = getCodeBlock();
            }
            System.out.println(">> Svhttp >> Replay of interaction " + num + ": " + method + " " + url);
            return new ServiceResponse(bodyToReturn, contentType, statusCode, headersToReturn);
        } catch (AssertionError e) {

            System.out.println(">> Svhttp >> Replay Assertion Error: " + e.getMessage());
            e.printStackTrace();
            return new ServiceResponse("ServiceInteractionReplayer: " + e.getMessage(), "text/plain", 500);

        }
    }

    private AssertionError makeAssertionError(String message) {
        return new AssertionError(message);
    }

    private String reorderMaybe(String headersReceived) {
        if (forgivingOrderOfClientRquestHeaders) {
            String[] foo = headersReceived.split("\n");
            Arrays.sort(foo);
            return String.join("\n", foo);
        }
        return headersReceived;
    }

    private String methodAndFilePrefix(String mdMethod) {
        return "Interaction " + num + " (method: " + mdMethod + ") in " + filename;
    }

    private String getCodeBlock() {
        ix = markdownConversation.indexOf("\n```\n", ix);
        int endCodeBlock = markdownConversation.indexOf("\n```\n", ix + 5);
        String rv = markdownConversation.substring(ix + 5, endCodeBlock);
        ix = endCodeBlock + 5;
        return rv;
    }

    @Override
    protected void responseBody(ServiceResponse rv) {
        // only useful for recording which is not this class
    }

    @Override
    protected void responseHeaders(ServiceResponse rv) {
        // only useful for recording which is not this class
    }

    @Override
    protected void requestBody(String bodyToReal, String contentTypeToReal) {
        this.bodyToReal = bodyToReal;
        this.contentTypeToReal = contentTypeToReal;
    }

    @Override
    protected void requestHeaders(Map<String, String> headers) {
        StringBuilder sb = new StringBuilder();
        for (String k : headers.keySet()) {
            String v = headers.get(k);
            sb.append(k).append(": ").append(v).append("\n");
        }
        this.headers = sb.toString();
    }

    @Override
    protected void newMethod(String method, String path) {
    }
}
