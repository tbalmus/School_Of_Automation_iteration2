package com.automation.school.tbalmus.OOPHomeWork;

import java.util.Random;

public abstract class AbstractUser {
    private final String username;
    private long id;


    public AbstractUser ( String username ) {
        this.username = username;
        this.id = new Random ( ).nextLong ( );
    }

    public String getUsername () {
        return username;
    }

    public long getId () {
        return id;
    }

    public void setId ( long id ) {
        this.id = id;
    }
}
