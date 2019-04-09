package com.ttdemo;

import android.content.Context;
import android.support.multidex.MultiDexApplication;
import android.support.v7.app.AppCompatDelegate;

import com.ttdemo.util.SettingUtil;

public class MyApplication extends MultiDexApplication {
    public static Context AppContext;

    @Override
    public void onCreate() {
        super.onCreate();
        AppContext = getApplicationContext();
        initTheme();
    }

    private void initTheme() {//初始化主题
        SettingUtil settingUtil = SettingUtil.getInstance();
        if(settingUtil.getIsNightMode()){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }

    }
}
