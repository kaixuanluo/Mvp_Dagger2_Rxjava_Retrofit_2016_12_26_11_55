package com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.presenter;

import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.view.BaseLoadingStatus;

/**
 * 描述说明  <br/>
 * Author : luokaixuan <br/>
 * CreateDate : 2016/12/26 18:23 <br/>
 * Modified : luokaixuan <br/>
 * ModifiedDate : 2016/12/26 18:23 <br/>
 * Email : 1005949566@qq.com <br/>
 * Version 1.0
 */
public class BaseListPresenter<DATA> extends BaseLoadingPresenter<DATA> {

    public BaseListPresenter(BaseLoadingStatus<DATA> baseLoadingStatus) {
        super(baseLoadingStatus);
    }
}
