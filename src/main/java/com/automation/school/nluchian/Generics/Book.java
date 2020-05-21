package com.automation.school.nluchian.Generics;

public class Book {
    String name;
    String genre;
    int id;


    public Book(String name, String genre, int id) {
        this.name = name;
        this.genre = genre;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", id=" + id +
                '}';
    }
}
