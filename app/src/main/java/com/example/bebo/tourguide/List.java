package com.example.bebo.tourguide;

import java.io.Serializable;

public class List implements Serializable {
    String name, info, location;
    int img;

    public List(String loc, String name, int img, String info) {
        this.name = name;
        this.info = info;
        this.img = img;
        this.location = loc;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public int getImg() {
        return img;
    }

    public String getLocation() {
        return location;
    }


}
