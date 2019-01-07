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

import com.paulhammant.svhttp.svn.SvnHeaderManipulator;
import org.junit.After;
import org.junit.Test;

import java.io.ByteArrayOutputStream;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;

public class SimpleGetCentricTextTest {

    private static final String EXPECTED_1 =
            "## Interaction 0: GET /repos/asf/synapse/tags/3.0.0/modules/core/src/main/resources/META-INF/NOTICE\n" +
            "\n" +
            "### Request headers sent to the real server:\n" +
            "\n" +
            "```\n" +
            "Accept: */*\n" +
            "User-Agent: RestAssured\n" +
            "Connection: keep-alive\n" +
            "Host: svn.apache.org\n" +
            "Accept-Encoding: gzip,deflate\n" +
            "```\n" +
            "\n" +
            "### Body sent to the real server ():\n" +
            "\n" +
            "```\n" +
            "\n" +
            "```\n" +
            "\n" +
            "### Resulting headers back from the real server:\n" +
            "\n" +
            "```\n";


    private static final String EXPECTED_2a =
            "Date: Thu, 08 Nov 2018 09:52:36 GMT\n" +
            "Server: Apache/2.4.7 (Ubuntu)\n" +
            "Last-Modified: Tue, 13 Nov 2007 11:58:38 GMT\n" +
            "ETag: \"594498//synapse/tags/3.0.0/modules/core/src/main/resources/META-INF/NOTICE-gzip\"\n" +
            "Cache-Control: max-age=604800\n" +
            "Accept-Ranges: bytes\n" +
            "Vary: Accept-Encoding\n" +
            "Keep-Alive: timeout=15, max=1000\n" +
            "Connection: Keep-Alive\n" +
            "Content-Type: text/plain\n";

    private static final String EXPECTED_2b =
            "Accept-Ranges: bytes\n" +
            "Keep-Alive: timeout=15, max=1000\n" +
            "Server: Apache/2.4.7 (Ubuntu)\n" +
            "Cache-Control: max-age=604800\n" +
            "ETag: \"594498//synapse/tags/3.0.0/modules/core/src/main/resources/META-INF/NOTICE-gzip\"\n" +
            "Connection: Keep-Alive\n" +
            "Vary: Accept-Encoding\n" +
            "Last-Modified: Tue, 13 Nov 2007 11:58:38 GMT\n" +
            "Date: Thu, 08 Nov 2018 09:52:36 GMT\n" +
            "Content-Type: text/plain\n";

    private static final String EXPECTED_3 =
            "```\n" +
            "\n" +
            "### Resulting body back from the real server (200: text/plain):\n" +
            "\n" +
            "```\n" +
            "\tApache Synapse\n" +
            "\tCopyright 2005-2006 The Apache Software Foundation\n" +
            "\t\n" +
            "\tThis product includes software developed at\n" +
            "\tThe Apache Software Foundation (http://www.apache.org/).\n" +
            "```\n" +
            "\n";


    private SvHttpServer delegate;


    @Test
    public void canRecordASimpleGetFromApachesSubversionViaUniRest() {

        delegate = new InteractionRecordingSvHttpServer(
                new ServiceInteroperationViaUniRest(),
               8080, false, new SvnHeaderManipulator("localhost:8080", "svn.apache.org"));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ((InteractionRecordingSvHttpServer) delegate).setOutputStream("foo", out);
        delegate.startApp();

        checkGetOfApacheNoticeFileOverHttpViaRestAssured();

        // Order of headers is NOT as originally sent as UniRest uses a Map to store them
        assertEquals(sanitizeDate(EXPECTED_1 + EXPECTED_2b + EXPECTED_3), sanitizeDate(out.toString()));

        delegate.finishedMarkdownScript();
    }

    @After
    public void tearDown() {
        delegate.stop();
    }


    @Test
    public void canRecordASimpleGetFromApachesSubversionViaOkHttp() {

        delegate = new InteractionRecordingSvHttpServer(
                new ServiceInteropViaOkHttp(),
               8080, false, new SvnHeaderManipulator("localhost:8080", "svn.apache.org"));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ((InteractionRecordingSvHttpServer) delegate).setOutputStream("foo", out);
        delegate.startApp();

        checkGetOfApacheNoticeFileOverHttpViaRestAssured();

        // Order of headers is as originally sent
        assertEquals(sanitizeDate(EXPECTED_1 + EXPECTED_2a + EXPECTED_3), sanitizeDate(out.toString()));

        delegate.finishedMarkdownScript();
    }

    @Test
    public void canReplayASimpleGetFromApachesSubversion() {

        delegate = new InteractionReplayingSvHttpServer(
               8080, false, new SvnHeaderManipulator("localhost:8080", "svn.apache.org"));
        ((InteractionReplayingSvHttpServer) delegate).setPlaybackConversation(EXPECTED_1 + EXPECTED_2a + EXPECTED_3);
        delegate.startApp();

        checkGetOfApacheNoticeFileOverHttpViaRestAssured();

        delegate.finishedMarkdownScript();

    }

    private void checkGetOfApacheNoticeFileOverHttpViaRestAssured() {
        given()
                .header("User-Agent", "RestAssured")
        .when()
                .get("/repos/asf/synapse/tags/3.0.0/modules/core/src/main/resources/META-INF/NOTICE")
        .then()
                .assertThat()
                .statusCode(200)
                .body(equalTo("\tApache Synapse\n" +
                        "\tCopyright 2005-2006 The Apache Software Foundation\n" +
                        "\t\n" +
                        "\tThis product includes software developed at\n" +
                        "\tThe Apache Software Foundation (http://www.apache.org/)."))
                .contentType("text/plain");
    }

    private String sanitizeDate(String expected) {
        return expected
                .replaceAll("Date: .* GMT", "Date: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT")
                .replaceAll("Keep-Alive: timeout=15, max=.*", "Keep-Alive: timeout=15, max=NNNN");
    }

}