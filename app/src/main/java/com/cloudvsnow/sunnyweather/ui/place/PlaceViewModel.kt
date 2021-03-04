package com.cloudvsnow.sunnyweather.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.cloudvsnow.sunnyweather.logic.Repository
import com.cloudvsnow.sunnyweather.logic.model.Place

class PlaceViewModel {
    private val searchLiveData = MutableLiveData<String>()
    val placeList = ArrayList<Place>()
    val placeLiveData = Transformations.switchMap(searchLiveData) { qurey ->
        Repository.searchPlaces(qurey)
    }
    fun searchPlaces(query:String) {
        searchLiveData.value = query
    }
}