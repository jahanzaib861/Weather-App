package com.example.weatherapp.service

import com.example.weatherapp.utils.weather
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherServiceApi {

    @GET("2.5/weather")
    fun getWeatherDetails(
        @Query("lon") longitude: Double,
        @Query("lat") latitude: Double,
        @Query("appid") appId: String,
        @Query("units") metric: String
    ): Call<weather>

}