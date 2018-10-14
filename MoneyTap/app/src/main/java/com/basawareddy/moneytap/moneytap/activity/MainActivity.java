package com.basawareddy.moneytap.moneytap.activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;


import com.basawareddy.moneytap.moneytap.R;
import com.basawareddy.moneytap.moneytap.adapter.imagesAdapter;
import com.basawareddy.moneytap.moneytap.model.Images;
import com.basawareddy.moneytap.moneytap.model.ImagesResponse;
import com.basawareddy.moneytap.moneytap.rest.APICall;
import com.basawareddy.moneytap.moneytap.rest.APICallInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    public String queryy = "query";
    public String titles ="San_Francisco";
    public String imagess = "images";
    public String jsonn = "json";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.images_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        APICallInterface apiService = APICall.getClient().create(APICallInterface.class);
       /* Map<String, String> data = new HashMap<>();
        data.put("action", "query");
        data.put("titles","San_Francisco");
        data.put("prop","images");
        data.put("imlimit", String.valueOf(5));
        data.put("format","json");*/

        /*Call<List<ImagesResponse>> call = apiService.getImages(data);
        call.enqueue(new Callback<List<ImagesResponse>>() {
            @Override
            public void onResponse(Call<List<ImagesResponse>> call, Response<List<ImagesResponse>> response) {
                int statusCode = response.code();
                List<Images> imagesList = response.body().get();
                recyclerView.setAdapter(new imagesAdapter(imagesList, R.layout.list_item_movie, getApplicationContext()));
            }

            @Override
            public void onFailure(Call<List<ImagesResponse>> call, Throwable t) {
                // Log error here since request failed
                Log.e(TAG, t.toString());
            }
        });*/

        Call<ImagesResponse> call = apiService.getImages(queryy,titles,imagess,jsonn);
        call.enqueue(new Callback<ImagesResponse>() {
            @Override
            public void onResponse(Call<ImagesResponse> call, Response<ImagesResponse> response) {
                int statusCode = response.code();
                List<Images> movies = response.body().getImages();
                recyclerView.setAdapter(new imagesAdapter(movies, R.layout.list_item_movie, getApplicationContext()));
            }

            @Override
            public void onFailure(Call<ImagesResponse> call, Throwable t) {
                // Log error here since request failed
                Log.e(TAG, t.toString());
            }
        });


    }

}
