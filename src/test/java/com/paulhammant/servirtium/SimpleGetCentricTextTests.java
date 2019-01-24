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

import com.paulhammant.servirtium.svn.SubversionInteractionManipulations;
import org.junit.After;
import org.junit.Test;

import java.io.ByteArrayOutputStream;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;

public class SimpleGetCentricTextTests {

    private static final String EXPECTED_1 =
            "## Interaction 0: GET /repos/asf/synapse/tags/3.0.0/modules/core/src/main/resources/META-INF/NOTICE\n" +
            "\n" +
            "### Request headers sent to the real server:\n" +
            "\n" +
            "```\n" +
            "Accept: */*\n" +
            "User-Agent: SVN/1.10.0 (x86_64-apple-darwin17.0.0) serf/1.3.9\n" +
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
    public static final String REDACTED_CONVERSATION = "## Interaction 0: GET /paul-hammant/servirtium/master/src/test/resources/test.json\n" +
            "\n" +
            "### Request headers sent to the real server:\n" +
            "\n" +
            "```\n" +
            "Accept: */*\n" +
            "User-Agent: RestAssured\n" +
            "Connection: keep-alive\n" +
            "Host: raw.githubusercontent.com\n" +
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
            "```\n" +
            "Content-Security-Policy: default-src 'none'; style-src 'unsafe-inline'; sandbox\n" +
            "Strict-Transport-Security: max-age=31536000\n" +
            "ETag: \"XxXxXxXxX\"\n" +
            "Content-Type: text/plain; charset=utf-8\n" +
            "Cache-Control: max-age=300\n" +
            "Accept-Ranges: bytes\n" +
            "Date: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT\n" +
            "Via: 1.1 varnish\n" +
            "Connection: keep-alive\n" +
            "Vary: Authorization,Accept-Encoding\n" +
            "Access-Control-Allow-Origin: *\n" +
            "```\n" +
            "\n" +
            "### Resulting body back from the real server (200: text/plain; charset=utf-8):\n" +
            "\n" +
            "```\n" +
            "{\n" +
            "  \"Accept-Language\": \"en-US,en;q\\u003d0.8\",\n" +
            "  \"Host\": \"headers.jsontest.com\",\n" +
            "  \"Accept-Charset\": \"ISO-NNNN-1,utf-8;q\\u003d0.7,*;q\\u003d0.3\",\n" +
            "  \"Accept\": \"text/html,application/xhtml+xml,application/xml;q\\u003d0.9,*/*;q\\u003d0.8\"\n" +
            "}\n" +
            "```\n" +
            "\n";

    private ServirtiumServer servirtiumServer;

    @After
    public void tearDown() {
        servirtiumServer.stop();
    }

    @Test
    public void canRecordASimpleGetFromApachesSubversionViaOkHttp() throws Exception {

        final ServerMonitor.Console serverMonitor = new ServerMonitor.Console();
        MarkdownRecorder recorder = new MarkdownRecorder(
                new ServiceInteropViaOkHttp(),
                new SubversionInteractionManipulations("localhost:8080", "svn.apache.org"));
        servirtiumServer = new ServirtiumServer(serverMonitor,
                8080, false,
                new SubversionInteractionManipulations("localhost:8080", "svn.apache.org"), recorder);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        recorder.setOutputStream("foo", out);
        servirtiumServer.startApp();

        checkGetOfApacheNoticeFileOverHttpViaRestAssured();

        servirtiumServer.finishedScript();

        // Order of headers is as originally sent
        assertEquals(sanitizeDate(EXPECTED_1 + EXPECTED_2a + EXPECTED_3), sanitizeDate(out.toString()));

    }

