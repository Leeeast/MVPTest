package com.iteast.mvpdemo.view;

/**
 * 定义出所有的UI逻辑
 */

public interface IGirlView {
    /**
     * 加载进度
     */
    void showLoading();

    /**
     * 显示数据（使用回调的方式）
     */
    void showGirls(String girlUrl);
}
