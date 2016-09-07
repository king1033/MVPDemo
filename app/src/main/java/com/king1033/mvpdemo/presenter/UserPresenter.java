package com.king1033.mvpdemo.presenter;

import com.king1033.mvpdemo.model.CustomModel;
import com.king1033.mvpdemo.model.IUserModel;
import com.king1033.mvpdemo.model.UserModel;
import com.king1033.mvpdemo.view.IUserView;

/**
 * @Author:king1033
 * @Desc:
 * @Time:2016/9/7
 */
public class UserPresenter implements IUserPresenter {
    IUserModel mUserModel = new UserModel();
    //IUserModel mUserModel = new CustomModel();

    IUserView mUserView;

    public UserPresenter(IUserView mUserView) {
        this.mUserView = mUserView;
    }

    @Override
    public void getName() {
        String name = mUserModel.getName();
        if(name.length()>6){
            mUserView.setText(name);
        }else{
            mUserView.setText("无效的字符串");
        }

    }
}
