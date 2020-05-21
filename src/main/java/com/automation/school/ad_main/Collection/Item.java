package com.automation.school.ad_main.Collection;

public class Item {

    public long id;
    public String title;
    public Type type;
    public static String newTitle;
    public static Type newType;
    private static int nextItemId = 0;
    private double price;


    // Create a class constructor for the Item class
    public Item(long id, String title, Type type) {
        this.id = id;
        this.title =title;
        this.type = type;
        this.price = price;

    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type=" + type +
                ", price=" + price +
                '}';
    }

/* public static void main(String[] args) {

        // adds 1 at 0 index firstList.add(1, 2);

        Item newItem = new Item(2, "newUser",CLOTHES);
         List<Item> itemList = new ArrayList<>();
        itemList.add(1,2);
        System.out.println(newItem.id);
        System.out.println(newItem.title);
        System.out.println(newItem.type );

    }*/
}


