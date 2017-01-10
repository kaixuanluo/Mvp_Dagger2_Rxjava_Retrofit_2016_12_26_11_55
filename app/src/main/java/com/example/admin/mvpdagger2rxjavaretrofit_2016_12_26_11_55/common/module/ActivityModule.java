package com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.module;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Arron on 16/7/25.
 */
@PerActivity
@Module
public class ActivityModule {
    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @PerActivity
    protected Activity provideActivity() {
        return this.activity;
    }
}
