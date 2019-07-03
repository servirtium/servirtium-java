package com.paulhammant.servirtium;

import java.util.List;

/**
 * HTTP client to invoke endpoints against remote services
 */
public interface ServiceInteroperation {

    /**
     * Invoke a specific endpoint on a remote service
     *
     * @param method GET, POST etc
     * @param clientRequestBody The body of the client request being sent to the remote service
     * @param clientRequestContentType
     * @param url The fully qualified URL for the request
     * @param clientRequestHeaders Headers to use with the request
     * @param interactionManipulations For changing the headers back from the remote service
     * @param forceHeadersToLowerCase Response headers should be forced to be lower case
     * @return the service response
     * @throws ServiceInteroperationFailed
     */
    ServiceResponse invokeServiceEndpoint(String method,
                                          Object clientRequestBody,
                                          String clientRequestContentType,
                                          String url, List<String> clientRequestHeaders,
                                          InteractionManipulations interactionManipulations,
                                          boolean forceHeadersToLowerCase) throws ServiceInteroperationFailed;

    class ServiceInteroperationFailed extends RuntimeException {
        public ServiceInteroperationFailed(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
