package com.paulhammant.servirtium;

import static com.paulhammant.servirtium.TodobackendDotComRecorderMain.makeInteractionManipulations;
import static com.paulhammant.servirtium.TodobackendDotComRecorderMain.makeServirtiumServer;

public class TodobackendDotComReplayerMain {

    public static void main(String[] args) throws Exception {

        // Run this main() method from within Intellij

        // Then, in a browser go to:
        //    http://www.todobackend.com/specs/index.html?http://localhost:8099/todos

        // ... src/test/resources/TodobackendDotComServiceRecording.md will be read and
        // hopefully the Jasmine tests in the browser still pass.

        final SimpleInteractionManipulations manipulations = makeInteractionManipulations();

        MarkdownReplayer replayer = new MarkdownReplayer().withForgivingOrderOfClientRequestHeaders();

        JettyServirtiumServer servirtiumServer = makeServirtiumServer(manipulations, replayer);

        replayer.setScriptFilename("src/test/resources/TodobackendDotComServiceRecording.md");
        servirtiumServer.startApp();

        Runtime.getRuntime().addShutdownHook(new Thread(servirtiumServer::stop));

    }

}
