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

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import okio.BufferedSink;
import okio.Okio;
import okio.Source;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static com.paulhammant.servirtium.JsonAndXmlUtilities.jsonEqualTo;
import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;

public abstract class SimplePostCentricTests {

    public static final String EXPECTED =
            "## Interaction 0: POST /post\n" +
            "\n" +
            "### Request headers sent to the real server:\n" +
            "\n" +
            "```\n" +
            "Accept: */*\n" +
            "User-Agent: RestAssured\n" +
            "Connection: keep-alive\n" +
            "Host: postman-echo.com\n" +
            "Content-Length: 19\n" +
            "Content-Type: text/plain; charset=ISO-8859-1\n" +
            "```\n" +
            "\n" +
            "### Body sent to the real server (text/plain; charset=ISO-8859-1):\n" +
            "\n" +
            "```\n" +
            "I'm a little teapot\n" +
            "```\n" +
            "\n" +
            "### Resulting headers back from the real server:\n" +
            "\n" +
            "```\n" +
            "Content-Type: application/json; charset=utf-8\n" +
            "Date: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT\n" +
            "ETag: W/\"153-InEEm1mVJgfG705oGbxXxiguOuU\"\n" +
            "Server: nginx\n" +
            "set-cookie: sails.sid=s%3AQpYXn4PNOGmzId3jttU03ZketH2aY6Zz.dj6l8lpXUtFJTCoRxWRPPx4fISmmCKzgOAlIxT2DSxM; Path=/; HttpOnly\n" +
            "Vary: Accept-Encoding\n" +
            "Connection: keep-alive\n" +
            "```\n" +
            "\n" +
            "### Resulting body back from the real server (200: application/json; charset=utf-8):\n" +
            "\n" +
            "```\n" +
            "{\"args\":{},\"data\":\"I'm a little teapot\",\"files\":{},\"form\":{},\"headers\":{\"x-forwarded-proto\":\"https\",\"host\":\"postman-echo.com\",\"content-length\":\"19\",\"accept\":\"*/*\",\"accept-encoding\":\"gzip\",\"content-type\":\"text/plain; charset=ISO-8859-1\",\"user-agent\":\"RestAssured\",\"x-forwarded-port\":\"443\"},\"json\":null,\"url\":\"https://postman-echo.com/post\"}\n" +
            "```\n" +
            "\n";

    private ServirtiumServer servirtiumServer;

    public void tearDown() {
        servirtiumServer.stop();
    }

    public void canRecordASimplePostToPostmanEchoViaOkHttp() throws Exception {

        final SimpleInteractionManipulations interactionManipulations =
                new SimpleInteractionManipulations("http://localhost:8080", "https://postman-echo.com")
                        .withHeaderPrefixesToRemoveFromRequestToReal("Accept-Encoding");

        MarkdownRecorder recorder = new MarkdownRecorder(
                new ServiceInteropViaOkHttp(),
                interactionManipulations);

        servirtiumServer = makeServirtiumServer(interactionManipulations, recorder);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        recorder.setOutputStream("foo", out);
        servirtiumServer.start();

        checkPostToPostmanEchoViaRestAssured();

        servirtiumServer.finishedScript();

        // Order of headers is as originally sent
        assertEquals(sanitizeDate(EXPECTED), sanitizeDate(out.toString()));

    }

    public abstract ServirtiumServer makeServirtiumServer(SimpleInteractionManipulations interactionManipulations, Interactor interactor);

    public void canReplayASimplePostToPostmanEcho() throws Exception {

        MarkdownReplayer replayer = new MarkdownReplayer();
        replayer.setPlaybackConversation(EXPECTED);

        servirtiumServer = makeServirtiumServer(
                new SimpleInteractionManipulations("http://localhost:8080", "https://postman-echo.com")
                        .withHeaderPrefixesToRemoveFromRequestToReal("Accept-Encoding"), replayer);

        servirtiumServer.start();

        checkPostToPostmanEchoViaRestAssured();

        servirtiumServer.finishedScript();
    }

