package com.basawareddy.moneytap.moneytap.rest;

import com.basawareddy.moneytap.moneytap.model.ImagesResponse;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface APICallInterface {

    @GET("w/api.php")
    /*Call<List<ImagesResponse>> getImages(@QueryMap Map<String, String> options);*/

     Call<ImagesResponse> getImages(@Query("action") String query,@Query("titles") String San_Francisco,
                                       @Query("prop") String images,@Query("format") String format);
}
