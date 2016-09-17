package com.king1033.mvp_network_demo.presenter;

import com.king1033.mvp_network_demo.bean.GiftBean;

/**
 * @Author:king1033
 * @Desc:Presenter层接口
 * @Time:2016/9/7
 */
public interface IPresenter {
    /**
     * @Desc:查询礼包列表
     * @param pageno
     */
    void getGiftList(int pageno);

    /**
     * 接口回调：用于接收网络请求之后的所获取的数据
     */
    interface Callback {
        void success(GiftBean giftbean);
    }

}
