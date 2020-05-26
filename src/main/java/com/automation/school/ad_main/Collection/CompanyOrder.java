package com.automation.school.ad_main.Collection;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

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

    @Override
    public double sum(double price) {
        double[] arr = {price};
        double total = 0;

        int i = 0;
        while (i < arr.length) {
            total = total + arr[i];
            i++;
        }
        return total;
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
