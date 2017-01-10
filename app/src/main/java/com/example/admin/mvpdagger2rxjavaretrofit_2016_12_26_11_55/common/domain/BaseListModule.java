package com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.domain;

import java.util.List;

/**
 * 描述说明  <br/>
 * Author : luokaixuan <br/>
 * CreateDate : 2016/10/11 17:08 <br/>
 * Modified : luokaixuan <br/>
 * ModifiedDate : 2016/10/11 17:08 <br/>
 * Email : 1005949566@qq.com <br/>
 * Version 1.0
 */
public abstract class BaseListModule<ITEM> extends BaseModule {

    public abstract List<ITEM> getList();

}

