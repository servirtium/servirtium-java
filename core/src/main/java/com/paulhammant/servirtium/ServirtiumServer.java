package com.paulhammant.servirtium;

public abstract class ServirtiumServer {

    protected final InteractionManipulations interactionManipulations;
    protected final Interactor interactor;

    private String context = "no context";
    private boolean pretty;
    private int interactionNum = -1;
    private boolean lowerCaseHeaders;

    public ServirtiumServer(InteractionManipulations interactionManipulations, Interactor interactor) {

        this.interactionManipulations = interactionManipulations;
        this.interactor = interactor;
    }

    public abstract ServirtiumServer start() throws Exception;
    public abstract void stop();
    public abstract void finishedScript();

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


    public static class NullObject extends ServirtiumServer {

        public NullObject() {
            super(new InteractionManipulations.NullObject(), new Interactor.NullObject());
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
