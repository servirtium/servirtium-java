package com.paulhammant.servirtium.undertow;

import com.paulhammant.servirtium.InteractionMonitor;
import com.paulhammant.servirtium.ServiceMonitor;
import com.paulhammant.servirtium.ServirtiumServer;
import com.paulhammant.servirtium.SimpleInteractionManipulations;
import com.paulhammant.servirtium.SimplePostCentricTests;
import org.junit.After;
import org.junit.Test;

public class SimplePostCentricWithUndertowTests extends SimplePostCentricTests {

    public ServirtiumServer makeServirtiumServer(SimpleInteractionManipulations interactionManipulations, InteractionMonitor interactionMonitor) {
        return new UndertowServirtiumServer(new ServiceMonitor.Console(),
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

    @Override @Test
    public void canRecordABase64PostToPostmanEchoViaOkHttp() throws Exception {
        super.canRecordABase64PostToPostmanEchoViaOkHttp();
    }

    @Override @Test
    public void canReplayASimplePostToPostmanEcho() throws Exception {
        super.canReplayASimplePostToPostmanEcho();
    }

    @Override @Test
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
