package com.automation.school.ad_main.Collection;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserOrder  implements Order{

    private long id; //(generate automatically in constructor )
    public LocalDateTime date; //(set as current day directly in constructor)
    public User user;
    public List<Item> items;
    private static int nextUniqueId = 0;


    // public  User newUser;
    //public  Item newItem;
    //get the value of id
    public UserOrder() {
        this.id = getId();
        this.date = LocalDateTime.now();
        this.items = new ArrayList<>();
        //this.user = user;
    }

    public int getId() {
        nextUniqueId++;
        id = nextUniqueId;
        return (int) id;
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
        this.user= user;

    }

    public void addItem(Item items) {

    }

    @Override
    public String toString() {
        return "UserOrder{" +
                "id=" + id +
                ", date=" + date +
                ", user=" + user +
                ", items=" + items +
                '}';
    }

// Create a class constructor for the Order class
   /* public static void main(String[] args) {

        Order newOrder = new Order(id, newUser, newItem, date);
        System.out.println(newOrder.id);
        System.out.println(newOrder.date);
        System.out.println(newOrder.newUser + " " + newOrder.newItem );*/

//}

    }




