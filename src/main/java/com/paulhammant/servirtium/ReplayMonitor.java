package com.paulhammant.servirtium;

public interface ReplayMonitor {

    void finishedButMoreInteractionsYetToDo(int interaction, String filename);

    void couldNotFindInteraction(int interaction, String filename);

    void methodNotAsExpected(int interaction, String filename, String mdMethod, String method);

    void urlNotAsExpected(String url, InteractionsReplayer.ReplayingContext rc, String mdMethod, String mdUrl, String filename);

    void markdownSectionHeadingMissing(int interaction, String HEADERS_SENT_TO_REAL_SERVER, String filename);

    void headersFromClientToRealNotAsExpected(int interaction, String mdMethod, String filename);

    void bodyFromClientToRealNotAsExpected(int interaction, String mdMethod, String filename);

    void contentTypeFromClientToRealNotAsExpected(int interaction, String mdMethod, String filename);

    AssertionError unexpectedInteractionRequest(int interactionNum, String filename);

    class Default implements ReplayMonitor {

        public void finishedButMoreInteractionsYetToDo(int interaction, String filename) {
            throw makeAssertionError("There are more recorded interactions after last replayed interaction: #" + interaction + " in " + filename + ", yet invocation of .finishedScript() possibly via .stop() implies there should be no more. Fail!!");
        }

        public void couldNotFindInteraction(int interaction, String filename) {
            throw makeAssertionError("Could not find interactions #" + interaction + " in file '" + filename + "'");
        }

        public void methodNotAsExpected(int interaction, String filename, String mdMethod, String method) {
            throw makeAssertionError(methodAndFilePrefix(interaction, mdMethod, filename) + ", method from the client that should be sent to real server are not the same as expected: " + method);
        }

        public void urlNotAsExpected(String url, InteractionsReplayer.ReplayingContext rc, String mdMethod, String mdUrl, String filename) {
            throw makeAssertionError("Method " + rc.interactionNum + " (" + mdMethod + ") in " + filename + ": " + url + " does not end in previously recorded " + mdUrl);
        }

        public void markdownSectionHeadingMissing(int interaction, String HEADERS_SENT_TO_REAL_SERVER, String filename) {
            throw makeAssertionError("Expected '" + HEADERS_SENT_TO_REAL_SERVER + "' for interaction #" + interaction + " in " + filename + ", but it was not there");
        }

        public void headersFromClientToRealNotAsExpected(int interaction, String mdMethod, String filename) {
            throw makeAssertionError(methodAndFilePrefix(interaction, mdMethod, filename) + ", headers from the client that should be sent to real server are not the same as those previously recorded");
        }

        public void bodyFromClientToRealNotAsExpected(int interaction, String mdMethod, String filename) {
            throw makeAssertionError(methodAndFilePrefix(interaction, mdMethod, filename) + ", body from the client that should be sent to real server are not the same those previously recorded");
        }

        public void contentTypeFromClientToRealNotAsExpected(int interaction, String mdMethod, String filename) {
            throw makeAssertionError(methodAndFilePrefix(interaction, mdMethod, filename) + ", content-Type of body from the client that should be sent to real server are not the same those previously recorded");
        }

        public AssertionError unexpectedInteractionRequest(int interactionNum, String filename) {
            return makeAssertionError("Replay of script '" + filename + "' hit a problem when interaction " + interactionNum + " sought, but there were no more after " + (interactionNum -1));
        }

        private String methodAndFilePrefix(int interactionNum, String mdMethod, String filename) {
            return "Interaction " + interactionNum + " (method: " + mdMethod + ") in " + filename;
        }

        private AssertionError makeAssertionError(String message) {
            return new AssertionError(message);
        }

    }
}
