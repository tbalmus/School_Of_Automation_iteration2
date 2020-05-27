package CollectionsTask;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Order {

    private long id;
    private Date date;
    private User user;
    private List<Item> items;

    public Order() {
        this.id = hashCode();
        this.date = new Date();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}