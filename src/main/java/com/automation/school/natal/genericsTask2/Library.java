package com.automation.school.natal.genericsTask2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Media> {
    private String name;
    private final List<T> storage;
    private final Logger log = LoggerFactory.getLogger(Library.class);

    public Library(String name) {
        this.name = name;
        this.storage = new ArrayList<>();
        log.info("New library is created with empty storage");
    }

    public Library(String name, List<T> storage) {
        this.name = name;
        this.storage = storage;
        log.info("New library is created with preset storage");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<T> getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return "Library \"" +
                name + '"';
    }

    public void storeMedia(T media) {
        storage.add(media);
        log.info(("To " + this.toString() + "new media was added"), media);
    }

    public void retrieveMedia(String name) {
        for (T media : storage) {
            if (media.name.equals(name)) {
                storage.remove(media);
                log.info(("From " + this.toString() + " was retrieved"), media);
                break;
            }
        }
        log.info("Item with" + '\"' + name + '\"' + " could not be found in " + this.toString());
    }

    public void retrieveMedia(T media) {
        for (T med : storage) {
            if (med.equals(media)) {
                storage.remove(med);
                log.info(("From " + this.toString() + " was retrieved"), media);
                break;
            }
        }
        log.info("Following item could not be found in " + this.toString(),media);
    }

    public void retrieveMedia(List<T> library) {
        library.clear();
        log.info("All items were retrieved from "+this.toString());
    }


}
