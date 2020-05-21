package com.automation.school.tbalmus.CollectionHomeWork;

public class Item {

    private Type itemType;
    private String itemName;
    private long itemId;

    public Item ( Type itemType, String itemName, long itemId) {

        this.itemType = itemType;
        this.itemName = itemName;
        this.itemId = itemId;
    }

    public Type getItemType () {
        return this.itemType;
    }
}
