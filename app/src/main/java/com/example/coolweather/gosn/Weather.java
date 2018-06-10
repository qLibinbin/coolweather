package com.example.coolweather.gosn;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by PC on 2018/6/4.
 */

public class Weather {
    public String starus;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
