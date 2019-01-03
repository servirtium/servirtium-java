package com.paulhammant.svhttp;

import java.util.Map;

public class SimpleHeaderManipulator implements HeaderManipulator {

    protected final String fromUrl;
    protected final String toUrl;

    public SimpleHeaderManipulator(String fromUrl, String toUrl) {
        this.fromUrl = fromUrl;
        this.toUrl = toUrl;
    }

    @Override
    public String changeToRealURL(String url) {
        return url.replace(fromUrl, toUrl);
    }

    @Override
    public void potentiallyManipulateHeaders(String method, String currentHeader, Map<String, String> allHeadersToReal) {
        if (currentHeader.equals("Host")) {
            allHeadersToReal.put("Host", allHeadersToReal.get("Host").replace(fromUrl, toUrl));
        }
    }


}
