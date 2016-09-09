package com.king1033.mvp_network_demo.modle.impl;

import com.king1033.mvp_network_demo.bean.GiftBean;
import com.king1033.mvp_network_demo.http.HttpUtils;
import com.king1033.mvp_network_demo.modle.IModle;
import com.king1033.mvp_network_demo.presenter.IPresenter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * @Author:king1033
 * @Desc:Module层的实现
 * @Time:2016/9/9
 */
public class ModleImpl implements IModle {

    @Override
    public void queryGiftList(int pageno, final IPresenter.Callback callback) {
//        /**
//         * retrofit2的使用
//         */
//        HttpUtils.create().queryGift(pageno).enqueue(new Callback<GiftBean>() {
//            @Override
//            public void onResponse(Call<GiftBean> call, Response<GiftBean> response) {
//                callback.success(response.body());
//            }
//
//            @Override
//            public void onFailure(Call<GiftBean> call, Throwable t) {
//
//            }
//        });
        /**
         * RxJava的使用
         */
        HttpUtils.create().queryGift2(pageno)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<GiftBean>() {
                    @Override
                    public void call(GiftBean giftBean) {
                        callback.success(giftBean);
                    }
                });
    }
}
