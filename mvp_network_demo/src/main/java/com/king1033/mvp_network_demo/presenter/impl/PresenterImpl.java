package com.king1033.mvp_network_demo.presenter.impl;

import com.king1033.mvp_network_demo.bean.GiftBean;
import com.king1033.mvp_network_demo.modle.IModle;
import com.king1033.mvp_network_demo.modle.impl.ModleImpl;
import com.king1033.mvp_network_demo.presenter.IPresenter;
import com.king1033.mvp_network_demo.view.IView;

/**
 * @Author:king1033
 * @Desc:Presenter层的实现，用于连接Modle层与View层
 * @Time:2016/9/9
 */
public class PresenterImpl implements IPresenter,IPresenter.Callback{
    IModle mModle;
    IView mView;

    public PresenterImpl(IView giftView) {
        this.mModle = new ModleImpl();
        this.mView = giftView;
    }

    @Override
    public void getGiftList(int pageno) {
        mModle.queryGiftList(pageno,this);
    }

    //通知适配器刷新视图
    @Override
    public void success(GiftBean giftBean) {
        if (giftBean == null) {
            mView.refreshListView(giftBean.getList());
        }
    }
}
