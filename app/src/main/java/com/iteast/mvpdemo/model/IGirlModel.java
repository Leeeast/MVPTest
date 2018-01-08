package com.iteast.mvpdemo.model;

/**
 * Created by Administrator on 2018/1/8.
 */

public interface IGirlModel {
    /**
     * 数据模型中加载数据
     */
    void loadGirl(GirlOnLoadListener girlOnLoadListener);

    //设计一个内部回调接口
    interface GirlOnLoadListener {
        void onComplete(String girlUrl);
    }
}
