package com.automation.school.tbalmus.generics;

public class Video extends Media {
    String type;
    String title;
    int duration;


    public Video ( int id , String type , String title , int duration , double price ) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.duration = duration;
        this.price = price;
    }

    public boolean isLongVideo () {
        if (this.getDuration () > 110) {
            return true;
        }
        return false;
    }

    public String getType () {
        return type;
    }

    public String getTitle () {
        return title;
    }

    public int getDuration () {
        return duration;
    }

    @Override
    public String toString () {
        return "Video{" +
                "type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
