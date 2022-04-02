package com.example.whether.medule

import com.google.gson.annotations.SerializedName

data class CurrentConditionItem(@SerializedName("precipMM")
                                val precipMM: String = "",
                                @SerializedName("observation_time")
                                val observationTime: String = "",
                                @SerializedName("weatherDesc")
                                val weatherDesc: List<WeatherDescItem>?,
                                @SerializedName("visibility")
                                val visibility: String = "",
                                @SerializedName("weatherCode")
                                val weatherCode: String = "",
                                @SerializedName("FeelsLikeF")
                                val feelsLikeF: String = "",
                                @SerializedName("pressure")
                                val pressure: String = "",
                                @SerializedName("temp_C")
                                val tempC: String = "",
                                @SerializedName("temp_F")
                                val tempF: String = "",
                                @SerializedName("cloudcover")
                                val cloudcover: String = "",
                                @SerializedName("windspeedMiles")
                                val windspeedMiles: String = "",
                                @SerializedName("winddirDegree")
                                val winddirDegree: String = "",
                                @SerializedName("FeelsLikeC")
                                val feelsLikeC: String = "",
                                @SerializedName("windspeedKmph")
                                val windspeedKmph: String = "",
                                @SerializedName("humidity")
                                val humidity: String = "",
                                @SerializedName("visibilityMiles")
                                val visibilityMiles: String = "",
                                @SerializedName("precipInches")
                                val precipInches: String = "",
                                @SerializedName("uvIndex")
                                val uvIndex: String = "",
                                @SerializedName("winddir16Point")
                                val winddirPoint: String = "",
                                @SerializedName("weatherIconUrl")
                                val weatherIconUrl: List<WeatherIconUrlItem>?,
                                @SerializedName("pressureInches")
                                val pressureInches: String = "")