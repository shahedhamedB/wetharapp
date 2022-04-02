package com.example.whether.retrofit.data

import com.example.whether.retrofit.services.NetworkService
import javax.inject.Inject

class HomeDataSourse @Inject constructor(
    private val networkService: NetworkService
) : BaseDataSource() {

    suspend fun getTopApp(location: String,num_of_days:Int)=getResult {
        networkService.getData(location,num_of_days)
    }

}