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

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarkdownRecorder implements Interactor {

    private final ServiceInteroperation serviceInteroperation;
    private final InteractionManipulations interactionManipulations;
    private PrintStream out;
    private Map<Integer, String> interactions = new HashMap<>();
    private Map<String, String> redactions = new HashMap<>();
    private boolean alphaSortHeaders;
    private boolean extraDebugOutput;

    public MarkdownRecorder(ServiceInteroperation serviceInteroperation, InteractionManipulations interactionManipulations) {
        this.serviceInteroperation = serviceInteroperation;
        this.interactionManipulations = interactionManipulations;
    }

    public MarkdownRecorder withAlphaSortingOfHeaders() {
        alphaSortHeaders = true;
        return this;
    }

    public MarkdownRecorder withExtraDebugOutput() {
        extraDebugOutput = true;
        return this;
    }

    public ServiceResponse getServiceResponseForRequest(String method, String url, List<String> clientRequestHeaders,
                                                        Interaction interaction, boolean lowerCaseHeaders) {
        //clientRequestHeaders.remove("Accept-Encoding");
        return serviceInteroperation.invokeServiceEndpoint(method, interaction.clientRequestBody,
                interaction.clientRequestContentType, url, clientRequestHeaders, interactionManipulations, lowerCaseHeaders);
    }

    /**
     * In the recording, some things that will be recorded differently to
     * what was sent/received to/from the real.
     * @param regex - something that may be in the read data sent to/from the real.
     * @param replacement - something that will replace the above in the recording.
     * @return this
     */
    public MarkdownRecorder withReplacementInRecording(String regex, String replacement) {
        redactions.put(regex, replacement);
        return this;
    }

    /**
     * In the recording, some things that will be recorded differently to
     * what was sent/received to/from the real.
     * @param terms - an even number of 'regex' and 'replacement' pairs.
     * @return this
     */
    public MarkdownRecorder withReplacementsInRecording(String... terms) {
        final int i = terms.length / 2;
        for (int x = 0; x < i; x++) {
            redactions.put(terms[x*2], terms[(x*2)+1]);
        }
        return this;
    }

    public class RecordingInteraction extends Interaction {

        private StringBuilder recording = new StringBuilder();

        RecordingInteraction(int interactionNumber, String context) {
            super(interactionNumber, context);
        }

        public List<String> noteClientRequestHeadersAndBody(InteractionManipulations interactionManipulations,
                                                            List<String> clientRequestHeaders, Object clientRequestBody,
                                                            String clientRequestContentType, String method, boolean lowerCaseHeaders) {

            if (clientRequestBody == null) {
                clientRequestBody = "";
            }

            guardOut();


            if (extraDebugOutput) {

                // Debug / Raw headers

                blockStart("DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC");
                for (String s : clientRequestHeaders) {
                    this.recording.append(s).append("\n");
                }
                blockEnd();
            }

            // Headers for playback

            List<String> clientRequestHeaders2 = changeRequestHeadersIfNeeded(interactionManipulations, clientRequestHeaders, method, lowerCaseHeaders);

            interactionManipulations.changeAnyHeadersForRequestToService(clientRequestHeaders2);

            final String[] headersToRecord = clientRequestHeaders2.toArray(new String[0]);

            if (alphaSortHeaders) {
                Arrays.sort(headersToRecord);
            }
            final String[] headersToRecord2 = new String[headersToRecord.length];
            int ix = 0;
            for (String h : headersToRecord) {
                for (String redactionRegex : redactions.keySet()) {
                    h = h.replaceAll(redactionRegex, redactions.get(redactionRegex));
                }
                headersToRecord2[ix++ ] = h;
            }

            blockStart("Request headers for playback");
            for (String s : headersToRecord2) {
                this.recording.append(s).append("\n");
            }
            blockEnd();

            // Body


            if (clientRequestBody instanceof String) {
                clientRequestBody = interactionManipulations.changeBodyForRequestToService((String) clientRequestBody);
            }

            super.setClientRequestBodyAndContentType(clientRequestBody, clientRequestContentType);

            if (extraDebugOutput) {
                blockStart("DEBUG: Request body as received from client (" + clientRequestContentType + "), WITHOUT REDACTIONS, ETC");
                this.recording.append(clientRequestBody).append("\n");
                blockEnd();
            }

            String forRecording = null;
            if (clientRequestBody == null) {
                forRecording = "";
            } else if (clientRequestBody instanceof String) {
                forRecording = (String) clientRequestBody;
                for (String redactionRegex : redactions.keySet()) {
                    forRecording = forRecording.replaceAll(redactionRegex, redactions.get(redactionRegex));
                }
            } else {
                forRecording = "//SERVIRTIUM+Base64: " + Base64.getEncoder()
                        .encodeToString((byte[]) clientRequestBody).replaceAll("(.{60})", "$1\n");
            }

            blockStart("Request body for playback (" + clientRequestContentType + ")");
            this.recording.append(forRecording).append("\n");
            blockEnd();

            return clientRequestHeaders2;
        }

        private void blockStart(String s) {
            this.recording.append("### ").append(s).append(":\n")
                    .append("\n")
                    .append("```\n");
        }

        private void blockEnd() {
            this.recording.append("```\n");
            this.recording.append("\n");
        }

        @Override
        public void debugOriginalServiceResponseHeaders(String[] headers) {
            if (extraDebugOutput) {
                doServiceResponseHeaders(headers, "DEBUG: Response headers from real service, unchanged");
            }
        }

        @Override
        public void debugClientsServiceResponseHeaders(String[] headers) {
            if (extraDebugOutput) {
                doServiceResponseHeaders(headers, "DEBUG: Headers for client, possibly changed after recording");
            }
        }

        @Override
        public void debugOriginalServiceResponseBody(Object serverResponseBody, int statusCode, String serverResponseContentType) {
            if (extraDebugOutput) {
                doServiceResponseBody(serverResponseBody, statusCode, serverResponseContentType, "DEBUG: Response body from real service, unchanged");
            }
        }

        @Override
        public void debugClientsServiceResponseBody(Object serverResponseBody, int statusCode, String serverResponseContentType) {
            if (extraDebugOutput) {
                doServiceResponseBody(serverResponseBody, statusCode, serverResponseContentType, "DEBUG: Response body for client, possibly changed after recording");
            }
        }

        @Override
        public void noteServiceResponseHeaders(String[] headers) {

            doServiceResponseHeaders(headers, "Response headers for playback");

        }

        @Override
        public void noteServiceResponseBody(Object serverResponseBody, int statusCode,
                                            String serverResponseContentType) {

            doServiceResponseBody(serverResponseBody, statusCode, serverResponseContentType, "Response body for playback");
        }

        private void doServiceResponseHeaders(String[] headers, String title) {

            guardOut();

            blockStart(title);

            if (alphaSortHeaders) {
                Arrays.sort(headers);
            }
            for (String hdrLine : headers) {
                int ix = hdrLine.indexOf(": ");
                String hdrKey = hdrLine.substring(0, ix);
                String hdrVal = hdrLine.substring(ix + 2);
                for (String next : redactions.keySet()) {
                    hdrVal = hdrVal.replaceAll(next, redactions.get(next));
                }
                this.recording.append(hdrKey).append(": ").append(
                        interactionManipulations.headerReplacement(hdrKey, hdrVal)).append("\n");
            }

            blockEnd();

        }

        private void doServiceResponseBody(Object serverResponseBody, int statusCode, String serverResponseContentType, String title) {

            guardOut();

            String xtra = "";
            if (serverResponseBody instanceof byte[]) {
                xtra = " - Base64 below";
            }

            blockStart(title + " (" + statusCode + ": " + serverResponseContentType + xtra + ")");

            if (serverResponseBody instanceof String) {
                for (String next : redactions.keySet()) {
                    serverResponseBody = ((String) serverResponseBody).replaceAll(next, redactions.get(next));
                }
                this.recording.append(serverResponseBody).append("\n");
            } else if (serverResponseBody instanceof byte[]) {
                this.recording.append(Base64.getEncoder().encodeToString((byte[]) serverResponseBody)).append("\n");
            } else {
                throw new UnsupportedOperationException();
            }

            blockEnd();
        }

    }

    @Override
    public void addInteraction(Interaction interaction) {
        this.interactions.put(interaction.interactionNum, ((RecordingInteraction) interaction).recording.toString());
    }

    @Override
    public Interaction newInteraction(String method, String path, int interactionNum, String url, String context) {
        guardOut();
        RecordingInteraction rc = new RecordingInteraction(interactionNum, context);

        rc.recording.append("## Interaction ").append(interactionNum).append(": ").append(method)
                .append(" ").append(path).append("\n\n");
        return rc;
    }

    private void guardOut() {
        if (out == null) {
            throw new AssertionError("Recording in progress, but previous recording was " +
                    "finishedScript() and/or no new setScriptFilename(..) started");
        }
    }

    public void finishedScript(int interactionNum, boolean failed) {
        if (this.out != null) {
            int i = 0;
            while (this.interactions.size() >0) {
                this.out.print(this.interactions.remove(i++));
            }
            if (failed) {
                this.out.println("# Failure noted during recording.\n\nMeaning this recording may be shorter than intended. " +
                        "That all depends on how the test was coded though.");
            }
            this.out.close();
            this.out = null;
        }
    }

    public void setScriptFilename(String filename) throws FileNotFoundException {
        setOutputStream(filename, new FileOutputStream(filename));
    }

    public void setOutputStream(String filename, OutputStream out) {
        if (out != null) {
            this.out = new PrintStream(out);
        }
    }

}
