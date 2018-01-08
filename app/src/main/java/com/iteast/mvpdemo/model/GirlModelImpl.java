package com.iteast.mvpdemo.model;

/**
 * Created by Administrator on 2018/1/8.
 */

public class GirlModelImpl implements IGirlModel {
    @Override
    public void loadGirl(GirlOnLoadListener girlOnLoadListener) {
        String girlUrl = "http://img0.imgtn.bdimg.com/it/u=3424226810,3788025634&fm=214&gp=0.jpg";
        girlOnLoadListener.onComplete(girlUrl);
    }
}
