package com.automation.school.nluchian.CollectionTask;

import java.util.HashMap;
import java.util.Map;

public class User extends AbstractUser {
   private Map<String, Address> addresses;

    public User(String userName) {
        super(userName);
        this.addresses = new HashMap<>();
    }

    public Map<String, Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Map<String, Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}
