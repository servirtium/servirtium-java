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

import static java.nio.file.Files.readAllBytes;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.core.IsEqual.equalTo;

public class MarkdownReplayer implements Interactor {

    private final ReplayMonitor monitor;

    private List<String> allMarkdownInteractions = new ArrayList<>();
    private String filename;
    private boolean alphaSortHeaders = false;

    public static final String SERVIRTIUM_INTERACTION = "## Interaction ";

    public MarkdownReplayer() {
        this(new ReplayMonitor.Default());
    }

    public MarkdownReplayer(ReplayMonitor monitor) {
        this.monitor = monitor;
    }

    public MarkdownReplayer withAlphaSortingOfHeaders() {
        alphaSortHeaders = true;
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
        if (!failed) {
            try {
                assertThat((allMarkdownInteractions.size() - interactionNum), equalTo(1));
            } catch (AssertionError e) {
                monitor.finishedButMoreInteractionsYetToDo(interactionNum, filename, e);
            }
        }
    }

    public class ReplayingInteraction extends Interaction {
        private final String interactionText;
        int ix;
        private String clientRequestHeaders;

        ReplayingInteraction(String interactionText, int interactionNum, String context) {
            super(interactionNum, context);
            this.interactionText = interactionText;
        }

        @Override
        public List<String> noteClientRequestHeadersAndBody(InteractionManipulations interactionManipulations, List<String> clientRequestHeaders, Object clientRequestBody,
                                                            String clientRequestContentType, String method, boolean lowerCaseHeaders) {

            List<String> clientRequestHeaders2 = changeRequestHeadersIfNeeded(interactionManipulations, clientRequestHeaders, method, lowerCaseHeaders);

            interactionManipulations.changeAnyHeadersForRequestToService(clientRequestHeaders2);

            StringBuilder sb = new StringBuilder();
            for (String h : clientRequestHeaders2) {
                sb.append(h).append("\n");
            }
            this.clientRequestHeaders = sb.toString();

            // Body

            if (clientRequestBody == null) {
                clientRequestBody = "";
            }
            if (clientRequestBody instanceof String) {
                clientRequestBody = interactionManipulations.changeBodyForRequestToService((String) clientRequestBody);
            }

            super.setClientRequestBodyAndContentType(clientRequestBody, clientRequestContentType);

            return clientRequestHeaders2;
        }

        @Override
        public void debugOriginalServiceResponseHeaders(String[] headers) {
            // Nothing to note, this is already the replay of a recording
        }

        @Override
        public void debugClientsServiceResponseHeaders(String[] headers) {
            // Nothing to note, this is already the replay of a recording
        }

        @Override
        public void debugOriginalServiceResponseBody(Object body, int statusCode, String contentType) {
            // Nothing to note, this is already the replay of a recording
        }

        @Override
        public void debugClientsServiceResponseBody(Object body, int statusCode, String contentType) {
            // Nothing to note, this is already the replay of a recording
        }

        @Override
        public void noteServiceResponseHeaders(String[] headers) {
            // Nothing to note, this is already the replay of a recording
        }

        @Override
        public void noteServiceResponseBody(Object body, int statusCode, String contentType) {
            // Nothing to note, this is already the replay of a recording
        }

    }

