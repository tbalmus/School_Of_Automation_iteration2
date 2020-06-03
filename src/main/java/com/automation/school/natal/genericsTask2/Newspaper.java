package com.automation.school.natal.genericsTask2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.util.Objects;

public class Newspaper extends Media {
    private final int pages;
    private int copies;
    private final Logger log = LoggerFactory.getLogger(Newspaper.class);

    public Newspaper(String name, int pages, int copies) {
        super(name);
        this.pages = pages;
        this.copies = copies;
        log.info("New newspaper is created with current issue date");
    }

    public Newspaper(String name, LocalDate issueDate, int pages, int copies) {
        super(name, issueDate);
        this.pages = pages;
        this.copies = copies;
        log.info("New newspaper is created with custom issue date");
    }

    public int getPages() {
        return pages;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Newspaper)) return false;
        Newspaper newspaper = (Newspaper) o;
        return name.equals(newspaper.name) &&
                issueDate.equals(newspaper.issueDate) &&
                pages == newspaper.pages &&
                copies == newspaper.copies;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, issueDate, pages, copies);
    }

    @Override
    public String toString() {
        return "Newspaper \"" + name + "\"" +
                ", issueDate: " + issueDate;
    }

    @Override
    public void issue() {
        log.info("Newspaper was printed");
    }
}
