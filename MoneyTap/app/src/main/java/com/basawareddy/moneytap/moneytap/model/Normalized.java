package com.basawareddy.moneytap.moneytap.model;

import com.google.gson.annotations.SerializedName;

public class Normalized {

    @SerializedName("from")
    private String from;
    @SerializedName("to")
    private String to;

    public Normalized(String from,String to){
        this.from = from;
        this.to = to;
    }

    public String getFrom() { return this.from; }

    public void setFrom(String from) { this.from = from; }

    public String getTo() { return this.to; }

    public void setTo(String to) { this.to = to; }

}
