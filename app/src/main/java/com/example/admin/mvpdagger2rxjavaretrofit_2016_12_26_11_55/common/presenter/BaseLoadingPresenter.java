package com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.presenter;

import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.view.BaseLoadingStatus;

/**
 * 描述说明  <br/>
 * Author : luokaixuan <br/>
 * CreateDate : 2016/12/26 18:23 <br/>
 * Modified : luokaixuan <br/>
 * ModifiedDate : 2016/12/26 18:23 <br/>
 * Email : 1005949566@qq.com <br/>
 * Version 1.0
 */
public class BaseLoadingPresenter<DATA> extends BasePresenter
        implements BaseLoadingStatus<DATA>{

    BaseLoadingStatus<DATA> mBaseLoadingStatus;

    public BaseLoadingPresenter(BaseLoadingStatus<DATA> baseLoadingStatus) {
        this.mBaseLoadingStatus = baseLoadingStatus;
    }

    @Override
    public void loadData() {
        mBaseLoadingStatus.loadData();
    }

    @Override
    public void startLoad() {
        mBaseLoadingStatus.startLoad();
    }

    @Override
    public void loading() {
        mBaseLoadingStatus.loading();
    }

    @Override
    public void success(DATA data) {
        mBaseLoadingStatus.success(data);
    }

    @Override
    public void failure(int code, String msg) {
        mBaseLoadingStatus.failure(code, msg);
    }

    @Override
    public void error(String msg) {
        mBaseLoadingStatus.error(msg);
    }

    @Override
    public void complete() {
        mBaseLoadingStatus.complete();
    }

    @Override
    public void reLoad() {
        mBaseLoadingStatus.reLoad();
    }

    @Override
    public void offLine() {
        mBaseLoadingStatus.offLine();
    }

    @Override
    public void unLogin() {
        mBaseLoadingStatus.unLogin();
    }
}
