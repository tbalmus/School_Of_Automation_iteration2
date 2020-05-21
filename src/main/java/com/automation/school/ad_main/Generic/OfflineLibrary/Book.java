package com.automation.school.ad_main.Generic.OfflineLibrary;

public class Book {
    public String name;
    public String writer;
    public Book(String name,String writer)  {
        this.name = name;
        this.writer = writer;
    }

    public String getName() {
        return name;
    }

    public String getWriter() {
        return writer;
    }

    @Override
    public String toString() { return "Book name: " + name +"is writen by " + writer; }
}
