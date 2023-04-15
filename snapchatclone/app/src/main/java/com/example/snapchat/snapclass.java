package com.example.snapchat;

public class snapclass {
    private int imageface;
    private String name;
    private int imagerecived;
    private String received;
    private String time;


    public static  void setSearchgone(boolean searchgone) {
        searchgone = searchgone;
    }

    public snapclass(int imageface, String name, int imagerecived, String received, String time) {
        this.imageface = imageface;
        this.name = name;
        this.imagerecived = imagerecived;
        this.received = received;
        this.time = time;
    }

    public int getImageface() {
        return imageface;
    }

    public void setImageface(int  imageface) {
        this.imageface = imageface;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImagerecived() {
        return imagerecived;
    }

    public void setImagerecived(int imagerecived) {
        this.imagerecived = imagerecived;
    }

    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
