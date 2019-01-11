package com.paulhammant.svhttp;

import java.io.FileNotFoundException;
import java.util.Map;

public class TodobackendDotComReplayerMain {

    public static void main(String[] args) throws FileNotFoundException {

        // Run this main() method from within Intellij

        // Then, in a browser go to:
        //    http://www.todobackend.com/specs/index.html?http://localhost:8099/todos

        // ... src/test/resources/TodobackendDotComServiceRecording.md will be read and
        // hopefully the Jasmine tests in the browser still pass.

        InteractionReplayingSvHttpServer replayer = new InteractionReplayingSvHttpServer(
                8099, false,
                new SimpleHeaderManipulator("localhost:8099", "todo-backend-sinatra.herokuapp.com") {
                    @Override
                    public void changeHeadersToSendToReal(Map<String, String> headersToReal) {
                        headersToReal.put("Cache-Control","no-cache");
                        headersToReal.put("Pragma","no-cache");
                    }
                })
                .withForgivingOrderOfClientRquestHeaders();

        replayer.setMarkdownScriptFilename("src/test/resources/TodobackendDotComServiceRecording.md");
        replayer.startApp();

    }

}
