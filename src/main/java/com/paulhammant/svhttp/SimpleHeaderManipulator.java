package com.paulhammant.svhttp;

import java.util.ArrayList;
import java.util.Map;

public class SimpleHeaderManipulator implements InteractionManipulations {

    protected final String fromUrl;
    protected final String toUrl;
    private String[] headerPrefixesToRemove = new String[0];

    public SimpleHeaderManipulator(String fromUrl, String toUrl) {
        this.fromUrl = fromUrl;
        this.toUrl = toUrl;
    }

    public SimpleHeaderManipulator withHeaderPrefixesToRemoveFromRealResponse(String... headerPrefixesToRemove) {
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
    public void messWithHeadersBackFromReal(ArrayList<String> headers) {
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
