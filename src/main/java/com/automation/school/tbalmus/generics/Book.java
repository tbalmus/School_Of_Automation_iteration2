package com.automation.school.tbalmus.generics;

public class Book extends Media {

    String bookTitle;
    String authorName;


    public Book ( int id, String bookTitle , String authorName, double price ) {
        this.id = id;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
    }

    public boolean authorBeginsWithCertainLetter ( char letter){
        char first = this.authorName.charAt (0);
        if ( first == letter){
            return true;
        }
            return false;
    }

    public static void add ( Book addNewBook ) {
    }

    @Override
    public String toString () {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", authorName='" + authorName + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}