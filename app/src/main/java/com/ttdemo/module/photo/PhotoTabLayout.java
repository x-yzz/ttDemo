package com.ttdemo.module.photo;

import android.support.v4.app.Fragment;

public class PhotoTabLayout extends Fragment {
    private static PhotoTabLayout instance = null;
    public static PhotoTabLayout getInstance() {
        if (instance == null) {
            instance = new PhotoTabLayout();
        }
        return instance;
    }
}
