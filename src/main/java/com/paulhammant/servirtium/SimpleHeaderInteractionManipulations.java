package com.paulhammant.servirtium;

import java.util.ArrayList;
import java.util.Map;

public class SimpleHeaderInteractionManipulations implements InteractionManipulations {

    protected final String fromUrl;
    protected final String toUrl;
    private String[] headerPrefixesToRemove = new String[0];

    public SimpleHeaderInteractionManipulations(String fromUrl, String toUrl) {
        this.fromUrl = fromUrl;
        this.toUrl = toUrl;
    }

    public SimpleHeaderInteractionManipulations withHeaderPrefixesToRemoveFromRealResponse(String... headerPrefixesToRemove) {
        this.headerPrefixesToRemove = headerPrefixesToRemove;
        return this;
    }

    @Override
    public String changeUrlForRequestToReal(String url) {
        return url.replace(fromUrl, toUrl);
    }

    @Override
    public void potentiallyManipulateHeader(String method, String currentHeader, Map<String, String> allHeadersToReal) {
        if (currentHeader.equals("Host")) {
            allHeadersToReal.put("Host", allHeadersToReal.get("Host").replace(fromUrl, toUrl));
        }
    }

    @Override
    public void changeAllHeadersBackFromReal(ArrayList<String> headers) {
        String[] hdrs = headers.toArray(new String[0]);
        for (String hdr : hdrs) {
            for (String pfx : headerPrefixesToRemove) {
                if (hdr.startsWith(pfx)) {
                    headers.remove(hdr);
                }
            }
        }
    }
}
