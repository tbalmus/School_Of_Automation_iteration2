package com.automation.school.nluchian.Generics;

import java.util.ArrayList;
import java.util.List;

public class Library<T> {

    private List<T> storage;

    public Library() {
        this.storage = new ArrayList<>();
    }

    void addItem(T item) {
        storage.add(item);
    }

//              just an example
//    T getElementByIndex(int index) {
//        return storage.get(index);
//    }

    public List<T> getStorage() {
        return storage;
    }

    void removeItem (T item){
        storage.remove(item);
    }

    @Override
    public String toString() {
        return "Library{" +
                "storage=" + storage +
                '}';
    }
}

