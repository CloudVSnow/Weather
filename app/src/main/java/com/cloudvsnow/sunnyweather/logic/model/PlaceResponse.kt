package com.cloudvsnow.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName

/* {
    "status":"ok",
    "query":" ",
    "places":[
    {"name":" ","location":{"lat":39.9041999,"lng":116.4073963}, "formatted_address":" "},
    {"name":" ","location":{"lat":39.89491,"lng":116.322056}, "formatted_address":" 118 "},
    {"name":" ","location":{"lat":39.865195,"lng":116.378545}, "formatted_address":" 12 "},
    {"name":" ( )","location":{"lat":39.904983,"lng":116.427287}, "formatted_address":" 2 "}
    ]
}*/

data class PlaceResponse(val status: String, val places:List<Place>)
data class Place(val name: String, val location:Location, @SerializedName("formattted_address") val address: String)
data class Location(val lng:String, val lat: String)