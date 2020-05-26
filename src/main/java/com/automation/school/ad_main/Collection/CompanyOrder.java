package com.automation.school.ad_main.Collection;

import org.w3c.dom.Node;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class CompanyOrder implements Order {

    private long companyOrderId;// = new IdGenerator(0).getNextId(); //(generate automatically in constructor )
    public static long companyCurrentOrderId = 0;
    private LocalDateTime date; //(set as current day directly in constructor)
    private User user;
    public Company company;
    public List<Item> itemsCompany;
    private int itemCount = 0;

    public CompanyOrder() {
        companyCurrentOrderId++;
        this.date = LocalDateTime.now();
        this.itemsCompany = new LinkedList<>();
    }

    public void CreateOrder(User user, Company company) {
        this.company = company;
        this.user = user;
        this.companyOrderId = new IdGenerator().set(CompanyOrder.companyCurrentOrderId);
    }

    public double sum(double price) {
        double[] arr = {price};
        double total = 0;

        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        return total;
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

    @Override
    public void registrationUser(User user) {
    }

    @Override
    public void addItem(Item items) {
        itemsCompany.add(items);
     }


    @Override
    public String toString() {
        return "CompanyOrder{" +
                " companyOrderId=" + companyOrderId +
                ", date=" + date +
                ", user=" + user +
                ", companies=" + company +
                ", itemsCompany=" + itemsCompany +
                ", itemCount=" + itemCount +
                '}';
    }
}
