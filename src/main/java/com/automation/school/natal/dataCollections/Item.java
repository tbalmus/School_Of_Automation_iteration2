package com.automation.school.natal.dataCollections;

import java.util.Objects;

public class Item {
    private long id;
    private final String title;
    private final ItemType type;
    private double price;

    public Item(String title, ItemType type) {
        this.id=RandomIdSetter.setRandId();
        this.title = title;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", '" + title + '\'' +
                ", from type: " + type +
                '}';
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public ItemType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return title.equals(item.title) &&  type.equals(item.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, type);
    }

}
