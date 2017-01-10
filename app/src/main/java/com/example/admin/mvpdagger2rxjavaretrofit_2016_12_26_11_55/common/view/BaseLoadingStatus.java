package com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.view;

/**
 * 描述说明  <br/>
 * Author : luokaixuan <br/>
 * CreateDate : 2016/12/26 18:14 <br/>
 * Modified : luokaixuan <br/>
 * ModifiedDate : 2016/12/26 18:14 <br/>
 * Email : 1005949566@qq.com <br/>
 * Version 1.0
 */
public interface BaseLoadingStatus<T> {
    void loadData();//加载数据
    void startLoad();//开始加载
    void loading();//加载中
    void success(T data);//加载成功
    void failure(int code, String msg);//加载失败
    void error(String msg);//发生错误
    void complete();//加载完成
    void reLoad();//重新加载
    void offLine();//掉线
    void unLogin();//未登陆
}
