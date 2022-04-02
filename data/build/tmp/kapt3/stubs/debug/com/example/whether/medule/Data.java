package com.example.whether.medule;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003H\u00c6\u0003JQ\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u00a8\u0006\u001d"}, d2 = {"Lcom/example/whether/medule/Data;", "", "request", "", "Lcom/example/whether/medule/RequestItem;", "currentCondition", "Lcom/example/whether/medule/CurrentConditionItem;", "weather", "Lcom/example/whether/medule/WeatherItem;", "climateAverages", "Lcom/example/whether/medule/ClimateAveragesItem;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getClimateAverages", "()Ljava/util/List;", "getCurrentCondition", "getRequest", "getWeather", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_debug"})
public final class Data {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "request")
    private final java.util.List<com.example.whether.medule.RequestItem> request = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "current_condition")
    private final java.util.List<com.example.whether.medule.CurrentConditionItem> currentCondition = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "weather")
    private final java.util.List<com.example.whether.medule.WeatherItem> weather = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "ClimateAverages")
    private final java.util.List<com.example.whether.medule.ClimateAveragesItem> climateAverages = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.whether.medule.Data copy(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.whether.medule.RequestItem> request, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.whether.medule.CurrentConditionItem> currentCondition, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.whether.medule.WeatherItem> weather, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.whether.medule.ClimateAveragesItem> climateAverages) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Data(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.whether.medule.RequestItem> request, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.whether.medule.CurrentConditionItem> currentCondition, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.whether.medule.WeatherItem> weather, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.whether.medule.ClimateAveragesItem> climateAverages) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.whether.medule.RequestItem> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.whether.medule.RequestItem> getRequest() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.whether.medule.CurrentConditionItem> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.whether.medule.CurrentConditionItem> getCurrentCondition() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.whether.medule.WeatherItem> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.whether.medule.WeatherItem> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.whether.medule.ClimateAveragesItem> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.whether.medule.ClimateAveragesItem> getClimateAverages() {
        return null;
    }
}