package com.paulhammant.servirtium.jetty;

import com.paulhammant.servirtium.Interactor;
import com.paulhammant.servirtium.ServerMonitor;
import com.paulhammant.servirtium.ServirtiumServer;
import com.paulhammant.servirtium.SimpleInteractionManipulations;
import com.paulhammant.servirtium.SimplePostCentricTests;
import org.junit.After;
import org.junit.Test;

public class SimplePostCentricWithJettyTests extends SimplePostCentricTests {

    public ServirtiumServer makeServirtiumServer(SimpleInteractionManipulations interactionManipulations, Interactor interactor) {
        return new JettyServirtiumServer(new ServerMonitor.Console(),
                8080, interactionManipulations, interactor);
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
    public void canReplayASimplePostToPostmanEcho() throws Exception {
        super.canReplayASimplePostToPostmanEcho();
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
