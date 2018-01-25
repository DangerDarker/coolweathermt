package com.example.mt.coolweathermt.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by MT on 2018/1/21.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daliy_forecast")
    public List<Forecast> forecastList;
    
}
