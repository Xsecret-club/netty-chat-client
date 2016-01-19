package com.example.xsecretchatclient.netty_chat_client.login;

import com.example.xsecretchatclient.netty_chat_client.MainActivity;
import com.example.xsecretchatclient.netty_chat_client.R;
import com.example.xsecretchatclient.netty_chat_client.autowire.AndroidView;
import com.example.xsecretchatclient.netty_chat_client.base.BaseActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends BaseActivity {

    /**
     * 登录按钮
     */
    @AndroidView(R.id.bt_login)
    private Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        setListener();
    }

    private void initView() {

    }

    private void setListener() {
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.start(LoginActivity.this);
            }
        });
    }
}
