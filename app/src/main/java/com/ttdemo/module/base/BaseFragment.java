package com.ttdemo.module.base;

import android.arch.lifecycle.Lifecycle;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.AutoDisposeConverter;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public  abstract  class BaseFragment<T extends IBasePresenter> extends Fragment implements IBaseView{
    public T mPresenter;
   private Unbinder bind;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getlayout(),container,false);
         bind = ButterKnife.bind(this, view);
         initView(view);
         initData();
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    protected abstract void initData();


    protected abstract void initView(View view);

    public  abstract  int getlayout();
  
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        bind.unbind();
    }
    /**
     * 初始化 Toolbar
     */
    protected void initToolBar(Toolbar toolbar, boolean homeAsUpEnabled, String title) {
        ((BaseActivity)getActivity()).initoobar(toolbar,homeAsUpEnabled,title);
    }
    @Override
    public <X> AutoDisposeConverter<X> bindAutoDispose() {
        return AutoDispose.autoDisposable(AndroidLifecycleScopeProvider
                .from(this, Lifecycle.Event.ON_DESTROY));
    }
}
