package com.example.whether.retrofit.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\'J+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/whether/retrofit/services/NetworkService;", "", "createPost", "Lretrofit2/Call;", "Lcom/example/whether/medule/TokenModel;", "token", "", "dataModal", "getData", "Lretrofit2/Response;", "Lcom/example/whether/medule/WhetherResponse;", "location", "num_of_days", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public abstract interface NetworkService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "user/device_token/update")
    public abstract retrofit2.Call<com.example.whether.medule.TokenModel> createPost(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Body()
    com.example.whether.medule.TokenModel dataModal);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "weather.ashx?key=f6966c54b71a422bb4e180940223003&format=json")
    public abstract java.lang.Object getData(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String location, @retrofit2.http.Query(value = "num_of_days")
    int num_of_days, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.whether.medule.WhetherResponse>> p2);
}