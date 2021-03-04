package com.cloudvsnow.sunnyweather.logic.network


import com.cloudvsnow.sunnyweather.SunnyWeatherApplication
import com.cloudvsnow.sunnyweather.logic.model.PlaceResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    @GET("v2/place?token=${SunnyWeatherApplication.Token}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): retrofit2.Call<PlaceResponse>
}