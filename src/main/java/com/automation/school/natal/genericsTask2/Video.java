package com.automation.school.natal.genericsTask2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.util.Objects;

public class Video extends Media {
    private final double lengthMinutes;
    private final Logger log= LoggerFactory.getLogger(Video.class);

    public Video(String name, double lengthMinutes) {
        super(name);
        this.lengthMinutes = lengthMinutes;
        log.info("New video is created with current issue date");
    }

    public Video(String name, LocalDate issueDate, double lengthMinutes) {
        super(name, issueDate);
        this.lengthMinutes = lengthMinutes;
        log.info("New video is created with custom issue date");
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
        log.info("Video was shown on TV");

    }
}
