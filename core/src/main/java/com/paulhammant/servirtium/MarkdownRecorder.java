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
import java.io.IOException;
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

    public MarkdownRecorder(ServiceInteroperation serviceInteroperation,
                            InteractionManipulations interactionManipulations) {
        this.serviceInteroperation = serviceInteroperation;
        this.interactionManipulations = interactionManipulations;
    }

    public MarkdownRecorder withAlphaSortingOfHeaders() {
        alphaSortHeaders = true;
        return this;
    }

    public ServiceResponse getServiceResponseForRequest(String method, String url, List<String> headersToReal, Interaction interaction, boolean lowerCaseHeaders) throws IOException {
        //headersToReal.remove("Accept-Encoding");
        return serviceInteroperation.invokeServiceEndpoint(method, interaction.clientRequestBody, interaction.clientRequestContentType, url, headersToReal, interactionManipulations, lowerCaseHeaders);
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

        public void noteClientRequestHeadersAndBody(List<String> clientRequestHeaders, Object clientRequestBody, String clientRequestContentType) {

            guardOut();

            blockStart("Request headers sent to the real server");

            final String[] headersToRecord = clientRequestHeaders.toArray(new String[0]);
            if (alphaSortHeaders) {
                Arrays.sort(headersToRecord);
            }
            for (String h : headersToRecord) {
                for (String redactionRegex : redactions.keySet()) {
                    h = h.replaceAll(redactionRegex, redactions.get(redactionRegex));
                }
                this.recording.append(h).append("\n");
            }

            blockEnd();

            // Body

            super.noteClientRequestBody(clientRequestBody, clientRequestContentType);

            guardOut();
            blockStart("Body sent to the real server (" + clientRequestContentType + ")");
            String forRecording = null;
            if (clientRequestBody == null) {
                forRecording = "";
            } else if (clientRequestBody instanceof String) {
                forRecording = (String) clientRequestBody;
                for (String redactionRegex : redactions.keySet()) {
                    forRecording = ((String) forRecording).replaceAll(redactionRegex, redactions.get(redactionRegex));
                }
            } else {
                forRecording = "//SERVIRTIUM+Base64: " + Base64.getEncoder().encodeToString((byte[]) clientRequestBody).replaceAll("(.{60})", "$1\n");
            }
            this.recording.append(forRecording).append("\n");

            blockEnd();

        }

        private void recordResponseHeaders(String[] headers) {
            guardOut();
            blockStart("Resulting headers back from the real server");
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
                this.recording.append(hdrKey).append(": ").append(interactionManipulations.headerReplacement(hdrKey, hdrVal)).append("\n");
            }

            blockEnd();

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
        public void noteResponseHeadersAndBody(String[] headers, Object body, int statusCode, String contentType) {
            this.recordResponseHeaders(headers);
            this.recordResponseBody(body, statusCode, contentType);
        }

        private void recordResponseBody(Object body, int statusCode, String contentType) {

            guardOut();

            String xtra = "";
            if (body instanceof byte[]) {
                xtra = " - Base64 below";
            }

            blockStart("Resulting body back from the real server (" + statusCode + ": " + contentType + xtra + ")");

            if (body instanceof String) {
                for (String next : redactions.keySet()) {
                    body = ((String) body).replaceAll(next, redactions.get(next));
                }
                this.recording.append(body).append("\n");
            } else if (body instanceof byte[]) {
                this.recording.append(Base64.getEncoder().encodeToString((byte[]) body)).append("\n");
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

        rc.recording.append("## Interaction ").append(interactionNum).append(": ").append(method).append(" ").append(path).append("\n\n");
        return rc;
    }

    private void guardOut() {
        if (out == null) {
            throw new AssertionError("Recording in progress, but previous recording was finishedScript() and/or no new setScriptFilename(..) started");
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
