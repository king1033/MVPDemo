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
    IModle mGiftModel;
    IView mGiftView;

    public PresenterImpl(IView giftView) {
        this.mGiftModel = new ModleImpl();
        this.mGiftView = giftView;
    }

    @Override
    public void getGiftList(int pageno) {
        mGiftModel.queryGiftList(pageno,this);
    }

    @Override
    public void success(GiftBean giftbean) {
        //通知适配器刷新视图
        if (giftbean != null) {
            mGiftView.refreshListView(giftbean.getList());
        }
    }
}
