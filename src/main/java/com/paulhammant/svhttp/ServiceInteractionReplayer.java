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

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.Map;

import static java.nio.file.Files.readAllBytes;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ServiceInteractionReplayer extends ServiceInteractionDelegate {

    private String markdownConversation;
    private int ix;
    private String bodyToReal;
    private String contentTypeToReal;
    private String headers;
    private String num;
    private String filename;

    public ServiceInteractionReplayer(int port, boolean ssl, HeaderManipulator headerManipultor) {
        super(port, ssl, headerManipultor);
    }

    public void setPlaybackFilename(String filename) {
        try {
            setPlaybackConversation(new String(readAllBytes(Paths.get(filename))));
            this.filename = filename;
        } catch (IOException e) {
            throw new UnsupportedOperationException();
        }
    }

    public void setPlaybackConversation(String conversation) {
        this.filename = "n/a";
        ix = 0;
        markdownConversation = conversation;
    }

    @Override
    public void finished() {
        ix = markdownConversation.indexOf("## ", ix);
        if (ix > -1) {
            fail("There are more recorded interactions after #" + num + " in " + filename + ", yet calling finished() implies there should be no more. Fail!!");
        }
    }

    @Override
    protected ServiceResponse getRealResponse(String method, String url, Map<String, String> headersToReal) throws IOException {

        try {
            ix = markdownConversation.indexOf("## ", ix);
            if (ix == -1) {
                fail("There are no more recorded interactions after #" + num + " in " + filename + ", yet calling getRealResponse() implies there should be more. Fail!!");

            }
            int lineEnd = markdownConversation.indexOf("\n", ix);
            String line = markdownConversation.substring(ix +2, lineEnd);
            String[] parts = line.split(" ");
            num = parts[1].replace(":","");
            String mdMethod = parts[2];
            assertEquals(method, mdMethod);
            String mdUrl = parts[3];
            if (!url.endsWith(mdUrl)) {
                fail("Method " + num + " (" + mdMethod + ")" + num + " in " + filename + ": " + url + " does not end in previously recorded " + mdUrl);
            }
            String headersReceived = getCodeBlock();

            ix = markdownConversation.indexOf("### ", ix);
            lineEnd = markdownConversation.indexOf("\n", ix);
            line = markdownConversation.substring(ix +4, lineEnd);
            String contentType = line.substring(line.indexOf("(")+1, line.indexOf(")"));

            // TODO remove trim()
            assertEquals(methodAndFilePrefix(mdMethod) + ", headers from the client that should be sent to real server are not the same as those previously recorded", headers.trim(), headersReceived);
            String bodyReceived = getCodeBlock();
            assertEquals(methodAndFilePrefix(mdMethod) + ", body from the client that should be sent to real server are not the same those previously recorded", this.bodyToReal, bodyReceived);
            assertEquals(methodAndFilePrefix(mdMethod) + ", content-Type of body from the client that should be sent to real server are not the same those previously recorded", this.contentTypeToReal, contentType);
            String[] headersToReturn = getCodeBlock().split("\n");
            ix = markdownConversation.indexOf("### ", ix);
            lineEnd = markdownConversation.indexOf("\n", ix);
            line = markdownConversation.substring(ix +4, lineEnd);
            String statusContent = line.substring(line.indexOf("(")+1, line.indexOf(")"));
            parts = statusContent.split(": ");
            int statusCode = Integer.parseInt(parts[0]);
            contentType = parts[1];
            Object bodyToReturn;
            if (contentType.endsWith("- Base64 below")) {
                contentType = contentType.substring(0, contentType.indexOf(" "));
                bodyToReturn = Base64.getDecoder().decode(getCodeBlock());
            } else {
                bodyToReturn = getCodeBlock();
            }
            return new ServiceResponse(bodyToReturn, contentType, statusCode, headersToReturn);
        } catch (AssertionError e) {
            System.out.println("***************************************************");
            System.out.println(">>>> Assertion Error: " + e.getMessage());
            e.printStackTrace();
            return new ServiceResponse("ServiceInteractionReplayer: " + e.getMessage(), "text/plain", 500);

        }
    }

    private String methodAndFilePrefix(String mdMethod) {
        return "Method:" + num + " (" + mdMethod + ")" + num + " in " + filename;
    }

    private String getCodeBlock() {
        ix = markdownConversation.indexOf("\n```\n", ix);
        int endCodeBlock = markdownConversation.indexOf("\n```\n", ix + 5);
        String rv = markdownConversation.substring(ix + 5, endCodeBlock);
        ix = endCodeBlock + 5;
        return rv;
    }

    @Override
    protected void bodyToReturn(ServiceResponse rv) {
        // only useful for recording which is not this class
    }

    @Override
    protected void headersToReturn(ServiceResponse rv) {
        // only useful for recording which is not this class
    }

    @Override
    protected void bodyReceived(String bodyToReal, String contentTypeToReal) {
        this.bodyToReal = bodyToReal;
        this.contentTypeToReal = contentTypeToReal;
    }

    @Override
    protected void headersReceived(Map<String, String> headers) {
        StringBuilder sb = new StringBuilder();
        for (String k : headers.keySet()) {
            String v = headers.get(k);
            sb.append(k).append(": ").append(v).append("\n");
        }
        this.headers = sb.toString();
    }

    @Override
    protected void newMethod(String method, String path) {
    }
}
