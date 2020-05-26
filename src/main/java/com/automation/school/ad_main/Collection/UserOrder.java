package com.automation.school.ad_main.Collection;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class UserOrder implements Order {

    private Long userOrderId; //(generate automatically in constructor )
    public static long userCurrentOrderId =0;
    public LocalDateTime date; //(set as current day directly in constructor)
    public User user;
    public List<Item> itemsUser;
    private static int nextUniqueId = 0;


    public UserOrder() {
        userCurrentOrderId++;

        this.date = LocalDateTime.now();
        this.itemsUser = new LinkedList<>();
    }


    @Override
    public double sum() {
        return 0;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public LocalDateTime date() {
        return null;
    }

    public void registrationUser(User user) {
        this.userOrderId = new IdGenerator().set(UserOrder.userCurrentOrderId);
        this.user = user;

    }

    public void addItem(Item items) {
       this.itemsUser.add(items);
    }

    @Override
    public String toString() {
        return "UserOrder{" +
                "id=" + userOrderId +
                ", date=" + date +
                ", user=" + user +
                ", items=" + itemsUser +
                '}';
    }

}




