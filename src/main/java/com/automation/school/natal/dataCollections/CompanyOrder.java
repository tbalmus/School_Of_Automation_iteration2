package com.automation.school.natal.dataCollections;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

public class CompanyOrder implements Order {
    private long id;
    private final LocalDateTime date;
    private Company company;
    private List<Item> items;
    private Status status;

    public CompanyOrder(Company company, List<Item> items) {
        do {
            long rand = new Random().nextLong();
            if (rand > 0)
                this.id = rand;
        }
        while (this.id <= 0);
        this.date = LocalDateTime.now();
        this.company = company;
        this.items = items;
        this.status = Status.CREATED;
    }

    public long getId() {
        return id;
    }

    public Company getCompany() {
        return company;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Order nr. " + id +
                ", placed on: " + date.getDayOfMonth() + '.' + date.getMonth() + '.' + date.getYear() +
                ", by " + company +
                ", Status: " + status +
                '\n';
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

    @Override
    public void setStatus(Status status) {
        this.status = status;
    }
}
