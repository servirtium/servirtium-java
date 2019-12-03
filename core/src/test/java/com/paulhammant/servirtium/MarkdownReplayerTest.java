package com.paulhammant.servirtium;

import org.junit.Test;
import org.mockito.Matchers;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.eq;

public class MarkdownReplayerTest {

    private static final InteractionManipulations.NullObject NO_MANIPULATIONS = new InteractionManipulations.NullObject();

    @Test
    public void replayerShouldNotWorkWithoutAPreviouslyRecordedScript() {
        MarkdownReplayer m = new MarkdownReplayer();
        try {
            m.setPlaybackConversation("oh noes");
            fail("should have barfed");
        } catch (UnsupportedOperationException e) {
            assertEquals("No '## Interaction' found in conversation 'oh noes'. Wrong/empty script file?", e.getMessage());
        }
    }

    @Test
    public void replayerShouldWorkWithAPreviouslyRecordedScript() {
        MarkdownReplayer m = new MarkdownReplayer();
        m.setPlaybackConversation("## Interaction 0: GET /hello/how/are/you.json\n" +
                "\n" +
                "### Request headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "foo: aaa\n" +
                "bar: bbb\n" +
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
                "h1: one\n" +
                "h2: two\n" +
                "```\n" +
                "\n" +
                "### Response body recorded for playback (200: text/plain; charset=utf-8):\n" +
                "\n" +
                "```\n" +
                "{\n" +
                "   \"hello\": \"how-are-you\"\n" +
                "}\n" +
                "```\n" +
                "\n");
        final MarkdownReplayer.ReplayingInteraction interaction = m.newInteraction("GET", "aaa/bbb", 0,
                "http://example.com/hello/how/are/you.json", "hello");
        interaction.noteClientRequestHeadersAndBody(NO_MANIPULATIONS, Arrays.asList("foo: aaa", "bar: bbb"), "", "", "GET", false);
        ServiceResponse x = m.getServiceResponseForRequest("GET", "http://example.com/hello/how/are/you.json", interaction, false);
        assertEquals(2, x.headers.length);
        assertEquals("h1: one", x.headers[0]);
        assertEquals("h2: two", x.headers[1]);
        assertEquals("{\n   \"hello\": \"how-are-you\"\n}", x.body);
    }

    @Test
    public void unexpectedHeaders() {
        MarkdownReplayer m = new MarkdownReplayer();
        m.setPlaybackConversation("## Interaction 0: GET /hello/how/are/you.json\n" +
                "\n" +
                "### Request headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "foo: aaa\n" +
                "bar: bbb\n" +
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
                "h1: one\n" +
                "h2: two\n" +
                "```\n" +
                "\n" +
                "### Response body recorded for playback (200: text/plain; charset=utf-8):\n" +
                "\n" +
                "```\n" +
                "{\n" +
                "   \"hello\": \"how-are-you\"\n" +
                "}\n" +
                "```\n" +
                "\n");
        final MarkdownReplayer.ReplayingInteraction interaction = m.newInteraction("GET", "aaa/bbb", 0,
                "http://example.com/hello/how/are/you.json", "hello");
        interaction.noteClientRequestHeadersAndBody(NO_MANIPULATIONS, Arrays.asList("foo: aaaaaaaa", "bar: bbbbbbbbb"), "", "", "GET", false);

        try {
            ServiceResponse x = m.getServiceResponseForRequest("GET", "http://example.com/hello/how/are/you.json", interaction, false);
        } catch (AssertionError e) {

            assertThat(e.getMessage(), equalTo("Interaction 0 (method: GET) in file 'no filename set' (context: hello), headers from " +
                    "the client that should be sent to real server are not the same as those previously recorded"));

            assertThat(e.getCause().getMessage(), equalTo("\n" +
                    "Expected: [\"foo: aaa\", \"bar: bbb\"] in any order\n" +
                    "     but: Not matched: \"foo: aaaaaaaa\""));
        }
    }

