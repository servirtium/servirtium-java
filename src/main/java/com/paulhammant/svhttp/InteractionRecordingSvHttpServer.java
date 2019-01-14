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

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Base64;
import java.util.Map;

import static junit.framework.TestCase.fail;

public class InteractionRecordingSvHttpServer extends SvHttpServer {

    private final ServiceInteroperation httpInteractor;
    private PrintStream out;
    private String bodyToReal;
    private String contentTypeToReal;
    private String filename;

    public InteractionRecordingSvHttpServer(ServerMonitor serverMonitor, ServiceInteroperation realHttpInteractor,
                                            int port, boolean ssl, InteractionManipulations interactionManipulations) {
        super(serverMonitor, port, ssl, interactionManipulations);
        this.httpInteractor = realHttpInteractor;
    }

    public static String localResourceFileEquivFor(Class<?> aClass, String testMethod) {
        String file = aClass.getProtectionDomain().getCodeSource().getLocation().getFile();
        String root = file.substring(0, file.indexOf("/target"));
        String root2 = root + "/src/test/resources/" + aClass.getCanonicalName() + "." + testMethod + ".md";
        return root2;
    }

    protected ServiceResponse getServiceResponse(String method, String url, Map<String, String> headersToReal, Context ctx) throws IOException {
        headersToReal.remove("Accept-Encoding");
        return httpInteractor.invokeServiceEndpoint(method, this.bodyToReal, this.contentTypeToReal, url, headersToReal, interactionManipulations);
    }

    public static class RecordingContext extends Context {

        private StringBuilder out = new StringBuilder();
        private int interactionNumber;

    }

    @Override
    protected Context newInteraction(String method, String path, int counter) {
        guardOut();
        RecordingContext rc = new RecordingContext();

        rc.out.append("## Interaction ").append(counter).append(": ").append(method).append(" ").append(path).append("\n\n");
        rc.interactionNumber = counter;
        return rc;
    }

    private void guardOut() {
        if (out == null) {
            fail("Recording in progress, but previous recording was finishedMarkdownScript() and/or no new setMarkdownScriptFilename(..) started");
        }
    }

    @Override
    protected void requestHeaders(Map<String, String> headers, Context ctx) {
        RecordingContext rc = (RecordingContext) ctx; 
        guardOut();
        rc.out.append("### Request headers sent to the real server:\n\n");
        rc.out.append("```\n");
        for (String k : headers.keySet()) {
            String v = headers.get(k);
            rc.out.append(k).append(": ").append(v).append("\n");
        }
        rc.out.append("```\n\n");
    }

    @Override
    protected void requestBody(String bodyToReal, String contentTypeToReal, Context ctx) {
        RecordingContext rc = (RecordingContext) ctx;
        this.bodyToReal = bodyToReal;
        this.contentTypeToReal = contentTypeToReal;
        guardOut();
        rc.out.append("### Body sent to the real server (").append(contentTypeToReal).append("):\n");
        rc.out.append("\n");
        rc.out.append("```\n");
        rc.out.append(bodyToReal).append("\n");
        rc.out.append("```\n");
        rc.out.append("\n");
    }

    @Override
    protected void responseHeaders(Context ctx, String[] headers) {
        RecordingContext rc = (RecordingContext) ctx;
        guardOut();
        rc.out.append("### Resulting headers back from the real server:\n");
        rc.out.append("\n");
        rc.out.append("```\n");
        for (String hdrLine : headers) {
            int ix = hdrLine.indexOf(": ");
            String hdrKey = hdrLine.substring(0, ix);
            String hdrVal = hdrLine.substring(ix + 2);
            rc.out.append(hdrKey).append(": ").append(interactionManipulations.headerReplacement(hdrKey, hdrVal)).append("\n");
        }
        rc.out.append("```\n");
        rc.out.append("\n");
    }

    @Override
    protected void responseBody(Context ctx, Object body, int statusCode, String contentType) {
        RecordingContext rc = (RecordingContext) ctx;
        guardOut();
        String xtra = "";
        if (body instanceof byte[]) {
            xtra = " - Base64 below";
        }
        rc.out.append("### Resulting body back from the real server (").append(statusCode).append(": ").append(contentType).append(xtra).append("):\n");
        rc.out.append("\n");
        rc.out.append("```\n");
        if (body instanceof String) {
            rc.out.append(body).append("\n");
        } else if (body instanceof byte[]) {
            rc.out.append(Base64.getEncoder().encodeToString((byte[]) body)).append("\n");
        } else {
            throw new UnsupportedOperationException();
        }
        rc.out.append("```\n");
        rc.out.append("\n");

        this.out.print(((RecordingContext) ctx).out.toString());
    }

    public void finishedMarkdownScript() {
        if (this.out != null) {
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
        resetCounter();
    }

    public static void main(String[] args)  {
    }

}
