package com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.R;

import static com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.R.id.toolbar;

/**
 * 描述说明  <br/>
 * Author : luokaixuan <br/>
 * CreateDate : 2016/12/28 12:09 <br/>
 * Modified : luokaixuan <br/>
 * ModifiedDate : 2016/12/28 12:09 <br/>
 * Email : 1005949566@qq.com <br/>
 * Version 1.0
 */
public class BaseToolbarFragment extends BaseFragment {

    TextView mToolbarTvTitle;
    Toolbar mToolBar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View source = addTitleBar(inflater, container, savedInstanceState);
        mToolbarTvTitle = (TextView) source.findViewById(R.id.toolbar_tv_title);
        mToolbarTvTitle.setText(getActivity().getTitle());
        return source;
    }

    private View addTitleBar(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View toolBarView = inflater.inflate(R.layout.app_bar_main, container, false);
        FrameLayout cl = (FrameLayout) toolBarView.findViewById(R.id.cl_fl);
        cl.addView(container);

        mToolBar = (Toolbar) toolBarView.findViewById(toolbar);

        AppCompatActivity activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(mToolBar);

        ActionBar supportActionBar = activity.getSupportActionBar();
        supportActionBar.setDisplayHomeAsUpEnabled(true);

        return toolBarView;
    }

    protected void setToolBarVisiblity(int visiblity) {
        if (mToolBar != null) {
            mToolBar.setVisibility(visiblity);
        }
    }
}
