package com.automation.school.nluchian.CollectionTask;

public class Item {
    public long id;
    public String title;
    public Type type;
    public double price;

    public Item(long id, String title, Type type) {
        this.id = id;
        this.title = title;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type=" + type +
                '}';
    }
}
