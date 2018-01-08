package com.iteast.mvpdemo.presenter;

import java.lang.ref.WeakReference;

/**
 * Created by Administrator on 2018/1/8.
 */

public class BasePresenter<T> {
    //1. view层引用
    //IGirlView girlView;
    protected WeakReference<T> mViewRef;

    //进行绑定
    public void attachView(T view) {
        mViewRef = new WeakReference<>(view);
    }

    //解除绑定
    public void detachView() {
        mViewRef.clear();
    }
}
