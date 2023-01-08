package com.example.sunnyweather.logic.network;

import com.example.sunnyweather.logic.model.PlaceResponse;

import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * created by lanye
 * on 1/8/23
 */
public interface PlaceService {
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    public PlaceResponse searchPlaces(@Query("query") String query);
}
