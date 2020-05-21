package com.automation.school.ad_main.Collection;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CompanyOrder implements Order{


    private long id; //(generate automatically in constructor )
    private LocalDateTime date; //(set as current day directly in constructor)
    private User user;
    public List<Company> companies;
    private static int nextUniqueId = 0;
    private int itemCount = 0;
    Double value;

    // public  User newUser;
    //public  Item newItem;
    //get the value of id
    public CompanyOrder() {
        this.date = LocalDateTime.now();
        this.companies = new ArrayList<>(itemCount);
        this.value = value;
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

    }

    public double sum(double price) {
        double[] arr = {price};
        double total = 0;

        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }
        return total;

    }
    public int count(Item item) {

        for(int i=0; i<itemCount; itemCount++){
            return itemCount;
        }
        return itemCount;

    }
/*
    List<Item> exampleList = new ArrayList<>();
    for (int i = 0; i < itemCount; i++) { // Populate list
        exampleList.add(new Item(price));
    }

    Double sum = 0d;
    for (Entry entry : exampleList) { //Sum up values
        Double.sum(sum, entry.value);
    }

System.out.println(sum);

*/
}
