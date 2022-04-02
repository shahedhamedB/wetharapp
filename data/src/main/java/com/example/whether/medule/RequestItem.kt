package com.example.whether.medule

import com.google.gson.annotations.SerializedName

data class RequestItem(@SerializedName("query")
                       val query: String = "",
                       @SerializedName("type")
                       val type: String = "")