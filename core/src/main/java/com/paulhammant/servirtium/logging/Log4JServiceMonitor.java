package com.paulhammant.servirtium.logging;

import com.paulhammant.servirtium.ServiceMonitor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JServiceMonitor implements ServiceMonitor {

    private static final Logger log = LogManager.getLogger();

    @Override
    public void unexpectedRequestError(Throwable throwable, String context) {
        log.debug("(context: " + context + ") unexpected request error", throwable);
    }

    @Override
    public void interactionFinished(int interactionNum, String method, String url, String context) {
        log.debug("(context: " + context + ") interaction " + interactionNum + " " + method + " " + url + " FINISHED");
    }

    @Override
    public void interactionFailed(int interactionNum, String method, String url, AssertionError assertionError, String context) {
        log.debug("(context: " + context + ") interaction " + interactionNum + " " + method + " " + url + " FAILED; assertionError:" + assertionError.getMessage());
    }
}
