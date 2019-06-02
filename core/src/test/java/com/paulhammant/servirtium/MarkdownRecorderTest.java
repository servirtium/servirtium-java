package com.paulhammant.servirtium;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.util.List;

import static java.util.Arrays.asList;
import static junit.framework.TestCase.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

public class MarkdownRecorderTest {

    @Test
    public void canRecordASimpleScript() {
        final InteractionManipulations im = mock(InteractionManipulations.class);
        final ServiceInteroperation si = mock(ServiceInteroperation.class);
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        when(im.headerReplacement("ZZZZ", "ZZ")).thenReturn("Z-Z");
        when(im.headerReplacement("REQ_HEADER_KEY", "VAL")).thenReturn("V-A-L");
        when(im.changeBodyForRequestToRealService("REQ_BODY")).thenReturn("R-E-Q__B-O-D-Y");
        when(im.headerReplacement("RSP_HEADER_KEY", "RSP_VAL")).thenReturn("R-S-P__V-A-L");

        MarkdownRecorder mr = new MarkdownRecorder(si, im);
        mr.setOutputStream("foo", out);
        InteractionMonitor.Interaction i = mr.newInteraction("FOO", "/a/b/c", 0, "http://foo.com/bar", "ctx");
        i.noteClientRequestHeadersAndBody(im, asList("ZZZZ: ZZ", "REQ_HEADER_KEY: VAL"),
                "REQ_BODY", "text/plain", "FOO", true);
        i.noteServiceResponseHeaders(new String[] {"RSP_HEADER_KEY: RSP_VAL"});
        i.noteServiceResponseBody("RSP_BODY", 200, "text/plain");
        i.complete();
        mr.finishedScript(0, false);

        verify(im).headerReplacement("ZZZZ", "ZZ");
        verify(im).headerReplacement("REQ_HEADER_KEY", "VAL");
        verify(im).changeSingleHeaderForRequestToRealService(eq("FOO"), eq("req_header_key: V-A-L"), any(List.class));
        verify(im).changeSingleHeaderForRequestToRealService(eq("FOO"), eq("zzzz: Z-Z"), any(List.class));
        verify(im).changeAnyHeadersForRequestToRealService(any(List.class));
        verify(im).changeBodyForRequestToRealService("REQ_BODY");
        verify(im).headerReplacement("RSP_HEADER_KEY", "RSP_VAL");
        verifyNoMoreInteractions(im, si);
        assertEquals("## Interaction 0: FOO /a/b/c\n" +
                "\n" +
                "### Request headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "zzzz: Z-Z\n" +
                "req_header_key: V-A-L\n" +
                "```\n" +
                "\n" +
                "### Request body recorded for playback (text/plain):\n" +
                "\n" +
                "```\n" +
                "R-E-Q__B-O-D-Y\n" +
                "```\n" +
                "\n" +
                "### Response headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "RSP_HEADER_KEY: R-S-P__V-A-L\n" +
                "```\n" +
                "\n" +
                "### Response body recorded for playback (200: text/plain):\n" +
                "\n" +
                "```\n" +
                "RSP_BODY\n" +
                "```\n\n", out.toString());
    }

