package OOPTask;


import java.util.Date;
import java.util.List;

public class UserOrder implements Order  {

    private long id;
    private Date date;
    private AbstractUser user;
    private List <Item> items;

    public UserOrder(List<Item> items) {
        this.id = hashCode();
        this.date = new Date();
        this.items = items;
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

    public AbstractUser getUser() {
        return user;
    }
    public void setUser(AbstractUser user) {
        this.user = user;
    }

    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }


    @Override
    public void sum() {
        int sum = items.stream().mapToInt(o -> o.getPrice()).sum();
        System.out.println("The total price of the order is: " + sum + "$");
    }

    @Override
    public void count() {
        System.out.println( "You have " + items.size() + " elements in the basket");
    }

    @Override
    public void date() {
        System.out.println("The date of order creation is: " + this.date);
    }
}
