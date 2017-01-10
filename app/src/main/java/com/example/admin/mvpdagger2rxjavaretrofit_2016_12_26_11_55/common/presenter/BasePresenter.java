package com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.presenter;

import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.MyApplication;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.main.mainServices.LoginApiService;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.main.email.emailService.MailApiService;

import javax.inject.Inject;

/**
 * 描述说明  <br/>
 * Author : luokaixuan <br/>
 * CreateDate : 2016/12/26 18:23 <br/>
 * Modified : luokaixuan <br/>
 * ModifiedDate : 2016/12/26 18:23 <br/>
 * Email : 1005949566@qq.com <br/>
 * Version 1.0
 */
public class BasePresenter {

    public BasePresenter() {
        MyApplication.getComponent().inject(this);
    }

    @Inject
    protected LoginApiService mLoginApiService;//这个地方不能动，必须放这里
    @Inject
    protected MailApiService mMailApiService;
}
