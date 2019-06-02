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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarkdownRecorder implements InteractionMonitor {

    private final ServiceInteroperation serviceInteroperation;
    private final InteractionManipulations interactionManipulations;
    private PrintStream out;
    private Map<Integer, String> interactions = new HashMap<>();
    private Map<Integer, List<Note>> notes = new HashMap<>();
    private Map<String, String> replacements = new HashMap<>();
    private boolean alphaSortHeaders;
    private boolean extraDebugOutput;

    public static class Note  {
        String title;
        private final String multiline;
        String body;

        public Note(String title, String multiline) {
            this.title = title;
            this.multiline = multiline;
        }
    }

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
        replacements.put(regex, replacement);
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
            replacements.put(terms[x*2], terms[(x*2)+1]);
        }
        return this;
    }

    public void codeNoteForNextInteraction(String title, String multiline) {
        noteForNextInteraction(title, "```\n" + multiline + "\n```");
    }

    public void noteForNextInteraction(String title, String multiline) {

        int key = interactions.size() + 1;
        List<Note> n = notes.get(key);
        if (n == null) {
            n = new ArrayList<Note>();
            notes.put(key, n);
        }
        n.add(new Note(title, multiline));
    }

    public class RecordingInteraction extends Interaction {

        private StringBuilder recording = new StringBuilder();

        RecordingInteraction(int interactionNumber, String context) {
            super(interactionNumber, context);
        }

        @Override
        public void complete() {
            MarkdownRecorder.this.addInteraction(this);
        }

        public List<String> noteClientRequestHeadersAndBody(InteractionManipulations interactionManipulations,
                                                            List<String> clientRequestHeaders, Object clientRequestBody,
                                                            String clientRequestContentType, String method, boolean lowerCaseHeaders) {

            if (clientRequestBody == null) {
                clientRequestBody = "";
            }

            guardOut();


            if (extraDebugOutput) {

                // Debug of original client headers

                blockStart("DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC");
                for (String s : clientRequestHeaders) {
                    this.recording.append(s).append("\n");
                }
                blockEnd();
            }

            // Headers recorded for playback

            List<String> clientRequestHeaders2 = changeRequestHeadersIfNeeded(interactionManipulations, clientRequestHeaders, method, lowerCaseHeaders);

            interactionManipulations.changeAnyHeadersForRequestToRealService(clientRequestHeaders2);

            final String[] headersToRecord = clientRequestHeaders2.toArray(new String[0]);

            if (alphaSortHeaders) {
                Arrays.sort(headersToRecord);
            }
            final List<String> headersToRecord2 = new ArrayList<>();
            for (String h : headersToRecord) {
                for (String replacementRegex : replacements.keySet()) {
                    h = h.replaceAll(replacementRegex, replacements.get(replacementRegex));
                }
                headersToRecord2.add(h);
            }

            blockStart("Request headers recorded for playback");
            for (String s : headersToRecord2) {
                this.recording.append(s).append("\n");
            }
            blockEnd();

            // Body

            if (extraDebugOutput) {
                blockStart("DEBUG: Request body as received from client (" + clientRequestContentType + "), WITHOUT REDACTIONS, ETC");
                if (clientRequestBody instanceof String) {
                    this.recording.append(clientRequestBody).append("\n");

                } else {
                    this.recording.append(objectToStringForRecording((byte[]) clientRequestBody)).append("\n");
                }
                blockEnd();
            }

            if (clientRequestBody instanceof String) {
                clientRequestBody = interactionManipulations.changeBodyForRequestToRealService((String) clientRequestBody);
            }

            super.setClientRequestBodyAndContentType(clientRequestBody, clientRequestContentType);

            String forRecording = null;
            if (clientRequestBody == null) {
                forRecording = "";
            } else if (clientRequestBody instanceof String) {
                forRecording = (String) clientRequestBody;
                for (String redactionRegex : replacements.keySet()) {
                    forRecording = forRecording.replaceAll(redactionRegex, replacements.get(redactionRegex));
                }
            } else {
                forRecording = objectToStringForRecording((byte[]) clientRequestBody);
            }

            blockStart("Request body recorded for playback (" + clientRequestContentType + ")");
            this.recording.append(forRecording).append("\n");
            blockEnd();

            return Arrays.asList(headersToRecord);
        }

        private String objectToStringForRecording(byte[] clientRequestBody) {
            return "//SERVIRTIUM+Base64: " + Base64.getEncoder()
                    .encodeToString(clientRequestBody).replaceAll("(.{60})", "$1\n");
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
                doServiceResponseHeaders(headers, "DEBUG: Response Headers for client, possibly changed after recording");
            }
        }

        @Override
        public void debugOriginalServiceResponseBody(Object serviceResponseBody, int statusCode, String serviceResponseContentType) {
            if (extraDebugOutput) {
                doServiceResponseBody(serviceResponseBody, statusCode, serviceResponseContentType, "DEBUG: Response body from real service, unchanged");
            }
        }

        @Override
        public void debugClientsServiceResponseBody(Object serviceResponseBody, int statusCode, String serviceResponseContentType) {
            if (extraDebugOutput) {
                doServiceResponseBody(serviceResponseBody, statusCode, serviceResponseContentType, "DEBUG: Response body for client, possibly changed after recording");
            }
        }

        @Override
        public void noteServiceResponseHeaders(String[] headers) {

            doServiceResponseHeaders(headers, "Response headers recorded for playback");

        }

        @Override
        public void noteServiceResponseBody(Object serviceResponseBody, int statusCode,
                                            String serviceResponseContentType) {

            doServiceResponseBody(serviceResponseBody, statusCode, serviceResponseContentType, "Response body recorded for playback");
        }

        @Override
        public void noteChangedResourceForRequestToClient(String from, String to) {
            if (extraDebugOutput) {
                blockStart("DEBUG Note: Resource changed for call to real server");
                this.recording.append("From:").append(from).append("\n");
                this.recording.append("To:").append(to).append("\n");
                blockEnd();
            }
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
                for (String next : replacements.keySet()) {
                    hdrVal = hdrVal.replaceAll(next, replacements.get(next));
                }
                this.recording.append(hdrKey).append(": ").append(
                        interactionManipulations.headerReplacement(hdrKey, hdrVal)).append("\n");
            }

            blockEnd();

        }

        private void doServiceResponseBody(Object serviceResponseBody, int statusCode, String serviceResponseContentType, String title) {

            guardOut();

            String xtra = "";
            if (serviceResponseBody instanceof byte[]) {
                xtra = " - Base64 below";
            }

            blockStart(title + " (" + statusCode + ": " + serviceResponseContentType + xtra + ")");

            if (serviceResponseBody instanceof String) {
                for (String next : replacements.keySet()) {
                    serviceResponseBody = ((String) serviceResponseBody).replaceAll(next, replacements.get(next));
                }
                this.recording.append(serviceResponseBody).append("\n");
            } else if (serviceResponseBody instanceof byte[]) {
                this.recording.append(Base64.getEncoder().encodeToString((byte[]) serviceResponseBody)).append("\n");
            } else {
                throw new UnsupportedOperationException();
            }

            blockEnd();
        }

    }

    private void addInteraction(Interaction interaction) {
        this.interactions.put(interaction.interactionNum, ((RecordingInteraction) interaction).recording.toString());
    }

    @Override
    public Interaction newInteraction(String method, String path, int interactionNum, String url, String context) {
        guardOut();

        String path2 = path;

        for (String replacementRegex : replacements.keySet()) {
            path2 = path2.replaceAll(replacementRegex, replacements.get(replacementRegex));
        }

        RecordingInteraction rc = new RecordingInteraction(interactionNum, context);

        rc.recording.append("## Interaction ").append(interactionNum).append(": ").append(method)
                .append(" ").append(path2).append("\n\n");
        return rc;
    }

    private void guardOut() {
        if (out == null) {
            throw new AssertionError("Recording in progress, but no PrintStream set up for " +
                    "the recording. See setScriptFilename(..)");
        }
    }

    public void finishedScript(int interactionNum, boolean failed) {
        if (this.out != null) {
            int i = 0;
            while (this.interactions.size() >0) {

                String interaction = this.interactions.remove(i++);

                List<Note> n = notes.get(i);
                if (n != null) {
                    StringBuilder sb = new StringBuilder();
                    for (Note note : n) {
                        sb.append("## [Note] ").append(note.title).append(":\n")
                                .append("\n")
                                .append(note.multiline)
                                .append("\n");

                    }
                    interaction = interaction.replaceAll("### Request headers recorded for playback:", sb.toString() + "\n### Request headers recorded for playback:");
                }

                this.out.print(interaction);
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
