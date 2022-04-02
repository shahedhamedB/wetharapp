package com.example.whether.medule

import com.google.gson.annotations.SerializedName

data class ClimateAveragesItem(@SerializedName("month")
                               val month: List<MonthItem>?)