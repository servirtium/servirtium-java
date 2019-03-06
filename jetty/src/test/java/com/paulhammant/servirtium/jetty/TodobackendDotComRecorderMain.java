package com.paulhammant.servirtium.jetty;

import com.paulhammant.servirtium.Interactor;
import com.paulhammant.servirtium.MarkdownRecorder;
import com.paulhammant.servirtium.ServiceMonitor;
import com.paulhammant.servirtium.ServiceInteropViaOkHttp;
import com.paulhammant.servirtium.ServirtiumServer;
import com.paulhammant.servirtium.SimpleInteractionManipulations;

import java.util.List;

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
                new ServiceInteropViaOkHttp(), manipulations)
                .withAlphaSortingOfHeaders();

        ServirtiumServer servirtiumServer = makeServirtiumServer(manipulations, recorder);

        recorder.setScriptFilename("core/src/test/resources/TodobackendDotComServiceRecording.md");
        servirtiumServer.start();

        Runtime.getRuntime().addShutdownHook(new Thread(servirtiumServer::stop));
    }

    public static ServirtiumServer makeServirtiumServer(SimpleInteractionManipulations manipulations, Interactor interactor) {
        return new JettyServirtiumServer(new ServiceMonitor.Console(), 8099,
                manipulations, interactor)
                .withPrettyPrintedTextBodies();
    }

    public static SimpleInteractionManipulations makeInteractionManipulations() {
        return new SimpleInteractionManipulations("localhost:8099", "todo-backend-sinatra.herokuapp.com") {
            @Override
            public void changeAnyHeadersForRequestToService(List<String> clientRequestHeaders) {
                String refer = "";
                for (int i = 0; i < clientRequestHeaders.size(); i++) {
                    String s = clientRequestHeaders.get(i);
                    if (s.startsWith("Referer:")) {
                        refer = s;
                    }
                    if (s.startsWith("Cache-Control:") || s.startsWith("Pragma:") || s.startsWith("Referer:")) {
                        clientRequestHeaders.remove(s);
                    }
                }
                clientRequestHeaders.add("Cache-Control: no-cache");
                clientRequestHeaders.add("Pragma: no-cache");
                clientRequestHeaders.add(refer.replace(super.fromUrl, super.toUrl));
            }

            @Override
            public String changeBodyReturnedBackFromServiceForClient(String body) {
                return body.replaceAll("todo-backend-sinatra\\.herokuapp\\.com",
                        "localhost:8099");
            }
        };
    }

}
