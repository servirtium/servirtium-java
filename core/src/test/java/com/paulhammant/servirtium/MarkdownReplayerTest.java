package com.paulhammant.servirtium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MarkdownReplayerTest {

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
        m.setPlaybackConversation("## Interaction 0:\n\naaa\n\n");
        m.setPlaybackConversation("## Interaction 0:\n\naaa\n\n## Interaction 1:\n\nbbb\n\n");
    }
}