    @Override
    public ServiceResponse getServiceResponseForRequest(String method, String url, List<String> clientRequestHeaders,
                                                        Interaction interaction, boolean lowerCaseHeaders) {

        ReplayingInteraction replay = (ReplayingInteraction) interaction;

        replay.ix = replay.interactionText.indexOf(SERVIRTIUM_INTERACTION + replay.interactionNum + ":", 0);
        try {
            assertThat(replay.ix, not(equalTo(-1)));
        } catch (AssertionError e) {
            monitor.couldNotFindInteraction(replay.interactionNum, filename, replay.context, e);
        }
        int lineEnd = replay.interactionText.indexOf("\n", replay.ix);
        String line = replay.interactionText.substring(replay.ix + SERVIRTIUM_INTERACTION.length(), lineEnd);
        String[] parts = line.split(" ");
        int iNum = Integer.parseInt(parts[0].replace(":",""));
        String mdMethod = parts[1];


        try {
            assertThat(method, equalTo(mdMethod));
        } catch (AssertionError e) {
            monitor.unexpectedClientRequestMethod(replay.interactionNum, filename, mdMethod, method, replay.context, e);
        }

        String mdUrl = parts[2];

        try {
            assertThat(url, endsWith(mdUrl));
        } catch (AssertionError e) {
            monitor.unexpectedClientRequestUrl(url, replay, mdMethod, mdUrl, filename, replay.context, e);
        }

        final String REQUEST_HEADERS_SENT_TO_REAL_SERVER = "### Request headers for playback";
        replay.ix = replay.interactionText.indexOf(REQUEST_HEADERS_SENT_TO_REAL_SERVER, replay.ix);
        try {
            assertThat(replay.ix, not(equalTo(-1)));
        } catch (AssertionError e) {
            monitor.markdownSectionHeadingMissing(replay.interactionNum, REQUEST_HEADERS_SENT_TO_REAL_SERVER, filename,
                    replay.context, e);
        }

        String headersReceived = getCodeBlock(replay);

        final String BODY_SENT_TO_REAL_SERVER = "### Request body for playback";
        replay.ix = replay.interactionText.indexOf(BODY_SENT_TO_REAL_SERVER, replay.ix);
        try {
            assertThat(replay.ix, not(equalTo(-1)));
        } catch (AssertionError e) {
            monitor.markdownSectionHeadingMissing(replay.interactionNum, BODY_SENT_TO_REAL_SERVER, filename,
                    replay.context, e);
        }
        lineEnd = replay.interactionText.indexOf("\n", replay.ix);
        line = replay.interactionText.substring(replay.ix +4, lineEnd);
        String serverResponseContentType = line.substring(line.indexOf("(") + 1, line.indexOf(")"));

        // TODO remove trim()
        final String[] prevRecorded = reorderMaybe(headersReceived).split("\n");
        final String[] currentHeaders = reorderMaybe(replay.clientRequestHeaders.trim()).split("\n");

        String bodyReceived = getCodeBlock(replay);

        AssertionError error = null;
        try {
            try {
                assertThat(replay.clientRequestBody, equalTo(bodyReceived));
            } catch (AssertionError e) {
                monitor.unexpectedClientRequestBody(replay.interactionNum, mdMethod, filename, replay.context, e);
            }
        } catch (AssertionError e) {
            if (error == null) {
                error = e;
            }
        }

        try {
            try {
                assertThat(replay.clientRequestContentType, equalTo(serverResponseContentType));
            } catch (AssertionError e) {
                monitor.unexpectedClientRequestContentType(replay.interactionNum, mdMethod, filename, replay.context, e);
            }
        } catch (AssertionError e) {
            if (error == null) {
                error = e;
            }
        }

        try {
            try {
                assertThat(currentHeaders, arrayContainingInAnyOrder(prevRecorded));
            } catch (AssertionError e) {
                monitor.unexpectedClientRequestHeaders(replay.interactionNum, mdMethod, filename, replay.context, e);
            }
        } catch (AssertionError e) {
            if (error == null) {
                error = e;
            }
        }

        if (error != null) {
            throw error;
        }

        final String RESULTING_HEADERS_BACK_FROM_REAL_SERVER = "### Response headers for playback";
        replay.ix = replay.interactionText.indexOf(RESULTING_HEADERS_BACK_FROM_REAL_SERVER, replay.ix);
        try {
            assertThat(replay.ix, not(equalTo(-1)));
        } catch (AssertionError e) {
            monitor.markdownSectionHeadingMissing(replay.interactionNum, RESULTING_HEADERS_BACK_FROM_REAL_SERVER,
                    filename, replay.context, e);
        }
        String[] serverResponseHeaders = getCodeBlock(replay).split("\n");
        final String RESULTING_BODY_BACK_FROM_REAL_SERVER = "### Response body for playback";
        replay.ix = replay.interactionText.indexOf(RESULTING_BODY_BACK_FROM_REAL_SERVER, replay.ix);

        try {
            assertThat(replay.ix, not(equalTo(-1)));
        } catch (AssertionError e) {
            monitor.markdownSectionHeadingMissing(replay.interactionNum, RESULTING_BODY_BACK_FROM_REAL_SERVER,
                    filename, replay.context, e);
        }
        lineEnd = replay.interactionText.indexOf("\n", replay.ix);
        line = replay.interactionText.substring(replay.ix +4, lineEnd);
        String statusContent = line.substring(line.indexOf("(") + 1, line.indexOf(")"));
        parts = statusContent.split(": ");
        int statusCode = Integer.parseInt(parts[0]);
        serverResponseContentType = parts[1];
        Object serverResponseBody;
        if (serverResponseContentType.endsWith("- Base64 below")) {
            serverResponseContentType = serverResponseContentType.substring(0, serverResponseContentType.indexOf(" "));
            serverResponseBody = Base64.getDecoder().decode(getCodeBlock(replay));
        } else {
            serverResponseBody = getCodeBlock(replay);
        }
        return new ServiceResponse(serverResponseBody, serverResponseContentType, statusCode, serverResponseHeaders);


    }

