package com.example.administrator.news.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Administrator
 */
public class New {
    @SerializedName("ctime")
    public String time;

    public String title;

    public String description;

    public String picUrl;

    public String url;

}
