package com.example.whether.retrofit.services

import com.example.whether.medule.TokenModel
import com.example.whether.medule.WhetherResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*



interface NetworkService {


    @POST("user/device_token/update")
    fun createPost(@Header("Authorization") token:String, @Body dataModal: TokenModel?): Call<TokenModel?>?


    @GET("weather.ashx?key=f6966c54b71a422bb4e180940223003&format=json")
    suspend  fun getData(

     //   @Query("num_of_days") num_of_days:Int
        @Query("q") location: String,
        @Query("num_of_days") num_of_days:Int


    ) : Response<WhetherResponse>

    /*@GET("/data/2.5/weather")
    suspend fun getWeatherInfo(
        @Query("q") query: String
    ): Response<WeatherResponse>*/
}