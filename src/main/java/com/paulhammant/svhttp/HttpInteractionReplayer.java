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

import org.jooby.Mutant;
import org.jooby.Request;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Paths;
import java.util.Map;

import static java.nio.file.Files.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class HttpInteractionReplayer extends HttpInteractionDelegate {

    private String markdown;
    private int ix;
    private String bodyToReal;
    private String headers;
    private String num;
    private String filename;

    public HttpInteractionReplayer(int port, HeaderManipulator headerManipultor) {
        super(port, headerManipultor);
    }

    @Override
    public void setOutputStream(String filename, OutputStream out) throws IOException {
        this.filename = filename;
        if (filename != null) {
            markdown = new String(readAllBytes(Paths.get(filename)));
        }
        ix = 0;
    }

    @Override
    public void finished() {
        ix = markdown.indexOf("## ", ix);
        if (ix > -1) {
            fail("There are more recorded interactions after #" + num + " in " + filename + ", yet calling finished() implies there should be no more. Fail!!");
        }
    }

    @Override
    protected HttpResponse getRealResponse(String method, String bodyToReal, String url, Map<String, String> headersToReal) throws IOException {

        ix = markdown.indexOf("## ", ix);
        if (ix == -1) {
            fail("There are no more recorded interactions after #" + num + " in " + filename + ", yet calling getRealResponse() implies there should be more. Fail!!");

        }
        int lineEnd = markdown.indexOf("\n", ix);
        String line = markdown.substring(ix +2, lineEnd);
        String[] parts = line.split(" ");
        num = parts[1].replace(":","");
        String mdMethod = parts[2];
        assertEquals(method, mdMethod);
        String mdUrl = parts[3];
        if (!url.endsWith(mdUrl)) {
            fail("Method " + num + " (" + mdMethod + "): " + url + " does not end in previously recorded " + mdUrl);
        }
        String headersReceived = getCodeBlock();
        // TODO remove trim()
        assertEquals("Headers that would be sent to real Svn are not the same as those previously recorded", headers.trim(), headersReceived);
        String bodyReceived = getCodeBlock();
        assertEquals("Body that would be sent to real Svn are not the same those previously recorded", this.bodyToReal, bodyReceived);
        String[] headersToReturn = getCodeBlock().split("\n");
        ix = markdown.indexOf("### ", ix);
        lineEnd = markdown.indexOf("\n", ix);
        line = markdown.substring(ix +4, lineEnd);
        String statusContent = line.substring(line.indexOf("(")+1, line.indexOf(")"));
        parts = statusContent.split(": ");
        int statusCode = Integer.parseInt(parts[0]);
        String contentType = parts[1];
        String bodyToReturn = getCodeBlock();
        return new HttpResponse(bodyToReturn, contentType, statusCode, headersToReturn);
    }

    private String getCodeBlock() {
        ix = markdown.indexOf("\n```\n", ix);
        int endCodeBlock = markdown.indexOf("\n```\n", ix + 5);
        String rv = markdown.substring(ix + 5, endCodeBlock);
        ix = endCodeBlock + 5;
        return rv;
    }

    @Override
    protected void bodyToReturn(HttpResponse rv) {
        // only useful for recording which is not this class
    }

    @Override
    protected void headersToReturn(HttpResponse rv) {
        // only useful for recording which is not this class
    }

    @Override
    protected void bodyReceived(String bodyToReal) {
        this.bodyToReal = bodyToReal;
    }

    @Override
    protected void headersReceived(Map<String, Mutant> headers) {
        StringBuilder sb = new StringBuilder();
        for (String k : headers.keySet()) {
            Mutant v = headers.get(k);
            sb.append(k).append(": ").append(v.value()).append("\n");
        }
        this.headers = sb.toString();
    }

    @Override
    protected void newMethod(Request req, String method) {
    }
}
