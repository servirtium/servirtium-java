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
            monitor.finishedButMoreInteractionsYetToDo(this.getClass(), interactionNum, filename);
        }
    }

    public class ReplayingInteraction extends Interaction {
        private final String interactionText;
        int ix;
        private String headers;

        ReplayingInteraction(String interactionText, int interactionNum, String context) {
            super(interactionNum, context);
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
            monitor.couldNotFindInteraction(this.getClass(), replay.interactionNum, filename, replay.context);
        }
        int lineEnd = replay.interactionText.indexOf("\n", replay.ix);
        String line = replay.interactionText.substring(replay.ix + SERVIRTIUM_INTERACTION.length(), lineEnd);
        String[] parts = line.split(" ");
        int iNum = Integer.parseInt(parts[0].replace(":",""));
        String mdMethod = parts[1];

        if (!method.equals(mdMethod)) {
            monitor.methodNotAsExpected(this.getClass(), replay.interactionNum, filename, mdMethod, method, replay.context);
        }
        String mdUrl = parts[2];
        if (!url.endsWith(mdUrl)) {
            monitor.urlNotAsExpected(this.getClass(), url, replay, mdMethod, mdUrl, filename, replay.context);
        }

        final String REQUEST_HEADERS_SENT_TO_REAL_SERVER = "### Request headers sent to the real server";
        replay.ix = replay.interactionText.indexOf(REQUEST_HEADERS_SENT_TO_REAL_SERVER, replay.ix);
        if (replay.ix == -1) {
            monitor.markdownSectionHeadingMissing(this.getClass(), replay.interactionNum, REQUEST_HEADERS_SENT_TO_REAL_SERVER, filename, replay.context);
        }

        String headersReceived = getCodeBlock(replay);

        final String BODY_SENT_TO_REAL_SERVER = "### Body sent to the real server";
        replay.ix = replay.interactionText.indexOf(BODY_SENT_TO_REAL_SERVER, replay.ix);
        if (replay.ix == -1) {
            monitor.markdownSectionHeadingMissing(this.getClass(), replay.interactionNum, BODY_SENT_TO_REAL_SERVER, filename, replay.context);
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
            monitor.headersFromClientToRealNotAsExpected(this.getClass(), replay.interactionNum, mdMethod, filename, msg, replay.context);
        }

        String bodyReceived = getCodeBlock(replay);

        try {
            assertThat(replay.bodyToReal, equalTo(bodyReceived));
        } catch (AssertionError e) {
            String msg = e.getMessage();
            monitor.bodyFromClientToRealNotAsExpected(this.getClass(), replay.interactionNum, mdMethod, filename, msg, replay.context);
        }

        try {
            assertThat(replay.contentTypeToReal, equalTo(contentType));
        } catch (AssertionError e) {
            String msg = e.getMessage();
            monitor.contentTypeFromClientToRealNotAsExpected(this.getClass(), replay.interactionNum, mdMethod, filename, msg, replay.context);
        }

        final String RESULTING_HEADERS_BACK_FROM_REAL_SERVER = "### Resulting headers back from the real server";
        replay.ix = replay.interactionText.indexOf(RESULTING_HEADERS_BACK_FROM_REAL_SERVER, replay.ix);
        if (replay.ix == -1) {
            monitor.markdownSectionHeadingMissing(this.getClass(), replay.interactionNum, RESULTING_HEADERS_BACK_FROM_REAL_SERVER, filename, replay.context);
        }
        String[] headersToReturn = getCodeBlock(replay).split("\n");
        final String RESULTING_BODY_BACK_FROM_REAL_SERVER = "### Resulting body back from the real server";
        replay.ix = replay.interactionText.indexOf(RESULTING_BODY_BACK_FROM_REAL_SERVER, replay.ix);
        if (replay.ix == -1) {
            monitor.markdownSectionHeadingMissing(this.getClass(), replay.interactionNum, RESULTING_BODY_BACK_FROM_REAL_SERVER, filename, replay.context);
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
    public Interaction newInteraction(String method, String path, int interactionNum, String url, String context) {
        final String interactionText;
        try {
            interactionText = allMarkdownInteractions.get(interactionNum);
        } catch (IndexOutOfBoundsException e) {
            throw monitor.unexpectedInteractionRequest(this.getClass(), interactionNum, filename);
        }
        return new ReplayingInteraction(interactionText, interactionNum, context);
    }

    public interface ReplayMonitor {

        void finishedButMoreInteractionsYetToDo(Class clazz, int interaction, String filename);

        void couldNotFindInteraction(Class clazz, int interaction, String filename, String context);

        void methodNotAsExpected(Class clazz, int interaction, String filename, String mdMethod, String method, String context);

        void urlNotAsExpected(Class clazz, String url, ReplayingInteraction rc, String mdMethod, String mdUrl, String filename, String context);

        void markdownSectionHeadingMissing(Class clazz, int interaction, String HEADERS_SENT_TO_REAL_SERVER, String filename, String context);

        void headersFromClientToRealNotAsExpected(Class clazz, int interaction, String mdMethod, String filename, String msg, String context);

        void bodyFromClientToRealNotAsExpected(Class clazz, int interaction, String mdMethod, String filename, String msg, String context);

        void contentTypeFromClientToRealNotAsExpected(Class clazz, int interaction, String mdMethod, String filename, String msg, String context);

        AssertionError unexpectedInteractionRequest(Class clazz, int interactionNum, String filename);

        class Default implements ReplayMonitor {

            public void finishedButMoreInteractionsYetToDo(Class clazz, int interaction, String filename) {
                throw makeAssertionError("There are more recorded interactions after last replayed interaction: #" + interaction + " in " + filename + ", yet invocation of .finishedScript() possibly via .stop() implies there should be no more. Fail!!");
            }

            public void couldNotFindInteraction(Class clazz, int interaction, String filename, String context) {
                throw makeAssertionError("Could not find interactions #" + interaction + " in file '" + filename + "'");
            }

            public void methodNotAsExpected(Class clazz, int interaction, String filename, String mdMethod, String method, String context) {
                throw makeAssertionError(methodFileAndContextPrefix(interaction, mdMethod, filename, context) + ", method from the client that should be sent to real server are not the same as expected: " + method);
            }

            public void urlNotAsExpected(Class clazz, String url, ReplayingInteraction interaction, String mdMethod, String mdUrl, String filename, String context) {
                throw makeAssertionError("Method " + interaction.interactionNum + " (" + mdMethod + ") in " + filename + ": " + url + " does not end in previously recorded " + mdUrl);
            }

            public void markdownSectionHeadingMissing(Class clazz, int interaction, String HEADERS_SENT_TO_REAL_SERVER, String filename, String context) {
                throw makeAssertionError("Expected '" + HEADERS_SENT_TO_REAL_SERVER + "' for interaction #" + interaction + " in " + filename + ", but it was not there");
            }

            public void headersFromClientToRealNotAsExpected(Class clazz, int interaction, String mdMethod, String filename, String msg, String context) {
                throw makeAssertionError(methodFileAndContextPrefix(interaction, mdMethod, filename, context)
                        + ", headers from the client that should be sent to real server are not the same as those previously recorded"
                        + ", Hamcrest message: " + msg);
            }

            public void bodyFromClientToRealNotAsExpected(Class clazz, int interaction, String mdMethod, String filename, String msg, String context) {
                throw makeAssertionError(methodFileAndContextPrefix(interaction, mdMethod, filename, context) + ", body from the client that should be sent to real server are not the same those previously recorded"
                        + ", Hamcrest message: " + msg);
            }

            public void contentTypeFromClientToRealNotAsExpected(Class clazz, int interaction, String mdMethod, String filename, String msg, String context) {
                throw makeAssertionError(methodFileAndContextPrefix(interaction, mdMethod, filename, context) + ", content-Type of body from the client that should be sent to real server are not the same those previously recorded"
                        + ", Hamcrest message: " + msg);
            }

            public AssertionError unexpectedInteractionRequest(Class clazz, int interactionNum, String filename) {
                return makeAssertionError("Replay of script '" + filename + "' hit a problem when interaction " + interactionNum + " sought, but there were no more after " + (interactionNum - 1));
            }

            private String methodFileAndContextPrefix(int interactionNum, String mdMethod, String filename, String context) {
                return "Interaction " + interactionNum + " (method: " + mdMethod + ") in " + filename + "(context: " + context + ")";
            }

            private AssertionError makeAssertionError(String message) {
                return new AssertionError(message);
            }

        }
    }
}
