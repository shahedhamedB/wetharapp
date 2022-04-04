package com.example.whether.retrofit.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/whether/retrofit/data/HomeDataSourse;", "Lcom/example/whether/retrofit/data/BaseDataSource;", "networkService", "Lcom/example/whether/retrofit/services/NetworkService;", "(Lcom/example/whether/retrofit/services/NetworkService;)V", "getTopApp", "Lcom/example/whether/utils/Resource;", "Lcom/example/whether/medule/WhetherResponse;", "location", "", "num_of_days", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class HomeDataSourse extends com.example.whether.retrofit.data.BaseDataSource {
    private final com.example.whether.retrofit.services.NetworkService networkService = null;
    
    @javax.inject.Inject()
    public HomeDataSourse(@org.jetbrains.annotations.NotNull()
    com.example.whether.retrofit.services.NetworkService networkService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTopApp(@org.jetbrains.annotations.NotNull()
    java.lang.String location, int num_of_days, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.whether.utils.Resource<com.example.whether.medule.WhetherResponse>> continuation) {
        return null;
    }
}