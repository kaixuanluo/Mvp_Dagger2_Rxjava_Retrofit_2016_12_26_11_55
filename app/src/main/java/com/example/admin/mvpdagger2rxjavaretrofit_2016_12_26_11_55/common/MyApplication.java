package com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common;

import android.app.Application;
import android.content.Context;

import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.component.ApplicationComponent;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.component.DaggerApplicationComponent;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.module.ApplicationModule;

/**
 * 描述说明  <br/>
 * Author : luokaixuan <br/>
 * CreateDate : 2016/12/28 11:03 <br/>
 * Modified : luokaixuan <br/>
 * ModifiedDate : 2016/12/28 11:03 <br/>
 * Email : 1005949566@qq.com <br/>
 * Version 1.0
 */
public class MyApplication extends Application {

    private static Context mContext;
    private ApplicationComponent mComponent;

    public static MyApplication newInstance() {
        return new MyApplication();
    }

    public static ApplicationComponent getComponent() {
        return ((MyApplication) mContext.getApplicationContext()).mComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
        mComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
    }

    public Context getContext() {
        return mContext;
    }
}
