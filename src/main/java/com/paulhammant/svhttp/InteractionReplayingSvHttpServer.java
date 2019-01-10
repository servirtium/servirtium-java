/*
        SvHttp: Service Virtualized HTTP

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
        either expressed or implied, of the SvHttp project.
*/
package com.paulhammant.svhttp;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;

import static java.nio.file.Files.readAllBytes;

public class InteractionReplayingSvHttpServer extends SvHttpServer {

    private List<String> markdownConversation = new ArrayList<>();
    private String bodyToReal;
    private String contentTypeToReal;
    private String headers;
    private String filename;
    private boolean forgivingOrderOfClientRquestHeaders = false;
    public static final String SVHTTP_INTERACTION = "## Interaction ";
    private int interactionNum;

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
        int charPosn = -1;
        int ctr = 0;
        boolean again = true;
        while (again) {
            charPosn = conversation.indexOf(SVHTTP_INTERACTION + ctr + ":");
            int charEndPosn;
            if (charPosn > -1) {
                charEndPosn = conversation.indexOf(SVHTTP_INTERACTION + (ctr+1) + ":");
                if (charEndPosn == -1) {
                    charEndPosn = conversation.length();
                    again = false;
                }
                String interactionText = conversation.substring(charPosn, charEndPosn);
                markdownConversation.add(interactionText);
                ctr++;
            }
        }
        System.out.println();
    }

    @Override
    public void finishedMarkdownScript() {
        if (markdownConversation.size() - interactionNum > 1) {
            throw makeAssertionError("There are more recorded interactions after last replayed inteaction: #" + interactionNum + " in " + filename + ", yet invocation of .finishedMarkdownScript() possibly via .stop() implies there should be no more. Fail!!");
        }
    }

    public static class ReplayingContext extends Context {

        private final String interactionText;
        public int ix;
        public int interactionNum;

        public ReplayingContext(String interactionText, int interactionNum) {
            this.interactionText = interactionText;
            this.interactionNum = interactionNum;
        }
    }

    @Override
    protected ServiceResponse getServiceResponse(String method, String url, Map<String, String> headersToReal, Context ctx) throws IOException {

        ReplayingContext rc = (ReplayingContext) ctx;

        try {
            rc.ix = rc.interactionText.indexOf(SVHTTP_INTERACTION + rc.interactionNum + ":", 0);
            if (rc.ix == -1) {
                throw makeAssertionError("Could not find interactions #" + rc.interactionNum + " in file '" + filename + "'");
            }
            int lineEnd = rc.interactionText.indexOf("\n", rc.ix);
            String line = rc.interactionText.substring(rc.ix + SVHTTP_INTERACTION.length(), lineEnd);
            String[] parts = line.split(" ");
            int interactionNum = Integer.parseInt(parts[0].replace(":",""));
            String mdMethod = parts[1];
//            if (!method.equals(mdMethod)) {
//                throw makeAssertionError("Method " + interactionNum + " (" + mdMethod + ") in " + filename + ": " + url + " expected to be " + method);
//            }

            if (!method.equals(mdMethod)) {
                throw makeAssertionError(methodAndFilePrefix(rc.interactionNum, mdMethod) + ", method from the client that should be sent to real server are not the same as expected: " + method);
            }
            String mdUrl = parts[2];
            if (!url.endsWith(mdUrl)) {
                throw makeAssertionError("Method " + rc.interactionNum + " (" + mdMethod + ") in " + filename + ": " + url + " does not end in previously recorded " + mdUrl);
            }

            final String HEADERS_SENT_TO_REAL_SERVER = "### Request headers sent to the real server";
            rc.ix = rc.interactionText.indexOf(HEADERS_SENT_TO_REAL_SERVER, rc.ix);
            if (rc.ix == -1) {
                throw makeAssertionError("Expected '" + HEADERS_SENT_TO_REAL_SERVER + "' for interaction #" + rc.interactionNum + " in " + filename + ", but it was not there");
            }

            String headersReceived = getCodeBlock(rc);

            final String BODY_SENT_TO_REAL_SERVER = "### Body sent to the real server";
            rc.ix = rc.interactionText.indexOf(BODY_SENT_TO_REAL_SERVER, rc.ix);
            if (rc.ix == -1) {
                throw makeAssertionError("Expected '" + BODY_SENT_TO_REAL_SERVER + "' for interaction #" + rc.interactionNum + " in " + filename + ", but it was not there");
            }
            lineEnd = rc.interactionText.indexOf("\n", rc.ix);
            line = rc.interactionText.substring(rc.ix +4, lineEnd);
            String contentType = line.substring(line.indexOf("(") + 1, line.indexOf(")"));

            // TODO remove trim()
            if (!this.reorderMaybe(headersReceived).equals(reorderMaybe(headers.trim()))) {
                throw makeAssertionError(methodAndFilePrefix(rc.interactionNum, mdMethod) + ", headers from the client that should be sent to real server are not the same as those previously recorded");
            }
            String bodyReceived = getCodeBlock(rc);
            if (!this.bodyToReal.equals(bodyReceived)) {
                throw makeAssertionError(methodAndFilePrefix(rc.interactionNum, mdMethod) + ", body from the client that should be sent to real server are not the same those previously recorded");
            }
            if (!this.contentTypeToReal.equals(contentType)) {
                throw makeAssertionError(methodAndFilePrefix(rc.interactionNum, mdMethod) + ", content-Type of body from the client that should be sent to real server are not the same those previously recorded");
            }
            final String RESULTING_HEADERS_BACK_FROM_REAL_SERVER = "### Resulting headers back from the real server";
            rc.ix = rc.interactionText.indexOf(RESULTING_HEADERS_BACK_FROM_REAL_SERVER, rc.ix);
            if (rc.ix == -1) {
                throw makeAssertionError("Expected '" + RESULTING_HEADERS_BACK_FROM_REAL_SERVER + "' for interaction #" + rc.interactionNum + " in " + filename + ", but it was not there");
            }
            String[] headersToReturn = getCodeBlock(rc).split("\n");
            final String RESULTING_BODY_BACK_FROM_REAL_SERVER = "### Resulting body back from the real server";
            rc.ix = rc.interactionText.indexOf(RESULTING_BODY_BACK_FROM_REAL_SERVER, rc.ix);
            if (rc.ix == -1) {
                throw makeAssertionError("Expected '" + RESULTING_BODY_BACK_FROM_REAL_SERVER + "' for interaction #" + rc.interactionNum + " in " + filename + ", but it was not there");
            }
            lineEnd = rc.interactionText.indexOf("\n", rc.ix);
            line = rc.interactionText.substring(rc.ix +4, lineEnd);
            String statusContent = line.substring(line.indexOf("(") + 1, line.indexOf(")"));
            parts = statusContent.split(": ");
            int statusCode = Integer.parseInt(parts[0]);
            contentType = parts[1];
            Object bodyToReturn;
            if (contentType.endsWith("- Base64 below")) {
                contentType = contentType.substring(0, contentType.indexOf(" "));
                bodyToReturn = Base64.getDecoder().decode(getCodeBlock(rc));
            } else {
                bodyToReturn = getCodeBlock(rc);
            }
            System.out.println(">> Svhttp >> Replay of interaction " + rc.interactionNum + ": " + method + " " + url);
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

    private String methodAndFilePrefix(int interactionNum, String mdMethod) {
        return "Interaction " + interactionNum + " (method: " + mdMethod + ") in " + filename;
    }

    private String getCodeBlock(ReplayingContext rc) {
        rc.ix = rc.interactionText.indexOf("\n```\n", rc.ix);
        int endCodeBlock = rc.interactionText.indexOf("\n```\n", rc.ix + 5);
        String rv = rc.interactionText.substring(rc.ix + 5, endCodeBlock);
        rc.ix = endCodeBlock + 5;
        return rv;
    }

    @Override
    protected void responseBody(ServiceResponse rv, Context ctx) {
        // only useful for recording which is not this class
    }

    @Override
    protected void responseHeaders(ServiceResponse rv, Context ctx) {
        // only useful for recording which is not this class
    }

    @Override
    protected void requestBody(String bodyToReal, String contentTypeToReal, Context ctx) {
        this.bodyToReal = bodyToReal;
        this.contentTypeToReal = contentTypeToReal;
    }

    @Override
    protected void requestHeaders(Map<String, String> headers, Context ctx) {
        StringBuilder sb = new StringBuilder();
        for (String k : headers.keySet()) {
            String v = headers.get(k);
            sb.append(k).append(": ").append(v).append("\n");
        }
        this.headers = sb.toString();
    }

    @Override
    protected Context newInteraction(String method, String path) {
        final String interactionText;
        try {
            interactionText = markdownConversation.get(interactionNum);
        } catch (IndexOutOfBoundsException e) {
            throw new AssertionError("Replay of script '" + filename + "' hit a problem when interaction " + interactionNum + " sought, but there were no more after " + (interactionNum-1));
        }
        return new ReplayingContext(interactionText, interactionNum++);
    }
}
