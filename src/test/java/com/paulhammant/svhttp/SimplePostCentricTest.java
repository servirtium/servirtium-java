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

import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayOutputStream;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;

public class SimplePostCentricTest {

    public static final String EXPECTED =
            "## SvHttp Interaction 0: POST /post\n" +
            "\n" +
            "### Request headers sent to the real server:\n" +
            "\n" +
            "```\n" +
            "Accept: */*\n" +
            "User-Agent: RestAssured\n" +
            "Connection: keep-alive\n" +
            "Host: localhost:8080\n" +
            "Accept-Encoding: gzip,deflate\n" +
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
            "ETag: W/\"145-Jwv9/WWsc6+3MH1D6qmR3cqfUn8\"\n" +
            "Server: nginx\n" +
            "set-cookie: sails.sid=s%3AQpYXn4PNOGmzId3jttU03ZketH2aY6Zz.dj6l8lpXUtFJTCoRxWRPPx4fISmmCKzgOAlIxT2DSxM; Path=/; HttpOnly\n" +
            "Vary: Accept-Encoding\n" +
            "Connection: keep-alive\n" +
            "```\n" +
            "\n" +
            "### Resulting body back from the real server (200: application/json; charset=utf-8):\n" +
            "\n" +
            "```\n" +
            "{\"args\":{},\"data\":\"I'm a little teapot\",\"files\":{},\"form\":{},\"headers\":{\"x-forwarded-proto\":\"https\",\"host\":\"localhost\",\"content-length\":\"19\",\"accept\":\"*/*\",\"accept-encoding\":\"gzip\",\"content-type\":\"text/plain; charset=ISO-8859-1\",\"user-agent\":\"RestAssured\",\"x-forwarded-port\":\"443\"},\"json\":null,\"url\":\"https://localhost/post\"}\n" +
            "```\n" +
            "\n";
    private ServiceInteractionDelegate delegate;


    @Test @Ignore
    public void canRecordASimplePostToPostmanEchoViaUniRest() {

        delegate = new ServiceInteractionRecorder(
                new UniRestRealServiceInteractor(),
               8080, false, new SimpleHeaderManipulator("http://localhost:8080", "https://postman-echo.com"));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ((ServiceInteractionRecorder) delegate).setOutputStream("foo", out);
        delegate.startApp();

        checkPostToPostmanEchoViaRestAssured();

        // Order of headers is NOT as originally sent as UniRest uses a Map to store them
        assertEquals(sanitizeDate(EXPECTED), sanitizeDate(out.toString()));

        delegate.finishedMarkdownScript();

    }

    @After
    public void tearDown() {
        delegate.stop();
    }

    @Test
    public void canRecordASimplePostToPostmanEchoViaOkHttp() {

        delegate = new ServiceInteractionRecorder(
                new OkHttpRealServiceInteractor(),
               8080, false, new SimpleHeaderManipulator("http://localhost:8080", "https://postman-echo.com"));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ((ServiceInteractionRecorder) delegate).setOutputStream("foo", out);
        delegate.startApp();

        checkPostToPostmanEchoViaRestAssured();

        // Order of headers is as originally sent
        assertEquals(sanitizeDate(EXPECTED), sanitizeDate(out.toString()));

        delegate.finishedMarkdownScript();
    }

    @Test
    public void canReplayASimplePostToPostmanEcho() {

        delegate = new ServiceInteractionReplayer(
               8080, false, new SimpleHeaderManipulator("http://localhost:8080", "https://postman-echo.com"));
        ((ServiceInteractionReplayer) delegate).setPlaybackConversation(EXPECTED);
        delegate.startApp();

        checkPostToPostmanEchoViaRestAssured();

        delegate.finishedMarkdownScript();
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
                .body(equalTo("{\"args\":{},\"data\":\"I'm a little teapot\",\"files\":{},\"form\":{},\"headers\":{\"x-forwarded-proto\":\"https\",\"host\":\"localhost\",\"content-length\":\"19\",\"accept\":\"*/*\",\"accept-encoding\":\"gzip\",\"content-type\":\"text/plain; charset=ISO-8859-1\",\"user-agent\":\"RestAssured\",\"x-forwarded-port\":\"443\"},\"json\":null,\"url\":\"https://localhost/post\"}"))
                .contentType("application/json;charset=utf-8");
    }

    private String sanitizeDate(String expected) {
        return expected
                .replaceAll("Date: .* GMT", "Date: Aaa, Nn Aaa Nnnn Nn:Nn:Nn GMT")
                .replaceAll("set-cookie: sails.sid=.*; Path=/; HttpOnly\n",
                        "set-cookie: sails.sid=XxXxXxXxXxXx; Path=/; HttpOnly\n");
    }

}