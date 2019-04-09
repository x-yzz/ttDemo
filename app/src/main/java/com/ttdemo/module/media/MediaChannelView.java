package com.ttdemo.module.media;

import android.support.v4.app.Fragment;

public class MediaChannelView extends Fragment {
    private static MediaChannelView instance = null;
    public static MediaChannelView getInstance() {
        if (instance == null) {
            instance = new MediaChannelView();
        }
        return instance;
    }
}
