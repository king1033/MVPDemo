package com.king1033.mvp_network_demo.http;

import com.king1033.mvp_network_demo.bean.GiftBean;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * @Author:king1033
 * @Desc:
 * @Time:2016/9/7
 */
public interface HttpService {
    //网址：http://www.1688wan.com/majax.action?method=getGiftList
    @Deprecated
    @POST("/majax.action?method=getGiftList")
    Call<GiftBean>queryGift(@Query("pageno")int num);

    @POST("/majax.action?method=getGiftList")
    Observable<GiftBean>queryGift2(@Query("pageno")int num);
}
