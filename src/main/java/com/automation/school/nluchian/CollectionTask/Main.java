package com.automation.school.nluchian.CollectionTask;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Item> catalog = new ArrayList<>();
        catalog.add(new Item(1, "shirt", Type.CLOTHES));
        catalog.add(new Item(2, "pants", Type.CLOTHES));
        catalog.add(new Item(3, "jacket", Type.CLOTHES));
        catalog.add(new Item(4, "robot", Type.TOYS));
        catalog.add(new Item(5, "drone", Type.GADGET));
        catalog.add(new Item(6, "soldier", Type.TOYS));
        catalog.add(new Item(7, "screwdriver", Type.INSTRUMENTS));
        catalog.add(new Item(8, "phone", Type.GADGET));
        catalog.add(new Item(9, "tv", Type.GADGET));
        catalog.add(new Item(10, "radio", Type.GADGET));

        //User vasea = new User("vasea");
//        System.out.println(vasea.id);
//        System.out.println(vasea.userName);
//        System.out.println(vasea.addresses);

        List<User> users = new ArrayList<>();
        users.add(new User("vasea"));
        users.add(new User("petea"));
        users.add(new User("johnny"));


        users.get(0).getAddresses().put("Billing", new Address("Moldova", "Chisinau", "Decebal"));
        users.get(1).getAddresses().put("Billing", new Address("Moldova", "Chisinau", "Dacia"));
        users.get(2).getAddresses().put("Billing", new Address("Moldova", "New York", "New York"));


//        vasea.addresses.put("Billing",new Address("Moldova", "Chisinau","Decebal"));
//        vasea.addresses.put("Billing",new Address("Moldova", "Chisinau","Decebal"));


        List<UserOrder> orders = new ArrayList<>();
        orders.add(new UserOrder(users.get(0), catalog.get(5)));
        orders.get(0).addItem(catalog.get(7));

        // System.out.println(orders.get(0));

        orders.add(new UserOrder(users.get(1), catalog.get(5)));
        orders.get(1).addItem(catalog.get(8));

        orders.add(new UserOrder(users.get(2), catalog.get(5)));
        orders.get(2).addItem(catalog.get(9));


        orders.add(new UserOrder(new User("Ion"), catalog.get(0))); // second method of creating orders + user
        orders.get(0).addItem(catalog.get(8));
        System.out.println(orders.get(1));
        System.out.println(listOfOrders(orders, Type.CLOTHES));
        System.out.println(userAddress(users, "Chisinau"));
    }

    public static List<UserOrder> listOfOrders(List<UserOrder> abrcadbra, Type type) {
        List<UserOrder> loo = new ArrayList<>();
        for (UserOrder o : abrcadbra) {
            for (Item i : o.items) {
                if (i.type == type)
                    loo.add(o);
                break;
            }
        }
        return loo;
    }

    public static List<User> userAddress(List<User> firstAddress, String city) {
        List<User> firstCity = new ArrayList<>();
        for (User l : firstAddress) {
            for (Address u : l.getAddresses().values()) {
                if (u.city == city)
                    firstCity.add(l);
                break;
            }
        }
        return firstCity;
    }
}
