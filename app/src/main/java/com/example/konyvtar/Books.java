package com.example.konyvtar;

public class Books {
    private String Author;
    private String Title;
    private Number PageNumber;

    public Books(String author, String title, Number pageNumber) {
        Author = author;
        Title = title;
        PageNumber = pageNumber;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Number getPageNumber() {
        return PageNumber;
    }

    public void setPageNumber(Number pageNumber) {
        PageNumber = pageNumber;
    }
}
