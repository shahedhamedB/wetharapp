package com.example.whether.medule;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00e3\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u001bJ\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0006H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\u00eb\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010L\u001a\u00020MH\u00d6\u0001J\t\u0010N\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0016\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001dR\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001dR\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001dR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001d\u00a8\u0006O"}, d2 = {"Lcom/example/whether/medule/CurrentConditionItem;", "", "precipMM", "", "observationTime", "weatherDesc", "", "Lcom/example/whether/medule/WeatherDescItem;", "visibility", "weatherCode", "feelsLikeF", "pressure", "tempC", "tempF", "cloudcover", "windspeedMiles", "winddirDegree", "feelsLikeC", "windspeedKmph", "humidity", "visibilityMiles", "precipInches", "uvIndex", "winddirPoint", "weatherIconUrl", "Lcom/example/whether/medule/WeatherIconUrlItem;", "pressureInches", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getCloudcover", "()Ljava/lang/String;", "getFeelsLikeC", "getFeelsLikeF", "getHumidity", "getObservationTime", "getPrecipInches", "getPrecipMM", "getPressure", "getPressureInches", "getTempC", "getTempF", "getUvIndex", "getVisibility", "getVisibilityMiles", "getWeatherCode", "getWeatherDesc", "()Ljava/util/List;", "getWeatherIconUrl", "getWinddirDegree", "getWinddirPoint", "getWindspeedKmph", "getWindspeedMiles", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "data_debug"})
public final class CurrentConditionItem {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "precipMM")
    private final java.lang.String precipMM = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "observation_time")
    private final java.lang.String observationTime = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "weatherDesc")
    private final java.util.List<com.example.whether.medule.WeatherDescItem> weatherDesc = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "visibility")
    private final java.lang.String visibility = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "weatherCode")
    private final java.lang.String weatherCode = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "FeelsLikeF")
    private final java.lang.String feelsLikeF = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "pressure")
    private final java.lang.String pressure = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "temp_C")
    private final java.lang.String tempC = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "temp_F")
    private final java.lang.String tempF = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "cloudcover")
    private final java.lang.String cloudcover = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "windspeedMiles")
    private final java.lang.String windspeedMiles = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "winddirDegree")
    private final java.lang.String winddirDegree = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "FeelsLikeC")
    private final java.lang.String feelsLikeC = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "windspeedKmph")
    private final java.lang.String windspeedKmph = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "humidity")
    private final java.lang.String humidity = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "visibilityMiles")
    private final java.lang.String visibilityMiles = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "precipInches")
    private final java.lang.String precipInches = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "uvIndex")
    private final java.lang.String uvIndex = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "winddir16Point")
    private final java.lang.String winddirPoint = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "weatherIconUrl")
    private final java.util.List<com.example.whether.medule.WeatherIconUrlItem> weatherIconUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "pressureInches")
    private final java.lang.String pressureInches = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.whether.medule.CurrentConditionItem copy(@org.jetbrains.annotations.NotNull()
    java.lang.String precipMM, @org.jetbrains.annotations.NotNull()
    java.lang.String observationTime, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.whether.medule.WeatherDescItem> weatherDesc, @org.jetbrains.annotations.NotNull()
    java.lang.String visibility, @org.jetbrains.annotations.NotNull()
    java.lang.String weatherCode, @org.jetbrains.annotations.NotNull()
    java.lang.String feelsLikeF, @org.jetbrains.annotations.NotNull()
    java.lang.String pressure, @org.jetbrains.annotations.NotNull()
    java.lang.String tempC, @org.jetbrains.annotations.NotNull()
    java.lang.String tempF, @org.jetbrains.annotations.NotNull()
    java.lang.String cloudcover, @org.jetbrains.annotations.NotNull()
    java.lang.String windspeedMiles, @org.jetbrains.annotations.NotNull()
    java.lang.String winddirDegree, @org.jetbrains.annotations.NotNull()
    java.lang.String feelsLikeC, @org.jetbrains.annotations.NotNull()
    java.lang.String windspeedKmph, @org.jetbrains.annotations.NotNull()
    java.lang.String humidity, @org.jetbrains.annotations.NotNull()
    java.lang.String visibilityMiles, @org.jetbrains.annotations.NotNull()
    java.lang.String precipInches, @org.jetbrains.annotations.NotNull()
    java.lang.String uvIndex, @org.jetbrains.annotations.NotNull()
    java.lang.String winddirPoint, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.whether.medule.WeatherIconUrlItem> weatherIconUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String pressureInches) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
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
    
    public CurrentConditionItem(@org.jetbrains.annotations.NotNull()
    java.lang.String precipMM, @org.jetbrains.annotations.NotNull()
    java.lang.String observationTime, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.whether.medule.WeatherDescItem> weatherDesc, @org.jetbrains.annotations.NotNull()
    java.lang.String visibility, @org.jetbrains.annotations.NotNull()
    java.lang.String weatherCode, @org.jetbrains.annotations.NotNull()
    java.lang.String feelsLikeF, @org.jetbrains.annotations.NotNull()
    java.lang.String pressure, @org.jetbrains.annotations.NotNull()
    java.lang.String tempC, @org.jetbrains.annotations.NotNull()
    java.lang.String tempF, @org.jetbrains.annotations.NotNull()
    java.lang.String cloudcover, @org.jetbrains.annotations.NotNull()
    java.lang.String windspeedMiles, @org.jetbrains.annotations.NotNull()
    java.lang.String winddirDegree, @org.jetbrains.annotations.NotNull()
    java.lang.String feelsLikeC, @org.jetbrains.annotations.NotNull()
    java.lang.String windspeedKmph, @org.jetbrains.annotations.NotNull()
    java.lang.String humidity, @org.jetbrains.annotations.NotNull()
    java.lang.String visibilityMiles, @org.jetbrains.annotations.NotNull()
    java.lang.String precipInches, @org.jetbrains.annotations.NotNull()
    java.lang.String uvIndex, @org.jetbrains.annotations.NotNull()
    java.lang.String winddirPoint, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.whether.medule.WeatherIconUrlItem> weatherIconUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String pressureInches) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrecipMM() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getObservationTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.whether.medule.WeatherDescItem> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.whether.medule.WeatherDescItem> getWeatherDesc() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWeatherCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFeelsLikeF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPressure() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTempC() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTempF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCloudcover() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWindspeedMiles() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWinddirDegree() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFeelsLikeC() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWindspeedKmph() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHumidity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVisibilityMiles() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrecipInches() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUvIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWinddirPoint() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.whether.medule.WeatherIconUrlItem> component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.whether.medule.WeatherIconUrlItem> getWeatherIconUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPressureInches() {
        return null;
    }
}