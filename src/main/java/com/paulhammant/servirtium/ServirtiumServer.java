package com.paulhammant.servirtium;

public abstract class ServirtiumServer {

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

    public static class NullObject extends ServirtiumServer {

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
}
