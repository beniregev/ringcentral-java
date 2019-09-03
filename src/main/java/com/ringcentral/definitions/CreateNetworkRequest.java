package com.ringcentral.definitions;


public class CreateNetworkRequest {
    /**
     *
     */
    public String name;
    /**
     *
     */
    public AutomaticLocationUpdatesSiteInfo site;
    /**
     *
     */
    public PublicIpRangeInfo[] publicIpRanges;
    /**
     *
     */
    public PrivateIpRangeInfo[] privateIpRanges;

    public CreateNetworkRequest name(String name) {
        this.name = name;
        return this;
    }

    public CreateNetworkRequest site(AutomaticLocationUpdatesSiteInfo site) {
        this.site = site;
        return this;
    }

    public CreateNetworkRequest publicIpRanges(PublicIpRangeInfo[] publicIpRanges) {
        this.publicIpRanges = publicIpRanges;
        return this;
    }

    public CreateNetworkRequest privateIpRanges(PrivateIpRangeInfo[] privateIpRanges) {
        this.privateIpRanges = privateIpRanges;
        return this;
    }

}
