package com.example.myapplication.api

import com.example.myapplication.model.CurrentWeatherModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("current.json")
    suspend fun getCurrent(@Query("q") query : String) : Response<CurrentWeatherModel>
}