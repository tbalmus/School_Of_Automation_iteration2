package com.automation.school.natal.dataCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Set<Item> catalog = new HashSet<>();
        catalog.add(new Item("Dress", ItemType.CLOTHES));
        catalog.add(new Item("T-Shirt", ItemType.CLOTHES));
        catalog.add(new Item("Pants", ItemType.CLOTHES));
        catalog.add(new Item("Shorts", ItemType.CLOTHES));
        catalog.add(new Item("Skirt", ItemType.CLOTHES));
        catalog.add(new Item("Cardigan", ItemType.CLOTHES));
        catalog.add(new Item("Shirt", ItemType.CLOTHES));
        catalog.add(new Item("Scarf", ItemType.ACCESSORIES));
        catalog.add(new Item("Gloves", ItemType.ACCESSORIES));
        catalog.add(new Item("Hat", ItemType.ACCESSORIES));
        catalog.add(new Item("Day Cream", ItemType.COSMETICS));
        catalog.add(new Item("Night Cream", ItemType.COSMETICS));
        catalog.add(new Item("Eye Cream", ItemType.COSMETICS));
        catalog.add(new Item("Perfume", ItemType.COSMETICS));
        catalog.add(new Item("Foreo", ItemType.GADGET));
        catalog.add(new Item("MiBand", ItemType.GADGET));
        catalog.add(new Item("AppleWatch", ItemType.GADGET));
        catalog.add(new Item("Sandals", ItemType.SHOES));
        List<User> users = new ArrayList<>();
        users.add(new User("Tom Brady"));
        users.add(new User("Emma Stone"));
        users.add(new User("Guillermo Del Toro"));
        users.add(new User("Quentin Tarantino"));
        users.add(new User("Uma Turman"));
        users.add(new User("Scarlett Johansson"));
        users.add(new User("John Travolta"));
        users.add(new User("Tom Hanks"));
        User user3 = users.get(3);
        user3.addAddress("Billing", new Address("Moldova", "Chisinau", "Cuza Voda"));
        user3.addAddress("Shipping", new Address("Moldova", "Orhei", "Vasile Lupu"));
        user3.addToBasket(pickItem("T-Shirt", ItemType.CLOTHES, catalog));
        user3.addToBasket(pickItem("Pants", ItemType.CLOTHES, catalog));
        user3.addToBasket(pickItem("AppleWatch", ItemType.GADGET, catalog));
        User user4 = users.get(4);
        user4.addAddress("Billing", new Address("Moldova", "Chisinau", "Alecu Russo"));
        user4.addAddress("Shipping", new Address("Moldova", "Chisinau", "Alecu Russo"));
        user4.addToBasket(pickItem("Dress", ItemType.CLOTHES, catalog));
        user4.addToBasket(pickItem("Sandals", ItemType.SHOES, catalog));
        user4.addToBasket(pickItem("Foreo", ItemType.GADGET, catalog));

        List<Order> orders = new ArrayList<>();
        orders.add(new UserOrder(user3, user3.getBasket()));
        orders.add(new UserOrder(user4, user4.getBasket()));
        Company company1 = new Company("Endava");
        company1.addToBasket(pickItem("AppleWatch", ItemType.GADGET, catalog));
        orders.add(new CompanyOrder(company1, company1.getBasket()));
        System.out.println(orders);
        System.out.println(filterOrderByItemType(orders, ItemType.CLOTHES));
        System.out.println(filterUsersByCity(users, "Chisinau"));

        AdminUser admin = new AdminUser("Rambo");
        for (Order o : filterOrderByItemType(orders, ItemType.CLOTHES)) {
            admin.approveOrder(o);
        }
        System.out.println(filterOrderByItemType(orders, ItemType.CLOTHES));
        for (Order or : orders) {
            System.out.println(or.getItems());
        }
        System.out.println(filterOrderByItemType(orders, ItemType.SHOES));
        for (Order o : filterOrderByItemType(orders, ItemType.SHOES)) {
            admin.rejectOrder(o);
        }
        System.out.println(orders);
    }

    static Item pickItem(String title, ItemType type, Set<Item> catalog) {
        Item pickedItem = null;
        for (Item item : catalog)
            if (title.equals(item.getTitle()) && type.equals(item.getType()))
                pickedItem = item;
        return pickedItem;
    }

    static List<Order> filterOrderByItemType(List<Order> orders, ItemType type) {
        List<Order> filteredList = new ArrayList<>();
        for (Order o : orders)
            for (Item i : o.getItems())
                if (i.getType() == type) {
                    filteredList.add(o);
                    break;
                }
        return filteredList;
    }

    static List<User> filterUsersByCity(List<User> users, String city) {
        List<User> filteredUsers = new ArrayList<>();
        for (User u : users)
            for (Address a : u.getAddresses().values())
                if (a.getCity().equals(city)) {
                    filteredUsers.add(u);
                    break;
                }
        return filteredUsers;
    }
}
