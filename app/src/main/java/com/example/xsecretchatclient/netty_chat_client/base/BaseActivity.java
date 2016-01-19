package com.example.xsecretchatclient.netty_chat_client.base;


import com.example.xsecretchatclient.netty_chat_client.autowire.AndroidAutowire;
import com.example.xsecretchatclient.netty_chat_client.autowire.AndroidView;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by password on 16-1-19.
 * Description TODO
 */
public class BaseActivity extends FragmentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        // 设置自动绑定ViewId和View功能
        AndroidAutowire.autowire(getWindow().getDecorView(), this);
    }
}
