package com.basawareddy.moneytap.moneytap.model;

import android.provider.ContactsContract;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Number_Pojo {

    @SerializedName("pageid")
    private int pageid;

    @SerializedName("ns")
    private int ns;

    @SerializedName("title")
    private String title;

    @SerializedName("images")
    private List<Images> images;

    public Number_Pojo (int ns,int pageid,String title,List<Images> images){
        this.ns = ns;
        this.pageid = pageid;
        this.title = title;
        this.images = images;
    }

    public int getPageid() { return this.pageid; }

    public void setPageid(int pageid) { this.pageid = pageid; }


    public int getNs() { return this.ns; }

    public void setNs(int ns) { this.ns = ns; }


    public String getTitle() { return this.title; }

    public void setTitle(String title) { this.title = title; }


    public List<Images> getImages() { return this.images; }

    public void setImages(List<Images> images) { this.images = images; }
}
