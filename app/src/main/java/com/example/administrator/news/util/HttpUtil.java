package com.example.administrator.news.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @author Administrator
 * get的异步请求
 * 不用再次开启子线程，但回调方法是执行在子线程中，所以在更新UI时还要跳转到UI线程中。
 */
public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();  //创建OkHttpClient对象
        Request request=new Request.Builder()
                .url(address)   //请求接口。如果需要传参拼接到接口后面
                .get()
                .build();       //创建Request 对象
        client.newCall(request).enqueue(callback);      //跳转至子线程，实现onFailure(),onResponse()
    }
}
