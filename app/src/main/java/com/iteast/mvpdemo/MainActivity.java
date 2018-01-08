package com.iteast.mvpdemo;

import android.os.Bundle;
import android.widget.Toast;

import com.facebook.drawee.view.SimpleDraweeView;
import com.iteast.mvpdemo.presenter.GirlPresenter;
import com.iteast.mvpdemo.view.IGirlView;

public class MainActivity extends BaseActivity<IGirlView, GirlPresenter<IGirlView>> implements IGirlView {

    private SimpleDraweeView ivGirl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivGirl = findViewById(R.id.sdv_girl);
        presenter.fetch();
        presenter.onClick();
    }

    @Override
    protected GirlPresenter<IGirlView> createPresenter() {
        return new GirlPresenter<>();
    }

    @Override
    public void showLoading() {
        Toast.makeText(this, "加载成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showGirls(String girlUrl) {
        ivGirl.setImageURI(girlUrl);
    }
}
