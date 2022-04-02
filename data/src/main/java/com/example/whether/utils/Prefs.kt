package com.example.whether.utils

import android.content.SharedPreferences
import android.util.Log
import androidx.core.content.edit
import com.example.whether.medule.TokenModel
import com.example.whether.retrofit.services.NetworkService
import com.example.whether.utils.AppConstants.Companion.DEVICE_TOKEN
import com.example.whether.utils.AppConstants.Companion.NOTIF_KEY
import com.example.whether.utils.AppConstants.Companion.USER_TOKEN
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*
import javax.inject.Inject

class Prefs @Inject constructor(
    private val sharedPrefs: SharedPreferences,
) {

    var currentFragment: String?
        get() {
            return sharedPrefs.getString(AppConstants.CURRENT_FRAGMENT, null)

        }
        set(value) {
            sharedPrefs.edit { putString(AppConstants.CURRENT_FRAGMENT, value) }
        }




    var language: String?
        get() {
            return sharedPrefs.getString(AppConstants.defaultLanguageKey, Locale.getDefault().language)
                ?: Locale.getDefault().language
        }
        set(value) {
            sharedPrefs.edit { putString(AppConstants.defaultLanguageKey, value) }
        }

    var isLoggedIn: Boolean
        get() = sharedPrefs.getBoolean(AppConstants.isLoggedInKey, false)
        set(value) = sharedPrefs.edit { putBoolean(AppConstants.isLoggedInKey, value)  ?: Locale.getDefault() }

    var userType: Int?
        get() = sharedPrefs.getInt(AppConstants.userTypeKey, 0)

        set(value) {
            sharedPrefs.edit { putInt(AppConstants.userTypeKey, value ?: 0) }
        }
    fun saveKey(key: String){
        val editor =sharedPrefs.edit()
        editor.putString(NOTIF_KEY, key)
        editor.apply()
    }
    fun featchKey():String ?{
        return sharedPrefs.getString(NOTIF_KEY, null)
    }
    fun deleteAllSharedPrefs() {
        sharedPrefs.edit().clear().apply()
    }
    fun UpdateUserDeviceToken(authToken: String, token: String)
    {
        /* val retrofit = Retrofit.Builder()
             .baseUrl(BASE_URL)
             .addConverterFactory(GsonConverterFactory.create())
             .build()
         val lastFmService = retrofit.create(NetworkService::class.java)
         lastFmService.updateToken(authToken,tokenModel = TokenModel(token))*/
        val retrofit = Retrofit.Builder()
            .baseUrl(AppConstants.BASE_URL) // as we are sending data in json format so
            // we have to add Gson converter factory
            .addConverterFactory(GsonConverterFactory.create()) // at last we are building our retrofit builder.
            .build()
        // below line is to create an instance for our retrofit api class.
        // below line is to create an instance for our retrofit api class.
        val retrofitAPI: NetworkService = retrofit.create(NetworkService::class.java)

        // passing data from our text fields to our modal class.

        // passing data from our text fields to our modal class.
        val modal = TokenModel(token)

        // calling a method to create a post and passing our modal class.

        // calling a method to create a post and passing our modal class.
        val call: Call<TokenModel?>? = retrofitAPI.createPost(authToken,modal)

        // on below line we are executing our method.

        // on below line we are executing our method.
        call!!.enqueue(object : Callback<TokenModel?> {
            override fun onResponse(call: Call<TokenModel?>, response: Response<TokenModel?>) {
                //Toast.makeText(con, response.code().toString(), Toast.LENGTH_SHORT).show()
                Log.d("val",response.code().toString())
            }

            override fun onFailure(call: Call<TokenModel?>, t: Throwable) {
                Log.d("val",t.toString())
                //Toast.makeText(this@MyFirebaseMessagingService, t.toString(), Toast.LENGTH_SHORT).show()

            }

        })



    }
    fun saveAuthToken(token: String){
        val editor =sharedPrefs.edit()
        editor.putString(USER_TOKEN, token)
        editor.apply()
    }
    fun featchAuthToken():String ?{
        return sharedPrefs.getString(USER_TOKEN, null)
    }
    fun saveDeviceToken(token: String){
        val editor =sharedPrefs.edit()
        editor.putString(DEVICE_TOKEN, token)
        editor.apply()
    }
    fun featchDeviceToken():String ?{
        return sharedPrefs.getString(DEVICE_TOKEN, null)
    }

}