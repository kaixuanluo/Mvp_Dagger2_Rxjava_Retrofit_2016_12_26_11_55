package com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.main.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.R;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.view.BaseActivity;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.common.view.BaseLoadingFragment;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.domain.response.LoginResult;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.main.email.view.EmailActivity;
import com.example.admin.mvpdagger2rxjavaretrofit_2016_12_26_11_55.main.presenter.LoginPresenter;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @Override
    public Fragment initFragment() {
        return MainFragment.newInstance();
    }

    public static class MainFragment extends BaseLoadingFragment<LoginPresenter, LoginResult> {

        @Bind(R.id.main_login_bt)
        Button mMainLoginBt;
        @Bind(R.id.activity_main)
        LinearLayout mActivityMain;

        public static MainFragment newInstance() {

            Bundle args = new Bundle();

            MainFragment fragment = new MainFragment();
            fragment.setArguments(args);
            return fragment;
        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                                 @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.activity_main, container, false);
            ButterKnife.bind(view);
            Button btLogin = (Button) view.findViewById(R.id.main_login_bt);
            Button btEmail = (Button) view.findViewById(R.id.main_email_bt);
            btLogin.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    getPresenter().loadData();
                }
            });
            btEmail.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainFragment.this.getActivity(), EmailActivity.class);
                    startActivity(intent);
                }
            });
            return super.onCreateView(inflater, (ViewGroup) view, savedInstanceState);
//            return view;
        }

        @Override
        public LoginPresenter getPresenter() {
            return new LoginPresenter(this);
        }

        @Override
        public void success(LoginResult loginResult) {
            super.success(loginResult);
            Toast.makeText(this.getContext(), loginResult.toString(), Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onDestroyView() {
            super.onDestroyView();
            ButterKnife.unbind(this);
        }

        @OnClick(R.id.main_login_bt)
        public void onClick() {
            getPresenter().loadData();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_setting_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.e("qqq  ", " qqq " + item.getItemId());
        Toast.makeText(this, "qqqqqqq", Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }
}