    @Test
    public void canRecordASimpleScriptWithDebugging() {
        final InteractionManipulations im = mock(InteractionManipulations.class);
        final ServiceInteroperation si = mock(ServiceInteroperation.class);
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        when(im.headerReplacement("ZZZZ", "ZZ")).thenReturn("Z-Z");
        when(im.headerReplacement("REQ_HEADER_KEY", "VAL")).thenReturn("V-A-L");
        when(im.changeBodyForRequestToRealService("REQ_BODY")).thenReturn("R-E-Q__B-O-D-Y");
        when(im.headerReplacement("RSP_HEADER_KEY", "RSP_VAL")).thenReturn("R-S-P__V-A-L");

        MarkdownRecorder mr = new MarkdownRecorder(si, im)
                .withExtraDebugOutput();
        mr.setOutputStream("foo", out);
        InteractionMonitor.Interaction i = mr.newInteraction("FOO", "/a/b/c", 0, "http://foo.com/bar", "ctx");
        i.noteClientRequestHeadersAndBody(im, asList("ZZZZ: ZZ", "REQ_HEADER_KEY: VAL"),
                "REQ_BODY", "text/plain", "FOO", true);
        i.noteServiceResponseHeaders(new String[] {"RSP_HEADER_KEY: RSP_VAL"});
        i.noteServiceResponseBody("RSP_BODY", 200, "text/plain");
        i.complete();
        mr.finishedScript(0, false);

        verify(im).headerReplacement("ZZZZ", "ZZ");
        verify(im).headerReplacement("REQ_HEADER_KEY", "VAL");
        verify(im).changeSingleHeaderForRequestToRealService(eq("FOO"), eq("req_header_key: V-A-L"), any(List.class));
        verify(im).changeSingleHeaderForRequestToRealService(eq("FOO"), eq("zzzz: Z-Z"), any(List.class));
        verify(im).changeAnyHeadersForRequestToRealService(any(List.class));
        verify(im).changeBodyForRequestToRealService("REQ_BODY");
        verify(im).headerReplacement("RSP_HEADER_KEY", "RSP_VAL");
        verifyNoMoreInteractions(im, si);
        assertEquals("## Interaction 0: FOO /a/b/c\n" +
                "\n" +
                "### DEBUG: Request headers as received from client, WITHOUT ALPHA-SORT, REDACTIONS, ETC:\n" +
                "\n" +
                "```\n" +
                "ZZZZ: ZZ\n" +
                "REQ_HEADER_KEY: VAL\n" +
                "```\n" +
                "\n" +
                "### Request headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "zzzz: Z-Z\n" +
                "req_header_key: V-A-L\n" +
                "```\n" +
                "\n" +
                "### DEBUG: Request body as received from client (text/plain), WITHOUT REDACTIONS, ETC:\n" +
                "\n" +
                "```\n" +
                "REQ_BODY\n" +
                "```\n" +
                "\n" +
                "### Request body recorded for playback (text/plain):\n" +
                "\n" +
                "```\n" +
                "R-E-Q__B-O-D-Y\n" +
                "```\n" +
                "\n" +
                "### Response headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "RSP_HEADER_KEY: R-S-P__V-A-L\n" +
                "```\n" +
                "\n" +
                "### Response body recorded for playback (200: text/plain):\n" +
                "\n" +
                "```\n" +
                "RSP_BODY\n" +
                "```\n" +
                "\n", out.toString());
    }

    @Test
    public void canRecordASimpleScriptAndAlphaSortHeaders() {
        final InteractionManipulations im = mock(InteractionManipulations.class);
        final ServiceInteroperation si = mock(ServiceInteroperation.class);
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        when(im.headerReplacement("ZZZZ", "ZZ")).thenReturn("Z-Z");
        when(im.headerReplacement("REQ_HEADER_KEY", "VAL")).thenReturn("V-A-L");
        when(im.changeBodyForRequestToRealService("REQ_BODY")).thenReturn("R-E-Q__B-O-D-Y");
        when(im.headerReplacement("RSP_HEADER_KEY", "RSP_VAL")).thenReturn("R-S-P__V-A-L");

        MarkdownRecorder mr = new MarkdownRecorder(si, im)
                .withAlphaSortingOfHeaders();
        mr.setOutputStream("foo", out);
        InteractionMonitor.Interaction i = mr.newInteraction("FOO", "/a/b/c", 0, "http://foo.com/bar", "ctx");
        i.noteClientRequestHeadersAndBody(im, asList("ZZZZ: ZZ", "REQ_HEADER_KEY: VAL"),
                "REQ_BODY", "text/plain", "FOO", true);
        i.noteServiceResponseHeaders(new String[] {"RSP_HEADER_KEY: RSP_VAL"});
        i.noteServiceResponseBody("RSP_BODY", 200, "text/plain");
        i.complete();
        mr.finishedScript(0, false);

        verify(im).headerReplacement("ZZZZ", "ZZ");
        verify(im).headerReplacement("REQ_HEADER_KEY", "VAL");
        verify(im).changeSingleHeaderForRequestToRealService(eq("FOO"), eq("req_header_key: V-A-L"), any(List.class));
        verify(im).changeSingleHeaderForRequestToRealService(eq("FOO"), eq("zzzz: Z-Z"), any(List.class));
        verify(im).changeAnyHeadersForRequestToRealService(any(List.class));
        verify(im).changeBodyForRequestToRealService("REQ_BODY");
        verify(im).headerReplacement("RSP_HEADER_KEY", "RSP_VAL");
        verifyNoMoreInteractions(im, si);
        assertEquals("## Interaction 0: FOO /a/b/c\n" +
                "\n" +
                "### Request headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "req_header_key: V-A-L\n" +
                "zzzz: Z-Z\n" +
                "```\n" +
                "\n" +
                "### Request body recorded for playback (text/plain):\n" +
                "\n" +
                "```\n" +
                "R-E-Q__B-O-D-Y\n" +
                "```\n" +
                "\n" +
                "### Response headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "RSP_HEADER_KEY: R-S-P__V-A-L\n" +
                "```\n" +
                "\n" +
                "### Response body recorded for playback (200: text/plain):\n" +
                "\n" +
                "```\n" +
                "RSP_BODY\n" +
                "```\n" +
                "\n", out.toString());
    }

