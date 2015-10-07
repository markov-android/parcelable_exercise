package com.mobileapps.cake;

/**
 * Created by Exchange on 10/7/2015.
 */
public class Cake {
    int id;
    String title, desc, image;
    public Cake() {

    }

    public Cake(int id, String title, String desc, String image) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getImage() {
        return image;
    }
}
