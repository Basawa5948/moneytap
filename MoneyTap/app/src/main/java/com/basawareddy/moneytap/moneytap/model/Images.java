package com.basawareddy.moneytap.moneytap.model;

import com.google.gson.annotations.SerializedName;

public class Images {

    @SerializedName("ns")
    private int ns;
    @SerializedName("title")
    private String title;

    public Images(int ns,String title){
        this.ns = ns;
        this.title = title;
    }
    public int getNs() { return this.ns; }

    public void setNs(int ns) { this.ns = ns; }

    public String getTitle() { return this.title; }

    public void setTitle(String title) { this.title = title; }
}
