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
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.hamcrest.core.IsEqual.equalTo;

public class MarkdownReplayer implements Interactor {

    private final ReplayMonitor monitor;

    private List<String> allMarkdownInteractions = new ArrayList<>();
    private String filename;
    private boolean forgivingOrderOfClientRequestHeaders = false;

    public static final String SERVIRTIUM_INTERACTION = "## Interaction ";

    public MarkdownReplayer() {
        this(new ReplayMonitor.Default());
    }

    public MarkdownReplayer(ReplayMonitor monitor) {
        this.monitor = monitor;
    }

    public MarkdownReplayer withForgivingOrderOfClientRequestHeaders() {
        forgivingOrderOfClientRequestHeaders = true;
        return this;
    }

    public void setScriptFilename(String filename) {
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
                allMarkdownInteractions.add(interactionText);
                ctr++;
            }
        }
    }

    @Override
    public void finishedScript(int interactionNum, boolean failed) {
        if (failed && (allMarkdownInteractions.size() - interactionNum) > 1) {
            monitor.finishedButMoreInteractionsYetToDo(interactionNum, filename);
        }
    }

    public class ReplayingInteraction extends Interaction {
        private final String interactionText;
        int ix;
        private String headers;

        ReplayingInteraction(String interactionText, int interactionNum) {
            super(interactionNum);
            this.interactionText = interactionText;
        }

        @Override
        public void recordRequestHeaders(Map<String, String> headers) {
            StringBuilder sb = new StringBuilder();
            for (String k : headers.keySet()) {
                String v = headers.get(k);
                sb.append(k).append(": ").append(v).append("\n");
            }
            this.headers = sb.toString();
        }
    }

    @Override
    public ServiceResponse getServiceResponseForRequest(String method, String url, Map<String, String> headersToReal, Interaction interaction) throws IOException {

        ReplayingInteraction replay = (ReplayingInteraction) interaction;

        replay.ix = replay.interactionText.indexOf(SERVIRTIUM_INTERACTION + replay.interactionNum + ":", 0);
        if (replay.ix == -1) {
            monitor.couldNotFindInteraction(replay.interactionNum, filename);
        }
        int lineEnd = replay.interactionText.indexOf("\n", replay.ix);
        String line = replay.interactionText.substring(replay.ix + SERVIRTIUM_INTERACTION.length(), lineEnd);
        String[] parts = line.split(" ");
        int iNum = Integer.parseInt(parts[0].replace(":",""));
        String mdMethod = parts[1];

        if (!method.equals(mdMethod)) {
            monitor.methodNotAsExpected(replay.interactionNum, filename, mdMethod, method);
        }
        String mdUrl = parts[2];
        if (!url.endsWith(mdUrl)) {
            monitor.urlNotAsExpected(url, replay, mdMethod, mdUrl, filename);
        }

        final String REQUEST_HEADERS_SENT_TO_REAL_SERVER = "### Request headers sent to the real server";
        replay.ix = replay.interactionText.indexOf(REQUEST_HEADERS_SENT_TO_REAL_SERVER, replay.ix);
        if (replay.ix == -1) {
            monitor.markdownSectionHeadingMissing(replay.interactionNum, REQUEST_HEADERS_SENT_TO_REAL_SERVER, filename);
        }

        String headersReceived = getCodeBlock(replay);

        final String BODY_SENT_TO_REAL_SERVER = "### Body sent to the real server";
        replay.ix = replay.interactionText.indexOf(BODY_SENT_TO_REAL_SERVER, replay.ix);
        if (replay.ix == -1) {
            monitor.markdownSectionHeadingMissing(replay.interactionNum, BODY_SENT_TO_REAL_SERVER, filename);
        }
        lineEnd = replay.interactionText.indexOf("\n", replay.ix);
        line = replay.interactionText.substring(replay.ix +4, lineEnd);
        String contentType = line.substring(line.indexOf("(") + 1, line.indexOf(")"));

        // TODO remove trim()
        final String[] prevRecorded = this.reorderMaybe(headersReceived).split("\n");
        final String[] current = reorderMaybe(replay.headers.trim()).split("\n");
        try {
            assertThat(current, arrayContainingInAnyOrder(prevRecorded));
        } catch (AssertionError e) {
            String msg = e.getMessage();
            monitor.headersFromClientToRealNotAsExpected(replay.interactionNum, mdMethod, filename, msg);
        }

        String bodyReceived = getCodeBlock(replay);

        try {
            assertThat(replay.bodyToReal, equalTo(bodyReceived));
        } catch (AssertionError e) {
            String msg = e.getMessage();
            monitor.bodyFromClientToRealNotAsExpected(replay.interactionNum, mdMethod, filename, msg);
        }

        try {
            assertThat(replay.contentTypeToReal, equalTo(contentType));
        } catch (AssertionError e) {
            String msg = e.getMessage();
            monitor.contentTypeFromClientToRealNotAsExpected(replay.interactionNum, mdMethod, filename, msg);
        }

        final String RESULTING_HEADERS_BACK_FROM_REAL_SERVER = "### Resulting headers back from the real server";
        replay.ix = replay.interactionText.indexOf(RESULTING_HEADERS_BACK_FROM_REAL_SERVER, replay.ix);
        if (replay.ix == -1) {
            monitor.markdownSectionHeadingMissing(replay.interactionNum, RESULTING_HEADERS_BACK_FROM_REAL_SERVER, filename);
        }
        String[] headersToReturn = getCodeBlock(replay).split("\n");
        final String RESULTING_BODY_BACK_FROM_REAL_SERVER = "### Resulting body back from the real server";
        replay.ix = replay.interactionText.indexOf(RESULTING_BODY_BACK_FROM_REAL_SERVER, replay.ix);
        if (replay.ix == -1) {
            monitor.markdownSectionHeadingMissing(replay.interactionNum, RESULTING_BODY_BACK_FROM_REAL_SERVER, filename);
        }
        lineEnd = replay.interactionText.indexOf("\n", replay.ix);
        line = replay.interactionText.substring(replay.ix +4, lineEnd);
        String statusContent = line.substring(line.indexOf("(") + 1, line.indexOf(")"));
        parts = statusContent.split(": ");
        int statusCode = Integer.parseInt(parts[0]);
        contentType = parts[1];
        Object bodyToReturn;
        if (contentType.endsWith("- Base64 below")) {
            contentType = contentType.substring(0, contentType.indexOf(" "));
            bodyToReturn = Base64.getDecoder().decode(getCodeBlock(replay));
        } else {
            bodyToReturn = getCodeBlock(replay);
        }
        return new ServiceResponse(bodyToReturn, contentType, statusCode, headersToReturn);


    }

    private String reorderMaybe(String headersReceived) {
        if (forgivingOrderOfClientRequestHeaders) {
            String[] foo = headersReceived.split("\n");
            Arrays.sort(foo);
            return String.join("\n", foo);
        }
        return headersReceived;
    }

    private String getCodeBlock(ReplayingInteraction replayingInteraction) {
        replayingInteraction.ix = replayingInteraction.interactionText.indexOf("\n```\n", replayingInteraction.ix);
        int endCodeBlock = replayingInteraction.interactionText.indexOf("\n```\n", replayingInteraction.ix + 5);
        String rv = replayingInteraction.interactionText.substring(replayingInteraction.ix + 5, endCodeBlock);
        replayingInteraction.ix = endCodeBlock + 5;
        return rv;
    }

    @Override
    public Interaction newInteraction(String method, String path, int interactionNum, String url) {
        final String interactionText;
        try {
            interactionText = allMarkdownInteractions.get(interactionNum);
        } catch (IndexOutOfBoundsException e) {
            throw monitor.unexpectedInteractionRequest(interactionNum, filename);
        }
        return new ReplayingInteraction(interactionText, interactionNum);
    }

    public interface ReplayMonitor {

        void finishedButMoreInteractionsYetToDo(int interaction, String filename);

        void couldNotFindInteraction(int interaction, String filename);

        void methodNotAsExpected(int interaction, String filename, String mdMethod, String method);

        void urlNotAsExpected(String url, MarkdownReplayer.ReplayingInteraction rc, String mdMethod, String mdUrl, String filename);

        void markdownSectionHeadingMissing(int interaction, String HEADERS_SENT_TO_REAL_SERVER, String filename);

        void headersFromClientToRealNotAsExpected(int interaction, String mdMethod, String filename, String msg);

        void bodyFromClientToRealNotAsExpected(int interaction, String mdMethod, String filename, String msg);

        void contentTypeFromClientToRealNotAsExpected(int interaction, String mdMethod, String filename, String msg);

        AssertionError unexpectedInteractionRequest(int interactionNum, String filename);

        class Default implements ReplayMonitor {

            public void finishedButMoreInteractionsYetToDo(int interaction, String filename) {
                throw makeAssertionError("There are more recorded interactions after last replayed interaction: #" + interaction + " in " + filename + ", yet invocation of .finishedScript() possibly via .stop() implies there should be no more. Fail!!");
            }

            public void couldNotFindInteraction(int interaction, String filename) {
                throw makeAssertionError("Could not find interactions #" + interaction + " in file '" + filename + "'");
            }

            public void methodNotAsExpected(int interaction, String filename, String mdMethod, String method) {
                throw makeAssertionError(methodAndFilePrefix(interaction, mdMethod, filename) + ", method from the client that should be sent to real server are not the same as expected: " + method);
            }

            public void urlNotAsExpected(String url, MarkdownReplayer.ReplayingInteraction rc, String mdMethod, String mdUrl, String filename) {
                throw makeAssertionError("Method " + rc.interactionNum + " (" + mdMethod + ") in " + filename + ": " + url + " does not end in previously recorded " + mdUrl);
            }

            public void markdownSectionHeadingMissing(int interaction, String HEADERS_SENT_TO_REAL_SERVER, String filename) {
                throw makeAssertionError("Expected '" + HEADERS_SENT_TO_REAL_SERVER + "' for interaction #" + interaction + " in " + filename + ", but it was not there");
            }

            public void headersFromClientToRealNotAsExpected(int interaction, String mdMethod, String filename, String msg) {
                throw makeAssertionError(methodAndFilePrefix(interaction, mdMethod, filename)
                        + ", headers from the client that should be sent to real server are not the same as those previously recorded"
                        + ", Hamcrest message: " + msg);
            }

            public void bodyFromClientToRealNotAsExpected(int interaction, String mdMethod, String filename, String msg) {
                throw makeAssertionError(methodAndFilePrefix(interaction, mdMethod, filename) + ", body from the client that should be sent to real server are not the same those previously recorded"
                        + ", Hamcrest message: " + msg);
            }

            public void contentTypeFromClientToRealNotAsExpected(int interaction, String mdMethod, String filename, String msg) {
                throw makeAssertionError(methodAndFilePrefix(interaction, mdMethod, filename) + ", content-Type of body from the client that should be sent to real server are not the same those previously recorded"
                        + ", Hamcrest message: " + msg);
            }

            public AssertionError unexpectedInteractionRequest(int interactionNum, String filename) {
                return makeAssertionError("Replay of script '" + filename + "' hit a problem when interaction " + interactionNum + " sought, but there were no more after " + (interactionNum - 1));
            }

            private String methodAndFilePrefix(int interactionNum, String mdMethod, String filename) {
                return "Interaction " + interactionNum + " (method: " + mdMethod + ") in " + filename;
            }

            private AssertionError makeAssertionError(String message) {
                return new AssertionError(message);
            }

        }
    }
}
