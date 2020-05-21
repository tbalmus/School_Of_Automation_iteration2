package com.automation.school.nluchian.Generics;

public class Video {
    String videoGenre;
    long year;

    public Video(String videoGenre, long year) {
        this.videoGenre = videoGenre;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Video{" +
                "videoGenre='" + videoGenre + '\'' +
                ", year=" + year +
                '}';
    }
}
