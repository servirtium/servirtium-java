package com.paulhammant.servirtium.jetty;

import com.paulhammant.servirtium.Interactor;
import com.paulhammant.servirtium.MarkdownRecorder;
import com.paulhammant.servirtium.ServiceMonitor;
import com.paulhammant.servirtium.ServiceInteropViaOkHttp;
import com.paulhammant.servirtium.ServirtiumServer;
import com.paulhammant.servirtium.SimpleInteractionManipulations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TodobackendDotComRecorderMain {

    public static final Pattern UID_PATTERN = Pattern.compile("\"([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})\"");

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
//                .withExtraDebugOutput(); // - This adds extra debugging output

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

    private static class ReplaceMockGuidForRealOnes implements BiConsumer<String, Integer> {
        private String result;

        public ReplaceMockGuidForRealOnes(String str) {
            this.result = str;
        }

        @Override
        public void accept(String guid, Integer integer) {
            result = result.replaceAll("MOCK-GUID-" + integer, guid);
        }
    }


    public static SimpleInteractionManipulations makeInteractionManipulations() {
        return new SimpleInteractionManipulations("localhost:8099", "todo-backend-sinatra.herokuapp.com") {

            Map<String, Integer> guids = new HashMap<>();

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
            public String changeBodyReturnedBackFromRealServiceForRecording(String bodyFromService) {
                return replaceRealGuidForMockOnes(bodyFromService);
            }

            @Override
            public String changeUrlForRequestToService(String url) {
                return super.changeUrlForRequestToService(replaceRealGuidForMockOnes(url));
            }

            @Override
            public String changeBodyForClientResponseAfterRecording(String body) {

                final ReplaceMockGuidForRealOnes replaceMockGuidForRealOnes = new ReplaceMockGuidForRealOnes(body);
                guids.forEach(replaceMockGuidForRealOnes);

                return replaceMockGuidForRealOnes.result.replaceAll("todo-backend-sinatra\\.herokuapp\\.com",
                        "localhost:8099");
            }

            private String replaceRealGuidForMockOnes(String result) {
                Matcher uidMatcher = UID_PATTERN.matcher(result);
                while (uidMatcher.find()) {
                    final String uid1 = uidMatcher.group(1);
                    System.out.println("++++" + uid1);
                    if (!guids.containsKey(uid1)) {
                        guids.put(uid1, guids.size() + 1);
                    }
                    result = result.replaceAll(uid1, "MOCK-GUID-" + guids.get(uid1));
                    uidMatcher = UID_PATTERN.matcher(result);
                }
                return result;
            }

        };
    }

}
