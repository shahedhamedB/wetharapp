package com.example.whether.medule

import com.google.gson.annotations.SerializedName

data class Data(@SerializedName("request")
                val request: List<RequestItem>?,
                @SerializedName("current_condition")
                val currentCondition: List<CurrentConditionItem>?,
                @SerializedName("weather")
                val weather: List<WeatherItem>?,
                @SerializedName("ClimateAverages")
                val climateAverages: List<ClimateAveragesItem>?)