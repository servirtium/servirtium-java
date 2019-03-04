package com.paulhammant.servirtium;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public interface ServiceMonitor {

    default void interactionStarted(int interactionNum, Interactor.Interaction interactionl){}

    default void interactionFinished(int interactionNum, String method, String url, String context) {}

    default void interactionFailed(int interactionNum, String method, String url, AssertionError assertionError, String context) {}

    default void unexpectedRequestError(Throwable throwable, String context) {}

    class Default implements ServiceMonitor {
    }

    class Console implements ServiceMonitor {

        @Override
        public void unexpectedRequestError(Throwable throwable, String context) {
            printShevrons();
            System.out.println(">> Servirtium >> (context: " + context + ") unexpected request error: " + throwable.getMessage() + "\nStackTrace:\n" + stackTrace(throwable));
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

    static String stackTrace(Throwable throwable) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        String stack = "";
        throwable.printStackTrace(new PrintStream(baos));
        try {
            baos.close();
            stack = baos.toString();
        } catch (IOException e) {
        }
        return stack;
    }
}
