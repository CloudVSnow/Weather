package com.cloudvsnow.sunnyweather.logic

import androidx.lifecycle.liveData
import com.cloudvsnow.sunnyweather.logic.model.Place
import com.cloudvsnow.sunnyweather.logic.network.WeatherNetwork
import kotlinx.coroutines.Dispatchers
import java.lang.Exception
import java.lang.RuntimeException

object Repository {
    fun searchPlaces(query: String) = liveData(Dispatchers.IO) {
        val result = try {
            val placeRe = WeatherNetwork.searchPlaces(query)
            if (placeRe.status == "ok") {
                val places = placeRe.places
                Result.success(places)
            }else {
                Result.failure(RuntimeException("response status is ${placeRe.status}"))
            }
        }catch (e : Exception) {
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }
}