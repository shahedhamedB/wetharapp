package com.example.whether.retrofit.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\'\u00a8\u0006\b"}, d2 = {"Lcom/example/whether/retrofit/services/NetworkService;", "", "createPost", "Lretrofit2/Call;", "Lcom/example/whether/medule/TokenModel;", "token", "", "dataModal", "data_debug"})
public abstract interface NetworkService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "user/device_token/update")
    public abstract retrofit2.Call<com.example.whether.medule.TokenModel> createPost(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Body()
    com.example.whether.medule.TokenModel dataModal);
}