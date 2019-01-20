package com.paulhammant.servirtium;

public interface ServerMonitor {

    default void interactionFinished(int interactionNum, String method, String url) {}

    default void interactionStarted(int interactionNum, String method, String url){}

    default void unexpectedRequestError(Throwable throwable) {}

    class Default implements ServerMonitor {
    }

    class Console implements ServerMonitor {

        @Override
        public void interactionFinished(int interactionNum, String method, String url) {
            System.out.println(">> Servirtium >> interaction " + interactionNum + " " + method + " " + url + " DONE");
        }

        @Override
        public void interactionStarted(int interactionNum, String method, String url) {
        }

        @Override
        public void unexpectedRequestError(Throwable throwable) {
            System.out.println(">> Servirtium >> unexpected request error ");
        }
    }
}
