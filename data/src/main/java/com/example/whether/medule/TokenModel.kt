package com.example.whether.medule

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class TokenModel (
    @SerializedName("device_token")
    @Expose
    var device_token: String?
        )