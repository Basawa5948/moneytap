package com.basawareddy.moneytap.moneytap.model;

import com.google.gson.annotations.SerializedName;

public class Pages {

    @SerializedName("number_pojo")
    private Number_Pojo number_pojo;

    public Pages(Number_Pojo number_pojo){
        this.number_pojo = number_pojo;
    }

    public Number_Pojo getnumber_pojo() { return this.number_pojo; }

    public void setnumber_pojo(Number_Pojo number_pojo) { this.number_pojo = number_pojo; }

}
