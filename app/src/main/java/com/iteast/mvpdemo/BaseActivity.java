package com.iteast.mvpdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.iteast.mvpdemo.presenter.BasePresenter;

/**
 * Created by Administrator on 2018/1/8.
 */

public abstract class BaseActivity<V, T extends BasePresenter<V>> extends Activity {
    //表示层引用
    public T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();
        this.presenter.attachView((V) this);
    }

    protected abstract T createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
