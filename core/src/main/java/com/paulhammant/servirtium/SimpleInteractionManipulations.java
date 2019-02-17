package com.paulhammant.servirtium;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SimpleInteractionManipulations implements InteractionManipulations {

    protected final String fromUrl;
    protected final String toUrl;
    protected final String fromHost;
    protected final String toHost;
    private String[] headerPrefixesToRemoveFromRequest = new String[0];
    private String[] headerPrefixesToRemoveFromResponse = new String[0];

    public SimpleInteractionManipulations() {
        this("xx8suf98su98sf98sjxjcvlkxjcv" , "s89s8798s7df98sdf98sdf98sdf9");
    }
    public SimpleInteractionManipulations(String fromUrl, String toUrl) {
        this.fromUrl = fromUrl;
        this.toUrl = toUrl;
        this.fromHost = fromUrl.replaceAll("https://","").replaceAll("http://","");
        this.toHost = toUrl.replaceAll("https://","").replaceAll("http://","");
    }

    public SimpleInteractionManipulations withHeaderPrefixesToRemoveFromRealResponse(String... headerPrefixesToRemove) {
        this.headerPrefixesToRemoveFromResponse = headerPrefixesToRemove;
        return this;
    }

    public SimpleInteractionManipulations withHeaderPrefixesToRemoveFromRequestToReal(String... headerPrefixesToRemove) {
        this.headerPrefixesToRemoveFromRequest = headerPrefixesToRemove;
        return this;
    }

    @Override
    public String changeUrlForRequestToReal(String url) {
        return url.replace(fromUrl, toUrl);
    }

    @Override
    public void changeSingleHeaderForRequestToReal(String method, String currentHeader, List<String> allHeadersToReal) {
        for (String pfx : headerPrefixesToRemoveFromRequest) {
            if (currentHeader.startsWith(pfx)) {
                allHeadersToReal.remove(currentHeader);
            }
        }
        if (currentHeader.startsWith("Host: ")) {
            for (int i = 0; i < allHeadersToReal.size(); i++) {
                String h = allHeadersToReal.get(i);
                if (h.startsWith("Host: ")) {
                    allHeadersToReal.remove(h);
                    allHeadersToReal.add(i, h.replace(fromHost, toHost));
                    break;
                }
            }
        }
    }

    @Override
    public void changeAllHeadersReturnedBackFromReal(ArrayList<String> headers) {
        String[] hdrs = headers.toArray(new String[0]);
        for (String hdr : hdrs) {
            for (String pfx : headerPrefixesToRemoveFromResponse) {
                if (hdr.startsWith(pfx)) {
                    headers.remove(hdr);
                }
            }
        }
    }
}
