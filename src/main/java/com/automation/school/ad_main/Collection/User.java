package com.automation.school.ad_main.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class User {
    public long userCurrentId =0;
    private long userId;
    private String userName = null;
    public Map<String,Address> addresses; //(i.e. Key= "Home", Value = Address)


    public User() {
        userCurrentId++;
        this.addresses = new HashMap<>();

    }
    public void createUser(String userName) {
        this.userName = userName;
        this.userId = new IdGenerator().set(userCurrentId);
    }
    public void addAddress(String type, Address address) {
        this.addresses.put(type, address);
    }
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}
