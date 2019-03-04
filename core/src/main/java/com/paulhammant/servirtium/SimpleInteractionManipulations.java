package com.paulhammant.servirtium;

import java.util.ArrayList;
import java.util.Arrays;
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

    public SimpleInteractionManipulations withHeaderPrefixesToRemoveFromServerResponse(String... headerPrefixesToRemove) {
        this.headerPrefixesToRemoveFromResponse = headerPrefixesToRemove;
        return this;
    }

    public SimpleInteractionManipulations withHeaderPrefixesToRemoveFromClientRequest(String... headerPrefixesToRemove) {
        this.headerPrefixesToRemoveFromRequest = headerPrefixesToRemove;
        return this;
    }

    @Override
    public String changeUrlForRequestToServer(String url) {
        return url.replace(fromUrl, toUrl);
    }

    @Override
    public void changeSingleHeaderForRequestToServer(String method, String currentHeader, List<String> clientRequestHeaders) {
        String currentHeaderKey = null;
        String currentHeaderVal = null;
        try {
            currentHeaderKey = currentHeader.substring(0, currentHeader.indexOf(": "));
            currentHeaderVal = currentHeader.substring(currentHeader.indexOf(": ") +2);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("CH: " + currentHeader + "<CH");
        }

        for (String pfx : headerPrefixesToRemoveFromRequest) {
            if (currentHeader.startsWith(pfx)) {
                clientRequestHeaders.remove(currentHeader);
            }
        }

        if (currentHeader.startsWith("Host: ") || currentHeader.startsWith("host: ")) {
            for (int i = 0; i < clientRequestHeaders.size(); i++) {
                String h = clientRequestHeaders.get(i);
                if (h.startsWith("Host: ") || h.startsWith("host: ")) {
                    clientRequestHeaders.remove(h);
                    final String replace = h.replace(fromHost, toHost);
                    clientRequestHeaders.add(i, replace);
                    break;
                }
            }
        }
    }

    @Override
    public void changeAllHeadersReturnedBackFromServer(ArrayList<String> serverResponseHeaders) {
        String[] hdrs = serverResponseHeaders.toArray(new String[0]);
        for (String hdr : hdrs) {
            for (String pfx : headerPrefixesToRemoveFromResponse) {
                if (hdr.startsWith(pfx)) {
                    serverResponseHeaders.remove(hdr);
                }
            }
        }
    }

}
