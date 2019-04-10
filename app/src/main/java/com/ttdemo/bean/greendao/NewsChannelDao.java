package com.ttdemo.bean.greendao;

import com.ttdemo.MyApplication;
import com.ttdemo.R;
import com.ttdemo.greendao.NewsChannelTableDao;

import java.util.List;

public class NewsChannelDao {

    NewsChannelTableDao dao = MyApplication.getDaoSession().getNewsChannelTableDao();

    public List<NewsChannelTable> query(int isEnable) {
        List<NewsChannelTable> list = dao.queryBuilder().where(NewsChannelTableDao.Properties.IsEnable.eq(isEnable)).list();
        return list;
    }
    public void addData(){
        String categoryId[] = MyApplication.AppContext.getResources().getStringArray(R.array.mobile_news_id);
        String categoryName[] = MyApplication.AppContext.getResources().getStringArray(R.array.mobile_news_name);

       for (int i = 0;i<categoryId.length;i++){
           int isEnable = -1;


           NewsChannelTable newsChannel = new NewsChannelTable(categoryId[i],categoryName[i],1,i);
           dao.insert(newsChannel);
       }
    }

}
