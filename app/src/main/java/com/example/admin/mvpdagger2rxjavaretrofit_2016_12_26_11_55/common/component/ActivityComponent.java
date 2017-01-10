package com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.component;

import android.app.Activity;

import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.module.ActivityModule;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.module.PerActivity;

import dagger.Component;

/**
 * Created by Arron on 16/7/25.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    Activity activity();
}
