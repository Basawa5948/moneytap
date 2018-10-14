package com.basawareddy.moneytap.moneytap.model;

import com.google.gson.annotations.SerializedName;

public class RootObject {

    @SerializedName("continuee")
    private Continue continuee;

    @SerializedName("query")
    private Query query;

    public RootObject(Continue continuee,Query query){
        this.continuee = continuee;
        this.query = query;
    }
    public Continue getContinue() { return this.continuee; }

    public void setContinue(Continue continuee) { this.continuee = continuee; }

    public Query getQuery() { return this.query; }

    public void setQuery(Query query) { this.query = query; }

}
