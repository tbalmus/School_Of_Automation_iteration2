package CollectionsTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PlaceNewOrder {

    public static void main(String[] args) {


        Address address1 = new Address("Moldova", "Chisinau", "Alecu Russo");
        Address address2 = new Address("England", "London", "Kings Road");

        List<User> users = new ArrayList<User>();

        User johnJohnson = new User("John Johnson");
        johnJohnson.addAddress(address2, "home");
        users.add(johnJohnson);

        User georgeSmith = new User("George Smith");
        georgeSmith.addAddress(address1, "work");
        users.add(georgeSmith);

        Item shirt = new Item(01, "shirt", Type.CLOTHES);
        Item jaket = new Item(02, "jacket", Type.CLOTHES);
        Item suit = new Item(02, "suit", Type.CLOTHES);
        Item macbook = new Item(03, "macbook", Type.GADGETS);
        Item ipad = new Item(04, "ipad", Type.GADGETS);
        Item novel = new Item(05, "novel", Type.BOOKS);

        List<Item> basket1 = new ArrayList<>();
        basket1.add(shirt);
        basket1.add(macbook);
        basket1.add(novel);

        List<Item> basket2 = new ArrayList<>();
        basket2.add(macbook);
        basket2.add(ipad);
        basket2.add(novel);

        Order order1 = new Order();
        order1.setUser(johnJohnson);
        order1.setItems(basket1);

        Order order2 = new Order();
        order2.setUser(georgeSmith);
        order2.setItems(basket2);

        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);

        for (Order order : filterItemsByType(orders, Type.CLOTHES)) {
            System.out.println("filtered by order: " + "id:" + order.getId() + "; date:" + order.getDate() + "; name:" + order.getUser().getUsername());
        }

        for (User user : filterUsersByCity(users, "Chisinau")) {
            System.out.println("filtered by city: " + user.getUsername());
        }


    }

    public static List<User> filterUsersByCity(List<User> users, String city) {
        List<User> filteredUsers = new ArrayList<>();

        for (User user : users)
            for (Map.Entry<String, Address> entry : user.getAddresses().entrySet())
                if (entry.getValue().getCity().equalsIgnoreCase(city))
                    filteredUsers.add(user);

        return filteredUsers;
    }

    public static List<Order> filterItemsByType(List<Order> orders, Type type) {
        List<Order> filteredOrders = new ArrayList<>();

        for (Order order : orders)
            for (Item item : order.getItems())
                if (item.getType().equals(type))
                    filteredOrders.add(order);

        return filteredOrders;
    }

}