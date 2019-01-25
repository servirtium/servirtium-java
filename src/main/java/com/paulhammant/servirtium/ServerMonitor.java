package com.paulhammant.servirtium;

public interface ServerMonitor {

    default void interactionStarted(int interactionNum, Interactor.Interaction interactionl){}

    default void interactionFinished(int interactionNum, String method, String url, String context) {}

    default void interactionFailed(int interactionNum, String method, String url, AssertionError assertionError, String context) {}

    default void unexpectedRequestError(Throwable throwable, String context) {}

    class Default implements ServerMonitor {
    }

    class Console implements ServerMonitor {

        @Override
        public void unexpectedRequestError(Throwable throwable, String context) {
            printShevrons();
            System.out.println(">> Servirtium >> (context: " + context + ") unexpected request error: " + throwable.getMessage());
            printShevrons();        }

        private void printShevrons() {
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        }

        @Override
        public void interactionFinished(int interactionNum, String method, String url, String context) {
            printShevrons();
            System.out.println(">> Servirtium >> (context: " + context + ") interaction " + interactionNum + " " + method + " " + url + " FINISHED");
            printShevrons();
        }


        @Override
        public void interactionFailed(int interactionNum, String method, String url, AssertionError assertionError, String context) {
            printShevrons();
            System.out.println(">> Servirtium >> (context: " + context + ") interaction " + interactionNum + " " + method + " " + url + " FAILED");
            System.out.println(">> " + assertionError.getMessage());
            printShevrons();
        }

    }
}
