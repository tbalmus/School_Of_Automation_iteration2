package com.automation.school.ad_main.Generic.OfflineLibrary;


import java.util.ArrayList;
import java.util.List;

public class GenericLibrary<T> {


    private List<T> libraryStorage;

    public GenericLibrary() {
        this.libraryStorage = new ArrayList<>();
    }

    void addAnItem(T element) {
        libraryStorage.add(element);
    }


    T removeAnItem(int index) {
        return libraryStorage.remove(index);
    }


    public void printAll() {

        for (Object element : this.libraryStorage) {
            System.out.println(element);
        }
    }


    public String toString(T element) {
        return element + " " + element;
    }

}

