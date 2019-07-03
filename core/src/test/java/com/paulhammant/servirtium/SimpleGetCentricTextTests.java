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
            "### Request headers recorded for playback:\n" +
            "\n" +
            "```\n" +
            "Accept: */*\n" +
            "Connection: keep-alive\n" +
            "Host: svn.apache.org\n" +
            "User-Agent: SVN/1.10.0 (x86_64-apple-darwin17.0.0) serf/1.3.9\n" +
            "```\n" +
            "\n" +
            "### Request body recorded for playback ():\n" +
            "\n" +
            "```\n" +
            "\n" +
            "```\n" +
            "\n" +
            "### Response headers recorded for playback:\n" +
            "\n" +
            "```\n";

    private static final String EXPECTED_2a =
            "Accept-Ranges: bytes\n" +
            "Cache-Control: max-age=604800\n" +
            "Connection: Keep-Alive\n" +
            "Content-Type: text/plain\n" +
            "Date: Thu, 08 Nov 2018 09:52:36 GMT\n" +
            "ETag: \"594498//synapse/tags/3.0.0/modules/core/src/main/resources/META-INF/NOTICE-gzip\"\n" +
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
            "### Response body recorded for playback (200: text/plain):\n" +
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
            "### Request headers recorded for playback:\n" +
            "\n" +
            "```\n" +
            "Accept: */*\n" +
            "Connection: keep-alive\n" +
            "Host: raw.githubusercontent.com\n" +
            "User-Agent: RestAssured\n" +
            "```\n" +
            "\n" +
            "### Request body recorded for playback ():\n" +
            "\n" +
            "```\n" +
            "\n" +
            "```\n" +
            "\n" +
            "### Response headers recorded for playback:\n" +
            "\n" +
            "```\n" +
            "Accept-Ranges: bytes\n" +
            "Access-Control-Allow-Origin: *\n" +
            "Cache-Control: max-age=300\n" +
            "Connection: keep-alive\n" +
            "Content-Security-Policy: default-src 'none'; style-src 'unsafe-inline'; sandbox\n" +
            "Content-Type: text/plain; charset=utf-8\n" +
            "Date: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT\n" +
            "Strict-Transport-Security: max-age=31536000\n" +
            "Vary: Authorization,Accept-Encoding, Accept-Encoding\n" +
            "Via: 1.1 varnish\n" +
            "```\n" +
            "\n" +
            "### Response body recorded for playback (200: text/plain; charset=utf-8):\n" +
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

    public static final String SERVIRTIUM_SVG_CONVERSATION = "## Interaction 0: GET /paul-hammant/servirtium/master/Servirtium.svg?sanitize=true\n" +
            "\n" +
            "### Request headers recorded for playback:\n" +
            "\n" +
            "```\n" +
            "accept-encoding: deflate\n" +
            "accept: */*\n" +
            "connection: keep-alive\n" +
            "host: raw.githubusercontent.com\n" +
            "user-agent: java\n" +
            "```\n" +
            "\n" +
            "### Request body recorded for playback ():\n" +
            "\n" +
            "```\n" +
            "\n" +
            "```\n" +
            "\n" +
            "### Response headers recorded for playback:\n" +
            "\n" +
            "```\n" +
            "accept-ranges: bytes\n" +
            "access-control-allow-origin: *\n" +
            "cache-control: max-age=300\n" +
            "connection: keep-alive\n" +
            "content-length: 1238\n" +
            "content-security-policy: default-src 'none'; style-src 'unsafe-inline'; sandbox\n" +
            "content-type: image/svg+xml\n" +
            "date: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT\n" +
            "etag: \"ac09d02640c8005b4419456f173de5e3ebaaabe3\"\n" +
            "expires: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT\n" +
            "strict-transport-security: max-age=31536000\n" +
            "via: 1.1 varnish\n" +
            "x-content-type-options: nosniff\n" +
            "x-frame-options: deny\n" +
            "x-geo-block-list: \n" +
            "x-xss-protection: 1; mode=block\n" +
            "```\n" +
            "\n" +
            "### Response body recorded for playback (200: image/svg+xml):\n" +
            "\n" +
            "```\n" +
            "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" +
            "<svg xmlns:xl=\"http://www.w3.org/1999/xlink\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" viewBox=\"217 111 164 43\" width=\"164\" height=\"43\">\n" +
            "   <defs>\n" +
            "    \n" +
            "  </defs>\n" +
            "   <metadata> Produced by OmniGraffle 7.10.1 \n" +
            "    \n" +
            "  </metadata>\n" +
            "   <g id=\"Canvas_1\" stroke-opacity=\"1\" stroke-dasharray=\"none\" fill-opacity=\"1\" stroke=\"none\" fill=\"none\">\n" +
            "      <title>Canvas 1</title>\n" +
            "      <rect fill=\"white\" x=\"217\" y=\"111\" width=\"164\" height=\"43\"/>\n" +
            "      <g id=\"Canvas_1: Layer 1\">\n" +
            "         <title>Layer 1</title>\n" +
            "         <g id=\"Graphic_2\">\n" +
            "            <path d=\"M 218 132.5 L 258.5 112 L 339.5 112 L 380 132.5 L 339.5 153 L 258.5 153 Z\" fill=\"#80ff80\"/>\n" +
            "            <path d=\"M 218 132.5 L 258.5 112 L 339.5 112 L 380 132.5 L 339.5 153 L 258.5 153 Z\" stroke=\"black\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"1\"/>\n" +
            "            <text transform=\"translate(223 119)\" fill=\"#ff2600\">\n" +
            "               <tspan font-family=\"Helvetica Neue\" font-size=\"22\" font-weight=\"700\" fill=\"#ff2600\" x=\"22.232\" y=\"21\">Servirtium</tspan>\n" +
            "            </text>\n" +
            "         </g>\n" +
            "      </g>\n" +
            "   </g>\n" +
            "</svg>\n" +
            "```\n" +
            "\n";
    public static final String SERVIRTIUM_SVG_SANITIZED = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" +
            "<svg xmlns:xl=\"http://www.w3.org/1999/xlink\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" viewBox=\"217 111 164 43\" width=\"164\" height=\"43\">\n" +
            "   <defs>\n" +
            "    \n" +
            "  </defs>\n" +
            "   <metadata> Produced by OmniGraffle 7.10.1 \n" +
            "    \n" +
            "  </metadata>\n" +
            "   <g id=\"Canvas_1\" stroke-opacity=\"1\" stroke-dasharray=\"none\" fill-opacity=\"1\" stroke=\"none\" fill=\"none\">\n" +
            "      <title>Canvas 1</title>\n" +
            "      <rect fill=\"white\" x=\"217\" y=\"111\" width=\"164\" height=\"43\"/>\n" +
            "      <g id=\"Canvas_1: Layer 1\">\n" +
            "         <title>Layer 1</title>\n" +
            "         <g id=\"Graphic_2\">\n" +
            "            <path d=\"M 218 132.5 L 258.5 112 L 339.5 112 L 380 132.5 L 339.5 153 L 258.5 153 Z\" fill=\"#80ff80\"/>\n" +
            "            <path d=\"M 218 132.5 L 258.5 112 L 339.5 112 L 380 132.5 L 339.5 153 L 258.5 153 Z\" stroke=\"black\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"1\"/>\n" +
            "            <text transform=\"translate(223 119)\" fill=\"#ff2600\">\n" +
            "               <tspan font-family=\"Helvetica Neue\" font-size=\"22\" font-weight=\"700\" fill=\"#ff2600\" x=\"22.232\" y=\"21\">Servirtium</tspan>\n" +
            "            </text>\n" +
            "         </g>\n" +
            "      </g>\n" +
            "   </g>\n" +
            "</svg>";

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
                .withHeaderPrefixesToRemoveFromClientRequest("Accept-Encoding")
                .withHeaderPrefixesToRemoveFromServiceResponse("Age", "Keep-Alive");

        MarkdownRecorder recorder = new MarkdownRecorder(
                new ServiceInteropViaOkHttp(),
                interactionManipulations
        ).withAlphaSortingOfHeaders();

        servirtiumServer = makeServirtiumServer(new ServiceMonitor.Console(), interactionManipulations, recorder, 8080);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        recorder.setOutputStream("changeRequestHeadersIfNeeded", out);
        servirtiumServer.start();

        checkGetOfApacheNoticeFileOverHttpViaRestAssured();

        servirtiumServer.finishedScript();

        // Order of headers is as originally sent
        assertEquals(sanitizeDate(EXPECTED_1 + EXPECTED_2a + EXPECTED_3), sanitizeDate(out.toString()));

    }

    public void canRecordASequenceThenBarfInPlaybackWithClearMessagingIfUnplayedInteractions() throws Exception {

        final ServiceMonitor.Console serverMonitor = new ServiceMonitor.Console();
        final SimpleInteractionManipulations interactionManipulations = new SimpleInteractionManipulations("http://localhost:8080", "https://raw.githubusercontent.com")
                .withHeaderPrefixesToRemoveFromServiceResponse("X-", "Source-Age", "Expires:", "ETag:")
                .withHeaderPrefixesToRemoveFromClientRequest("Accept-Encoding");

        MarkdownRecorder recorder = new MarkdownRecorder(
                new ServiceInteropViaOkHttp(),
                interactionManipulations)
                .withAlphaSortingOfHeaders();

        servirtiumServer = makeServirtiumServer(serverMonitor, interactionManipulations, recorder, 8080);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        recorder.setOutputStream("changeRequestHeadersIfNeeded", out);

        // Order of headers is as originally sent
        String expected = "## Interaction 0: GET /paul-hammant/servirtium/master/core/src/test/resources/test.json\n" +
                "\n" +
                "### Request headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "Accept: */*\n" +
                "Connection: keep-alive\n" +
                "Host: raw.githubusercontent.com\n" +
                "User-Agent: RestAssured\n" +
                "```\n" +
                "\n" +
                "### Request body recorded for playback ():\n" +
                "\n" +
                "```\n" +
                "\n" +
                "```\n" +
                "\n" +
                "### Response headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "Accept-Ranges: bytes\n" +
                "Access-Control-Allow-Origin: *\n" +
                "Cache-Control: max-age=300\n" +
                "Connection: keep-alive\n" +
                "Content-Security-Policy: default-src 'none'; style-src 'unsafe-inline'; sandbox\n" +
                "Content-Type: text/plain; charset=utf-8\n" +
                "Date: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT\n" +
                "Strict-Transport-Security: max-age=31536000\n" +
                "Vary: Authorization,Accept-Encoding, Accept-Encoding\n" +
                "Via: 1.1 varnish\n" +
                "```\n" +
                "\n" +
                "### Response body recorded for playback (200: text/plain; charset=utf-8):\n" +
                "\n" +
                "```\n" +
                "{\"Accept-Language\": \"en-US,en;q=0.8\",  \"Host\": \"headers.jsontest.com\",  \"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.3\",\"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\" }\n" +
                "\n" +
                "```\n" +
                "\n" +
                "## Interaction 1: GET /paul-hammant/servirtium/master/core/src/test/resources/does-not-exist.json\n" +
                "\n" +
                "### Request headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "Accept: */*\n" +
                "Connection: keep-alive\n" +
                "Host: raw.githubusercontent.com\n" +
                "User-Agent: RestAssured\n" +
                "```\n" +
                "\n" +
                "### Request body recorded for playback ():\n" +
                "\n" +
                "```\n" +
                "\n" +
                "```\n" +
                "\n" +
                "### Response headers recorded for playback:\n" +
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
                "### Response body recorded for playback (404: null - Base64 below):\n" +
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
                interactionManipulations, replayer, 8080);

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

    public abstract ServirtiumServer makeServirtiumServer(ServiceMonitor.Console serverMonitor, SimpleInteractionManipulations interactionManipulations, InteractionMonitor interactionMonitor, int port);

    public void canRecordASimpleGetOfARedditJsonDocumentAndPrettify() throws Exception {

        final ServiceMonitor.Console serverMonitor = new ServiceMonitor.Console();

        final SimpleInteractionManipulations interactionManipulations = new SimpleInteractionManipulations("http://localhost:8080", "https://raw.githubusercontent.com")
                .withHeaderPrefixesToRemoveFromServiceResponse("x-", "source-age", "expires:", "vary:", "etag:")
                .withHeaderPrefixesToRemoveFromClientRequest("accept-encoding");

        MarkdownRecorder recorder = new MarkdownRecorder(
                new ServiceInteropViaOkHttp(),
                interactionManipulations)
                .withAlphaSortingOfHeaders();

        servirtiumServer = makeServirtiumServer(serverMonitor, interactionManipulations, recorder, 8080)
                .withPrettyPrintedTextBodies()
                .withLowerCaseHeaders();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        recorder.setOutputStream("changeRequestHeadersIfNeeded", out);
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
                "### Request headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "accept: */*\n" +
                "connection: keep-alive\n" +
                "host: raw.githubusercontent.com\n" +
                "user-agent: restassured\n" +
                "```\n" +
                "\n" +
                "### Request body recorded for playback ():\n" +
                "\n" +
                "```\n" +
                "\n" +
                "```\n" +
                "\n" +
                "### Response headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "accept-ranges: bytes\n" +
                "access-control-allow-origin: *\n" +
                "cache-control: max-age=300\n" +
                "connection: keep-alive\n" +
                "content-security-policy: default-src 'none'; style-src 'unsafe-inline'; sandbox\n" +
                "content-type: text/plain; charset=utf-8\n" +
                "date: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT\n" +
                "strict-transport-security: max-age=31536000\n" +
                "via: 1.1 varnish\n" +
                "```\n" +
                "\n" +
                "### Response body recorded for playback (200: text/plain; charset=utf-8):\n" +
                "\n" +
                "```\n" +
                "{\n" +
                "   \"Accept-Language\": \"en-US,en;q=0.8\",\n" +
                "   \"Host\": \"headers.jsontest.com\",\n" +
                "   \"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.3\",\n" +
                "   \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\"\n" +
                "}\n" +
                "```\n" +
                "\n"), sanitizeDate(out.toString()));

    }

    public void canRecordASimpleQueryStringGet() throws Exception {

        final ServiceMonitor.Console serverMonitor = new ServiceMonitor.Console();

        final SimpleInteractionManipulations interactionManipulations =
                new SimpleInteractionManipulations("http://localhost:61417", "https://raw.githubusercontent.com")
                        .withHeaderPrefixesToRemoveFromServiceResponse("source-age:",
                                "x-fastly-request-id:", "x-served-by:", "x-timer:",
                                "x-github-request-id:", "vary:", "x-cache");

        MarkdownRecorder recorder = new MarkdownRecorder(
                new ServiceInteropViaOkHttp(),
                interactionManipulations)
                .withAlphaSortingOfHeaders();

        servirtiumServer = makeServirtiumServer(serverMonitor, interactionManipulations, recorder, 61417)
                .withPrettyPrintedTextBodies()
                .withLowerCaseHeaders();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        recorder.setOutputStream("changeRequestHeadersIfNeeded", out);
        servirtiumServer.start();


        given().
                config(newConfig().decoderConfig(decoderConfig().contentDecoders(DEFLATE))).
                header("User-Agent", "Java").
                port(61417).
        when()
                .get("/paul-hammant/servirtium/master/Servirtium.svg?sanitize=true")
        .then()
                .assertThat()
                .statusCode(200)
                .body(equalTo(SERVIRTIUM_SVG_SANITIZED))
                .contentType("image/svg+xml");

        servirtiumServer.finishedScript();

        // Order of headers is as originally sent
        assertEquals(sanitizeDate(SERVIRTIUM_SVG_CONVERSATION), sanitizeDate(out.toString()));

    }

    public void canPassThroughASimpleQueryStringGet() throws Exception {

        final ServiceMonitor.Console serverMonitor = new ServiceMonitor.Console();

        final SimpleInteractionManipulations interactionManipulations =
                new SimpleInteractionManipulations("http://localhost:61417", "https://raw.githubusercontent.com")
                        .withHeaderPrefixesToRemoveFromServiceResponse("source-age:",
                                "x-fastly-request-id:", "x-served-by:", "x-timer:",
                                "x-github-request-id:", "vary:", "x-cache");

        NonRecordingPassThrough nonRecordingPassThrough = new NonRecordingPassThrough(
                new ServiceInteropViaOkHttp(),
                interactionManipulations)
                .withAlphaSortingOfHeaders();

        servirtiumServer = makeServirtiumServer(serverMonitor, interactionManipulations, nonRecordingPassThrough, 61417)
                .withPrettyPrintedTextBodies()
                .withLowerCaseHeaders();

        servirtiumServer.start();

        given().
                config(newConfig().decoderConfig(decoderConfig().contentDecoders(DEFLATE))).
                header("User-Agent", "Java").
                port(61417).
        when()
                .get("/paul-hammant/servirtium/master/Servirtium.svg?sanitize=true")
        .then()
                .assertThat()
                .statusCode(200)
                .body(equalTo(SERVIRTIUM_SVG_SANITIZED))
                .contentType("image/svg+xml");

        servirtiumServer.finishedScript();


    }

    public void canPlaybackASimpleQueryStringGet() throws Exception {

        final ServiceMonitor.Console serverMonitor = new ServiceMonitor.Console();

        final SimpleInteractionManipulations interactionManipulations =
                new SimpleInteractionManipulations("http://localhost:61417", "https://raw.githubusercontent.com")
                        .withHeaderPrefixesToRemoveFromServiceResponse("source-age:",
                                "x-fastly-request-id:", "x-served-by:", "x-timer:",
                                "x-github-request-id:", "vary:", "x-cache");

        MarkdownReplayer playback = new MarkdownReplayer(new MarkdownReplayer.ReplayMonitor.Console())
                .withAlphaSortingOfHeaders();

        servirtiumServer = makeServirtiumServer(serverMonitor, interactionManipulations, playback, 61417)
                .withPrettyPrintedTextBodies()
                .withLowerCaseHeaders();

        playback.setPlaybackConversation(SERVIRTIUM_SVG_CONVERSATION);

        servirtiumServer.start();


        given().
                config(newConfig().decoderConfig(decoderConfig().contentDecoders(DEFLATE))).
                header("User-Agent", "Java").
                port(61417).
        when()
                .get("/paul-hammant/servirtium/master/Servirtium.svg?sanitize=true")
        .then()
                .assertThat()
                .statusCode(200)
                .body(equalTo(SERVIRTIUM_SVG_SANITIZED))
                .contentType(containsString("image/svg+xml"));

        servirtiumServer.finishedScript();


    }


    public void canSupplyDebugInformationOnRedditJsonGet() throws Exception {

        final ServiceMonitor.Console serverMonitor = new ServiceMonitor.Console();

        final SimpleInteractionManipulations interactionManipulations = new SimpleInteractionManipulations("http://localhost:8080", "https://raw.githubusercontent.com")
                .withHeaderPrefixesToRemoveFromServiceResponse("x-", "source-age", "expires:", "etag:", "vary:")
                .withHeaderPrefixesToRemoveFromClientRequest("accept-encoding");


        MarkdownRecorder recorder = new MarkdownRecorder(
                new ServiceInteropViaOkHttp(),
                interactionManipulations)
                .withAlphaSortingOfHeaders()
                .withExtraDebugOutput();

        servirtiumServer = makeServirtiumServer(serverMonitor, interactionManipulations, recorder, 8080)
                .withPrettyPrintedTextBodies()
                .withLowerCaseHeaders();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        recorder.setOutputStream("changeRequestHeadersIfNeeded", out);
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
        final String one = sanitizeDate("## Interaction 0: GET /paul-hammant/servirtium/master/core/src/test/resources/test.json\n" +
                "\n" +
                "### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:\n" +
                "\n" +
                "```\n" +
                "Accept: */*\n" +
                "Connection: keep-alive\n" +
                "User-Agent: RestAssured\n" +
                "Host: localhost:8080\n" +
                "Accept-Encoding: deflate\n" +
                "```\n" +
                "\n" +
                "### Request headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "accept: */*\n" +
                "connection: keep-alive\n" +
                "host: raw.githubusercontent.com\n" +
                "user-agent: restassured\n" +
                "```\n" +
                "\n" +
                "### DEBUG: Request body as received from client (), WITHOUT REDACTIONS, ETC:\n" +
                "\n" +
                "```\n" +
                "\n" +
                "```\n" +
                "\n" +
                "### Request body recorded for playback ():\n" +
                "\n" +
                "```\n" +
                "\n" +
                "```\n" +
                "\n" +
                "### DEBUG: Response headers from real service, unchanged:\n" +
                "\n" +
                "```\n" +
                "accept-ranges: bytes\n" +
                "access-control-allow-origin: *\n" +
                "cache-control: max-age=300\n" +
                "connection: keep-alive\n" +
                "content-security-policy: default-src 'none'; style-src 'unsafe-inline'; sandbox\n" +
                "content-type: text/plain; charset=utf-8\n" +
                "date: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT\n" +
                "etag: W/\"dc98c3ae65b0caa93d436d47a3d2ffe59b02fd36\"\n" +
                //"etag: \"dc98c3ae65b0caa93d436d47a3d2ffe59b02fd36\"\n" +
                "expires: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT\n" +
                "source-age: 142\n" +
                "strict-transport-security: max-age=31536000\n" +
                "vary: Authorization,Accept-Encoding, Accept-Encoding\n" +
                "via: 1.1 varnish\n" +
                "x-cache-hits: 2\n" +
                "x-cache: HIT\n" +
                "x-content-type-options: nosniff\n" +
                "x-fastly-request-id: e07368cfcf9768713b0873d9b2a6316366e3802c\n" +
                "x-frame-options: deny\n" +
                "x-geo-block-list: \n" +
                "x-github-request-id: EAF4:60D6:C33E:F7BF:5D151F5A\n" +
                "x-served-by: cache-lhr6351-LHR\n" +
                "x-timer: S1561665512.245348,VS0,VE0\n" +
                "x-xss-protection: 1; mode=block\n" +
                "```\n" +
                "\n" +
                "### Response headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "accept-ranges: bytes\n" +
                "access-control-allow-origin: *\n" +
                "cache-control: max-age=300\n" +
                "connection: keep-alive\n" +
                "content-security-policy: default-src 'none'; style-src 'unsafe-inline'; sandbox\n" +
                "content-type: text/plain; charset=utf-8\n" +
                "date: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT\n" +
                "strict-transport-security: max-age=31536000\n" +
                "via: 1.1 varnish\n" +
                "```\n" +
                "\n" +
                "### DEBUG: Response Headers for client, possibly changed after recording:\n" +
                "\n" +
                "```\n" +
                "accept-ranges: bytes\n" +
                "access-control-allow-origin: *\n" +
                "cache-control: max-age=300\n" +
                "connection: keep-alive\n" +
                "content-security-policy: default-src 'none'; style-src 'unsafe-inline'; sandbox\n" +
                "content-type: text/plain; charset=utf-8\n" +
                "date: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT\n" +
                "strict-transport-security: max-age=31536000\n" +
                "via: 1.1 varnish\n" +
                "```\n" +
                "\n" +
                "### DEBUG: Response body from real service, unchanged (200: text/plain; charset=utf-8):\n" +
                "\n" +
                "```\n" +
                "{\"Accept-Language\": \"en-US,en;q=0.8\",  \"Host\": \"headers.jsontest.com\",  \"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.3\",\"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\" }\n" +
                "\n" +
                "```\n" +
                "\n" +
                "### Response body recorded for playback (200: text/plain; charset=utf-8):\n" +
                "\n" +
                "```\n" +
                "{\n" +
                "   \"Accept-Language\": \"en-US,en;q=0.8\",\n" +
                "   \"Host\": \"headers.jsontest.com\",\n" +
                "   \"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.3\",\n" +
                "   \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\"\n" +
                "}\n" +
                "```\n" +
                "\n" +
                "### DEBUG: Response body for client, possibly changed after recording (200: text/plain; charset=utf-8):\n" +
                "\n" +
                "```\n" +
                "{\"Accept-Language\": \"en-US,en;q=0.8\",  \"Host\": \"headers.jsontest.com\",  \"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.3\",\"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\" }\n" +
                "\n" +
                "```\n" +
                "\n");
        final String two = sanitizeDate(out.toString());
        try {
            assertEquals(one, two);
            fail("shoulda failed here, but was not to be");
        } catch (AssertionError e) {
            String[] chunks = e.getMessage().split("but was");
            assertBoth(chunks, "source-age:");
            assertBoth(chunks, "strict-transport-security:");
            assertBoth(chunks, "vary:");
            assertBoth(chunks, "via:");
            assertBoth(chunks, "x-cache-hits:");
            assertBoth(chunks, "x-cache:");
            assertBoth(chunks, "x-content-type-options:");
            assertBoth(chunks, "x-fastly-request-id:");
            assertBoth(chunks, "x-frame-options:");
            assertBoth(chunks, "x-geo-block-list");
            assertBoth(chunks, "x-github-request-id:");
            assertBoth(chunks, "x-served-by:");
            assertBoth(chunks, "x-timer:");
            try {
                assertBoth(chunks, "x-xss-protection:");
            } catch (AssertionError e1) {
                // optional
            }
            assertBoth(chunks, "..."); // the chunk intro and closing is '...' per containsString()
            assertEquals("Chunk[0] should have nothing left for 'difference'", "", chunks[0]);
            assertEquals("Chunk[1] should have nothing left for 'difference'", "", chunks[1]);
        }

    }

    private void assertBoth(String[] chunks, String stringToContain) {
        assertThat(chunks[0], containsString(stringToContain));
        assertThat(chunks[1], containsString(stringToContain));
        chunks[0] = removeLine(chunks[0], stringToContain);
        chunks[1] = removeLine(chunks[1], stringToContain);

    }

    private String removeLine(String chunk, String stringToContain) {
        String rv = "";
        String[] lines = chunk.split("\n");
        for (String line : lines) {
            if (!line.contains(stringToContain)) {
                rv += line + "\n";
            }
        }
        return rv;
    }

    public void worksThroughAproxyServer() throws Exception {

        final ServiceMonitor.Console serverMonitor = new ServiceMonitor.Console();

        final SimpleInteractionManipulations interactionManipulations = new SimpleInteractionManipulations("http://localhost:8080", "https://raw.githubusercontent.com")
                .withHeaderPrefixesToRemoveFromServiceResponse("X-", "Source-Age", "Expires:", "ETag:", "Vary:")
                .withHeaderPrefixesToRemoveFromClientRequest("Accept-Encoding");

        MarkdownRecorder recorder = new MarkdownRecorder(
                new ServiceInteropViaOkHttp(),
                interactionManipulations)
                .withAlphaSortingOfHeaders();

        servirtiumServer = makeServirtiumServer(serverMonitor, interactionManipulations, recorder, 8080)
                .withPrettyPrintedTextBodies();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        recorder.setOutputStream("changeRequestHeadersIfNeeded", out);
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
                "### Request headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "Accept: */*\n" +
                "Host: raw.githubusercontent.com\n" +
                "Proxy-Connection: Keep-Alive\n" +
                "User-Agent: RestAssured\n" +
                "```\n" +
                "\n" +
                "### Request body recorded for playback ():\n" +
                "\n" +
                "```\n" +
                "\n" +
                "```\n" +
                "\n" +
                "### Response headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "Accept-Ranges: bytes\n" +
                "Access-Control-Allow-Origin: *\n" +
                "Cache-Control: max-age=300\n" +
                "Connection: keep-alive\n" +
                "Content-Security-Policy: default-src 'none'; style-src 'unsafe-inline'; sandbox\n" +
                "Content-Type: text/plain; charset=utf-8\n" +
                "Date: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT\n" +
                "Strict-Transport-Security: max-age=31536000\n" +
                "Via: 1.1 varnish\n" +
                "```\n" +
                "\n" +
                "### Response body recorded for playback (200: text/plain; charset=utf-8):\n" +
                "\n" +
                "```\n" +
                "{\n" +
                "   \"Accept-Language\": \"en-US,en;q=0.8\",\n" +
                "   \"Host\": \"headers.jsontest.com\",\n" +
                "   \"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.3\",\n" +
                "   \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\"\n" +
                "}\n" +
                "```\n" +
                "\n"), sanitizeDate(out.toString()));

    }

    public void worksThroughAproxyServer2() throws Exception {

        final ServiceMonitor.Console serverMonitor = new ServiceMonitor.Console();

        final SimpleInteractionManipulations interactionManipulations = new SimpleInteractionManipulations()
                .withHeaderPrefixesToRemoveFromServiceResponse("X-", "Source-Age", "Expires:")
                .withHeaderPrefixesToRemoveFromClientRequest("Accept-Encoding");

        MarkdownRecorder recorder = new MarkdownRecorder(
                new ServiceInteropViaOkHttp(),
                interactionManipulations);
        servirtiumServer = makeServirtiumServer(serverMonitor, interactionManipulations, recorder, 8080)
                .withPrettyPrintedTextBodies();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        recorder.setOutputStream("changeRequestHeadersIfNeeded", out);
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
                "### Request headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "Accept: */*\n" +
                "Host: raw.githubusercontent.com\n" +
                "Proxy-Connection: Keep-Alive\n" +
                "User-Agent: RestAssured\n" +
                "```\n" +
                "\n" +
                "### Request body recorded for playback ():\n" +
                "\n" +
                "```\n" +
                "\n" +
                "```\n" +
                "\n" +
                "### Response headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "Content-Security-Policy: default-src 'none'; style-src 'unsafe-inline'; sandbox\n" +
                "Strict-Transport-Security: max-age=31536000\n" +
                "ETag: W/\"dc98c3ae65b0caa93d436d47a3d2ffe59b02fd36\"\n" +
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
                "### Response body recorded for playback (200: text/plain; charset=utf-8):\n" +
                "\n" +
                "```\n" +
                sillyJSONdoc +
                "\n```\n" +
                "\n"), sanitizeDate(out.toString()));

    }

    public void canRecordASimpleGetOfARedditJsonDocumentAndPrettifyAndRedactPartOfTheRecordingOnly() throws Exception {

        final ServiceMonitor.Console serverMonitor = new ServiceMonitor.Console();

        final SimpleInteractionManipulations interactionManipulations =
                new SimpleInteractionManipulations("http://localhost:8080", "https://raw.githubusercontent.com")
                .withHeaderPrefixesToRemoveFromServiceResponse("X-", "Source-Age", "Expires:", "ETag:")
                .withHeaderPrefixesToRemoveFromClientRequest("Accept-Encoding");

        MarkdownRecorder recorder = new MarkdownRecorder(
                new ServiceInteropViaOkHttp(),
                interactionManipulations)
                .withReplacementInRecording("ISO-\\d\\d\\d\\d-1", "ISO-NNNN-1")
                .withAlphaSortingOfHeaders();

        servirtiumServer = makeServirtiumServer(serverMonitor, interactionManipulations, recorder, 8080)
                .withPrettyPrintedTextBodies();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        recorder.setOutputStream("changeRequestHeadersIfNeeded", out);
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

        final ServiceMonitor.Console serverMonitor = new ServiceMonitor.Console();

        MarkdownReplayer replayer = new MarkdownReplayer();
        replayer.setPlaybackConversation(REDACTED_CONVERSATION);

        final SimpleInteractionManipulations interactionManipulations =
                new SimpleInteractionManipulations("http://localhost:8080", "https://raw.githubusercontent.com")
                        .withHeaderPrefixesToRemoveFromServiceResponse("X-", "Source-Age", "Expires:", "ETag:")
                        .withHeaderPrefixesToRemoveFromClientRequest("Accept-Encoding");

        servirtiumServer = makeServirtiumServer(serverMonitor,
                interactionManipulations, replayer, 8080)
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
                //.header("ETag", equalTo("W/\"XxXxXxXxX\""))
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

        servirtiumServer = makeServirtiumServer(new ServiceMonitor.Console(),
                new SubversionInteractionManipulations("localhost:8080", "svn.apache.org")
                        .withHeaderPrefixesToRemoveFromClientRequest("Accept-Encoding")
                , replayer, 8080);

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

    private String sanitizeDate(String toSanitize) {
        return toSanitize
                .replaceAll("Date: .* GMT", "Date: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT")
                .replaceAll("date: .* GMT", "date: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT")
                .replaceAll("expires: .* GMT", "expires: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT")
                .replaceAll("Keep-Alive: timeout=15, max=.*", "Keep-Alive: timeout=15, max=NNNN");
    }

}