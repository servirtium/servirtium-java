package com.paulhammant.servirtium;

public interface ServerMonitor {

    default void interactionStarted(int interactionNum, Interactor.Interaction interactionl){}

    default void interactionFinished(int interactionNum, String method, String url) {}

    default void interactionFailed(int interactionNum, String method, String url, AssertionError assertionError) {}

    default void unexpectedRequestError(Throwable throwable) {}

    class Default implements ServerMonitor {
    }

    class Console implements ServerMonitor {

        @Override
        public void unexpectedRequestError(Throwable throwable) {
            printShevrons();
            System.out.println(">> Servirtium >> unexpected request error: " + throwable.getMessage());
            printShevrons();        }

        private void printShevrons() {
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        }

        @Override
        public void interactionFinished(int interactionNum, String method, String url) {
            printShevrons();
            System.out.println(">> Servirtium >> interaction " + interactionNum + " " + method + " " + url + " FINISHED");
            printShevrons();
        }


        @Override
        public void interactionFailed(int interactionNum, String method, String url, AssertionError assertionError) {
            printShevrons();
            System.out.println(">> Servirtium >> interaction " + interactionNum + " " + method + " " + url + " FAILED");
            System.out.println(">> " + assertionError.getMessage());
            printShevrons();
        }

    }
}
