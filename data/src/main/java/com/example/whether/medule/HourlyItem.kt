package com.example.whether.medule

import com.google.gson.annotations.SerializedName

data class HourlyItem(@SerializedName("weatherCode")
                      val weatherCode: String = "",
                      @SerializedName("chanceofhightemp")
                      val chanceofhightemp: String = "",
                      @SerializedName("FeelsLikeF")
                      val feelsLikeF: String = "",
                      @SerializedName("cloudcover")
                      val cloudcover: String = "",
                      @SerializedName("WindChillC")
                      val windChillC: String = "",
                      @SerializedName("windspeedMiles")
                      val windspeedMiles: String = "",
                      @SerializedName("winddirDegree")
                      val winddirDegree: String = "",
                      @SerializedName("DewPointC")
                      val dewPointC: String = "",
                      @SerializedName("chanceofthunder")
                      val chanceofthunder: String = "",
                      @SerializedName("chanceoffrost")
                      val chanceoffrost: String = "",
                      @SerializedName("DewPointF")
                      val dewPointF: String = "",
                      @SerializedName("humidity")
                      val humidity: String = "",
                      @SerializedName("winddir16Point")
                      val winddirPoint: String = "",
                      @SerializedName("WindChillF")
                      val windChillF: String = "",
                      @SerializedName("weatherIconUrl")
                      val weatherIconUrl: List<WeatherIconUrlItem>?,
                      @SerializedName("tempF")
                      val tempF: String = "",
                      @SerializedName("precipMM")
                      val precipMM: String = "",
                      @SerializedName("weatherDesc")
                      val weatherDesc: List<WeatherDescItem>?,
                      @SerializedName("chanceofrain")
                      val chanceofrain: String = "",
                      @SerializedName("chanceofovercast")
                      val chanceofovercast: String = "",
                      @SerializedName("visibility")
                      val visibility: String = "",
                      @SerializedName("pressure")
                      val pressure: String = "",
                      @SerializedName("chanceofsunshine")
                      val chanceofsunshine: String = "",
                      @SerializedName("WindGustMiles")
                      val windGustMiles: String = "",
                      @SerializedName("chanceofsnow")
                      val chanceofsnow: String = "",
                      @SerializedName("FeelsLikeC")
                      val feelsLikeC: String = "",
                      @SerializedName("windspeedKmph")
                      val windspeedKmph: String = "",
                      @SerializedName("WindGustKmph")
                      val windGustKmph: String = "",
                      @SerializedName("chanceoffog")
                      val chanceoffog: String = "",
                      @SerializedName("visibilityMiles")
                      val visibilityMiles: String = "",
                      @SerializedName("HeatIndexC")
                      val heatIndexC: String = "",
                      @SerializedName("time")
                      val time: String = "",
                      @SerializedName("precipInches")
                      val precipInches: String = "",
                      @SerializedName("chanceofwindy")
                      val chanceofwindy: String = "",
                      @SerializedName("uvIndex")
                      val uvIndex: String = "",
                      @SerializedName("tempC")
                      val tempC: String = "",
                      @SerializedName("pressureInches")
                      val pressureInches: String = "",
                      @SerializedName("HeatIndexF")
                      val heatIndexF: String = "",
                      @SerializedName("chanceofremdry")
                      val chanceofremdry: String = "")