    @Test
    public void canRecordASimpleScriptWithNotes() {
        final InteractionManipulations im = mock(InteractionManipulations.class);
        final ServiceInteroperation si = mock(ServiceInteroperation.class);
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        when(im.changeBodyForRequestToRealService("REQ_BODY")).thenReturn("R-E-Q__B-O-D-Y");

        MarkdownRecorder mr = new MarkdownRecorder(si, im);
        mr.setOutputStream("foo", out);
        InteractionMonitor.Interaction i = mr.newInteraction("FOO", "/a/b/c", 0, "http://foo.com/bar", "ctx");
        mr.noteForNextInteraction("Mary", "... Had a Little Lamb");
        i.noteClientRequestHeadersAndBody(im, asList(),
                "REQ_BODY", "text/plain", "FOO", true);
        i.complete();
        mr.finishedScript(0, false);

        verify(im).changeAnyHeadersForRequestToRealService(any(List.class));
        verify(im).changeBodyForRequestToRealService("REQ_BODY");
        verifyNoMoreInteractions(im, si);
        assertEquals("## Interaction 0: FOO /a/b/c\n" +
                "\n" +
                "## [Note] Mary:\n" +
                "\n" +
                "... Had a Little Lamb\n" +
                "\n" +
                "### Request headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "```\n" +
                "\n" +
                "### Request body recorded for playback (text/plain):\n" +
                "\n" +
                "```\n" +
                "R-E-Q__B-O-D-Y\n" +
                "```\n" +
                "\n", out.toString());
    }

    @Test
    public void canRecordASimpleScriptWithCodeNotes() {
        final InteractionManipulations im = mock(InteractionManipulations.class);
        final ServiceInteroperation si = mock(ServiceInteroperation.class);
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        when(im.changeBodyForRequestToRealService("REQ_BODY")).thenReturn("R-E-Q__B-O-D-Y");

        MarkdownRecorder mr = new MarkdownRecorder(si, im);
        mr.setOutputStream("foo", out);
        InteractionMonitor.Interaction i = mr.newInteraction("FOO", "/a/b/c", 0, "http://foo.com/bar", "ctx");
        mr.codeNoteForNextInteraction("CodeNotes", "111\n222");
        i.noteClientRequestHeadersAndBody(im, asList(),
                "REQ_BODY", "text/plain", "FOO", true);
        i.complete();
        mr.finishedScript(0, false);

        verify(im).changeAnyHeadersForRequestToRealService(any(List.class));
        verify(im).changeBodyForRequestToRealService("REQ_BODY");
        verifyNoMoreInteractions(im, si);
        assertEquals("## Interaction 0: FOO /a/b/c\n" +
                "\n" +
                "## [Note] CodeNotes:\n" +
                "\n" +
                "```\n" +
                "111\n" +
                "222\n" +
                "```\n" +
                "\n" +
                "### Request headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "```\n" +
                "\n" +
                "### Request body recorded for playback (text/plain):\n" +
                "\n" +
                "```\n" +
                "R-E-Q__B-O-D-Y\n" +
                "```\n" +
                "\n", out.toString());
    }

