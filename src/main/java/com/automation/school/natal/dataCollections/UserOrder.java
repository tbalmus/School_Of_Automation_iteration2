package com.automation.school.natal.dataCollections;

import java.time.*;
import java.util.List;


public class UserOrder implements Order {
    private final long id;
    private final LocalDateTime date;
    private final User user;
    private final List<Item> items;
    private OrderStatus status;

    public UserOrder(User user, List<Item> items) {
        this.id = RandomIdSetter.setRandId();
        this.date = LocalDateTime.now();
        this.user = user;
        this.items = items;
        this.status = OrderStatus.CREATED;
    }

    @Override
    public String toString() {
        return "Order nr. " + id +
                ", placed on: " + date.getDayOfMonth() + '.' + date.getMonth() + '.' + date.getYear() +
                ", by " + user +
                ", Status: " + status + '\n';
    }

    public long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public List<Item> getItems() {
        return items;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public double sum() {
        double sum = 0.0;
        for (Item item : items)
            sum = sum + item.getPrice();
        return sum;
    }

    public double sum(Item item) {
        double sum = 0.0;
        for (Item i : items)
            if (item.equals(i))
                sum = sum + item.getPrice();
        return sum;
    }

    @Override
    public int count() {
               return this.items.size();
    }

    public int count(Item item) {
        int count = 0;
        for (Item i : items)
            if (item.equals(i))
                count++;
        return count;

    }

    @Override
    public LocalDateTime date() {
        return this.date;
    }
}
