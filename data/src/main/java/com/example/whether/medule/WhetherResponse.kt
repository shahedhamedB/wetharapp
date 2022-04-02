package com.example.whether.medule

import com.google.gson.annotations.SerializedName

data class WhetherResponse(@SerializedName("data")
                           val data: Data)