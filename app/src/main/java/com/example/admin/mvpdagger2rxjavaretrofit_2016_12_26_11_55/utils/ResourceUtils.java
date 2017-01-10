package com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.utils;

import android.graphics.drawable.Drawable;

import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.MyApplication;


/**
 * Created by Arron on 16/7/25.
 */
public class ResourceUtils {
    public static String getString(int id) {
        return MyApplication.newInstance().getContext().getResources().getString(id);
    }

    public static Drawable getDrawable(int id) {
        return MyApplication.newInstance().getContext().getResources().getDrawable(id);
    }

//    public static int getDimen(int dimen) {
//        return MyApplication.newInstance().getContext().getDim
//    }
}
