package com.automation.school.natal.genericsTask2;

import java.time.LocalDate;
import java.util.Objects;

public class Video extends Media {
    private final double lengthMinutes;

    public Video(String name, double lengthMinutes) {
        super(name);
        this.lengthMinutes = lengthMinutes;
    }

    public Video(String name, LocalDate issueDate, double lengthMinutes) {
        super(name, issueDate);
        this.lengthMinutes = lengthMinutes;
    }

    public double getLengthMinutes() {
        return lengthMinutes;
    }

    @Override
    public String toString() {
        return "Video \"" +
                name + "\"" +
                ", issueDate: " + issueDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Video)) return false;
        Video video = (Video) o;
        return video.lengthMinutes == lengthMinutes &&
                video.name.equals(name)
                && video.issueDate.equals(issueDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lengthMinutes, name, issueDate);
    }


    @Override
    public void issue() {
        System.out.println("Video was shown on TV");

    }
}
