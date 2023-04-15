package com.example.mylibarary;

public class Books {
    private int id;
    private int pages;
    private  int images;
    private  String name,author,shortDesc;
    private  boolean expand;

    public Books(int id, int pages, int images, String name, String author, String shortDesc) {
        this.id = id;
        this.pages = pages;
        this.images = images;
        this.name = name;
        this.author = author;
        this.shortDesc = shortDesc;

        this.expand=false;
    }

    public Books(boolean expand) {
        this.expand = expand;
    }

    public boolean isExpand() {
        return expand;
    }

    public void setExpand(boolean expand) {
        this.expand = expand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }


}
