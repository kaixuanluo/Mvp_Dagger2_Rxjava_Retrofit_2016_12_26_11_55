package com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.main.email.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.view.BaseActivity;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.view.BaseLoadingFragment;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.domain.response.MailResult;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.main.email.presenter.EmailPresenter;

/**
 * 描述说明  <br/>
 * Author : luokaixuan <br/>
 * CreateDate : 2016/12/28 18:34 <br/>
 * Modified : luokaixuan <br/>
 * ModifiedDate : 2016/12/28 18:34 <br/>
 * Email : 1005949566@qq.com <br/>
 * Version 1.0
 */
public class EmailActivity extends BaseActivity {
    @Override
    public Fragment initFragment() {
        return EmailFragment.newInstance();
    }

    public static class EmailFragment extends BaseLoadingFragment<EmailPresenter<MailResult>, MailResult> {

        public static EmailFragment newInstance() {

            Bundle args = new Bundle();

            EmailFragment fragment = new EmailFragment();
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public EmailPresenter<MailResult> getPresenter() {
            return new EmailPresenter<MailResult>(this);
        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                                 @Nullable Bundle savedInstanceState) {
            return super.onCreateView(inflater, null, savedInstanceState);
        }

        @Override
        public void onActivityCreated(@Nullable Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
            getPresenter().loadData();
        }

        @Override
        public void success(MailResult mailResult) {
            super.success(mailResult);
            Toast.makeText(this.getContext(), mailResult.toString(), Toast.LENGTH_SHORT).show();
        }
    }
}
