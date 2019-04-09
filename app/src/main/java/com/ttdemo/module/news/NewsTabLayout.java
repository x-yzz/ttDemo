package com.ttdemo.module.news;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.ttdemo.R;
import com.ttdemo.module.base.BaseFragment;

import butterknife.BindView;

public class NewsTabLayout extends BaseFragment {
    private static NewsTabLayout instance = null;
    @BindView(R.id.tab_layout_news)
    TabLayout tab_layout;
    @BindView(R.id.add_channel_iv)
    ImageView add_channel_iv;
    @BindView(R.id.header_layout)
    LinearLayout linearLayout;
    @BindView(R.id.view_pager_news)
    ViewPager viewPager;

    public static NewsTabLayout getInstance() {
        if (instance == null) {
            instance = new NewsTabLayout();
        }
        return instance;
    }


    @Override
    protected void initData() {

    }

    @Override
    protected void initView(View view) {
   tab_layout.setupWithViewPager(viewPager);

    }

    @Override
    public int getlayout() {
        return R.layout.fragment_news_tab;
    }

}
