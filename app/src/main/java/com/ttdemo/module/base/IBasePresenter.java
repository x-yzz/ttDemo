package com.ttdemo.module.base;

public interface IBasePresenter<T extends IBaseView> {

    /**
     * 刷新数据
     */
    void doRefresh();

    /**
     * 显示网络错误
     */
    void doShowNetError();
}
