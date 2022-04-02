package com.example.whether.utils

class AppConstants {

    companion object{
        const val BASE_URL = "http://api.worldweatheronline.com/premium/v1/"
        const val defaultLanguage:String ="en"
        const val defaultLanguageKey:String ="DEFAULT_LANGUAGE"
        const val userTypeKey:String ="USER_TYPE"
        const val isLoggedInKey:String ="isLoggedInKey"
        const val USER_TOKEN="user token"
        const val CURRENT_FRAGMENT="Main Fragment"
        const val NOTIF_KEY="notfy key"
        const val DEVICE_TOKEN="device token"
        const val PASSWORD_PATTERN = "^" +
                "(?=.*[0-9])" +         //at least 1 digit
                "(?=.*[A-Z])" +         //at least 1 upper case letter
                ".{8,}" +               //at least 8 characters
                "$"

        const val EMAIL_PATTERN= "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                "\\@" +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                "(" +
                "\\." +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                ")+"


    }
}