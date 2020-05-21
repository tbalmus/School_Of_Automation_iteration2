package dataCollections;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User extends AbstractUser {
    private Map<String, Address> addresses;
    private List<Item> basket;


    public User(String userName) {
        super(userName);
        this.addresses = new HashMap<>();
        this.basket = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "User: " + super.toString();
    }

    @Override
    public void logIn() {
        System.out.println("Log in as an User");
    }

    public Map<String, Address> getAddresses() {
        return addresses;
    }

    public List<Item> getBasket() {
        return basket;
    }

    public void setBasket(List<Item> basket) {
        this.basket = basket;
    }

    public void addToBasket(Item item) {
        this.basket.add(item);
    }

    public void addAddress(String type, Address address) {
        this.addresses.put(type, address);
    }


}
