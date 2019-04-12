package com.ttdemo.module.news;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.ttdemo.R;
import com.ttdemo.adapter.base.BasePagerAdapter;
import com.ttdemo.bean.greendao.NewsChannelDao;
import com.ttdemo.bean.greendao.NewsChannelTable;
import com.ttdemo.module.base.LazyLoadFragment;
import com.ttdemo.module.news.articel.NewsArticleView;
import com.ttdemo.module.wenda.articel.WendaArticleView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;

public class NewsTabLayout extends LazyLoadFragment {
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
    private Map<String, Fragment> map = new HashMap<>();

    public static NewsTabLayout getInstance() {
        if (instance == null) {
            instance = new NewsTabLayout();
        }
        return instance;
    }


    @Override
    protected void initData() {
        initTab();
        BasePagerAdapter adapter = new BasePagerAdapter(getChildFragmentManager(), fragmentList, titleList);
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(15);
    }

    private void initTab() {
        List<NewsChannelTable> channelList = dao.query(1);
        fragmentList = new ArrayList<>();
        titleList = new ArrayList<>();
        if (channelList.size() == 0) {
            dao.addData();
            channelList = dao.query(1);
        }
        for (NewsChannelTable bean : channelList) {
            Fragment fragment = null;
            String channelId = bean.getId();
            switch (channelId) {
                case "question_and_answer":
                    if (map.containsKey(channelId)) {
                        fragmentList.add(map.get(channelId));
                    } else {
                        fragment = WendaArticleView.newInstance();
                        fragmentList.add(fragment);
                    }
                    break;

                default:
                    if (map.containsKey(channelId)) {
                        fragmentList.add(map.get(channelId));
                    } else {
                        fragment = NewsArticleView.newInstance();
                        fragmentList.add(fragment);
                    }
                    break;
            }
            titleList.add(bean.getName());
            if (fragment != null) {
                map.put(channelId, fragment);
            }
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


    @Override
    public void fetchData() {

    }
}
