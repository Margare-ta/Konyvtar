package com.example.konyvtar;

public class Books {
    private String Author;
    private String Title;
    private Integer PageInteger;

    public Books(String author, String title, Integer pageInteger) {
        Author = author;
        Title = title;
        PageInteger = pageInteger;
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

    public Integer getPageInteger() {
        return PageInteger;
    }

    public void setPageInteger(Integer pageInteger) {
        PageInteger = pageInteger;
    }
}