    private String reorderMaybe(String headersReceived) {
        if (alphaSortHeaders) {
            String[] headers = headersReceived.split("\n");
            Arrays.sort(headers);
            return String.join("\n", headers);
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
            throw monitor.unexpectedInteractionRequest(interactionNum, filename, e);
        }
        return new ReplayingInteraction(interactionText, interactionNum, context);
    }

    public interface ReplayMonitor {

        void finishedButMoreInteractionsYetToDo(int interaction, String filename, AssertionError e);

        void couldNotFindInteraction(int interaction, String filename, String context, AssertionError e);

        void unexpectedClientRequestMethod(int interaction, String filename, String expectedMethod, String method, String context, AssertionError e);

        void unexpectedClientRequestUrl(String url, ReplayingInteraction rc, String method, String mdUrl, String filename, String context, AssertionError e);

        void markdownSectionHeadingMissing(int interaction, String HEADERS_SENT_TO_REAL_SERVER, String filename, String context, AssertionError e);

        void unexpectedClientRequestHeaders(int interaction, String method, String filename, String context, AssertionError e);

        void unexpectedClientRequestBody(int interaction, String method, String filename, String context, AssertionError e);

        void unexpectedClientRequestContentType(int interaction, String method, String filename, String context, AssertionError e);

        AssertionError unexpectedInteractionRequest(int interactionNum, String filename, IndexOutOfBoundsException e);

        class Default implements ReplayMonitor {

            public void finishedButMoreInteractionsYetToDo(int interaction, String filename, AssertionError e) {
                throw makeAssertionError("There are more recorded interactions after last replayed interaction: #"
                        + interaction + " in " + filename
                        + ", yet invocation of .finishedScript() possibly via .stop() implies there should be no more. Fail!!", e);
            }

            public void couldNotFindInteraction(int interaction, String filename, String context, AssertionError e) {
                throw makeAssertionError("Could not find interactions #" + interaction + " in file '" + filename + "'", e);
            }

            public void unexpectedClientRequestMethod(int interaction, String filename, String expectedMethod, String method,
                                                      String context, AssertionError e) {
                throw makeAssertionError(methodFileAndContextPrefix(interaction, expectedMethod, filename, context)
                        + ", method from the client that should be sent to real server are not the same as expected: " + method, e);
            }

            public void unexpectedClientRequestUrl(String url, ReplayingInteraction interaction, String method,
                                                   String mdUrl, String filename, String context, AssertionError e) {
                throw makeAssertionError("Method " + interaction.interactionNum + " (" + method + ") in "
                        + filename + ": " + url + " does not end in previously recorded " + mdUrl, e);
            }

            public void markdownSectionHeadingMissing(int interaction, String HEADERS_SENT_TO_REAL_SERVER, String filename,
                                                      String context, AssertionError e) {
                throw makeAssertionError("Expected '" + HEADERS_SENT_TO_REAL_SERVER + "' for interaction #"
                        + interaction + " in " + filename + ", but it was not there", e);
            }

            public void unexpectedClientRequestHeaders(int interaction, String method, String filename, String context, AssertionError e) {
                throw makeAssertionError(methodFileAndContextPrefix(interaction, method, filename, context)
                        + ", headers from the client that should be sent to real server are not the same as those previously recorded", e);
            }

