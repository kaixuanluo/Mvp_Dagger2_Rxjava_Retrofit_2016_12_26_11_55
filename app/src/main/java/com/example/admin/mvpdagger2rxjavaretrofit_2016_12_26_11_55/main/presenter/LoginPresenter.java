package com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.main.presenter;

import android.util.Log;

import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.presenter.BaseLoadingPresenter;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.rx.BaseLoadingSubscriber;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.view.BaseLoadingStatus;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.domain.response.LoginResult;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 描述说明  <br/>
 * Author : luokaixuan <br/>
 * CreateDate : 2016/12/28 11:32 <br/>
 * Modified : luokaixuan <br/>
 * ModifiedDate : 2016/12/28 11:32 <br/>
 * Email : 1005949566@qq.com <br/>
 * Version 1.0
 */
public class LoginPresenter<DATA extends LoginResult> extends BaseLoadingPresenter<DATA> {

    public LoginPresenter(BaseLoadingStatus<DATA> baseLoadingStatus) {
        super(baseLoadingStatus);
    }

    @Override
    public void loadData() {
        super.loadData();
        login();
    }

    private void login() {
        Log.e(" login service " ," service " + mLoginApiService);
        if (mLoginApiService == null) {
            error(" mLoginApiService is null");
            return;
        }
        Observable<LoginResult> loginResultObservable = mLoginApiService.login("admin",
                "21232f297a57a5a743894a0e4a801fc3");

        loginResultObservable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new <DATA>MySubscriber(this));
    }

    private class MySubscriber<DATA> extends BaseLoadingSubscriber<DATA> {

        public MySubscriber(BaseLoadingPresenter<DATA> basePresenter) {
            super(basePresenter);
        }

    }
}