    public void canRecordABinaryPost() throws Exception {


        StringBuilder whatHappened = new StringBuilder();

        Server target = makeTargetServer(whatHappened);

        target.start();

        try {
            final SimpleInteractionManipulations interactionManipulations =
            new SimpleInteractionManipulations("http://localhost:8080", "http://localhost:8001")
                    .withHeaderPrefixesToRemoveFromRequestToReal("Accept-Encoding");

            MarkdownRecorder recorder = new MarkdownRecorder(
                    new ServiceInteropViaOkHttp(),
                    interactionManipulations);

            servirtiumServer = makeServirtiumServer(interactionManipulations, recorder);

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            recorder.setOutputStream("foo", out);
            servirtiumServer.start();

            final InputStream resourceAsStream = new FileInputStream("../core/src/test/resources/png-transparent.png");
            byte[] pic = new byte[resourceAsStream.available()];
            resourceAsStream.read(pic);
            System.out.println();

            given()
                    .header("User-Agent", "RestAssured")
                    .contentType("image/png")
                    .body(pic).
            when()
                    .post("/not-important")
            .then()
                    .assertThat()
                    .statusCode(200)
                    .body(equalTo("yee ha!"));

            servirtiumServer.finishedScript();

            assertEquals(whatHappened.toString(), "/not-important, body-length=67, body[1]=-119, body[1]=80");

            // Order of headers is as originally sent
            assertEquals(sanitizeDate("## Interaction 0: POST /not-important\n" +
            "\n" +
            "### Request headers sent to the real server:\n" +
            "\n" +
            "```\n" +
            "Accept: */*\n" +
            "User-Agent: RestAssured\n" +
            "Connection: keep-alive\n" +
            "Host: localhost:8001\n" +
            "Content-Length: 67\n" +
            "Content-Type: image/png; charset=ISO-8859-1\n" +
            "```\n" +
            "\n" +
            "### Body sent to the real server (image/png; charset=ISO-8859-1):\n" +
            "\n" +
            "```\n" +
            "//SERVIRTIUM+Base64: iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAYAAAAfFcSJAAAACklEQVR4nGMA\n" +
                    "AQAABQABDQottAAAAABJRU5ErkJggg==\n" +
            "```\n" +
            "\n" +
            "### Resulting headers back from the real server:\n" +
            "\n" +
            "```\n" +
            "Date: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT\n" +
            "Content-Type: text/plain;charset=iso-8859-1\n" +
            "Content-Length: 7\n" +
            "Server: Jetty(9.4.14.v20181114)\n" +
            "```\n" +
            "\n" +
            "### Resulting body back from the real server (200: text/plain;charset=iso-8859-1):\n" +
            "\n" +
            "```\n" +
            "yee ha!\n" +
            "```\n\n"), sanitizeDate(out.toString()));
        } finally {
            target.stop();
        }

    }

    public void canRecordABinaryPut() throws Exception {

        StringBuilder whatHappened = new StringBuilder();

        Server target = makeTargetServer(whatHappened);
        target.start();

        try {
            final SimpleInteractionManipulations interactionManipulations =
            new SimpleInteractionManipulations("http://localhost:8080", "http://localhost:8001")
                    .withHeaderPrefixesToRemoveFromRequestToReal("Accept-Encoding");

            MarkdownRecorder recorder = new MarkdownRecorder(
                    new ServiceInteropViaOkHttp(),
                    interactionManipulations);

            servirtiumServer = makeServirtiumServer(interactionManipulations, recorder);

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            recorder.setOutputStream("foo", out);
            servirtiumServer.start();

            final InputStream resourceAsStream = new FileInputStream("../core/src/test/resources/png-transparent.png");
            byte[] pic = new byte[resourceAsStream.available()];
            resourceAsStream.read(pic);
            System.out.println();

            given()
                    .header("User-Agent", "RestAssured")
                    .contentType("image/png")
                    .body(pic).
            when()
                    .put("/not-important")
            .then()
                    .assertThat()
                    .statusCode(200)
                    .body(equalTo("yee ha!"));

            servirtiumServer.finishedScript();

            assertEquals(whatHappened.toString(), "/not-important, body-length=67, body[1]=-119, body[1]=80");

            // Order of headers is as originally sent
            assertEquals(sanitizeDate("## Interaction 0: PUT /not-important\n" +
            "\n" +
            "### Request headers sent to the real server:\n" +
            "\n" +
            "```\n" +
            "Accept: */*\n" +
            "User-Agent: RestAssured\n" +
            "Connection: keep-alive\n" +
            "Host: localhost:8001\n" +
            "Content-Length: 67\n" +
            "Content-Type: image/png; charset=ISO-8859-1\n" +
            "```\n" +
            "\n" +
            "### Body sent to the real server (image/png; charset=ISO-8859-1):\n" +
            "\n" +
            "```\n" +
            "//SERVIRTIUM+Base64: iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAYAAAAfFcSJAAAACklEQVR4nGMA\n" +
                    "AQAABQABDQottAAAAABJRU5ErkJggg==\n" +
            "```\n" +
            "\n" +
            "### Resulting headers back from the real server:\n" +
            "\n" +
            "```\n" +
            "Date: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT\n" +
            "Content-Type: text/plain;charset=iso-8859-1\n" +
            "Content-Length: 7\n" +
            "Server: Jetty(9.4.14.v20181114)\n" +
            "```\n" +
            "\n" +
            "### Resulting body back from the real server (200: text/plain;charset=iso-8859-1):\n" +
            "\n" +
            "```\n" +
            "yee ha!\n" +
            "```\n\n"), sanitizeDate(out.toString()));
        } finally {
            target.stop();

        }

    }

