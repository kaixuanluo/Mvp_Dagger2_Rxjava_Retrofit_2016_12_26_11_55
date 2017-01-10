package com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.R;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.domain.BaseModule;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.presenter.BaseLoadingPresenter;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.view.layout.LoadingLayout;

/**
 * 描述说明  <br/>
 * Author : luokaixuan <br/>
 * CreateDate : 2016/12/26 18:21 <br/>
 * Modified : luokaixuan <br/>
 * ModifiedDate : 2016/12/26 18:21 <br/>
 * Email : 1005949566@qq.com <br/>
 * Version 1.0
 */
public abstract class BaseLoadingFragment<PRST extends BaseLoadingPresenter, DATA extends BaseModule>
        extends BaseSwipeFragment
        implements BaseLoadingStatus<DATA> {

    LoadingLayout mLoadingLayout;

    protected LoadingLayout getLoadingLayout() {
        return mLoadingLayout;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container
            , @Nullable Bundle savedInstanceState) {
        View loadingView = addLoadingView(inflater, container, savedInstanceState);

//        return loadingView;
        return super.onCreateView(inflater, (ViewGroup) loadingView, savedInstanceState);
    }

    /**
     * 添加加载状态。
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    private View addLoadingView(LayoutInflater inflater, @Nullable ViewGroup container
            , @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_loading, container, false);
        mLoadingLayout = (LoadingLayout) view.findViewById(R.id.loading_layout);
        FrameLayout fl = (FrameLayout) view.findViewById(R.id.load_transparent_ll);
        if (container != null && container.getParent()== null) {
            fl.addView(container);
        }
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
//        setRefreshEnable(getSrl(), false);
        setSwipeRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {
                getPresenter().loadData();
            }
        });
    }

    PRST mPresenter;

    public abstract PRST getPresenter();

    @Override
    public void loadData() {
        mLoadingLayout.loadData();
    }

    @Override
    public void startLoad() {
        mLoadingLayout.startLoad();
    }

    @Override
    public void loading() {
        mLoadingLayout.loading();
    }

    @Override
    public void success(DATA data) {
        mLoadingLayout.success(data);
    }

    @Override
    public void failure(int code, String msg) {
        mLoadingLayout.failure(code, msg);
    }

    @Override
    public void error(String msg) {
        mLoadingLayout.error(msg);
    }

    @Override
    public void complete() {
        mLoadingLayout.complete();
    }

    @Override
    public void reLoad() {
        mLoadingLayout.reLoad();
    }

    @Override
    public void offLine() {

    }

    @Override
    public void unLogin() {

    }
}
