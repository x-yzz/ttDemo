package com.ttdemo.module.video;

import android.support.v4.app.Fragment;
public class VideoTabLayout extends Fragment {
    private static VideoTabLayout instance = null;
    public static VideoTabLayout getInstance() {
        if (instance == null) {
            instance = new VideoTabLayout();
        }
        return instance;
    }
}
