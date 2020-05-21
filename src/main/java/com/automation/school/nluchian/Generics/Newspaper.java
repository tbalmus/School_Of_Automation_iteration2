package com.automation.school.nluchian.Generics;

public class Newspaper {
    String newspaperName;
    int newsPaperDate;

    public Newspaper(String newspaperName, int newsPaperDate) {
        this.newspaperName = newspaperName;
        this.newsPaperDate = newsPaperDate;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "newspaperName='" + newspaperName + '\'' +
                ", newsPaperDate=" + newsPaperDate +
                '}';
    }
}
