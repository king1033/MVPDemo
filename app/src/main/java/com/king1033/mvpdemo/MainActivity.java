package com.king1033.mvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.king1033.mvpdemo.presenter.UserPresenter;
import com.king1033.mvpdemo.view.IUserView;

public class MainActivity extends AppCompatActivity implements IUserView{

    private UserPresenter mUserPresenter;
    private TextView mShowText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUserPresenter = new UserPresenter(this);
        mShowText = (TextView) findViewById(R.id.mvp_show_txt);
    }

    @Override
    public void setText(String name) {
        mShowText.setText(name);
    }

    public void click(View view){
        mUserPresenter.getName();
    }
}
