package com.automation.school.nluchian.CollectionTask;

import java.util.Random;

public abstract class AbstractUser {
    public long id;
    public final String userName;

    public AbstractUser(String userName) {
        this.userName = userName;
        this.id = new Random().nextLong();
    }
}
