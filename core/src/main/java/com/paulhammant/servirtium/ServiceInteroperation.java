package com.paulhammant.servirtium;

import java.util.List;
import java.util.Map;

public interface ServiceInteroperation {
    ServiceResponse invokeServiceEndpoint(String method, Object bodyToReal, String contentTypeToReal, String url, List<String> headersToReal, InteractionManipulations interactionManipulations, boolean lowerCaseHeaders) throws InteractionException;

    public static class InteractionException extends RuntimeException {
        public InteractionException(Throwable cause) {
            super(cause);
        }
    }
}
