package com.pinal.retrofityourdevhere;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    public static RetrofitInstance instance;
    public ApiInterface apiInterface;


    RetrofitInstance() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiInterface =  retrofit.create(ApiInterface.class);
    }

    public static RetrofitInstance getInstance() {
        if (instance == null) {
            instance = new RetrofitInstance();
        }
        return instance;
    }
}
