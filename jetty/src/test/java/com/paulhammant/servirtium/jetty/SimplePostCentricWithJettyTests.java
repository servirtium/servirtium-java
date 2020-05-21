package com.paulhammant.servirtium.jetty;

import com.paulhammant.servirtium.*;
import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;

public class SimplePostCentricWithJettyTests extends SimplePostCentricTests {

    public ServirtiumServer makeServirtiumServer(SimpleInteractionManipulations interactionManipulations, InteractionMonitor interactionMonitor) {
        return new JettyServirtiumServer(new ServiceMonitor.Console(),
                8080, interactionManipulations, interactionMonitor);
    }

    @Override @After
    public void tearDown() {
        super.tearDown();
    }

    @Override @Test
    public void canRecordASimplePostToPostmanEchoViaOkHttp() throws Exception {
        super.canRecordASimplePostToPostmanEchoViaOkHttp();
    }

    @Override @Test @Ignore
    public void canRecordABase64PostToPostmanEchoViaOkHttp() throws Exception {
        super.canRecordABase64PostToPostmanEchoViaOkHttp();
    }

    @Override @Test
    public void canReplayASimplePostToPostmanEcho() throws Exception {
        super.canReplayASimplePostToPostmanEcho();
    }

    @Override @Test @Ignore
    public void canReplayABase64PostToPostmanEcho() throws Exception {
        super.canReplayABase64PostToPostmanEcho();
    }

    @Override @Test
    public void canRecordABinaryPost() throws Exception {
        super.canRecordABinaryPost();
    }

    @Override @Test
    public void canRecordABinaryPut() throws Exception {
        super.canRecordABinaryPut();
    }
}
