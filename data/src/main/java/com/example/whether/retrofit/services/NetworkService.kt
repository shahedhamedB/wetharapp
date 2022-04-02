package com.example.whether.retrofit.services

import com.example.whether.medule.TokenModel
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface NetworkService {


    @POST("user/device_token/update")
    fun createPost(@Header("Authorization") token:String, @Body dataModal: TokenModel?): Call<TokenModel?>?

}