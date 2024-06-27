package com.example.myapplication.api

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    const val BASE_URL = "https://api.weatherapi.com/v1/";
    const val API_KEY = "5154a0c2f93e4104b23222135242706";
}