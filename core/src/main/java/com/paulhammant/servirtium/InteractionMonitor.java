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

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface InteractionMonitor {

    default void finishedScript(int interactionNum, boolean failed) {}

    /**
     * Set the filename for the source of the conversation
     * @param filename the filename
     */
    default void setScriptFilename(String filename) {}

    ServiceResponse getServiceResponseForRequest(String method, String url,
                                                 List<String> clientRequestHeaders, Interaction interaction,
                                                 boolean lowerCaseHeaders) throws IOException;

    Interaction newInteraction(String method, String path, int interactionNum, String url, String context);

    default void codeNoteForNextInteraction(String title, String multiline) {}

    default void noteForNextInteraction(String title, String multiline) {}

    abstract class Interaction {

        final int interactionNum;
        public final String context;
        Object clientRequestBody;
        String clientRequestContentType;

        Interaction(int interactionNum, String context) {
            this.interactionNum = interactionNum;
            this.context = context;
        }

        public void complete() {}


        public abstract List<String> noteClientRequestHeadersAndBody(InteractionManipulations interactionManipulations, List<String> clientRequestHeaders, Object clientRequestBody, String clientRequestContentType, String method, boolean lowerCaseHeaders);

        protected void setClientRequestBodyAndContentType(Object clientRequestBody, String clientRequestContentType) {
            this.clientRequestBody = clientRequestBody;
            this.clientRequestContentType = clientRequestContentType;
        }

        protected List<String> changeRequestHeadersIfNeeded(InteractionManipulations interactionManipulations, List<String> clientRequestHeaders, String method, boolean lowerCaseHeaders) {
            List<String> clientRequestHeaders2 = new ArrayList<>();
            for (String s : clientRequestHeaders) {
                String hdrName = s.split(": ")[0];
                String hdrVal = s.split(": ")[1];
                hdrVal = interactionManipulations.headerReplacement(hdrName, hdrVal);
                final String fullHeader = (lowerCaseHeaders ? hdrName.toLowerCase() : hdrName) + ": " + hdrVal;
                clientRequestHeaders2.add(fullHeader);
                interactionManipulations.changeSingleHeaderForRequestToRealService(method, fullHeader, clientRequestHeaders2);
            }
            return clientRequestHeaders2;
        }

        public void debugOriginalServiceResponseHeaders(String... headers) {}

        public void debugOriginalServiceResponseBody(Object body, int statusCode, String contentType) {}

        public void debugClientsServiceResponseHeaders(String... headers) {}

        public void debugClientsServiceResponseBody(Object body, int statusCode, String contentType) {}

        public void noteServiceResponseHeaders(String... headers) {}

        public void noteServiceResponseBody(Object body, int statusCode, String contentType) {}

        public void noteChangedResourceForRequestToClient(String from, String to) {}
    }

    public class NullObject implements InteractionMonitor {
        @Override
        public void finishedScript(int interactionNum, boolean failed) {
        }

        @Override
        public void setScriptFilename(String filename) {
        }

        @Override
        public ServiceResponse getServiceResponseForRequest(String method, String url, List<String> clientRequestHeaders, Interaction interaction, boolean lowerCaseHeaders) throws IOException {
            return null;
        }

        @Override
        public Interaction newInteraction(String method, String path, int interactionNum, String url, String context) {
            return null;
        }
    }

}
