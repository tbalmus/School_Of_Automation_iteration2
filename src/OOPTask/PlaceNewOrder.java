package OOPTask;

import java.util.*;

public class PlaceNewOrder {

    public static void main(String[] args) {

        Address address1 = new Address("Moldova", "Chisinau", "Alecu Russo");
        Address address2 = new Address("England", "London", "Kings Road");
        Address address3 = new Address("Romania", "Bucharest", "Calea Victoriei");

        List<AbstractUser> users = new ArrayList<>();

        AbstractUser johnJohnson = new User("John Johnson");
        johnJohnson.addAddress(address2, "home");
        users.add(johnJohnson);

        AbstractUser georgeSmith = new User("George Smith");
        georgeSmith.addAddress(address1, "work");
        users.add(georgeSmith);

        AbstractUser mattWilliams = new User("Matt Williams");
        mattWilliams.addAddress(address1, "office");
        users.add(mattWilliams);

        AbstractUser sunShineInc = new User("SunShine Inc.");
        sunShineInc.addAddress(address3, "office");
        users.add(sunShineInc);

        Item shirt = new Item(01, "shirt", 5, Type.CLOTHES);
        Item jaket = new Item(02, "jacket",50, Type.CLOTHES);
        Item suit = new Item(02, "suit", 100, Type.CLOTHES);
        Item macbook = new Item(03, "macbook", 1200, Type.GADGETS);
        Item ipad = new Item(04, "ipad", 800, Type.GADGETS);
        Item novel = new Item(05, "novel", 15, Type.BOOKS);
        Item puzzle = new Item(06, "puzzle", 10, Type.TOYS);

        List<Item> basket1 = new ArrayList<>();
        basket1.add(shirt);
        basket1.add(macbook);
        basket1.add(novel);

        List <Item> basket2 = new ArrayList<>();
        basket2.add(macbook);
        basket2.add(ipad);
        basket2.add(novel);

        List<Item> basket3 = new ArrayList<>();
        basket3.add(suit);
        basket3.add(jaket);
        basket3.add(macbook);

        UserOrder order1 = new UserOrder(basket1);
        order1.setUser(johnJohnson);

        UserOrder order2 = new UserOrder(basket2);
        order2.setUser(georgeSmith);
        order2.sum();
        order2.count();
        order2.date();

        CompanyOrder order3 = new CompanyOrder(basket3);
        order3.setCompany(sunShineInc);
        order3.sum();
        order3.count();

        AdminUser mathewMorris = new AdminUser("Mathew Morris");
        mathewMorris.approveOrder(order2);
        mathewMorris.rejectOrder(order1);


        List<UserOrder> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);


        for (UserOrder order : filterItemsByType(orders, Type.CLOTHES)) {
            System.out.println("filtered by order: " + "id:" + order.getId() + "; date:" + order.getDate() + "; name:" + order.getUser().getUsername());
        }

        for (AbstractUser user : filterUsersByCity(users, "Chisinau")) {
            System.out.println("filtered by city: " + user.getUsername());
        }

    }




    public static List<AbstractUser> filterUsersByCity(List<AbstractUser> users, String city) {
        List<AbstractUser> filteredUsers = new ArrayList<>();

        for(AbstractUser user : users)
            for (Map.Entry<String, Address> entry : user.getAddresses().entrySet())
                if (entry.getValue().getCity().equalsIgnoreCase(city))
                    filteredUsers.add(user);

        return filteredUsers;
    }

    public static List<UserOrder> filterItemsByType(List<UserOrder> orders, Type type){
        List<UserOrder> filteredOrders = new ArrayList<>();

        for (UserOrder order : orders)
            for(Item item : order.getItems())
                if(item.getType().equals(type))
                    filteredOrders.add(order);

        return filteredOrders;
    }

}
