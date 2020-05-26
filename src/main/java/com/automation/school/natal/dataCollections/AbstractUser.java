package com.automation.school.natal.dataCollections;

import java.util.*;

abstract public class AbstractUser {
    private final long id;
    private final String userName;


    public AbstractUser(String userName) {
        this.id = RandomIdSetter.setRandId();
        this.userName = userName;
    }

    public long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return userName +
                " id=" + id;
    }

    public abstract void logIn();
}
