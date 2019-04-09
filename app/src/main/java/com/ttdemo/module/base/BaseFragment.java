package com.ttdemo.module.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public  abstract  class BaseFragment extends Fragment {
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
}
