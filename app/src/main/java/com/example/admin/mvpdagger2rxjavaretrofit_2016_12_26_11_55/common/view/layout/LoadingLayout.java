package com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.view.layout;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.R;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.view.BaseLoadingStatus;

/**
 * 描述说明  <br/>
 * Author : luokaixuan <br/>
 * CreateDate : 2016/10/12 15:12 <br/>
 * Modified : luokaixuan <br/>
 * ModifiedDate : 2016/10/12 15:12 <br/>
 * Email : 1005949566@qq.com <br/>
 * Version 1.0
 */
public class LoadingLayout<DATA> extends FrameLayout implements BaseLoadingStatus<DATA> {

    FixedFlipper mFlp;
    TextView mTvError;
    LinearLayout mLlError;
    int CONTENT = 0 ;
    int ERROR = 1;
    int EMPTY = 2;
    int LOADING = 3;
    public LoadingLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        mFlp = (FixedFlipper) findViewById(R.id.flp);
        mTvError = (TextView) findViewById(R.id.load_error_tv);
        mLlError = (LinearLayout) findViewById(R.id.load_error_ll);
        mLlError.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                reLoad();
            }
        });
        ImageView ivLoading = (ImageView) findViewById(R.id.loading_iv);
        AnimationDrawable loadingDrawable = (AnimationDrawable) ivLoading.getDrawable();
        loadingDrawable.start();
    }

    void showError(String msg) {
        mFlp.setDisplayedChild(ERROR);
        mTvError.setText(msg);
    }

    void showFailure(int code, String msg) {
        mFlp.setDisplayedChild(ERROR);
        mTvError.setText("code : " + code + " msg: " + msg);
    }

    void showContent() {
        mFlp.setDisplayedChild(CONTENT);
    }

    public void showEmpty() {
        mFlp.setDisplayedChild(EMPTY);
    }

    void showLoading() {
        mFlp.setDisplayedChild(LOADING);
    }

    @Override
    public void success(DATA data) {
        showContent();
    }

    @Override
    public void failure(int code, String msg) {
        showError(msg);
    }

    @Override
    public void error(String msg) {
        showFailure(0, msg);
    }

    @Override
    public void loading() {
        showLoading();
    }

    @Override
    public void complete() {

    }

    @Override
    public void loadData() {
        startLoad();
    }

    @Override
    public void startLoad() {
        showLoading();
    }

    @Override
    public void reLoad() {
        startLoad();
    }

    @Override
    public void offLine() {

    }

    @Override
    public void unLogin() {

    }
}
