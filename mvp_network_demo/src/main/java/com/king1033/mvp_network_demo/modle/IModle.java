package com.king1033.mvp_network_demo.modle;

import com.king1033.mvp_network_demo.presenter.IPresenter;

/**
 * @Author:king1033
 * @Desc:Modle层接口
 * @Time:2016/9/7
 */
public interface IModle {
    /**
     * 查询礼包列表
     * @param pageno
     * @param callback
     */
    void queryGiftList(int pageno, IPresenter.Callback callback);
}
