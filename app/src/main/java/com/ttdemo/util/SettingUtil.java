package com.ttdemo.util;

import android.content.SharedPreferences;

import com.ttdemo.MyApplication;

public class SettingUtil {


   private SharedPreferences setting = MyApplication.AppContext.getSharedPreferences("setting",0);

   public static  SettingUtil getInstance(){
      return SettingsUtilInstance.instance;
   }
   private static  class SettingsUtilInstance{//静态内部类单例模式
       private static  SettingUtil instance = new SettingUtil();
   }
    /**
     * 获取是否开启夜间模式
     */
    public boolean getIsNightMode(){
        return setting.getBoolean("switch_nightMode",false);
    }
    /**
     * 设置夜间模式
     */
    public void setIsNightMode(boolean flag){
        setting.edit().putBoolean("switch_nightMode",flag).apply();
    }
}
