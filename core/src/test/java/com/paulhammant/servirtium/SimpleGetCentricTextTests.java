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

import java.io.ByteArrayOutputStream;

import static com.paulhammant.servirtium.JsonAndXmlUtilities.jsonEqualTo;
import static io.restassured.RestAssured.given;
import static io.restassured.config.DecoderConfig.ContentDecoder.DEFLATE;
import static io.restassured.config.DecoderConfig.decoderConfig;
import static io.restassured.config.RestAssuredConfig.newConfig;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public abstract class SimpleGetCentricTextTests {

    private static final String EXPECTED_1 =
            "## Interaction 0: GET /repos/asf/synapse/tags/3.0.0/modules/core/src/main/resources/META-INF/NOTICE\n" +
            "\n" +
            "### Request headers sent to the real server:\n" +
            "\n" +
            "```\n" +
            "Accept: */*\n" +
            "Connection: keep-alive\n" +
            "Host: svn.apache.org\n" +
            "User-Agent: SVN/1.10.0 (x86_64-apple-darwin17.0.0) serf/1.3.9\n" +
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
            "Accept-Ranges: bytes\n" +
            "Cache-Control: max-age=604800\n" +
            "Connection: Keep-Alive\n" +
            "Content-Type: text/plain\n" +
            "Date: Thu, 08 Nov 2018 09:52:36 GMT\n" +
            "ETag: \"594498//synapse/tags/3.0.0/modules/core/src/main/resources/META-INF/NOTICE-gzip\"\n" +
            "Keep-Alive: timeout=15, max=1000\n" +
            "Last-Modified: Tue, 13 Nov 2007 11:58:38 GMT\n" +
            "Server: Apache/2.4.7 (Ubuntu)\n" +
            "Vary: Accept-Encoding\n";
;

//    private static final String EXPECTED_2b =
//            "Accept-Ranges: bytes\n" +
//            "Keep-Alive: timeout=15, max=1000\n" +
//            "Server: Apache/2.4.7 (Ubuntu)\n" +
//            "Cache-Control: max-age=604800\n" +
//            "ETag: \"594498//synapse/tags/3.0.0/modules/core/src/main/resources/META-INF/NOTICE-gzip\"\n" +
//            "Connection: Keep-Alive\n" +
//            "Vary: Accept-Encoding\n" +
//            "Last-Modified: Tue, 13 Nov 2007 11:58:38 GMT\n" +
//            "Date: Thu, 08 Nov 2018 09:52:36 GMT\n" +
//            "Content-Type: text/plain\n";

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

    public static final String REDACTED_CONVERSATION = "## Interaction 0: GET /paul-hammant/servirtium/master/core/src/test/resources/test.json\n" +
            "\n" +
            "### Request headers sent to the real server:\n" +
            "\n" +
            "```\n" +
            "Accept: */*\n" +
            "Connection: keep-alive\n" +
            "Host: raw.githubusercontent.com\n" +
            "User-Agent: RestAssured\n" +
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
            "Accept-Ranges: bytes\n" +
            "Access-Control-Allow-Origin: *\n" +
            "Cache-Control: max-age=300\n" +
            "Connection: keep-alive\n" +
            "Content-Security-Policy: default-src 'none'; style-src 'unsafe-inline'; sandbox\n" +
            "Content-Type: text/plain; charset=utf-8\n" +
            "Date: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT\n" +
            "ETag: \"XxXxXxXxX\"\n" +
            "Strict-Transport-Security: max-age=31536000\n" +
            "Vary: Authorization,Accept-Encoding\n" +
            "Via: 1.1 varnish\n" +
            "```\n" +
            "\n" +
            "### Resulting body back from the real server (200: text/plain; charset=utf-8):\n" +
            "\n" +
            "```\n" +
            "{\n" +
            "   \"Accept-Language\": \"en-US,en;q=0.8\",\n" +
            "   \"Host\": \"headers.jsontest.com\",\n" +
            "   \"Accept-Charset\": \"ISO-NNNN-1,utf-8;q=0.7,*;q=0.3\",\n" +
            "   \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\"\n" +
            "}\n" +
            "```\n" +
            "\n";

    final String sillyJSONdoc = "{\n" +
            "   \"Accept-Language\": \"en-US,en;q=0.8\",\n" +
            "   \"Host\": \"headers.jsontest.com\",\n" +
            "   \"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.3\",\n" +
            "   \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\"\n" +
            "}";

    private ServirtiumServer servirtiumServer;

    public void tearDown() {
        if (servirtiumServer != null) {
            servirtiumServer.stop();
        }
    }

    public void canRecordASimpleGetFromApachesSubversionViaOkHttp() throws Exception {

        final SimpleInteractionManipulations interactionManipulations = new SubversionInteractionManipulations("localhost:8080", "svn.apache.org")
                .withHeaderPrefixesToRemoveFromRequestToReal("Accept-Encoding");

        MarkdownRecorder recorder = new MarkdownRecorder(
                new ServiceInteropViaOkHttp(),
                interactionManipulations
        ).withAlphaSortingOfHeaders();

        servirtiumServer = makeServirtiumServer(new ServerMonitor.Console(), interactionManipulations, recorder);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        recorder.setOutputStream("foo", out);
        servirtiumServer.start();

        checkGetOfApacheNoticeFileOverHttpViaRestAssured();

        servirtiumServer.finishedScript();

        // Order of headers is as originally sent
        assertEquals(sanitizeDate(EXPECTED_1 + EXPECTED_2a + EXPECTED_3), sanitizeDate(out.toString()));

    }

    public void canRecordASequenceThenBarfInPlaybackWithClearMessagingIfUnplayedInteractions() throws Exception {

        final ServerMonitor.Console serverMonitor = new ServerMonitor.Console();
        final SimpleInteractionManipulations interactionManipulations = new SimpleInteractionManipulations("http://localhost:8080", "https://raw.githubusercontent.com")
                .withHeaderPrefixesToRemoveFromRealResponse("X-", "Source-Age", "Expires:")
                .withHeaderPrefixesToRemoveFromRequestToReal("Accept-Encoding");


        MarkdownRecorder recorder = new MarkdownRecorder(
                new ServiceInteropViaOkHttp(),
                interactionManipulations)
                .withAlphaSortingOfHeaders();

        servirtiumServer = makeServirtiumServer(serverMonitor, interactionManipulations, recorder);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        recorder.setOutputStream("foo", out);

        // Order of headers is as originally sent
        String expected = "## Interaction 0: GET /paul-hammant/servirtium/master/core/src/test/resources/test.json\n" +
                "\n" +
                "### Request headers sent to the real server:\n" +
                "\n" +
                "```\n" +
                "Accept: */*\n" +
                "Connection: keep-alive\n" +
                "Host: raw.githubusercontent.com\n" +
                "User-Agent: RestAssured\n" +
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
                "Accept-Ranges: bytes\n" +
                "Access-Control-Allow-Origin: *\n" +
                "Cache-Control: max-age=300\n" +
                "Connection: keep-alive\n" +
                "Content-Security-Policy: default-src 'none'; style-src 'unsafe-inline'; sandbox\n" +
                "Content-Type: text/plain; charset=utf-8\n" +
                "Date: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT\n" +
                "ETag: \"dc98c3ae65b0caa93d436d47a3d2ffe59b02fd36\"\n" +
                "Strict-Transport-Security: max-age=31536000\n" +
                "Vary: Authorization,Accept-Encoding\n" +
                "Via: 1.1 varnish\n" +
                "```\n" +
                "\n" +
                "### Resulting body back from the real server (200: text/plain; charset=utf-8):\n" +
                "\n" +
                "```\n" +
                "{\"Accept-Language\": \"en-US,en;q=0.8\",  \"Host\": \"headers.jsontest.com\",  \"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.3\",\"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\" }\n\n" +
                "```\n" +
                "\n" +
                "## Interaction 1: GET /paul-hammant/servirtium/master/core/src/test/resources/does-not-exist.json\n" +
                "\n" +
                "### Request headers sent to the real server:\n" +
                "\n" +
                "```\n" +
                "Accept: */*\n" +
                "Connection: keep-alive\n" +
                "Host: raw.githubusercontent.com\n" +
                "User-Agent: RestAssured\n" +
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
                "Accept-Ranges: bytes\n" +
                "Access-Control-Allow-Origin: *\n" +
                "Connection: keep-alive\n" +
                "Content-Length: 15\n" +
                "Content-Security-Policy: default-src 'none'; style-src 'unsafe-inline'; sandbox\n" +
                "Date: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT\n" +
                "Strict-Transport-Security: max-age=31536000\n" +
                "Vary: Authorization,Accept-Encoding\n" +
                "Via: 1.1 varnish\n" +
                "```\n" +
                "\n" +
                "### Resulting body back from the real server (404: null - Base64 below):\n" +
                "\n" +
                "```\n" +
                "NDA0OiBOb3QgRm91bmQK\n" +
                "```\n" +
                "\n";

        servirtiumServer.start();

        given()
                .header("Connection", "keep-alive")
                .header("User-Agent", "RestAssured")
        .when()
                .get("/paul-hammant/servirtium/master/core/src/test/resources/test.json")
        .then()
                .assertThat()
                .statusCode(200)
                .body(jsonEqualTo(sillyJSONdoc))
                .contentType("text/plain;charset=utf-8");

        given()
                .header("Connection", "keep-alive")
                .header("User-Agent", "RestAssured")
        .when()
                .get("/paul-hammant/servirtium/master/core/src/test/resources/does-not-exist.json")
        .then()
                .assertThat()
                .statusCode(404);

        servirtiumServer.stop();
        servirtiumServer = null;

        assertEquals(sanitizeDate(expected), sanitizeDate(out.toString()));

        expected = expected.replace("RestAssured", "Hack-To-Force-Failure");

        MarkdownReplayer replayer = new MarkdownReplayer(new MarkdownReplayer.ReplayMonitor.Default())
                .withAlphaSortingOfHeaders();

        replayer.setPlaybackConversation(expected);

        servirtiumServer = makeServirtiumServer(serverMonitor,
                interactionManipulations, replayer);

        servirtiumServer.start();

//        given()
//                .header("User-Agent", "RestAssured")
//                .when()
//                .get("/paul-hammant/servirtium/master/core/src/test/resources/test.json")
//                .then()
//                .assertThat()
//                .statusCode(500)
//                .body(containsString("headers from the client that should be sent to real server are not the same as those previously recorded"));
//
//        try {
//        } catch (AssertionError e) {
//            assertThat(e.getMessage(), containsString("but: Not matched: \"User-Agent: RestAssured\""));
//        }

        try {
            servirtiumServer.stop();
            fail();
        } catch (AssertionError e) {
            assertThat(e.getMessage(), containsString("There are more recorded interactions after last replayed interaction: #-1"));
        } finally {
            servirtiumServer = null;
        }

    }

    public abstract ServirtiumServer makeServirtiumServer(ServerMonitor.Console serverMonitor, SimpleInteractionManipulations interactionManipulations, Interactor interactor);

    public void canRecordASimpleGetOfARedditJsonDocumentAndPrettify() throws Exception {

        final ServerMonitor.Console serverMonitor = new ServerMonitor.Console();

        final SimpleInteractionManipulations interactionManipulations = new SimpleInteractionManipulations("http://localhost:8080", "https://raw.githubusercontent.com")
                .withHeaderPrefixesToRemoveFromRealResponse("x-", "source-age", "expires:")
                .withHeaderPrefixesToRemoveFromRequestToReal("accept-encoding");


        MarkdownRecorder recorder = new MarkdownRecorder(
                new ServiceInteropViaOkHttp(),
                interactionManipulations)
                .withAlphaSortingOfHeaders();

        servirtiumServer = makeServirtiumServer(serverMonitor, interactionManipulations, recorder)
                .withPrettyPrintedTextBodies()
                .withLowerCaseHeaders();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        recorder.setOutputStream("foo", out);
        servirtiumServer.start();

        given()
                .config(newConfig().decoderConfig(decoderConfig().contentDecoders(DEFLATE)))
                .header("Connection", "keep-alive")
                .header("User-Agent", "RestAssured")
        .when()
                .get("/paul-hammant/servirtium/master/core/src/test/resources/test.json")
        .then()
                .assertThat()
                .statusCode(200)
//                .body(equalTo(sillyJSONdoc))
                .contentType("text/plain;charset=utf-8");

        servirtiumServer.finishedScript();

        // Order of headers is as originally sent
        assertEquals(sanitizeDate("## Interaction 0: GET /paul-hammant/servirtium/master/core/src/test/resources/test.json\n" +
                "\n" +
                "### Request headers sent to the real server:\n" +
                "\n" +
                "```\n" +
                "accept: */*\n" +
                "connection: keep-alive\n" +
                "host: raw.githubusercontent.com\n" +
                "user-agent: RestAssured\n" +
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
                "accept-ranges: bytes\n" +
                "access-control-allow-origin: *\n" +
                "cache-control: max-age=300\n" +
                "connection: keep-alive\n" +
                "content-security-policy: default-src 'none'; style-src 'unsafe-inline'; sandbox\n" +
                "content-type: text/plain; charset=utf-8\n" +
                "date: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT\n" +
                "etag: \"dc98c3ae65b0caa93d436d47a3d2ffe59b02fd36\"\n" +
                "strict-transport-security: max-age=31536000\n" +
                "vary: Authorization,Accept-Encoding\n" +
                "via: 1.1 varnish\n" +
                "```\n" +
                "\n" +
                "### Resulting body back from the real server (200: text/plain; charset=utf-8):\n" +
                "\n" +
                "```\n" +
                sillyJSONdoc +
                "\n" +
                "```\n" +
                "\n"), sanitizeDate(out.toString()));

    }

    public void worksThroughAproxyServer() throws Exception {

        final ServerMonitor.Console serverMonitor = new ServerMonitor.Console();

        final SimpleInteractionManipulations interactionManipulations = new SimpleInteractionManipulations("http://localhost:8080", "https://raw.githubusercontent.com")
                .withHeaderPrefixesToRemoveFromRealResponse("X-", "Source-Age", "Expires:")
                .withHeaderPrefixesToRemoveFromRequestToReal("Accept-Encoding");

        MarkdownRecorder recorder = new MarkdownRecorder(
                new ServiceInteropViaOkHttp(),
                interactionManipulations)
                .withAlphaSortingOfHeaders();

        servirtiumServer = makeServirtiumServer(serverMonitor, interactionManipulations, recorder)
                .withPrettyPrintedTextBodies();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        recorder.setOutputStream("foo", out);
        servirtiumServer.start();

        given()
                .proxy("localhost", 8080)
                .header("User-Agent", "RestAssured")
        .when()
                .get("http://raw.githubusercontent.com/paul-hammant/servirtium/master/core/src/test/resources/test.json")
        .then()
                .assertThat()
                .statusCode(200)
                .body(equalTo(sillyJSONdoc))
                .contentType("text/plain;charset=utf-8");

        servirtiumServer.finishedScript();

        // Order of headers is as originally sent
        assertEquals(sanitizeDate("## Interaction 0: GET /paul-hammant/servirtium/master/core/src/test/resources/test.json\n" +
                "\n" +
                "### Request headers sent to the real server:\n" +
                "\n" +
                "```\n" +
                "Accept: */*\n" +
                "Host: raw.githubusercontent.com\n" +
                "Proxy-Connection: Keep-Alive\n" +
                "User-Agent: RestAssured\n" +
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
                "Accept-Ranges: bytes\n" +
                "Access-Control-Allow-Origin: *\n" +
                "Cache-Control: max-age=300\n" +
                "Connection: keep-alive\n" +
                "Content-Security-Policy: default-src 'none'; style-src 'unsafe-inline'; sandbox\n" +
                "Content-Type: text/plain; charset=utf-8\n" +
                "Date: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT\n" +
                "ETag: \"dc98c3ae65b0caa93d436d47a3d2ffe59b02fd36\"\n" +
                "Strict-Transport-Security: max-age=31536000\n" +
                "Vary: Authorization,Accept-Encoding\n" +
                "Via: 1.1 varnish\n" +
                "```\n" +
                "\n" +
                "### Resulting body back from the real server (200: text/plain; charset=utf-8):\n" +
                "\n" +
                "```\n" +
                sillyJSONdoc +
                "\n```\n" +
                "\n"), sanitizeDate(out.toString()));

    }

    public void worksThroughAproxyServer2() throws Exception {

        final ServerMonitor.Console serverMonitor = new ServerMonitor.Console();

        final SimpleInteractionManipulations interactionManipulations = new SimpleInteractionManipulations()
                .withHeaderPrefixesToRemoveFromRealResponse("X-", "Source-Age", "Expires:")
                .withHeaderPrefixesToRemoveFromRequestToReal("Accept-Encoding");

        MarkdownRecorder recorder = new MarkdownRecorder(
                new ServiceInteropViaOkHttp(),
                interactionManipulations);
        servirtiumServer = makeServirtiumServer(serverMonitor, interactionManipulations, recorder)
                .withPrettyPrintedTextBodies();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        recorder.setOutputStream("foo", out);
        servirtiumServer.start();

        given()
                .proxy("localhost", 8080)
                .header("User-Agent", "RestAssured")
        .when()
                .get("https://localhost:8080/paul-hammant/servirtium/master/core/src/test/resources/test.json")
        .then()
                .assertThat()
                .statusCode(200)
                .body(equalTo(sillyJSONdoc))
                .contentType("text/plain;charset=utf-8");

        servirtiumServer.finishedScript();

        // Order of headers is as originally sent
        assertEquals(sanitizeDate("## Interaction 0: GET /paul-hammant/servirtium/master/core/src/test/resources/test.json\n" +
                "\n" +
                "### Request headers sent to the real server:\n" +
                "\n" +
                "```\n" +
                "Accept: */*\n" +
                "Host: raw.githubusercontent.com\n" +
                "Proxy-Connection: Keep-Alive\n" +
                "User-Agent: RestAssured\n" +
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
                sillyJSONdoc +
                "\n```\n" +
                "\n"), sanitizeDate(out.toString()));

    }

    public void canRecordASimpleGetOfARedditJsonDocumentAndPrettifyAndRedactPartOfTheRecordingOnly() throws Exception {

        final ServerMonitor.Console serverMonitor = new ServerMonitor.Console();

        final SimpleInteractionManipulations interactionManipulations =
                new SimpleInteractionManipulations("http://localhost:8080", "https://raw.githubusercontent.com")
                .withHeaderPrefixesToRemoveFromRealResponse("X-", "Source-Age", "Expires:")
                .withHeaderPrefixesToRemoveFromRequestToReal("Accept-Encoding");

        MarkdownRecorder recorder = new MarkdownRecorder(
                new ServiceInteropViaOkHttp(),
                interactionManipulations)
                .withReplacementInRecording("ISO-\\d\\d\\d\\d-1", "ISO-NNNN-1")
                .withReplacementInRecording("dc98c3ae65b0caa93d436d47a3d2ffe59b02fd36", "XxXxXxXxX")
                .withAlphaSortingOfHeaders();

        servirtiumServer = makeServirtiumServer(serverMonitor, interactionManipulations, recorder)
                .withPrettyPrintedTextBodies();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        recorder.setOutputStream("foo", out);
        servirtiumServer.start();

        given()
                .header("User-Agent", "RestAssured")
                .header("Connection", "keep-alive")

                .when()
                .get("/paul-hammant/servirtium/master/core/src/test/resources/test.json")
        .then()
                .assertThat()
                .statusCode(200)
                .body(equalTo("{\n" +
                        "   \"Accept-Language\": \"en-US,en;q=0.8\",\n" +
                        "   \"Host\": \"headers.jsontest.com\",\n" +
                        "   \"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.3\",\n" +
                        "   \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\"\n" +
                        "}"))
                .contentType("text/plain;charset=utf-8");

        servirtiumServer.finishedScript();

        // Order of headers is as originally sent
        assertEquals(sanitizeDate(REDACTED_CONVERSATION), sanitizeDate(out.toString()));

    }

    public void canReplayASimpleGetOfARedditJsonDocumentAndPrettifyAndRedactPartOfTheRecordingOnly() throws Exception {

        final ServerMonitor.Console serverMonitor = new ServerMonitor.Console();

        MarkdownReplayer replayer = new MarkdownReplayer();
        replayer.setPlaybackConversation(REDACTED_CONVERSATION);

        final SimpleInteractionManipulations interactionManipulations =
                new SimpleInteractionManipulations("http://localhost:8080", "https://raw.githubusercontent.com")
                        .withHeaderPrefixesToRemoveFromRealResponse("X-", "Source-Age", "Expires:")
                        .withHeaderPrefixesToRemoveFromRequestToReal("Accept-Encoding");

        servirtiumServer = makeServirtiumServer(serverMonitor,
                interactionManipulations, replayer)
                .withPrettyPrintedTextBodies();

        servirtiumServer.start();

        given()
                .header("User-Agent", "RestAssured")
                .header("Connection", "keep-alive")
        .when()
                .get("/paul-hammant/servirtium/master/core/src/test/resources/test.json")
        .then()
                .assertThat()
                .statusCode(200)
                .header("ETag", equalTo("\"XxXxXxXxX\""))
                .body(equalTo("{\n" +
                        "   \"Accept-Language\": \"en-US,en;q=0.8\",\n" +
                        "   \"Host\": \"headers.jsontest.com\",\n" +
                        "   \"Accept-Charset\": \"ISO-NNNN-1,utf-8;q=0.7,*;q=0.3\",\n" +
                        "   \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\"\n" +
                        "}"))
                .contentType("text/plain;charset=utf-8");


        servirtiumServer.finishedScript();

    }

    public void canReplayASimpleGetFromApachesSubversion() throws Exception {

        MarkdownReplayer replayer = new MarkdownReplayer(new MarkdownReplayer.ReplayMonitor.Console());
        replayer.setPlaybackConversation(EXPECTED_1 + EXPECTED_2a + EXPECTED_3);

        servirtiumServer = makeServirtiumServer(new ServerMonitor.Console(),
                new SubversionInteractionManipulations("localhost:8080", "svn.apache.org")
                        .withHeaderPrefixesToRemoveFromRequestToReal("Accept-Encoding")
                , replayer);

        servirtiumServer.start();

        checkGetOfApacheNoticeFileOverHttpViaRestAssured();

        servirtiumServer.finishedScript();

    }

    private void checkGetOfApacheNoticeFileOverHttpViaRestAssured() {

        given()
                .header("Connection", "keep-alive")
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
                .replaceAll("date: .* GMT", "date: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT")
                .replaceAll("Keep-Alive: timeout=15, max=.*", "Keep-Alive: timeout=15, max=NNNN");
    }

}