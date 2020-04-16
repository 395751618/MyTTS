package com.xx.tts;

import android.content.Context;

import androidx.multidex.MultiDexApplication;

/**
 * @project MyTTS
 * @package：com.xx.tts
 * @anthor xiangxia
 * @time 2020-04-16 13:34
 * @description 描述
 */
public class MyTTSApp extends MultiDexApplication {

    public static Context applicationContext;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationContext = getApplicationContext();
    }
}