    @Test
    public void canRecordASimpleGetOfARedditJsonDocument() throws Exception {

        final ServerMonitor.Console serverMonitor = new ServerMonitor.Console();
        final SimpleHeaderInteractionManipulations interactionManipulations = new SimpleHeaderInteractionManipulations("http://localhost:8080", "https://raw.githubusercontent.com")
                .withHeaderPrefixesToRemoveFromRealResponse("X-", "Source-Age", "Expires:");


        MarkdownRecorder recorder = new MarkdownRecorder(
                new ServiceInteropViaOkHttp(),
                interactionManipulations);
        servirtiumServer = new ServirtiumServer(serverMonitor,
                8080, false,
                interactionManipulations, recorder);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        recorder.setOutputStream("foo", out);
        servirtiumServer.startApp();

        given()
                .header("User-Agent", "RestAssured")
        .when()
                .get("/paul-hammant/servirtium/master/src/test/resources/test.json")
        .then()
                .assertThat()
                .statusCode(200)
                .body(equalTo("{\"Accept-Language\": \"en-US,en;q=0.8\",  \"Host\": \"headers.jsontest.com\",  \"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.3\",\"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\" }\n"))
                .contentType("text/plain;charset=utf-8");

        servirtiumServer.finishedScript();

        // Order of headers is as originally sent
        assertEquals(sanitizeDate("## Interaction 0: GET /paul-hammant/servirtium/master/src/test/resources/test.json\n" +
                "\n" +
                "### Request headers sent to the real server:\n" +
                "\n" +
                "```\n" +
                "Accept: */*\n" +
                "User-Agent: RestAssured\n" +
                "Connection: keep-alive\n" +
                "Host: raw.githubusercontent.com\n" +
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
                "```\n" +
                "Content-Security-Policy: default-src 'none'; style-src 'unsafe-inline'; sandbox\n" +
                "Strict-Transport-Security: max-age=31536000\n" +
                "ETag: \"dc98c3ae65b0caa93d436d47a3d2ffe59b02fd36\"\n" +
                "Content-Type: text/plain; charset=utf-8\n" +
                "Cache-Control: max-age=300\n" +
                "Accept-Ranges: bytes\n" +
                "Date: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT\n" +
                "Via: 1.1 varnish\n" +
                "Connection: keep-alive\n" +
                "Vary: Authorization,Accept-Encoding\n" +
                "Access-Control-Allow-Origin: *\n" +
                "```\n" +
                "\n" +
                "### Resulting body back from the real server (200: text/plain; charset=utf-8):\n" +
                "\n" +
                "```\n" +
                "{\"Accept-Language\": \"en-US,en;q=0.8\",  \"Host\": \"headers.jsontest.com\",  \"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.3\",\"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\" }\n\n" +
                "```\n" +
                "\n"), sanitizeDate(out.toString()));

    }

    @Test
    public void canRecordASimpleGetOfARedditJsonDocumentAndPrettify() throws Exception {

        final ServerMonitor.Console serverMonitor = new ServerMonitor.Console();
        final SimpleHeaderInteractionManipulations interactionManipulations = new SimpleHeaderInteractionManipulations("http://localhost:8080", "https://raw.githubusercontent.com")
                .withHeaderPrefixesToRemoveFromRealResponse("X-", "Source-Age", "Expires:");


        MarkdownRecorder recorder = new MarkdownRecorder(
                new ServiceInteropViaOkHttp(),
                interactionManipulations);
        servirtiumServer = new ServirtiumServer(serverMonitor,
                8080, false,
                interactionManipulations, recorder)
                .withPrettyPrintedTextBodies();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        recorder.setOutputStream("foo", out);
        servirtiumServer.startApp();

        given()
                .header("User-Agent", "RestAssured")
        .when()
                .get("/paul-hammant/servirtium/master/src/test/resources/test.json")
        .then()
                .assertThat()
                .statusCode(200)
                .body(equalTo("{\n" +
                        "  \"Accept-Language\": \"en-US,en;q\\u003d0.8\",\n" +
                        "  \"Host\": \"headers.jsontest.com\",\n" +
                        "  \"Accept-Charset\": \"ISO-8859-1,utf-8;q\\u003d0.7,*;q\\u003d0.3\",\n" +
                        "  \"Accept\": \"text/html,application/xhtml+xml,application/xml;q\\u003d0.9,*/*;q\\u003d0.8\"\n" +
                        "}"))
                .contentType("text/plain;charset=utf-8");

        servirtiumServer.finishedScript();

        // Order of headers is as originally sent
        assertEquals(sanitizeDate("## Interaction 0: GET /paul-hammant/servirtium/master/src/test/resources/test.json\n" +
                "\n" +
                "### Request headers sent to the real server:\n" +
                "\n" +
                "```\n" +
                "Accept: */*\n" +
                "User-Agent: RestAssured\n" +
                "Connection: keep-alive\n" +
                "Host: raw.githubusercontent.com\n" +
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
                "```\n" +
                "Content-Security-Policy: default-src 'none'; style-src 'unsafe-inline'; sandbox\n" +
                "Strict-Transport-Security: max-age=31536000\n" +
                "ETag: \"dc98c3ae65b0caa93d436d47a3d2ffe59b02fd36\"\n" +
                "Content-Type: text/plain; charset=utf-8\n" +
                "Cache-Control: max-age=300\n" +
                "Accept-Ranges: bytes\n" +
                "Date: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT\n" +
                "Via: 1.1 varnish\n" +
                "Connection: keep-alive\n" +
                "Vary: Authorization,Accept-Encoding\n" +
                "Access-Control-Allow-Origin: *\n" +
                "```\n" +
                "\n" +
                "### Resulting body back from the real server (200: text/plain; charset=utf-8):\n" +
                "\n" +
                "```\n" +
                "{\n" +
                "  \"Accept-Language\": \"en-US,en;q\\u003d0.8\",\n" +
                "  \"Host\": \"headers.jsontest.com\",\n" +
                "  \"Accept-Charset\": \"ISO-8859-1,utf-8;q\\u003d0.7,*;q\\u003d0.3\",\n" +
                "  \"Accept\": \"text/html,application/xhtml+xml,application/xml;q\\u003d0.9,*/*;q\\u003d0.8\"\n" +
                "}\n" +
                "```\n" +
                "\n"), sanitizeDate(out.toString()));

    }

