package com.automation.school.natal.genericsTask2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.util.Objects;

public class Book extends Media {
    private final int pages;
    private final String author;
    private final int edition;
    private int copies;
    private final Logger log= LoggerFactory.getLogger(Book.class);

    public Book(String name, int pages, String author, int edition) {
        super(name);
        this.pages = pages;
        this.author = author;
        this.edition = edition;
        log.info("New book is created with current issue date");
    }

    public Book(String name, LocalDate issueDate, int pages, String author, int edition) {
        super(name, issueDate);
        this.pages = pages;
        this.author = author;
        this.edition = edition;
        log.info("New book is created with custom issue date");
    }

    public int getPages() {
        return pages;
    }


    public String getAuthor() {
        return author;
    }


    public int getEdition() {
        return edition;
    }


    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    @Override
    public String toString() {
        return "Book \"" + name +
                "\", author: " + author +
                ", edition: " + edition
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return name.equals(book.name) &&
                issueDate.equals(book.issueDate) &&
                pages == book.pages &&
                edition == book.edition &&
                copies == book.copies &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pages, author, edition, copies);
    }


    @Override
    public void issue() {
        log.info("Book is issued");

    }
}
