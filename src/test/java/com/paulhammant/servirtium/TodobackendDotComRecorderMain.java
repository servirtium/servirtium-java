package com.paulhammant.servirtium;

import java.util.Map;

public class TodobackendDotComRecorderMain {

    public static void main(String[] args) throws Exception {

        /*

        Run this main() method from within Intellij

        Then, in a browser go to:

           http://www.todobackend.com/specs/index.html?http://localhost:8099/todos

         ... src/test/resources/TodobackendDotComServiceRecording.md should be overwritten

        Effectively, this is the same as pointing the browser to ...

          https://www.todobackend.com/specs/index.html?https://todo-backend-sinatra.herokuapp.com/todos
          or http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos

         */

        // ([0-9a-f\-]{28,60})

        final SimpleInteractionManipulations manipulations = makeInteractionManipulations();

        MarkdownRecorder recorder = new MarkdownRecorder(
                new ServiceInteropViaOkHttp(), manipulations);

        ServirtiumServer servirtiumServer = makeServirtiumServer(manipulations, recorder);

        recorder.setScriptFilename("src/test/resources/TodobackendDotComServiceRecording.md");
        servirtiumServer.startApp();

        Runtime.getRuntime().addShutdownHook(new Thread(servirtiumServer::stop));
    }

    public static ServirtiumServer makeServirtiumServer(SimpleInteractionManipulations manipulations, Interactor interactor) {
        return new ServirtiumServer(new ServerMonitor.Console(), 8099, false,
                manipulations, interactor)
                .withPrettyPrintedTextBodies();
    }

    public static SimpleInteractionManipulations makeInteractionManipulations() {
        return new SimpleInteractionManipulations("localhost:8099", "todo-backend-sinatra.herokuapp.com") {
            @Override
            public void changeAllHeadersForRequestToReal(Map<String, String> headersToReal) {
                headersToReal.put("Cache-Control", "no-cache");
                headersToReal.put("Pragma", "no-cache");
                headersToReal.put("Referer", headersToReal.get("Referer").replace(super.fromUrl, super.toUrl));
            }
        };
    }

}
