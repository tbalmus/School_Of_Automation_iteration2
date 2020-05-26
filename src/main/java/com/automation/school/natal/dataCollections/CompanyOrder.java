package com.automation.school.natal.dataCollections;

import java.time.LocalDateTime;
import java.util.List;

public class CompanyOrder implements Order {
    private final long id;
    private final LocalDateTime date;
    private final Company company;
    private List<Item> items;
    private OrderStatus status;

    public CompanyOrder(Company company, List<Item> items) {
        this.id = RandomIdSetter.setRandId();
        this.date = LocalDateTime.now();
        this.company = company;
        this.items = items;
        this.status = OrderStatus.CREATED;
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

    public OrderStatus getStatus() {
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

    @Override
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