    @Test
    public void canPerformBodyReplacementsInRecording() {
        final InteractionManipulations im = mock(InteractionManipulations.class);
        final ServiceInteroperation si = mock(ServiceInteroperation.class);
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        when(im.changeBodyForRequestToRealService("Mary had a little lamb")).thenReturn("Mary had a little lamb");

        MarkdownRecorder mr = new MarkdownRecorder(si, im).withReplacementsInRecording("little", "tiny", "lamb", "piglet");
        mr.setOutputStream("foo", out);
        InteractionMonitor.Interaction i = mr.newInteraction("FOO", "/a/b/c", 0, "http://foo.com/bar", "ctx");
        i.noteClientRequestHeadersAndBody(im, asList(),
                "Mary had a little lamb", "text/plain", "FOO", true);
        i.noteServiceResponseHeaders(new String[0]);
        i.noteServiceResponseBody("A little lamb had Mary", 200, "text/plain");
        i.complete();
        mr.finishedScript(0, false);

        verify(im).changeAnyHeadersForRequestToRealService(any(List.class));
        verify(im).changeBodyForRequestToRealService("Mary had a little lamb");
        verifyNoMoreInteractions(im, si);
        assertEquals("## Interaction 0: FOO /a/b/c\n" +
                "\n" +
                "### Request headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "```\n" +
                "\n" +
                "### Request body recorded for playback (text/plain):\n" +
                "\n" +
                "```\n" +
                "Mary had a tiny piglet\n" +
                "```\n" +
                "\n" +
                "### Response headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "```\n" +
                "\n" +
                "### Response body recorded for playback (200: text/plain):\n" +
                "\n" +
                "```\n" +
                "A tiny piglet had Mary\n" +
                "```\n\n", out.toString());
    }

    @Test
    public void canPerformHeaderReplacementsInRecording() {
        final InteractionManipulations im = mock(InteractionManipulations.class);
        final ServiceInteroperation si = mock(ServiceInteroperation.class);
        final ByteArrayOutputStream out = new ByteArrayOutputStream();

        when(im.headerReplacement("Mary", "had a little lamb")).thenReturn("had a little lamb");
        when(im.headerReplacement("A", "tiny piglet had Mary")).thenReturn("tiny piglet had Mary");


        MarkdownRecorder mr = new MarkdownRecorder(si, im).withReplacementsInRecording("little", "tiny", "lamb", "piglet");
        mr.setOutputStream("foo", out);
        InteractionMonitor.Interaction i = mr.newInteraction("FOO", "/a/b/c", 0, "http://foo.com/bar", "ctx");
        i.noteClientRequestHeadersAndBody(im, asList("Mary: had a little lamb"),
                "", "text/plain", "FOO", true);
        i.noteServiceResponseHeaders(new String[]{"A: little lamb had Mary"});
        i.noteServiceResponseBody("", 200, "text/plain");
        i.complete();
        mr.finishedScript(0, false);

        verify(im).changeAnyHeadersForRequestToRealService(any(List.class));
        verify(im).changeSingleHeaderForRequestToRealService(eq("FOO"), eq("mary: had a little lamb"), any(List.class));

        verify(im).headerReplacement("Mary", "had a little lamb");
        verify(im).headerReplacement("A", "tiny piglet had Mary");
        verify(im).changeBodyForRequestToRealService("");
        verifyNoMoreInteractions(im, si);
        assertEquals("## Interaction 0: FOO /a/b/c\n" +
                "\n" +
                "### Request headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "mary: had a tiny piglet\n" +
                "```\n" +
                "\n" +
                "### Request body recorded for playback (text/plain):\n" +
                "\n" +
                "```\n" +
                "\n" +
                "```\n" +
                "\n" +
                "### Response headers recorded for playback:\n" +
                "\n" +
                "```\n" +
                "A: tiny piglet had Mary\n" +
                "```\n" +
                "\n" +
                "### Response body recorded for playback (200: text/plain):\n" +
                "\n" +
                "```\n" +
                "\n" +
                "```\n\n", out.toString());
    }



}
