package com.example.whether.ui.homewether;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lcom/example/whether/ui/homewether/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "homeDataSourse", "Lcom/example/whether/retrofit/data/HomeDataSourse;", "(Lcom/example/whether/retrofit/data/HomeDataSourse;)V", "getHomeDataSourse", "()Lcom/example/whether/retrofit/data/HomeDataSourse;", "topappStatus", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/whether/utils/Resource;", "Lcom/example/whether/medule/WhetherResponse;", "getTopappStatus", "()Landroidx/lifecycle/MutableLiveData;", "topAppList", "", "location", "", "num_of_days", "", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.whether.retrofit.data.HomeDataSourse homeDataSourse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.whether.utils.Resource<com.example.whether.medule.WhetherResponse>> topappStatus = null;
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.example.whether.retrofit.data.HomeDataSourse homeDataSourse) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.whether.retrofit.data.HomeDataSourse getHomeDataSourse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.whether.utils.Resource<com.example.whether.medule.WhetherResponse>> getTopappStatus() {
        return null;
    }
    
    public final void topAppList(@org.jetbrains.annotations.NotNull()
    java.lang.String location, int num_of_days) {
    }
}