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

package com.paulhammant.servirtium.svn;

import com.paulhammant.servirtium.SimpleInteractionManipulations;

import java.util.List;

public class SubversionInteractionManipulations extends SimpleInteractionManipulations {

    public SubversionInteractionManipulations(String fromUrl, String toUrl) {
        super(fromUrl, toUrl);
    }

    @Override
    public void changeSingleHeaderForRequestToRealService(String currentHeader, List<String> clientRequestHeaders) {
        if (currentHeader.startsWith("User-Agent:")) {
            for (int i = 0; i < clientRequestHeaders.size(); i++) {
                String s = clientRequestHeaders.get(i);
                if (s.startsWith("User-Agent:")) {
                    clientRequestHeaders.remove(s);
                    clientRequestHeaders.add(i, "User-Agent: " + getUserAgentString());
                    break;
                }
            }
        }

        super.changeSingleHeaderForRequestToRealService(currentHeader, clientRequestHeaders);
    }

    protected String getUserAgentString() {
        return "SVN/1.10.0 (x86_64-apple-darwin17.0.0) serf/1.3.9";
    }

    @Override
    public String headerReplacement(String hdrKey, String serviceResponseHeaders) {
        return serviceResponseHeaders
                //.replace(from, to)
                .replaceAll("SVN-Repository-UUID: ([a-f0-9]{8}(-[a-f0-9]{4}){3}-[a-f0-9]{12})", "SVN-Repository-UUID: aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .replaceAll("Date: ((Mon|Tue|Wed|Thu|Fri|Sat|Sun), [0-9]{2} (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) [0-9]{4} [0-9]{2}:[0-9]{2}:[0-9]{2} GMT)", "Date: Tue, 01 Jan 2018 01:02:03 GMT");
    }

    @Override
    public String changeSingleHeaderReturnedBackFromRealServiceForRecording(int ix, String headerBackFromService) {
        if (headerBackFromService.startsWith("DAV:")) {
            headerBackFromService = "DAV:" + spaces(ix) + headerBackFromService.substring(4);
        }
        return headerBackFromService;
    }

    static String spaces(int i) {
        String rv = "";
        for (int ix = 0; ix < i; ix++) {
            rv = rv + " ";
        }
        return rv;
    }

}
