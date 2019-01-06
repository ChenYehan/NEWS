package com.example.administrator.news;

/**
 * @author Administrator
 */
public class Title {
    private String title;
    private String descr;
    private String imageUrl;
    private String url;

    public Title(String title, String descr, String imageUrl, String url) {
        this.title = title;
        this.descr = descr;
        this.imageUrl = imageUrl;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public String getDescr() {
        return descr;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getUrl() {
        return url;
    }
}
