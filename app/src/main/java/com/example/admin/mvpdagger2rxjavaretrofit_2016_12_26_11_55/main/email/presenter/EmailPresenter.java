package com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.main.email.presenter;

import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.presenter.BaseLoadingPresenter;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.rx.BaseLoadingSubscriber;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.view.BaseLoadingStatus;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.domain.response.MailResult;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 描述说明  <br/>
 * Author : luokaixuan <br/>
 * CreateDate : 2016/12/28 18:35 <br/>
 * Modified : luokaixuan <br/>
 * ModifiedDate : 2016/12/28 18:35 <br/>
 * Email : 1005949566@qq.com <br/>
 * Version 1.0
 */
public class EmailPresenter<DATA extends MailResult> extends BaseLoadingPresenter<DATA> {

    public EmailPresenter(BaseLoadingStatus<DATA> baseLoadingStatus) {
        super(baseLoadingStatus);
    }

    @Override
    public void loadData() {
        super.loadData();
        getMailList();
    }

    private void getMailList() {
        rx.Observable<MailResult> mailResultObservable = mMailApiService.mailList(0 + "", 20);
        mailResultObservable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new <DATA>MailScriber(this));
    }

    private class MailScriber<DATA> extends BaseLoadingSubscriber<DATA> {

        public MailScriber(BaseLoadingPresenter<DATA> baseLoadingPresenter) {
            super(baseLoadingPresenter);
        }
    }
}
