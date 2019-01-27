package com.paulhammant.servirtium;

import java.util.Map;

public class TodobackendDotComReplayerMain {

    public static void main(String[] args) throws Exception {

        // Run this main() method from within Intellij

        // Then, in a browser go to:
        //    http://www.todobackend.com/specs/index.html?http://localhost:8099/todos

        // ... src/test/resources/TodobackendDotComServiceRecording.md will be read and
        // hopefully the Jasmine tests in the browser still pass.

        final SimpleInteractionManipulations pragma = new SimpleInteractionManipulations("localhost:8099", "todo-backend-sinatra.herokuapp.com") {
            @Override
            public void changeAllHeadersForRequestToReal(Map<String, String> headersToReal) {
                headersToReal.put("Cache-Control", "no-cache");
                headersToReal.put("Pragma", "no-cache");
                headersToReal.put("Referer", headersToReal.get("Referer").replace(super.fromUrl, super.toUrl));
            }
        };
        MarkdownReplayer replayer = new MarkdownReplayer()
                .withForgivingOrderOfClientRequestHeaders();

        ServirtiumServer servirtiumServer = new ServirtiumServer(new ServerMonitor.Console(),
                8099, false,
                pragma, replayer)
                .withPrettyPrintedTextBodies();

        replayer.setScriptFilename("src/test/resources/TodobackendDotComServiceRecording.md");
        servirtiumServer.startApp();

        Runtime.getRuntime().addShutdownHook(new Thread(servirtiumServer::stop));

    }

}
