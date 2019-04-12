package com.ttdemo.module.news.articel;

import com.ttdemo.module.base.IBasePresenter;
import com.ttdemo.module.base.IBaseView;

import java.util.List;

public interface INewsArticle {
    interface  View extends IBaseView{
        /**
         * 请求数据
         */
        void onLoadData();

        /**
         * 刷新
         */
        void onRefresh();
    }
    interface Presenter extends IBasePresenter<View> {

        /**
         * 请求数据
         */
        void doLoadData(String... category);

        /**
         * 再起请求数据
         */
        void doLoadMoreData();

        /**
         * 设置适配器
         */
        void doSetAdapter(List dataBeen);

        /**
         * 加载完毕
         */
        void doShowNoMore();
    }
}
