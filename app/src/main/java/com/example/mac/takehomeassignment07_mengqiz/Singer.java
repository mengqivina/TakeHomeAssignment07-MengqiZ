package com.example.mac.takehomeassignment07_mengqiz;

/**
 * Created by mac on 3/21/18.
 */

public class Singer {
    private String name;
    private String info;
    private int photoId;

    public Singer(String name, String info, int photoId) {
        this.name = name;
        this.info = info;
        this.photoId = photoId;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public int getPhotoId() {
        return photoId;
    }
}
