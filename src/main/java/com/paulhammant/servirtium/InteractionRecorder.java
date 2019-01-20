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
import java.util.Map;

import static junit.framework.TestCase.fail;

public class InteractionRecorder implements RecordOrPlayback {

    private final ServiceInteroperation serviceInteroperation;
    private final InteractionManipulations interactionManipulations;
    private PrintStream out;
    private String bodyToReal;
    private String contentTypeToReal;
    private String filename;
    private Map<Integer, String> interactions = new HashMap<>();

    public InteractionRecorder(ServiceInteroperation serviceInteroperation,
                               InteractionManipulations interactionManipulations) {
        this.serviceInteroperation = serviceInteroperation;
        this.interactionManipulations = interactionManipulations;
    }

    public ServiceResponse getServiceResponse(String method, String url, Map<String, String> headersToReal, Context ctx) throws IOException {
        headersToReal.remove("Accept-Encoding");
        return serviceInteroperation.invokeServiceEndpoint(method, this.bodyToReal, this.contentTypeToReal, url, headersToReal, interactionManipulations);
    }

    public static class RecordingContext extends Context {

        private StringBuilder recording = new StringBuilder();

        public RecordingContext(int interactionNumber) {
            super(interactionNumber);
        }
    }

    @Override
    public Context newInteraction(String method, String path, int counter) {
        guardOut();
        RecordingContext rc = new RecordingContext(counter);

        rc.recording.append("## Interaction ").append(counter).append(": ").append(method).append(" ").append(path).append("\n\n");
        return rc;
    }

    private void guardOut() {
        if (out == null) {
            fail("Recording in progress, but previous recording was finishedScript() and/or no new setMarkdownScriptFilename(..) started");
        }
    }

    @Override
    public void requestHeaders(Map<String, String> headers, Context ctx) {
        RecordingContext rc = (RecordingContext) ctx; 
        guardOut();
        rc.recording.append("### Request headers sent to the real server:\n\n");
        rc.recording.append("```\n");
        for (String k : headers.keySet()) {
            String v = headers.get(k);
            rc.recording.append(k).append(": ").append(v).append("\n");
        }
        rc.recording.append("```\n\n");
    }

    @Override
    public void requestBody(String bodyToReal, String contentTypeToReal, Context ctx) {
        RecordingContext rc = (RecordingContext) ctx;
        this.bodyToReal = bodyToReal;
        this.contentTypeToReal = contentTypeToReal;
        guardOut();
        rc.recording.append("### Body sent to the real server (").append(contentTypeToReal).append("):\n");
        rc.recording.append("\n");
        rc.recording.append("```\n");
        rc.recording.append(bodyToReal).append("\n");
        rc.recording.append("```\n");
        rc.recording.append("\n");
    }

    @Override
    public void responseHeaders(Context ctx, String[] headers) {
        RecordingContext rc = (RecordingContext) ctx;
        guardOut();
        rc.recording.append("### Resulting headers back from the real server:\n");
        rc.recording.append("\n");
        rc.recording.append("```\n");
        for (String hdrLine : headers) {
            int ix = hdrLine.indexOf(": ");
            String hdrKey = hdrLine.substring(0, ix);
            String hdrVal = hdrLine.substring(ix + 2);
            rc.recording.append(hdrKey).append(": ").append(interactionManipulations.headerReplacement(hdrKey, hdrVal)).append("\n");
        }
        rc.recording.append("```\n");
        rc.recording.append("\n");
    }

    @Override
    public void responseBody(Context ctx, Object body, int statusCode, String contentType) {
        RecordingContext rc = (RecordingContext) ctx;
        guardOut();
        String xtra = "";
        if (body instanceof byte[]) {
            xtra = " - Base64 below";
        }
        rc.recording.append("### Resulting body back from the real server (").append(statusCode).append(": ").append(contentType).append(xtra).append("):\n");
        rc.recording.append("\n");
        rc.recording.append("```\n");
        if (body instanceof String) {
            rc.recording.append(body).append("\n");
        } else if (body instanceof byte[]) {
            rc.recording.append(Base64.getEncoder().encodeToString((byte[]) body)).append("\n");
        } else {
            throw new UnsupportedOperationException();
        }
        rc.recording.append("```\n");
        rc.recording.append("\n");

        this.interactions.put(rc.interactionNum, rc.recording.toString());
    }

    public void finishedScript(int counter) {
        if (this.out != null) {
            int i = 0;
            while (this.interactions.size() >0) {
                this.out.print(this.interactions.remove(i++));
            }
            this.out.close();
            this.out = null;
        }
    }

    public void setMarkdownScriptFilename(String filename) throws FileNotFoundException {
        setOutputStream(filename, new FileOutputStream(filename));
    }

    public void setOutputStream(String filename, OutputStream out) {
        this.filename = filename;
        if (out != null) {
            this.out = new PrintStream(out);
        }
    }

}
