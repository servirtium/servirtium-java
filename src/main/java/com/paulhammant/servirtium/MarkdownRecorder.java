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
import java.util.Base64;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static junit.framework.TestCase.fail;

public class MarkdownRecorder implements Interactor {

    private final ServiceInteroperation serviceInteroperation;
    private final InteractionManipulations interactionManipulations;
    private PrintStream out;
    private Map<Integer, String> interactions = new HashMap<>();
    private Map<String, String> redactions = new HashMap<>();

    public MarkdownRecorder(ServiceInteroperation serviceInteroperation,
                            InteractionManipulations interactionManipulations) {
        this.serviceInteroperation = serviceInteroperation;
        this.interactionManipulations = interactionManipulations;
    }

    public ServiceResponse getServiceResponseForRequest(String method, String url, Map<String, String> headersToReal, Interaction interaction) throws IOException {
        //headersToReal.remove("Accept-Encoding");
        return serviceInteroperation.invokeServiceEndpoint(method, interaction.bodyToReal, interaction.contentTypeToReal, url, headersToReal, interactionManipulations);
    }

    public MarkdownRecorder withRedaction(String regex, String replacement) {
        redactions.put(regex, replacement);
        return this;
    }

    public class RecordingInteraction extends Interaction {

        private StringBuilder recording = new StringBuilder();

        RecordingInteraction(int interactionNumber) {
            super(interactionNumber);
        }

        @Override
        public void recordRequestHeaders(Map<String, String> headers) {
            guardOut();
            this.recording.append("### Request headers sent to the real server:\n\n");
            this.recording.append("```\n");
            for (String k : headers.keySet()) {
                String v = headers.get(k);
                this.recording.append(k).append(": ").append(v).append("\n");
            }
            this.recording.append("```\n\n");
        }

        @Override
        public void recordRequestBody(String bodyToReal, String contentTypeToReal) {
            super.recordRequestBody(bodyToReal, contentTypeToReal);
            guardOut();
            this.recording.append("### Body sent to the real server (").append(contentTypeToReal).append("):\n");
            this.recording.append("\n");
            this.recording.append("```\n");
            this.recording.append(bodyToReal).append("\n");
            this.recording.append("```\n");
            this.recording.append("\n");
        }

        @Override
        public void recordResponseHeaders(String[] headers) {
            guardOut();
            this.recording.append("### Resulting headers back from the real server:\n");
            this.recording.append("\n");
            this.recording.append("```\n");
            for (String hdrLine : headers) {
                int ix = hdrLine.indexOf(": ");
                String hdrKey = hdrLine.substring(0, ix);
                String hdrVal = hdrLine.substring(ix + 2);
                for (String next : redactions.keySet()) {
                    hdrVal = hdrVal.replaceAll(next, redactions.get(next));
                }
                this.recording.append(hdrKey).append(": ").append(interactionManipulations.headerReplacement(hdrKey, hdrVal)).append("\n");
            }
            this.recording.append("```\n");
            this.recording.append("\n");
        }

        @Override
        public void recordResponseBody(Object body, int statusCode, String contentType) {
            guardOut();
            String xtra = "";
            if (body instanceof byte[]) {
                xtra = " - Base64 below";
            }
            this.recording.append("### Resulting body back from the real server (").append(statusCode).append(": ").append(contentType).append(xtra).append("):\n");
            this.recording.append("\n");
            this.recording.append("```\n");
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
            this.recording.append("```\n");
            this.recording.append("\n");
        }

    }

    @Override
    public void addInteraction(Interaction interaction) {
        this.interactions.put(interaction.interactionNum, ((RecordingInteraction) interaction).recording.toString());
    }

    @Override
    public Interaction newInteraction(String method, String path, int interactionNum, String url) {
        guardOut();
        RecordingInteraction rc = new RecordingInteraction(interactionNum);

        rc.recording.append("## Interaction ").append(interactionNum).append(": ").append(method).append(" ").append(path).append("\n\n");
        return rc;
    }

    private void guardOut() {
        if (out == null) {
            fail("Recording in progress, but previous recording was finishedScript() and/or no new setScriptFilename(..) started");
        }
    }

    public void finishedScript(int interactionNum) {
        if (this.out != null) {
            int i = 0;
            while (this.interactions.size() >0) {
                this.out.print(this.interactions.remove(i++));
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
