package com.iteast.mvpdemo.presenter;

import android.app.Activity;
import android.view.View;
import android.widget.Toast;

import com.iteast.mvpdemo.R;
import com.iteast.mvpdemo.model.GirlModelImpl;
import com.iteast.mvpdemo.model.IGirlModel;
import com.iteast.mvpdemo.view.IGirlView;

/**
 * 表示层
 */

public class GirlPresenter<T extends IGirlView> extends BasePresenter<T> {

    //2. model层引用
    IGirlModel girlModel = new GirlModelImpl();


    //3. 构造方法
    public GirlPresenter() {

    }

    //4. 执行操作（UI逻辑）
    public void fetch() {
        if (mViewRef.get() != null) {
            mViewRef.get().showLoading();
            if (girlModel != null) {
                girlModel.loadGirl(new IGirlModel.GirlOnLoadListener() {
                    @Override
                    public void onComplete(String girlUrl) {
                        if (mViewRef.get() != null) {
                            mViewRef.get().showGirls(girlUrl);
                        }
                    }
                });
            }
        }
    }

    public void onClick() {
        final Activity t = (Activity) mViewRef.get();
        t.findViewById(R.id.sdv_girl).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(t, "哈哈哈", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
