package com.automation.school.ad_main.Generic.OfflineLibrary;

import java.util.ArrayList;
import java.util.List;

public class BooksLibrary {

    private List<Book> booksLibrary;

    public BooksLibrary () {
        this.booksLibrary = new ArrayList<>();
    }

 public void addAnItem (Book b) {
    booksLibrary.add(b);
    System.out.println(b.name + " was successfully added to the storage  booksLibrary");
}

     public Object removeAnItem(int index) {
        return  booksLibrary.remove(index);


    }

    public List<Book> getBookFromLibrary(String name) {
        for (Book b  : booksLibrary)
                if  (b.name.equals(name))
                    System.out.println(b + " was retrieved");
        return booksLibrary;
    }




    @Override
    public String toString() {
        return "BooksLibrary{" +
                "booksLibrary=" + booksLibrary +
                '}';
    }
}
