package com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.R;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.rx.RxFragment;

/**
 * 描述说明  <br/>
 * Author : luokaixuan <br/>
 * CreateDate : 2016/12/28 13:45 <br/>
 * Modified : luokaixuan <br/>
 * ModifiedDate : 2016/12/28 13:45 <br/>
 * Email : 1005949566@qq.com <br/>
 * Version 1.0
 */
public class BaseSwipeFragment extends RxFragment {

    private SwipeRefreshLayout mSrl;

    protected SwipeRefreshLayout getSrl() {
        return mSrl;
    }

    protected void setSwipeRefreshListener(OnRefreshListener onRefreshListener) {
        if (mSrl != null) {
            mSrl.setOnRefreshListener(onRefreshListener);
        }
    }

    private View addSwipeRefreshView(LayoutInflater inflater, @Nullable ViewGroup container
            , @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.swipe_refresh, container, false);
        mSrl = (SwipeRefreshLayout) view.findViewById(R.id.srl);
        mSrl.addView(container);
        return view;
    }

    protected void setRefreshEnable(SwipeRefreshLayout srl, boolean refreshEnable) {
        if (srl != null) {
            srl.setEnabled(refreshEnable);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View swipeRefreshView = addSwipeRefreshView(inflater, container, savedInstanceState);
        return super.onCreateView(inflater, (ViewGroup) swipeRefreshView, savedInstanceState);
    }
}
