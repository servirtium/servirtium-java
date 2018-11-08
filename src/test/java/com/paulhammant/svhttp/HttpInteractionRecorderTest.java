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

import com.paulhammant.svhttp.svn.SvnHeaderManipulator;
import org.junit.Test;

import java.io.ByteArrayOutputStream;

import static org.hamcrest.core.IsEqual.equalTo;
import static io.restassured.RestAssured.when;
import static org.junit.Assert.assertEquals;

public class HttpInteractionRecorderTest {

    @Test
    public void testASimpleGetFromSubversion() {

        HttpInteractionRecorder recorderApp = new HttpInteractionRecorder(
                new HttpInteractor("text/xml"),
               8080, new SvnHeaderManipulator("localhost:8080", "svn.apache.org"));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        recorderApp.setOutputStream("foo", out);
        recorderApp.startApp();

        when()
                .get("/repos/asf/synapse/trunk/java/modules/core/src/main/resources/META-INF/NOTICE")
                .then()
                .assertThat()
                .statusCode(200)
                .body(equalTo("\tApache Synapse\n" +
                        "\tCopyright 2005-2006 The Apache Software Foundation\n" +
                        "\t\n" +
                        "\tThis product includes software developed at\n" +
                        "\tThe Apache Software Foundation (http://www.apache.org/)."))
                .contentType("text/plain");

        String expected = "## 0: GET /repos/asf/synapse/trunk/java/modules/core/src/main/resources/META-INF/NOTICE\n" +
                "\n" +
                "### Assert that request headers are:\n" +
                "\n" +
                "```\n" +
                "Accept: */*\n" +
                "Host: localhost:8080\n" +
                "Connection: Keep-Alive\n" +
                "User-Agent: Apache-HttpClient/4.5.2 (Java/1.8.0_181)\n" +
                "Accept-Encoding: gzip,deflate\n" +
                "content-length: 0\n" +
                "```\n" +
                "\n" +
                "### Assert that request body is:\n" +
                "\n" +
                "```\n" +
                "\n" +
                "```\n" +
                "\n" +
                "### Resulting Headers\n" +
                "\n" +
                "```\n" +
                "Date: Thu, 08 Nov 2018 09:52:36 GMT\n" +
                "Server: Apache/2.4.7 (Ubuntu)\n" +
                "Last-Modified: Tue, 13 Nov 2007 11:58:38 GMT\n" +
                "ETag: \"594498//synapse/trunk/java/modules/core/src/main/resources/META-INF/NOTICE-gzip\"\n" +
                "Cache-Control: max-age=604800\n" +
                "Accept-Ranges: bytes\n" +
                "Vary: Accept-Encoding\n" +
                "Keep-Alive: timeout=15, max=1000\n" +
                "Connection: Keep-Alive\n" +
                "Content-Type: text/plain\n" +
                "```\n" +
                "\n" +
                "### Resulting Body (200: text/plain):\n" +
                "\n" +
                "```\n" +
                "\tApache Synapse\n" +
                "\tCopyright 2005-2006 The Apache Software Foundation\n" +
                "\t\n" +
                "\tThis product includes software developed at\n" +
                "\tThe Apache Software Foundation (http://www.apache.org/).\n" +
                "```\n" +
                "\n";

        assertEquals(sanitizeDate(expected), sanitizeDate(out.toString()));

    }

    private String sanitizeDate(String expected) {
        return expected.replaceAll("Date: .* GMT", "Date: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT");
    }

}