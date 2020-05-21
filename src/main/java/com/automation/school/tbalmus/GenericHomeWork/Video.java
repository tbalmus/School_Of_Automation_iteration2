package com.automation.school.tbalmus.GenericHomeWork;

public class Video extends Media {
    String type;
    String title;
    int duration;


    public Video ( int id , String type, String title, int duration ) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.duration = duration;
    }

    @Override
    public String toString () {
        return "Video{" +
                "type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", id=" + id +
                '}' + "\n";
    }
}
