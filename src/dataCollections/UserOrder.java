package dataCollections;

import java.time.*;
import java.util.List;
import java.util.Random;


public class UserOrder implements Order {
    private long id;
    private final LocalDateTime date;
    private final User user;
    private List<Item> items;
    private Status status;

    public UserOrder(User user, List<Item> items) {
        do {
            long rand = new Random().nextLong();
            if (rand > 0)
                this.id = rand;
        }
        while (this.id <= 0);
        this.date = LocalDateTime.now();
        this.user = user;
        this.items = items;
        this.status = Status.CREATED;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
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
        int count = 0;
        for (Item item : items)
            count++;
        return count;
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
