package dataCollections;

import java.util.Objects;
import java.util.Random;

public class Item {
    private long id;
    private final String title;
    private final Type type;
    private double price;

    public Item(String title, Type type) {
        do {
            long rand=new Random().nextLong();
            if (rand>0)
                this.id =rand ;
        }
        while (this.id<=0);
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

    public Type getType() {
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
