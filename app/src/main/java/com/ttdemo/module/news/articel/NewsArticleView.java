package com.ttdemo.module.news.articel;

import android.view.View;

import com.ttdemo.module.base.IBasePresenter;
import com.ttdemo.module.base.LazyLoadFragment;

public class NewsArticleView extends LazyLoadFragment<INewsArticle.Presenter> implements INewsArticle.View {
    public static NewsArticleView newInstance() {
        return new NewsArticleView();
    }

    @Override
    public void fetchData() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected IBasePresenter creatPresenter() {
        return new NewsArticlePresenter();
    }

    @Override
    protected void initView(View view) {

    }

    @Override
    public int getlayout() {
        return 0;
    }

    @Override
    public void onLoadData() {

    }

    @Override
    public void onRefresh() {

    }
}
