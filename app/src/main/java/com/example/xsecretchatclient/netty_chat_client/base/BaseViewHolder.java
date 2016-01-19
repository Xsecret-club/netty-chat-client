package com.example.xsecretchatclient.netty_chat_client.base;

import com.example.xsecretchatclient.netty_chat_client.autowire.AndroidAutowire;

import android.view.View;

/**
 * ViewHolder的基类，提供AndroidView自动绑定的功能
 */
public class BaseViewHolder {

  /**
   * 构造函数
   * 
   * @param root root view
   */
  public BaseViewHolder(View root) {
    AndroidAutowire.autowire(root, this);
  }

}
