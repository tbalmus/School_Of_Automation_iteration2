package com.automation.school.natal.genericsTask2;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    private String name;
    private List<Book> storage;

    public BookLibrary(String name) {
        this.name = name;
        this.storage = new ArrayList<>();
    }

    public BookLibrary(String name, List<Book> storage) {
        this.name = name;
        this.storage= new ArrayList<>();
        this.storage.addAll(storage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return "Library \"" +
                name + '"';
    }

    public void storeBook(Book book) {
        storage.add(book);
        System.out.println(book + " was successfully added to the storage " + name);
    }

    public void retrieveBook(String name) {
        for (Book book : storage)
            if (book.name.equals(name)) {
                storage.remove(book);
                System.out.println(book + " was retrieved");
                break;
            }
    }

    public void retrieveBook(Book book) {
        for (Book b: storage)
            if (b.equals(book)) {
                storage.remove(book);
                System.out.println(book + " was retrieved");
                break;
            }
    }

    public void retrieveBook(List<Book> library) {
        library.clear();
        System.out.println("All media was retrieved");
    }

}
