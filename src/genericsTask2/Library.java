package genericsTask2;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Media> {
    private String name;
    private final List<T> storage;

    public Library(String name) {
        this.name = name;
        this.storage = new ArrayList<>();
    }

    public Library(String name, List<T> storage) {
        this.name = name;
        this.storage = storage;
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
        System.out.println(media + " was successfully added to the storage " + name);
    }

    public void retrieveMedia(String name) {
        for (T media : storage)
            if (media.name.equals(name)) {
                storage.remove(media);
                System.out.println(media + " was retrieved");
                break;
            }
    }

    public void retrieveMedia(T media) {
        for (T med : storage)
            if (med.equals(media)) {
                storage.remove(med);
                System.out.println(media + " was retrieved");
                break;
            }
    }

    public void retrieveMedia(List<T> library) {
        library.clear();
        System.out.println("All media was retrieved");
    }


}
