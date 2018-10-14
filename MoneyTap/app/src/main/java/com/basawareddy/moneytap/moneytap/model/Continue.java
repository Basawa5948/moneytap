package com.basawareddy.moneytap.moneytap.model;

import com.google.gson.annotations.SerializedName;

public class Continue {
    @SerializedName("imcontinue")
    private String imcontinue;

    @SerializedName("continue")
    private String continuee;

    public Continue(String imcontinue,String continuee){
        this.continuee = continuee;
        this.imcontinue = imcontinue;
    }
    public String getImcontinue() { return this.imcontinue; }

    public void setImcontinue(String imcontinue) { this.imcontinue = imcontinue; }

    public String getContinue() { return this.continuee; }

    public void setContinue(String continuee) { this.continuee = continuee; }
}
