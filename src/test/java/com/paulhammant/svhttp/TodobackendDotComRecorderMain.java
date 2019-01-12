package com.paulhammant.svhttp;

import java.io.FileNotFoundException;
import java.util.Map;

public class TodobackendDotComRecorderMain {

    public static void main(String[] args) throws FileNotFoundException {

        /*

        Run this main() method from within Intellij

        Then, in a browser go to:

           http://www.todobackend.com/specs/index.html?http://localhost:8099/todos

         ... src/test/resources/TodobackendDotComServiceRecording.md should be overwritten

        Effectively, this is the same as pointing the browser to ...

          https://www.todobackend.com/specs/index.html?https://todo-backend-sinatra.herokuapp.com/todos
          or http://www.todobackend.com/specs/index.html?http://todo-backend-sinatra.herokuapp.com/todos

         */

        InteractionRecordingSvHttpServer recorder = new InteractionRecordingSvHttpServer(
                new SvHttpServer.ServerMonitor.Console(),
                new ServiceInteropViaOkHttp(),
                8099, false,
                new SimpleHeaderManipulator("localhost:8099", "todo-backend-sinatra.herokuapp.com") {
                    @Override
                    public void changeHeadersToSendToReal(Map<String, String> headersToReal) {
                        headersToReal.put("Cache-Control","no-cache");
                        headersToReal.put("Pragma","no-cache");
                    }
                });

        recorder.setMarkdownScriptFilename("src/test/resources/TodobackendDotComServiceRecording.md");
        recorder.startApp();

    }

}
