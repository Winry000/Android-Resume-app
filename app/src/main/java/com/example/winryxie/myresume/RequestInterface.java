package com.example.winryxie.myresume;

/**
 * Created by winryxie on 3/11/17.
 */


import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {

    @GET("android/jsonandroid")
    Call<JSONResponse> getJSON();
}