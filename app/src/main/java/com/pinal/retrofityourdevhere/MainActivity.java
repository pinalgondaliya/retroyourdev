package com.pinal.retrofityourdevhere;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    String api = "https://jsonplaceholder.typicode.com";
    String childurl = "/photos";
    private Retrofit retrofit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RetrofitInstance.getInstance().apiInterface.getUsers().enqueue(new Callback<List<UserModel>>() {
            @Override
            public void onResponse(Call<List<UserModel>> call, Response<List<UserModel>> response) {

            }

            @Override
            public void onFailure(Call<List<UserModel>> call, Throwable t) {

            }
        });

    }
}