package com.example.sunnyweather.logic.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * created by lanye
 * on 1/8/23
 */
public final class ServiceCreator {
    private static String BASE_URL = "https://api.caiyunapp.com/";

    private Retrofit retrofit = new Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build();

    public static final ServiceCreator INSTANCE = new ServiceCreator();

    public final Object create(Class serviceClass) {
        return retrofit.create(serviceClass);
    }
}
