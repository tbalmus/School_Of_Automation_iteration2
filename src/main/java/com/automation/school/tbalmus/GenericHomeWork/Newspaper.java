package com.automation.school.tbalmus.GenericHomeWork;

public class Newspaper extends Media {

    String name;

    public Newspaper ( int id , String name ) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString () {
        return "Newspaper{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}' + "\n";
    }
}

