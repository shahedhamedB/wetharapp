package com.example.whether.medule

import com.google.gson.annotations.SerializedName

data class WeatherDescItem(@SerializedName("value")
                           val value: String = "")