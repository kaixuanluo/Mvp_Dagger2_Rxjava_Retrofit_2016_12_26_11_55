package com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.rx;

import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.presenter.BaseLoadingPresenter;

/**
 * 描述说明  <br/>
 * Author : luokaixuan <br/>
 * CreateDate : 2016/12/28 18:55 <br/>
 * Modified : luokaixuan <br/>
 * ModifiedDate : 2016/12/28 18:55 <br/>
 * Email : 1005949566@qq.com <br/>
 * Version 1.0
 */
public class BaseLoadingSubscriber<T> extends BaseSubscriber<T> {

    BaseLoadingPresenter<T> mBaseLoadingPresenter;

    public BaseLoadingSubscriber(BaseLoadingPresenter<T> baseLoadingPresenter) {
        this.mBaseLoadingPresenter = baseLoadingPresenter;
    }


    @Override
    public void onCompleted() {
        mBaseLoadingPresenter.complete();
    }

    @Override
    public void onError(Throwable e) {
        mBaseLoadingPresenter.error(e.getMessage());
    }

    @Override
    public void onNext(T t) {
        mBaseLoadingPresenter.success(t);
    }
}