    @Test
    public void unexpectedHttpMethod() {
        MarkdownReplayer m = new MarkdownReplayer();
        m.setPlaybackConversation("## Interaction 0: GET /hello/how/are/you.json\n" +
                "\n" +
                "### Request headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "foo: aaa\n" +
                "bar: bbb\n" +
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
                "h1: one\n" +
                "h2: two\n" +
                "```\n" +
                "\n" +
                "### Response body recorded for playback (200: text/plain; charset=utf-8):\n" +
                "\n" +
                "```\n" +
                "{\n" +
                "   \"hello\": \"how-are-you\"\n" +
                "}\n" +
                "```\n" +
                "\n");
        final MarkdownReplayer.ReplayingInteraction interaction = m.newInteraction("GET", "aaa/bbb", 0,
                "http://example.com/hello/how/are/you.json", "hello");
        interaction.noteClientRequestHeadersAndBody(NO_MANIPULATIONS, Arrays.asList("foo: aaaaaaaa", "bar: bbbbbbbbb"), "", "", "GET", false);

        try {
            ServiceResponse x = m.getServiceResponseForRequest("BLORT", "http://example.com/hello/how/are/you.json", interaction, false);
        } catch (AssertionError e) {

            assertThat(e.getMessage(), equalTo("Interaction 0 (method: GET) in file 'no filename set' (context: hello), " +
                    "method from the client that should be sent to real server are not the same as " +
                    "expected: BLORT (URL=http://example.com/hello/how/are/you.json, script=no filename set)"));

            assertThat(e.getCause().getMessage(), equalTo("\n" +
                    "Expected: \"GET\"\n" +
                    "     but: was \"BLORT\""));
        }
    }

    @Test
    public void replayerShouldWorkWithAPreviouslyRecordedScriptAndRequestHeaderReplacements() {
        MarkdownReplayer m = new MarkdownReplayer();
        m.setPlaybackConversation("## Interaction 0: GET /hello/how/are/you.json\n" +
                "\n" +
                "### Request headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "foo: aaa\n" +
                "bar: bbb\n" +
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
                "h1: one\n" +
                "h2: two\n" +
                "```\n" +
                "\n" +
                "### Response body recorded for playback (200: text/plain; charset=utf-8):\n" +
                "\n" +
                "```\n" +
                "{\n" +
                "   \"hello\": \"how-are-you\"\n" +
                "}\n" +
                "```\n" +
                "\n");
        m.withReplacementInPlayback("abc", "foo");
        MarkdownReplayer.ReplayingInteraction interaction = m.newInteraction("GET", "aaa/bbb", 0,
                "http://example.com/hello/how/are/you.json", "hello");
        interaction.noteClientRequestHeadersAndBody(NO_MANIPULATIONS, Arrays.asList("abc: aaa", "bar: bbb"), "", "", "GET", false);
        ServiceResponse x = m.getServiceResponseForRequest("GET", "http://example.com/hello/how/are/you.json", interaction, false);
        assertEquals(2, x.headers.length);
        assertEquals("h1: one", x.headers[0]);
        assertEquals("h2: two", x.headers[1]);
        assertEquals("{\n   \"hello\": \"how-are-you\"\n}", x.body);
    }

    @Test
    public void replayerShouldWorkWithAPreviouslyRecordedScriptAndRequestBodyReplacements() {
        MarkdownReplayer m = new MarkdownReplayer();
        m.setPlaybackConversation("## Interaction 0: POST /hello/how/are/you.json\n" +
                "\n" +
                "### Request headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "foo: aaa\n" +
                "bar: bbb\n" +
                "```\n" +
                "\n" +
                "### Request body recorded for playback (text/plain):\n" +
                "\n" +
                "```\n" +
                "kapow\n" +
                "```\n" +
                "\n" +
                "### Response headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "h1: one\n" +
                "h2: two\n" +
                "```\n" +
                "\n" +
                "### Response body recorded for playback (200: text/plain; charset=utf-8):\n" +
                "\n" +
                "```\n" +
                "{\n" +
                "   \"hello\": \"how-are-you\"\n" +
                "}\n" +
                "```\n" +
                "\n");
        m.withReplacementInPlayback("smack", "kapow");
        final MarkdownReplayer.ReplayingInteraction interaction = m.newInteraction("POST", "aaa/bbb", 0,
                "http://example.com/hello/how/are/you.json", "hello");
        final List<String> clientRequestHeaders = Arrays.asList("foo: aaa", "bar: bbb");
        interaction.noteClientRequestHeadersAndBody(NO_MANIPULATIONS, clientRequestHeaders, "smack", "text/plain", "GET", false);
        ServiceResponse x = m.getServiceResponseForRequest("POST", "http://example.com/hello/how/are/you.json", interaction, false);
        assertEquals(2, x.headers.length);
        assertEquals("h1: one", x.headers[0]);
        assertEquals("h2: two", x.headers[1]);
        assertEquals("{\n   \"hello\": \"how-are-you\"\n}", x.body);
    }
}
