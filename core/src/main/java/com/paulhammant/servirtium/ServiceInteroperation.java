package com.paulhammant.servirtium;

import java.util.List;

public interface ServiceInteroperation {
    ServiceResponse invokeServiceEndpoint(String method, Object clientRequestBody, String clientRequestContentType, String url, List<String> clientRequestHeaders, InteractionManipulations interactionManipulations, boolean lowerCaseHeaders) throws ServiceInteroperationFailed;

    public static class ServiceInteroperationFailed extends RuntimeException {
        public ServiceInteroperationFailed(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
