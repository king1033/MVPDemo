package com.king1033.mvpdemo.model;

/**
 * @Author:king1033
 * @Desc:
 * @Time:2016/9/7
 */
public class CustomModel implements IUserModel {

    private String getLiName(){
        return "lisi";
    }
    @Override
    public String getName() {
        return getLiName();
    }
}
