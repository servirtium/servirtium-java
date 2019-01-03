/*
        SvHTTP: Service Virtualized HTTP

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
        either expressed or implied, of the SvHTTP project.
*/

package com.paulhammant.svhttp;

import com.google.common.base.Supplier;
import org.jooby.Jooby;
import org.jooby.Mutant;
import org.jooby.Request;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Map;

import static junit.framework.TestCase.fail;

public class ServiceInteractionRecorder extends ServiceInteractionDelegate {

    private final RealServiceInteractor httpInteractor;
    private int CTR = 0;
    private PrintStream out;
    private String bodyToReal;
    private String contentTypeToReal;
    private String filename;

    public ServiceInteractionRecorder(RealServiceInteractor realHttpInteractor,
                                      int port, boolean ssl, HeaderManipulator headerManipultor) {
        super(port, ssl, headerManipultor);
        this.httpInteractor = realHttpInteractor;
    }

    public static String localResourceFileEquivFor(Class<?> aClass, String testMethod) {
        String file = aClass.getProtectionDomain().getCodeSource().getLocation().getFile();
        String root = file.substring(0, file.indexOf("/target"));
        String root2 = root + "/src/test/resources/" + aClass.getCanonicalName() + "." + testMethod + ".md";
        return root2;
    }

    protected ServiceResponse getRealResponse(String method, String url, Map<String, String> headersToReal) throws IOException {
        headersToReal.remove("Accept-Encoding");
        return httpInteractor.invokeOnRealAndRecordResult(method, this.bodyToReal, this.contentTypeToReal, url, headersToReal, headerManipulator);
    }

    @Override
    protected void newMethod(Request req, String method) {
        guardOut();
        out.println("## " + CTR + ": " + method + " " + req.rawPath() + "\n");
    }

    private void guardOut() {
        if (out == null) {
            fail("Recording in progress, but previous recording was finished() and/or no new setFilename(..) started");
        }
    }

    @Override
    protected void headersReceived(Map<String, Mutant> headers) {
        guardOut();
        out.println("### Assert that request headers are:");
        out.println("");
        out.println("```");
        for (String k : headers.keySet()) {
            Mutant v = headers.get(k);
            out.println(k + ": " + v.value());
        }
        out.println("```");
        out.println("");
    }

    @Override
    protected void bodyReceived(String bodyToReal, String contentTypeToReal) {
        this.bodyToReal = bodyToReal;
        this.contentTypeToReal = contentTypeToReal;
        guardOut();
        out.println("### Assert that request body is (" + contentTypeToReal + "):");
        out.println("");
        out.println("```");
        out.println(bodyToReal);
        out.println("```");
        out.println("");
    }

    @Override
    protected void headersToReturn(ServiceResponse rv) {
        guardOut();
        out.println("### Resulting Headers");
        out.println("");
        out.println("```");
        for (String hdrLine : rv.headers) {
            int ix = hdrLine.indexOf(": ");
            String hdrKey = hdrLine.substring(0, ix);
            String hdrVal = hdrLine.substring(ix + 2);
            out.println(hdrKey + ": " + headerManipulator.headerReplacement(hdrKey, hdrVal));
        }
        out.println("```");
        out.println("");
    }

    @Override
    protected void bodyToReturn(ServiceResponse rv) {
        guardOut();
        out.println("### Resulting Body (" + rv.statusCode + ": " + rv.contentType + "):");
        out.println("");
        out.println("```");
        out.println(rv.body);
        out.println("```");
        out.println("");
        CTR++;
    }

    public void finished() {
        if (this.out != null) {
            this.out.close();
            this.out = null;
        }
    }

    public void setOutputStream(String filename, OutputStream out) {
        this.filename = filename;
        if (out != null) {
            this.out = new PrintStream(out);
        }
        CTR = 0;
    }

    public static void main(String[] args)  {
        run((Supplier<? extends Jooby>) () -> {
            ServiceInteractionRecorder recorderApp = new ServiceInteractionRecorder(new UniRestRealServiceInteractor(), 8100, false, new HeaderManipulator.Noop());
            try {
                recorderApp.setOutputStream("test_output.md", new FileOutputStream("test_output.md"));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            return recorderApp;
        }, args);
    }

}
