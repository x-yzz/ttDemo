package com.ttdemo.module.news;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.ttdemo.R;
import com.ttdemo.bean.greendao.NewsChannelDao;
import com.ttdemo.bean.greendao.NewsChannelTable;
import com.ttdemo.module.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

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
    private NewsChannelDao dao = new NewsChannelDao();
    private List<Fragment> fragmentList;
    private List<String> titleList;

    public static NewsTabLayout getInstance() {
        if (instance == null) {
            instance = new NewsTabLayout();
        }
        return instance;
    }


    @Override
    protected void initData() {
        initTab();
    }

    private void initTab() {
        List<NewsChannelTable> channelList = dao.query(1);
        fragmentList = new ArrayList<>();
        titleList = new ArrayList<>();
        if(channelList.size()==0){

        }
    }

    @Override
    protected void initView(View view) {
        tab_layout.setupWithViewPager(viewPager);
        add_channel_iv.setOnClickListener(v -> {
            //todo
        });

    }

    @Override
    public int getlayout() {
        return R.layout.fragment_news_tab;
    }

}
