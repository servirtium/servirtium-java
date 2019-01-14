package com.paulhammant.svhttp;

import java.util.Map;

public interface ServiceInteroperation {
    ServiceResponse invokeServiceEndpoint(String method, String bodyToReal, String contentTypeToReal, String url, Map<String, String> headersToReal, InteractionManipulations interactionManipulations) throws InteractionException;

    public static class InteractionException extends RuntimeException {
        public InteractionException(Throwable cause) {
            super(cause);
        }
    }
}
