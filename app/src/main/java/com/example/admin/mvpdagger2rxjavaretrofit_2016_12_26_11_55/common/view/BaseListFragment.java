package com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.view;

import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.domain.BaseLoadingModule;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.presenter.BaseLoadingPresenter;

/**
 * 描述说明  <br/>
 * Author : luokaixuan <br/>
 * CreateDate : 2016/12/27 18:20 <br/>
 * Modified : luokaixuan <br/>
 * ModifiedDate : 2016/12/27 18:20 <br/>
 * Email : 1005949566@qq.com <br/>
 * Version 1.0
 */
public abstract class BaseListFragment<PRST extends BaseLoadingPresenter<DATA>, DATA
        extends BaseLoadingModule> extends BaseLoadingFragment<PRST, DATA>{

}
