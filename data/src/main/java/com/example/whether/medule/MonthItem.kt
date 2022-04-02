package com.example.whether.medule

import com.google.gson.annotations.SerializedName

data class MonthItem(@SerializedName("absMaxTemp")
                     val absMaxTemp: String = "",
                     @SerializedName("avgMinTemp_F")
                     val avgMinTempF: String = "",
                     @SerializedName("name")
                     val name: String = "",
                     @SerializedName("index")
                     val index: String = "",
                     @SerializedName("absMaxTemp_F")
                     val absMaxTempF: String = "",
                     @SerializedName("avgDailyRainfall")
                     val avgDailyRainfall: String = "",
                     @SerializedName("avgMinTemp")
                     val avgMinTemp: String = "")