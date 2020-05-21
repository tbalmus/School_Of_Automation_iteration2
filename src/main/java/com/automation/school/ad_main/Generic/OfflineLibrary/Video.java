package com.automation.school.ad_main.Generic.OfflineLibrary;

public class Video {
    private String name;
    private String director;

    public  Video(String name,String director) {
        this.name = name;
        this.director = director;
    }

    public String toString() {
        return "Video name" + name + " directed by " + director;
    }

}
