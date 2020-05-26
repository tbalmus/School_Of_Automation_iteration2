package com.automation.school.ad_main.Collection;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class UserOrder implements Order {
    private Long userOrderId; //(generate automatically in constructor )
    public static long userCurrentOrderId = 0;
    public LocalDateTime date; //(set as current day directly in constructor)
    public User user;
    public List<Item> itemsUser;

    public UserOrder() {
        userCurrentOrderId++;
        this.date = LocalDateTime.now();
        this.itemsUser = new LinkedList<>();
    }


    @Override
    public double sum(double price) {
        double[] arr = {price};
        double total = 0;
        for (double v : arr) {
            total = total + v;
        }
        return total;
    }

    public void registrationUser(User user) {
        this.userOrderId = new IdGenerator().set(UserOrder.userCurrentOrderId);
        this.user = user;
    }

    public void addItem(Item items) {
         itemsUser.add(items);
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




