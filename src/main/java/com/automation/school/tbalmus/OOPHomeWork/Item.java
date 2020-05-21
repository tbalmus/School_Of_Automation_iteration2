package com.automation.school.tbalmus.OOPHomeWork;

public class Item {

    private Type itemType;
    private String itemName;
    private long itemId;
    private double price;

    public Item ( Type itemType, String itemName, long itemId, double price) {

        this.itemType = itemType;
        this.itemName = itemName;
        this.itemId = itemId;
        this.price = price;
    }

    public Type getItemType () {
        return this.itemType;
    }
}