    public static Server makeTargetServer(StringBuilder whatHappened) {
        Server target = new Server(8001);
        // How the f*** do you turn off Embedded Jetty's logging???
        // Everything I tried (mostly static operations on Log) didn't work.

        target.setHandler(new AbstractHandler() {

            @Override
            public void handle(String target, org.eclipse.jetty.server.Request baseRequest,
                               HttpServletRequest request, HttpServletResponse response) throws IOException {


                final ServletInputStream inputStream = request.getInputStream();
                byte[] body = new byte[inputStream.available()];
                int len = inputStream.read(body);

                whatHappened.append(request.getRequestURI())
                        .append(", body-length=")
                        .append(len)
                        .append(", body[1]=")
                        .append(body[0])
                        .append(", body[1]=")
                        .append(body[1]);

                response.getWriter().write("yee ha!");
                response.setContentType("text/plain");
                response.setStatus(200);
                baseRequest.setHandled(true);
            }
        });
        return target;
    }

    private void checkPostToPostmanEchoViaRestAssured() {
        given()
                .header("User-Agent", "RestAssured")
                .body("I'm a little teapot").
        when()
                .post("/post")
        .then()
                .assertThat()
                .statusCode(200)
                .body(equalTo("{\"args\":{},\"data\":\"I'm a little teapot\",\"files\":{},\"form\":{},\"headers\":{\"x-forwarded-proto\":\"https\",\"host\":\"postman-echo.com\",\"content-length\":\"19\",\"accept\":\"*/*\",\"accept-encoding\":\"gzip\",\"content-type\":\"text/plain; charset=ISO-8859-1\",\"user-agent\":\"RestAssured\",\"x-forwarded-port\":\"443\"},\"json\":null,\"url\":\"https://postman-echo.com/post\"}"))
                .contentType("application/json;charset=utf-8");
    }

    private String sanitizeDate(String expected) {
        return expected
                .replaceAll("Date: .* GMT", "Date: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT")
                .replaceAll("set-cookie: sails.sid=.*; Path=/; HttpOnly\n",
                        "set-cookie: sails.sid=XxXxXxXxXxXx; Path=/; HttpOnly\n");
    }

    public static void main(String[] args) throws IOException {

        InputStream inputStream = new FileInputStream("../core/src/test/resources/png-transparent.png");
        byte[] foo = new byte[inputStream.available()];
        inputStream.read(foo);

        given()
                .header("User-Agent", "RestAssured")
                .contentType("text/foofoo")
                .body(foo).
                when()
                .post("https://postman-echo.com/post")
                .then()
                .assertThat()
                .statusCode(200)
                .body(jsonEqualTo("{\"args\":{},\"data\":{},\"files\":{},\"form\":{},\"headers\":{\"x-forwarded-proto\":\"https\",\"host\":\"postman-echo.com\",\"content-length\":\"67\",\"accept\":\"*/*\",\"accept-encoding\":\"gzip,deflate\",\"content-type\":\"image/foofoo; charset=ISO-8859-1\",\"user-agent\":\"RestAssured\",\"x-forwarded-port\":\"443\"},\"json\":null,\"url\":\"https://postman-echo.com/post\"}\n"))
                .contentType("application/json;charset=utf-8");

        System.out.println("XXXXX");

//        OkHttpClient client = new OkHttpClient();
//
//        MediaType MEDIA_TYPE_MARKDOWN
//                = MediaType.parse("text/x-markdown; charset=utf-8");
//
//
//        RequestBody requestBody = createRB(MEDIA_TYPE_MARKDOWN, inputStream);
//        Request request = new Request.Builder()
//                .url("https://postman-echo.com/post")
//                .post(requestBody)
//                .build();
//
//        Response response = client.newCall(request).execute();
//
//        if (!response.isSuccessful())
//            throw new IOException("Unexpected code " + response);
//
//        System.out.println("POST" + response.body().string());
    }

    public static RequestBody createRB(final MediaType mediaType, final InputStream inputStream) {
        return new RequestBody() {
            @Override
            public MediaType contentType() {
                return mediaType;
            }

            @Override
            public long contentLength() {
                try {
                    return inputStream.available();
                } catch (IOException e) {
                    return 0;
                }
            }

            @Override
            public void writeTo(BufferedSink sink) throws IOException {
                Source source = null;
                try {
                    source = Okio.source(inputStream);
                    sink.writeAll(source);
                } finally {
                    Util.closeQuietly(source);
                }
            }
        };
    }

}