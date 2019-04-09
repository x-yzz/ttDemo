package com.ttdemo.bean.greendao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class NewsChannelTable {
    @Id(autoincrement = true)
    Long id;
    String name;
    String isEnable;
    String position;
    @Generated(hash = 1292959554)
    public NewsChannelTable(Long id, String name, String isEnable,
            String position) {
        this.id = id;
        this.name = name;
        this.isEnable = isEnable;
        this.position = position;
    }
    @Generated(hash = 518806505)
    public NewsChannelTable() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIsEnable() {
        return this.isEnable;
    }
    public void setIsEnable(String isEnable) {
        this.isEnable = isEnable;
    }
    public String getPosition() {
        return this.position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
}
