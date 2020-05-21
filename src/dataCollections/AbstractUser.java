package dataCollections;

import java.util.*;

abstract public class AbstractUser {
    private long id;
    private final String userName;


    public AbstractUser(String userName) {
        do {
            long rand=new Random().nextLong();
                if (rand>0)
                    this.id =rand ;
        }
        while (this.id<=0);
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
