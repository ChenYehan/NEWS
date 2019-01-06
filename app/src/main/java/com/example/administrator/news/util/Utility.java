package com.example.administrator.news.util;

import com.example.administrator.news.gson.NewsList;
import com.google.gson.Gson;

/**
 * @author Administrator
 */
public class Utility {
    public static NewsList parseJsonWithGson(final String requestText){
        Gson gson=new Gson();
        //将请求得到的数据解析为 NewList 实体类对象
        return gson.fromJson(requestText,NewsList.class);
    }
}
