package com.automation.school.nluchian.CollectionTask;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserOrder implements Order {
    public long id;
    public LocalDateTime date;
    public User user;
    public List<Item> items;

    public UserOrder(User user, Item item) {
        this.id = new Random().nextLong();
        this.date = LocalDateTime.now();
        this.user = user;
        this.items = new ArrayList<>();
        items.add(item);
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", user=" + user +
                ", items=" + items +
                '}';
    }

    public void addItem(Item item) {
        this.items.add(item);
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
    public int LocalDateTime() {
        return 0;
    }
}
