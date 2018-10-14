package com.basawareddy.moneytap.moneytap.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ImagesResponse {

    @SerializedName("images")
    private List<Images> images ;

    @SerializedName("number_pojo")
    private Number_Pojo number_pojo;

    @SerializedName("pages")
    private Pages pages;

    @SerializedName("normalized")
    private Normalized normalized;

    @SerializedName("query")
    private Query query;

    @SerializedName("continuee")
    private Continue continuee;

    public List<com.basawareddy.moneytap.moneytap.model.Images> getImages() {
        return images;
    }

    public void setImages(List<com.basawareddy.moneytap.moneytap.model.Images> images) {
        this.images = images;
    }

    public com.basawareddy.moneytap.moneytap.model.Number_Pojo getNumber_pojo() {
        return number_pojo;
    }

    public void setNumber_pojo(com.basawareddy.moneytap.moneytap.model.Number_Pojo number_pojo) {
        this.number_pojo = number_pojo;
    }

    public com.basawareddy.moneytap.moneytap.model.Pages getPages() {
        return pages;
    }

    public void setPages(com.basawareddy.moneytap.moneytap.model.Pages pages) {
        this.pages = pages;
    }

    public com.basawareddy.moneytap.moneytap.model.Normalized getNormalized() {
        return normalized;
    }

    public void setNormalized(com.basawareddy.moneytap.moneytap.model.Normalized normalized) {
        this.normalized = normalized;
    }

    public com.basawareddy.moneytap.moneytap.model.Query getQuery() {
        return query;
    }

    public void setQuery(com.basawareddy.moneytap.moneytap.model.Query query) {
        this.query = query;
    }

    public Continue getContinuee() {
        return continuee;
    }

    public void setContinuee(Continue continuee) {
        this.continuee = continuee;
    }
}