            public void unexpectedClientRequestBody(int interaction, String method, String filename, String context, AssertionError e) {
                throw makeAssertionError(methodFileAndContextPrefix(interaction, method, filename, context)
                        + ", body from the client that should be sent to real server are not the same those previously recorded", e);
            }

            public void unexpectedClientRequestContentType(int interaction, String method, String filename, String context, AssertionError e) {
                throw makeAssertionError(methodFileAndContextPrefix(interaction, method, filename, context)
                        + ", content-Type of body from the client that should be sent to real server are not the same those previously recorded", e);
            }

            public AssertionError unexpectedInteractionRequest(int interactionNum, String filename, IndexOutOfBoundsException e) {
                return makeAssertionError("Replay of script '" + filename + "' hit a problem when interaction "
                        + interactionNum + " sought, but there were no more after " + (interactionNum - 1), e);
            }

            private String methodFileAndContextPrefix(int interactionNum, String mdMethod, String filename, String context) {
                return "Interaction " + interactionNum + " (method: " + mdMethod + ") in " + filename + "(context: " + context + ")";
            }

            private AssertionError makeAssertionError(String message, Throwable e) {
                return new AssertionError(message, e);
            }

        }

        class Console extends Default {
            @Override
            public void finishedButMoreInteractionsYetToDo(int interaction, String filename, AssertionError e) {
                try {
                    super.finishedButMoreInteractionsYetToDo(interaction, filename, e);
                } catch (AssertionError e1) {
                    throw printAndRethrow(e, e1);
                }
            }

            private AssertionError printAndRethrow(AssertionError e, AssertionError e1) {
                System.out.println("MarkdownReplayer.ReplayMonitor.Console: " + e.getMessage());
                e1.printStackTrace();
                return e;
            }

            @Override
            public void couldNotFindInteraction(int interaction, String filename, String context, AssertionError e) {
                try {
                    super.couldNotFindInteraction(interaction, filename, context, e);
                } catch (AssertionError e1) {
                    throw printAndRethrow(e, e1);
                }
            }

            @Override
            public void unexpectedClientRequestMethod(int interaction, String filename, String expectedMethod,
                                                      String method, String context, AssertionError e) {
                try {
                    super.unexpectedClientRequestMethod(interaction, filename, expectedMethod, method, context, e);
                } catch (AssertionError e1) {
                    throw printAndRethrow(e, e1);
                }
            }

            @Override
            public void unexpectedClientRequestUrl(String url, ReplayingInteraction interaction, String method,
                                                   String mdUrl, String filename, String context, AssertionError e) {
                try {
                    super.unexpectedClientRequestUrl(url, interaction, method, mdUrl, filename, context, e);
                } catch (AssertionError e1) {
                    throw printAndRethrow(e, e1);
                }
            }

            @Override
            public void markdownSectionHeadingMissing(int interaction, String HEADERS_SENT_TO_REAL_SERVER,
                                                      String filename, String context, AssertionError e) {
                try {
                    super.markdownSectionHeadingMissing(interaction, HEADERS_SENT_TO_REAL_SERVER, filename, context, e);
                } catch (AssertionError e1) {
                    throw printAndRethrow(e, e1);
                }
            }

            @Override
            public void unexpectedClientRequestHeaders(int interaction, String method, String filename, String context, AssertionError e) {
                try {
                    super.unexpectedClientRequestHeaders(interaction, method, filename, context, e);
                } catch (AssertionError e1) {
                    throw printAndRethrow(e, e1);
                }
            }

            @Override
            public void unexpectedClientRequestBody(int interaction, String method, String filename, String context, AssertionError e) {
                try {
                    super.unexpectedClientRequestBody(interaction, method, filename, context, e);
                } catch (AssertionError e1) {
                    throw printAndRethrow(e, e1);
                }
            }

            @Override
            public void unexpectedClientRequestContentType(int interaction, String method, String filename, String context, AssertionError e) {
                try {
                    super.unexpectedClientRequestContentType(interaction, method, filename, context, e);
                } catch (AssertionError e1) {
                    throw printAndRethrow(e, e1);
                }
            }

        }
    }
}
