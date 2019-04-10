package com.ttdemo.bean.greendao;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class NewsChannelTable {

    String id;
    String name;
    int isEnable;
    int position;
    @Generated(hash = 1573257868)
    public NewsChannelTable(String id, String name, int isEnable, int position) {
        this.id = id;
        this.name = name;
        this.isEnable = isEnable;
        this.position = position;
    }
    @Generated(hash = 518806505)
    public NewsChannelTable() {
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIsEnable() {
        return this.isEnable;
    }
    public void setIsEnable(int isEnable) {
        this.isEnable = isEnable;
    }
    public int getPosition() {
        return this.position;
    }
    public void setPosition(int position) {
        this.position = position;
    }

}
