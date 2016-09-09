package com.king1033.mvp_network_demo.view;

import com.king1033.mvp_network_demo.bean.GiftBean;

import java.util.List;

/**
 * @Author:king1033
 * @Desc:View层接口
 * @Time:2016/9/7
 */
public interface IView {
    /**
     * 刷新适配器更新视图
     * @param listBeen
     */
    void refreshListView(List<GiftBean.ListBean>listBeen);
}
