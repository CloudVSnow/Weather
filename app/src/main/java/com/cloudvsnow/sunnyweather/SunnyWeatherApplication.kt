package com.cloudvsnow.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication: Application() {
    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val Token = "彩云天气的令牌"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}