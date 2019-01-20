/*
        Servirtium: Service Virtualized HTTP

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
        either expressed or implied, of the Servirtium project.
*/
package com.paulhammant.servirtium;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;

import static java.nio.file.Files.readAllBytes;

public class InteractionsReplayer implements InteractionsDelegate {

    private final ReplayMonitor monitor;

    private List<String> markdownConversation = new ArrayList<>();
    private String filename;
    private boolean forgivingOrderOfClientRquestHeaders = false;

    public static final String SERVIRTIUM_INTERACTION = "## Interaction ";

    public InteractionsReplayer() {
        this(new ReplayMonitor.Default());
    }

    public InteractionsReplayer(ReplayMonitor monitor) {
        this.monitor = monitor;
    }

    public InteractionsReplayer withForgivingOrderOfClientRequestHeaders() {
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
            charPosn = conversation.indexOf(SERVIRTIUM_INTERACTION + ctr + ":");
            int charEndPosn;
            if (charPosn > -1) {
                charEndPosn = conversation.indexOf(SERVIRTIUM_INTERACTION + (ctr+1) + ":");
                if (charEndPosn == -1) {
                    charEndPosn = conversation.length();
                    again = false;
                }
                String interactionText = conversation.substring(charPosn, charEndPosn);
                markdownConversation.add(interactionText);
                ctr++;
            }
        }
    }

    @Override
    public void finishedScript(int interactionNum) {
        if (markdownConversation.size() - interactionNum > 1) {
            monitor.finishedButMoreInteractionsYetToDo(interactionNum, filename);
        }
    }

    public static class ReplayingContext extends Context {

        private final String interactionText;
        public int ix;
        public String bodyToReal;
        public String contentTypeToReal;
        public String headers;

        public ReplayingContext(String interactionText, int interactionNum) {
            super(interactionNum);
            this.interactionText = interactionText;
        }
    }

    @Override
    public ServiceResponse getServiceResponseForRequest(String method, String url, Map<String, String> headersToReal, Context ctx) throws IOException {

        ReplayingContext rc = (ReplayingContext) ctx;

        try {
            rc.ix = rc.interactionText.indexOf(SERVIRTIUM_INTERACTION + rc.interactionNum + ":", 0);
            if (rc.ix == -1) {
                monitor.couldNotFindInteraction(rc.interactionNum, filename);
            }
            int lineEnd = rc.interactionText.indexOf("\n", rc.ix);
            String line = rc.interactionText.substring(rc.ix + SERVIRTIUM_INTERACTION.length(), lineEnd);
            String[] parts = line.split(" ");
            int iNum = Integer.parseInt(parts[0].replace(":",""));
            String mdMethod = parts[1];

            if (!method.equals(mdMethod)) {
                monitor.methodNotAsExpected(rc.interactionNum, filename, mdMethod, method);
            }
            String mdUrl = parts[2];
            if (!url.endsWith(mdUrl)) {
                monitor.urlNotAsExpected(url, rc, mdMethod, mdUrl, filename);
            }

            final String REQUEST_HEADERS_SENT_TO_REAL_SERVER = "### Request headers sent to the real server";
            rc.ix = rc.interactionText.indexOf(REQUEST_HEADERS_SENT_TO_REAL_SERVER, rc.ix);
            if (rc.ix == -1) {
                monitor.markdownSectionHeadingMissing(rc.interactionNum, REQUEST_HEADERS_SENT_TO_REAL_SERVER, filename);
            }

            String headersReceived = getCodeBlock(rc);

            final String BODY_SENT_TO_REAL_SERVER = "### Body sent to the real server";
            rc.ix = rc.interactionText.indexOf(BODY_SENT_TO_REAL_SERVER, rc.ix);
            if (rc.ix == -1) {
                monitor.markdownSectionHeadingMissing(rc.interactionNum, BODY_SENT_TO_REAL_SERVER, filename);
            }
            lineEnd = rc.interactionText.indexOf("\n", rc.ix);
            line = rc.interactionText.substring(rc.ix +4, lineEnd);
            String contentType = line.substring(line.indexOf("(") + 1, line.indexOf(")"));

            // TODO remove trim()
            if (!this.reorderMaybe(headersReceived).equals(reorderMaybe(rc.headers.trim()))) {
                monitor.headersFromClientToRealNotAsExpected(rc.interactionNum, mdMethod, filename);
            }
            String bodyReceived = getCodeBlock(rc);
            if (!rc.bodyToReal.equals(bodyReceived)) {
                monitor.bodyFromClientToRealNotAsExpected(rc.interactionNum, mdMethod, filename);
            }
            if (!rc.contentTypeToReal.equals(contentType)) {
                monitor.contentTypeFromClientToRealNotAsExpected(rc.interactionNum, mdMethod, filename);
            }
            final String RESULTING_HEADERS_BACK_FROM_REAL_SERVER = "### Resulting headers back from the real server";
            rc.ix = rc.interactionText.indexOf(RESULTING_HEADERS_BACK_FROM_REAL_SERVER, rc.ix);
            if (rc.ix == -1) {
                monitor.markdownSectionHeadingMissing(rc.interactionNum, RESULTING_HEADERS_BACK_FROM_REAL_SERVER, filename);
            }
            String[] headersToReturn = getCodeBlock(rc).split("\n");
            final String RESULTING_BODY_BACK_FROM_REAL_SERVER = "### Resulting body back from the real server";
            rc.ix = rc.interactionText.indexOf(RESULTING_BODY_BACK_FROM_REAL_SERVER, rc.ix);
            if (rc.ix == -1) {
                monitor.markdownSectionHeadingMissing(rc.interactionNum, RESULTING_BODY_BACK_FROM_REAL_SERVER, filename);
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
            System.out.println(">> SERVIRTIUM >> Replay of interaction " + rc.interactionNum + ": " + method + " " + url);
            return new ServiceResponse(bodyToReturn, contentType, statusCode, headersToReturn);
        } catch (AssertionError e) {

            System.out.println(">> SERVIRTIUM >> Replay Assertion Error: " + e.getMessage());
            e.printStackTrace();
            return new ServiceResponse("ServiceInteractionReplayer: " + e.getMessage(), "text/plain", 500);

        }
    }

    private String reorderMaybe(String headersReceived) {
        if (forgivingOrderOfClientRquestHeaders) {
            String[] foo = headersReceived.split("\n");
            Arrays.sort(foo);
            return String.join("\n", foo);
        }
        return headersReceived;
    }

    private String getCodeBlock(ReplayingContext rc) {
        rc.ix = rc.interactionText.indexOf("\n```\n", rc.ix);
        int endCodeBlock = rc.interactionText.indexOf("\n```\n", rc.ix + 5);
        String rv = rc.interactionText.substring(rc.ix + 5, endCodeBlock);
        rc.ix = endCodeBlock + 5;
        return rv;
    }

    @Override
    public void recordRequestBody(String bodyToReal, String contentTypeToReal, Context ctx) {
        ReplayingContext rc = (ReplayingContext) ctx;
        rc.bodyToReal = bodyToReal;
        rc.contentTypeToReal = contentTypeToReal;
    }

    @Override
    public void recordRequestHeaders(Map<String, String> headers, Context ctx) {
        ReplayingContext rc = (ReplayingContext) ctx;
        StringBuilder sb = new StringBuilder();
        for (String k : headers.keySet()) {
            String v = headers.get(k);
            sb.append(k).append(": ").append(v).append("\n");
        }
        rc.headers = sb.toString();
    }

    @Override
    public Context newInteraction(String method, String path, int interactionNum) {
        final String interactionText;
        try {
            interactionText = markdownConversation.get(interactionNum);
        } catch (IndexOutOfBoundsException e) {
            throw monitor.unexpectedInteractionRequest(interactionNum, filename);
        }
        return new ReplayingContext(interactionText, interactionNum);
    }

}
