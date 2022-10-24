package com.paulhammant.servirtium;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public abstract class ServirtiumServer {

    protected final InteractionManipulations interactionManipulations;
    protected final InteractionMonitor interactionMonitor;

    private String context = "no context";
    private boolean pretty;
    private int interactionNum = -1;
    private boolean lowerCaseHeaders;

    public ServirtiumServer(InteractionManipulations interactionManipulations, InteractionMonitor interactionMonitor) {

        this.interactionManipulations = interactionManipulations;
        this.interactionMonitor = interactionMonitor;
    }

    public abstract ServirtiumServer start() throws Exception;
    public abstract void stop();
    public abstract void finishedScript();

    public abstract Throwable getLastException();

    public static boolean isText(String contentType) {
        return contentType.startsWith("text/") ||
                contentType.startsWith("image/svg") ||
                contentType.startsWith("multipart/form-data") ||
                contentType.startsWith("application/json") ||
                contentType.startsWith("application/xml") ||
                (contentType.startsWith("application/") && contentType.contains("script")) ||
                contentType.startsWith("application/xhtml+xml");
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getContext() {
        return context;
    }

    public final ServirtiumServer withPrettyPrintedTextBodies() {
        pretty = true;
        return this;
    }

    public final ServirtiumServer withLowerCaseHeaders() {
        lowerCaseHeaders = true;
        return this;
    }

    protected boolean useLowerCaseHeaders() {
        return lowerCaseHeaders;
    }

    public boolean shouldHavePrettyPrintedTextBodies() {
        return pretty;
    }

    protected void bumpInteractionNum() {
        interactionNum++;
    }

    protected int getInteractionNum() {
        return interactionNum;
    }

    protected void resetInteractionNumber() {
        interactionNum = -1;
    }

//    protected ArrayList<String> changeContentLength(List<String> newHeaders, String body) {
//        int len = -1;
//        ArrayList<String> tmp = new ArrayList<>();
//        for (String header : newHeaders) {
//            if (header.startsWith("Content-Type")) {
//                int csIx = header.indexOf("charset=");
//                if (csIx == -1) {
//                    csIx = header.indexOf("CHARSET=");
//                }
//                if (csIx > -1) {
//                    try {
//                        final String substring = header.substring(csIx + 8);
//                        len = new String(body.getBytes(substring)).length();
//                    } catch (UnsupportedEncodingException e) {
//                        throw new UnsupportedOperationException(e);
//                    }
//                }
//            }
//        }
//        if (len == -1) {
//            len = body.length();
//        }
//        for (String header : newHeaders) {
//            if (header.startsWith("Content-Length")) {
//                tmp.add("Content-Length: " + len);
//            } else {
//                tmp.add(header);
//            }
//        }
//        return tmp;
//    }

    public static class NullObject extends ServirtiumServer {

        public NullObject() {
            super(new InteractionManipulations.NullObject(), new InteractionMonitor.NullObject());
        }

        @Override
        public ServirtiumServer start() {
            return this;
        }


        @Override
        public void stop() {
        }

        @Override
        public void finishedScript() {
        }

        @Override
        public Throwable getLastException() {
            return null;
        }
    }

    public static String classAndTestName() {
        return classAndTestName(0);
    }

    public static String classAndTestName(int numRemovedFromCaller) {
        StackTraceElement[] stes = Thread.currentThread().getStackTrace();
        int ix = 0;
        for (int j = 0; j < stes.length; j++) {
            StackTraceElement ste = stes[j];
            if (!ste.getClassName().startsWith("sun.")
                    && !ste.getClassName().startsWith("java")
                    && !ste.getMethodName().equals("classAndTestName")) {
                if (ix++ == numRemovedFromCaller) {
                    return ste.getClassName() + "." + ste.getMethodName();
                }
            }
        }
        throw new UnsupportedOperationException("could net get method name");
    }
}
