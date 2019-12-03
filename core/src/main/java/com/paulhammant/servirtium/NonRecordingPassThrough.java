/*
        Servirtium: Service Virtualized HTTP

        Copyright (c) 2018, Paul Hammant
        All rights reserved.

        Redistribution and use in source and binary forms, with or without
        modification, are permitted provided that the following conditions are met:

        1. Redistributions of source code must retain the above copyright notice, this
        list of conditions and the following disclaimer.
        2. Redistributions in binary form must reproduce the above copyright notice,
        this list of conditions and the following disclaimer in the documentation
        and/or other materials provided with the distribution.

        THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
        ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
        WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
        DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
        ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
        (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
        LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
        ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
        (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
        SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

        The views and conclusions contained in the software and documentation are those
        of the authors and should not be interpreted as representing official policies,
        either expressed or implied, of the Servirtium project.
*/

package com.paulhammant.servirtium;

import java.util.Arrays;
import java.util.List;

public class NonRecordingPassThrough implements InteractionMonitor {

    private final ServiceInteroperation serviceInteroperation;
    private final InteractionManipulations interactionManipulations;
    private boolean alphaSortHeaders;

    public NonRecordingPassThrough(ServiceInteroperation serviceInteroperation, InteractionManipulations interactionManipulations) {
        this.serviceInteroperation = serviceInteroperation;
        this.interactionManipulations = interactionManipulations;
    }

    public NonRecordingPassThrough withAlphaSortingOfHeaders() {
        alphaSortHeaders = true;
        return this;
    }

    public ServiceResponse getServiceResponseForRequest(String method, String url,
                                                        Interaction interaction, boolean lowerCaseHeaders) {
        return serviceInteroperation.invokeServiceEndpoint(method,
                interaction.clientRequestBody,
                interaction.clientRequestContentType,
                url, interaction.clientRequestHeaders,
                interactionManipulations, lowerCaseHeaders);
    }

    public class NonRecordingInteraction extends Interaction {

        NonRecordingInteraction(int interactionNumber, String context) {
            super(interactionNumber, context);
        }

        public List<String> noteClientRequestHeadersAndBody(InteractionManipulations interactionManipulations,
                                                            List<String> clientRequestHeaders, Object clientRequestBody,
                                                            String clientRequestContentType, String method, boolean lowerCaseHeaders) {

            if (clientRequestBody == null) {
                clientRequestBody = "";
            }

            // Headers recorded for playback

            List<String> clientRequestHeaders2 = changeRequestHeadersIfNeeded(interactionManipulations, clientRequestHeaders, method, lowerCaseHeaders);

            interactionManipulations.changeAnyHeadersForRequestToRealService(clientRequestHeaders2);

            this.clientRequestHeaders = clientRequestHeaders2;

            final String[] headersToRecord = clientRequestHeaders2.toArray(new String[0]);

            if (alphaSortHeaders) {
                Arrays.sort(headersToRecord);
            }

            if (clientRequestBody instanceof String) {
                clientRequestBody = interactionManipulations.changeBodyForRequestToRealService((String) clientRequestBody);
            }

            super.setClientRequestBodyAndContentType(clientRequestBody, clientRequestContentType);

            return Arrays.asList(headersToRecord);
        }

    }

    @Override
    public Interaction newInteraction(int interactionNum, String context, String method, String path, String url) {
        return new NonRecordingInteraction(interactionNum, context);
    }

}
