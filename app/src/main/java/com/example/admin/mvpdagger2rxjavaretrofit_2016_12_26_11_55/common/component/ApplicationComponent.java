package com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.component;

import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.module.ApplicationModule;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.module.BaseApiServiceModule;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.presenter.BasePresenter;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.view.BaseActivity;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.view.BaseFragment;

import javax.inject.Singleton;

import dagger.Component;

/**
 * 描述说明  <br/>
 * Author : luokaixuan <br/>
 * CreateDate : 2016/12/28 11:17 <br/>
 * Modified : luokaixuan <br/>
 * ModifiedDate : 2016/12/28 11:17 <br/>
 * Email : 1005949566@qq.com <br/>
 * Version 1.0
 */
@Singleton
@Component(modules = {ApplicationModule.class, BaseApiServiceModule.class})
public interface ApplicationComponent {
    void inject(BasePresenter presenter);

    void inject(BaseActivity activity);

    void inject(BaseFragment fragment);

}
