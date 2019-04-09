package com.ttdemo.bean.greendao;

import com.ttdemo.MyApplication;
import com.ttdemo.bean.news.NewsChannelBean;
import com.ttdemo.greendao.DaoSession;

import java.util.List;

public class NewsChannelDao {
 DaoSession session = MyApplication.getDaoSession();

 public List<NewsChannelBean> query(int isEnable) {

 }
}
