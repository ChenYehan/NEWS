package com.example.administrator.news.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Administrator
 */
public class NewsList {
    public int code;

    public String msg;

    @SerializedName("newslist")
    public List<New> newsList ;

}
