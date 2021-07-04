package com.company;

import java.util.Comparator;

public class Book implements Comparable<Book> {
    private int pageNumber;
    private String name;
    private String author;
    private String date;


    public Book(int pageNumber, String name, String author, String date) {
        this.pageNumber = pageNumber;
        this.name = name;
        this.author = author;
        this.date = date;
    }

    @Override
    public int compareTo(Book o) {
        if (this.getPageNumber() > o.getPageNumber()) {
            return 1;
        } else {
            return -1;
        }
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
