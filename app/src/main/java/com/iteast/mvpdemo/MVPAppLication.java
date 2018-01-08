package com.iteast.mvpdemo;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.backends.okhttp3.OkHttpImagePipelineConfigFactory;
import com.facebook.imagepipeline.core.ImagePipelineConfig;

import okhttp3.OkHttpClient;

/**
 * Created by Administrator on 2018/1/8.
 */

public class MVPAppLication extends Application {
    private OkHttpClient okHttpClient;

    @Override
    public void onCreate() {
        super.onCreate();
        initFresco();
    }

    /**
     * 初始化Fresco
     */
    private void initFresco() {
//        OkHttpClient okHttpClient = new OkHttpClient();
//        ImagePipelineConfig config =
//                OkHttpImagePipelineConfigFactory
//                        .newBuilder(this, okHttpClient)
//                        .build();
//        Fresco.initialize(this, config);
        Fresco.initialize(this);
    }
}
