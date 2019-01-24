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
import java.util.Map;

public interface Interactor {

    void finishedScript(int interactionNum);

    void setMarkdownScriptFilename(String filename) throws FileNotFoundException;

    ServiceResponse getServiceResponseForRequest(String method, String url,
                                                 Map<String, String> headersToReal, Interaction interaction) throws IOException;

    Interaction newInteraction(String method, String path, int interactionNum);

    default void addInteraction(Interaction interaction) {}

    abstract class Interaction {

        final int interactionNum;
        String bodyToReal;
        String contentTypeToReal;

        Interaction(int interactionNum) {
            this.interactionNum = interactionNum;
        }

        abstract void recordRequestHeaders(Map<String, String> header);

        void recordRequestBody(String bodyToReal, String contentTypeToReal) {
            this.bodyToReal = bodyToReal;
            this.contentTypeToReal = contentTypeToReal;
        }

        void recordResponseHeaders(String[] headers) {}

        void recordResponseBody(Object body, int statusCode, String contentType) {}

    }

}
