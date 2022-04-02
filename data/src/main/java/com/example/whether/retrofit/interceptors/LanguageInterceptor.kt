package com.example.whether.retrofit.interceptors

import com.example.whether.utils.Prefs
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class LanguageInterceptor @Inject constructor(
    private val prefs: Prefs
) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response =
        chain.proceed(
            chain.request().newBuilder()
                .addHeader(
                    "lang",
                    prefs.language ?: "en"
                ).build()
        )

}