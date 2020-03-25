package com.example.android.droidcafeinput;

import java.io.Serializable;

public class Recipe implements Serializable {

    private String header;
    private String shortContent;
    private String content;
    private String img;

    public Recipe(String header, String shortContent, String content, String img) {
        this.header = header;
        this.shortContent = shortContent;
        this.content = content;
        this.img = img;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getShortContent() {
        return shortContent;
    }

    public void setShortContent(String shortContent) {
        this.shortContent = shortContent;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "header='" + header + '\'' +
                ", shortContent='" + shortContent + '\'' +
                ", content='" + content + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
