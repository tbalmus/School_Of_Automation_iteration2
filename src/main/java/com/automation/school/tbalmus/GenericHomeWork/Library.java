package com.automation.school.tbalmus.GenericHomeWork;

import java.util.ArrayList;
import java.util.List;

public class Library< T > {
    private String name;
    private List < T > storage;

    public Library ( String name ) {
        this.name = name;
        this.storage = new ArrayList < T > ( );
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public void setStorage ( List < T > storage ) {
        this.storage = storage;
    }

    public String getName () {
        return name;
    }

    public List < T > getStorage () {
        return storage;
    }

    public void printItems () {
        for (T abc : storage) {
            System.out.println ( abc );
        }
    }
    public void addItem(T item){
        storage.add(item);
     }

    @Override
    public String toString () {
        return "Library{" +
                "name='" + name + '\'' +
                ", storage=" + storage +
                '}';
    }


}

