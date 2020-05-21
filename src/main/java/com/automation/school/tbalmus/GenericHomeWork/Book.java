package com.automation.school.tbalmus.GenericHomeWork;

public class Book extends Media {

    String bookTitle;
    String authorName;


    public Book ( int id, String bookTitle , String authorName ) {
        this.id = id;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
    }

    public static void add ( Book addNewBook ) {
    }

    @Override
    public String toString () {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", authorName='" + authorName + '\'' +
                ", id=" + id +
                '}' + "\n";
    }
}