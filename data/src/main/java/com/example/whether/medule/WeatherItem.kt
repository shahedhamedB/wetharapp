package com.example.whether.medule

import com.google.gson.annotations.SerializedName

data class WeatherItem(@SerializedName("date")
                       val date: String = "",
                       @SerializedName("sunHour")
                       val sunHour: String = "",
                       @SerializedName("mintempF")
                       val mintempF: String = "",
                       @SerializedName("avgtempF")
                       val avgtempF: String = "",
                       @SerializedName("mintempC")
                       val mintempC: String = "",
                       @SerializedName("totalSnow_cm")
                       val totalSnowCm: String = "",
                       @SerializedName("maxtempF")
                       val maxtempF: String = "",
                       @SerializedName("hourly")
                       val hourly: List<HourlyItem>?,
                       @SerializedName("avgtempC")
                       val avgtempC: String = "",
                       @SerializedName("astronomy")
                       val astronomy: List<AstronomyItem>?,
                       @SerializedName("uvIndex")
                       val uvIndex: String = "",
                       @SerializedName("maxtempC")
                       val maxtempC: String = "")