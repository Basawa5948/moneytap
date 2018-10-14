package com.basawareddy.moneytap.moneytap.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Query {

    @SerializedName("normalized")
    private ArrayList<Normalized> normalized;

    @SerializedName("pages")
    private Pages pages;

    public Query(ArrayList<Normalized> normalized, Pages pages){
        this.normalized = normalized;
        this.pages = pages;
    }

    public ArrayList<Normalized> getNormalized() { return this.normalized; }

    public void setNormalized(ArrayList<Normalized> normalized) { this.normalized = normalized; }

    public Pages getPages() { return this.pages; }

    public void setPages(Pages pages) { this.pages = pages; }
}