    @Test
    public void canRecordASimpleGetOfARedditJsonDocumentAndPrettifyAndRedactPartOfTheRecordingOnly() throws Exception {

        final ServerMonitor.Console serverMonitor = new ServerMonitor.Console();

        final SimpleHeaderInteractionManipulations interactionManipulations =
                new SimpleHeaderInteractionManipulations("http://localhost:8080", "https://raw.githubusercontent.com")
                .withHeaderPrefixesToRemoveFromRealResponse("X-", "Source-Age", "Expires:");

        MarkdownRecorder recorder = new MarkdownRecorder(
                new ServiceInteropViaOkHttp(),
                interactionManipulations)
                .withRedaction("ISO-\\d\\d\\d\\d-1", "ISO-NNNN-1")
                .withRedaction("dc98c3ae65b0caa93d436d47a3d2ffe59b02fd36", "XxXxXxXxX");

        servirtiumServer = new ServirtiumServer(serverMonitor,
                8080, false,
                interactionManipulations, recorder)
                .withPrettyPrintedTextBodies();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        recorder.setOutputStream("foo", out);
        servirtiumServer.startApp();

        given()
                .header("User-Agent", "RestAssured")
        .when()
                .get("/paul-hammant/servirtium/master/src/test/resources/test.json")
        .then()
                .assertThat()
                .statusCode(200)
                .body(equalTo("{\n" +
                        "  \"Accept-Language\": \"en-US,en;q\\u003d0.8\",\n" +
                        "  \"Host\": \"headers.jsontest.com\",\n" +
                        "  \"Accept-Charset\": \"ISO-8859-1,utf-8;q\\u003d0.7,*;q\\u003d0.3\",\n" +
                        "  \"Accept\": \"text/html,application/xhtml+xml,application/xml;q\\u003d0.9,*/*;q\\u003d0.8\"\n" +
                        "}"))
                .contentType("text/plain;charset=utf-8");

        servirtiumServer.finishedScript();

        // Order of headers is as originally sent
        assertEquals(sanitizeDate(REDACTED_CONVERSATION), sanitizeDate(out.toString()));

    }

    @Test
    public void canReplayASimpleGetOfARedditJsonDocumentAndPrettifyAndRedactPartOfTheRecordingOnly() throws Exception {

        final ServerMonitor.Console serverMonitor = new ServerMonitor.Console();

        MarkdownReplayer replayer = new MarkdownReplayer();
        replayer.setPlaybackConversation(REDACTED_CONVERSATION);

        final SimpleHeaderInteractionManipulations interactionManipulations =
                new SimpleHeaderInteractionManipulations("http://localhost:8080", "https://raw.githubusercontent.com")
                        .withHeaderPrefixesToRemoveFromRealResponse("X-", "Source-Age", "Expires:");

        servirtiumServer = new ServirtiumServer(serverMonitor,
                8080, false,
                interactionManipulations, replayer)
                .withPrettyPrintedTextBodies();

        servirtiumServer.startApp();

        given()
                .header("User-Agent", "RestAssured")
                .when()
                .get("/paul-hammant/servirtium/master/src/test/resources/test.json")
                .then()
                .assertThat()
                .statusCode(200)
                .header("ETag", equalTo("\"XxXxXxXxX\""))
                .body(equalTo("{\n" +
                        "  \"Accept-Language\": \"en-US,en;q\\u003d0.8\",\n" +
                        "  \"Host\": \"headers.jsontest.com\",\n" +
                        "  \"Accept-Charset\": \"ISO-NNNN-1,utf-8;q\\u003d0.7,*;q\\u003d0.3\",\n" +
                        "  \"Accept\": \"text/html,application/xhtml+xml,application/xml;q\\u003d0.9,*/*;q\\u003d0.8\"\n" +
                        "}"))
                .contentType("text/plain;charset=utf-8");


        servirtiumServer.finishedScript();

    }

    @Test
    public void canReplayASimpleGetFromApachesSubversion() throws Exception {

        MarkdownReplayer replayer = new MarkdownReplayer();
        replayer.setPlaybackConversation(EXPECTED_1 + EXPECTED_2a + EXPECTED_3);

        servirtiumServer = new ServirtiumServer(new ServerMonitor.Console(),
                8080, false,
                new SubversionInteractionManipulations("localhost:8080", "svn.apache.org"), replayer);

        servirtiumServer.startApp();

        checkGetOfApacheNoticeFileOverHttpViaRestAssured();

        servirtiumServer.finishedScript();

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