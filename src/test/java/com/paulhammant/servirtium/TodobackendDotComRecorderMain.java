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

        final ServerMonitor.Console serverMonitor = new ServerMonitor.Console();
        final SimpleHeaderManipulator interactionManipulations = new SimpleHeaderManipulator("localhost:8099", "todo-backend-sinatra.herokuapp.com") {
            @Override
            public void changeHeadersToSendToReal(Map<String, String> headersToReal) {
                headersToReal.put("Cache-Control", "no-cache");
                headersToReal.put("Pragma", "no-cache");
                headersToReal.put("Referer", headersToReal.get("Referer").replace(super.fromUrl, super.toUrl));
            }
        };
        InteractionRecordingServirtiumServer recorder = new InteractionRecordingServirtiumServer(
                serverMonitor,
                new ServiceInteropViaOkHttp(),
                interactionManipulations);
        NewServirtiumServer servirtiumServer = new NewServirtiumServer(serverMonitor,
                8099, false,
                interactionManipulations, recorder);

        recorder.setMarkdownScriptFilename("src/test/resources/TodobackendDotComServiceRecording.md");
        servirtiumServer.startApp();

    }

}
