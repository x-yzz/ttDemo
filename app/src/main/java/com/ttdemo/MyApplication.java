package com.ttdemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.multidex.MultiDexApplication;
import android.support.v7.app.AppCompatDelegate;

import com.ttdemo.greendao.DaoMaster;
import com.ttdemo.greendao.DaoSession;
import com.ttdemo.util.SettingUtil;

public class MyApplication extends MultiDexApplication {
    public static Context AppContext;

    @Override
    public void onCreate() {
        super.onCreate();
        AppContext = getApplicationContext();
        initTheme();
        initGreenDao();
    }
    /**
     * 初始化GreenDao,直接在Application中进行初始化操作
     */
    private void initGreenDao() {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "aserbao.db");
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }

    private static DaoSession daoSession;
    public static DaoSession getDaoSession() {
        return daoSession;
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
