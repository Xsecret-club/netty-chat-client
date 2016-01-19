package com.example.xsecretchatclient.netty_chat_client;

import com.example.xsecretchatclient.netty_chat_client.base.BaseActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by pxl on 16-1-19.
 * Description TODO
 */
public class MainActivity extends BaseActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void start(Context context){
        Intent intent=new Intent();
        intent.setClass(context,MainActivity.class);
        context.startActivity(intent);
    }
}
