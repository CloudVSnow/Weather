package com.cloudvsnow.sunnyweather.logic.network

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceCreator {
    private const val host = "https://api.caiyunapp.com/"
    private val retrofit = Retrofit.Builder()
        .baseUrl(host)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun <T> create(serviceClass:Class<T>) :T = retrofit.create(serviceClass)
    inline fun <reified T>create(): T = create(T::class.java)
}