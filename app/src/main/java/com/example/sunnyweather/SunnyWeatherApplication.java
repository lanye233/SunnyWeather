package com.example.sunnyweather;

import android.app.Application;
import android.content.Context;

/**
 * created by lanye
 * on 1/8/23
 */
public class SunnyWeatherApplication extends Application {
    private static Context context;
    private static String TOKEN = "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";

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
