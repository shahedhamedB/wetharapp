package com.example.whether.medule

import com.google.gson.annotations.SerializedName

data class AstronomyItem(@SerializedName("moonset")
                         val moonset: String = "",
                         @SerializedName("moon_illumination")
                         val moonIllumination: String = "",
                         @SerializedName("sunrise")
                         val sunrise: String = "",
                         @SerializedName("moon_phase")
                         val moonPhase: String = "",
                         @SerializedName("sunset")
                         val sunset: String = "",
                         @SerializedName("moonrise")
                         val moonrise: String = "")