package com.example.googlebooks.RecycleView;

public class BookInfo {
    private String title;
    private String publisher;
    private String publishedDate;
    private int pageCount;
    private int Image;


    public BookInfo(String title, String publisher, String publishedDate, int pageCount, int image) {
        this.title = title;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
        this.pageCount = pageCount;
        Image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getImage() {
        return Image;
    }
}