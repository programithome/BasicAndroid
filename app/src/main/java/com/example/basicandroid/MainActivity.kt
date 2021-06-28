package com.example.basicandroid

import ResponseMain
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var retrofit = RetrofitClient.getClient("https://www.boredapi.com/api/").create(API::class.java)
        retrofit.getRandomIdea().enqueue(object : Callback<ResponseMain>{
            override fun onResponse(call: Call<ResponseMain>, response: Response<ResponseMain>) {
                Log.d("MyLOG", "onRespose")
            }

            override fun onFailure(call: Call<ResponseMain>, t: Throwable) {
                Log.d("MyLOG", "onFailture")
            }

        })
    }
}