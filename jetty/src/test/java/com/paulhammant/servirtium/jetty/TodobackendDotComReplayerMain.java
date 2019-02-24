package com.paulhammant.servirtium.jetty;

import com.paulhammant.servirtium.MarkdownReplayer;
import com.paulhammant.servirtium.ServirtiumServer;
import com.paulhammant.servirtium.SimpleInteractionManipulations;

import static com.paulhammant.servirtium.jetty.TodobackendDotComRecorderMain.makeInteractionManipulations;
import static com.paulhammant.servirtium.jetty.TodobackendDotComRecorderMain.makeServirtiumServer;

public class TodobackendDotComReplayerMain {

    public static void main(String[] args) throws Exception {

        // Run this main() method from within Intellij

        // Then, in a browser go to:
        //    http://www.todobackend.com/specs/index.html?http://localhost:8099/todos

        // ... src/test/resources/TodobackendDotComServiceRecording.md will be read and
        // hopefully the Jasmine tests in the browser still pass.

        final SimpleInteractionManipulations manipulations = makeInteractionManipulations();

        MarkdownReplayer replayer = new MarkdownReplayer().withAlphaSortingOfHeaders();

        ServirtiumServer servirtiumServer = makeServirtiumServer(manipulations, replayer);

        replayer.setScriptFilename("core/src/test/resources/TodobackendDotComServiceRecording.md");
        servirtiumServer.start();

        Runtime.getRuntime().addShutdownHook(new Thread(servirtiumServer::stop));

    }

}
