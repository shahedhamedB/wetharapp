package com.example.whether.ui.homewether

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.whether.medule.WhetherResponse
import com.example.whether.retrofit.data.HomeDataSourse

import com.example.whether.utils.Resource
import kotlinx.coroutines.launch

class HomeViewModel @ViewModelInject constructor(val homeDataSourse: HomeDataSourse) : ViewModel() {
    val topappStatus = MutableLiveData<Resource<WhetherResponse>>()

    fun topAppList(location: String,num_of_days:Int) {
        viewModelScope.launch {
            val response = homeDataSourse.getTopApp(location,num_of_days)
            topappStatus.postValue(response)
        }
    }
}