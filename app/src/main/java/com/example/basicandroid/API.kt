package com.example.basicandroid

import ResponseMain
import retrofit2.Call
import retrofit2.http.GET

interface API {
    @GET("activity")
    fun getRandomIdea(): Call<ResponseMain>
}