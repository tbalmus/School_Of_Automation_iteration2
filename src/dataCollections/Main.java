package dataCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Set<Item> catalog = new HashSet<>();
        catalog.add(new Item("Dress", Type.CLOTHES));
        catalog.add(new Item("T-Shirt", Type.CLOTHES));
        catalog.add(new Item("Pants", Type.CLOTHES));
        catalog.add(new Item("Shorts", Type.CLOTHES));
        catalog.add(new Item("Skirt", Type.CLOTHES));
        catalog.add(new Item("Cardigan", Type.CLOTHES));
        catalog.add(new Item("Shirt", Type.CLOTHES));
        catalog.add(new Item("Scarf", Type.ACCESSORIES));
        catalog.add(new Item("Gloves", Type.ACCESSORIES));
        catalog.add(new Item("Hat", Type.ACCESSORIES));
        catalog.add(new Item("Day Cream", Type.COSMETICS));
        catalog.add(new Item("Night Cream", Type.COSMETICS));
        catalog.add(new Item("Eye Cream", Type.COSMETICS));
        catalog.add(new Item("Perfume", Type.COSMETICS));
        catalog.add(new Item("Foreo", Type.GADGET));
        catalog.add(new Item("MiBand", Type.GADGET));
        catalog.add(new Item("AppleWatch", Type.GADGET));
        catalog.add(new Item("Sandals", Type.SHOES));
        List<User> users = new ArrayList<>();
        users.add(new User("Tom Brady"));
        users.add(new User("Emma Stone"));
        users.add(new User("Guillermo Del Toro"));
        users.add(new User("Quentin Tarantino"));
        users.add(new User("Uma Turman"));
        users.add(new User("Scarlett Johansson"));
        users.add(new User("John Travolta"));
        users.add(new User("Tom Hanks"));

        users.get(3).addAddress("Billing", new Address("Moldova", "Chisinau", "Cuza Voda"));
        users.get(3).addAddress("Shipping", new Address("Moldova", "Orhei", "Vasile Lupu"));
        users.get(3).addToBasket(pickItem("T-Shirt", Type.CLOTHES, catalog));
        users.get(3).addToBasket(pickItem("Pants", Type.CLOTHES, catalog));
        users.get(3).addToBasket(pickItem("AppleWatch", Type.GADGET, catalog));

        users.get(4).addAddress("Billing", new Address("Moldova", "Chisinau", "Alecu Russo"));
        users.get(4).addAddress("Shipping", new Address("Moldova", "Chisinau", "Alecu Russo"));
        users.get(4).addToBasket(pickItem("Dress", Type.CLOTHES, catalog));
        users.get(4).addToBasket(pickItem("Sandals", Type.SHOES, catalog));
        users.get(4).addToBasket(pickItem("Foreo", Type.GADGET, catalog));

        List<Order> orders = new ArrayList<>();
        orders.add(new UserOrder(users.get(3), users.get(3).getBasket()));
        orders.add(new UserOrder(users.get(4), users.get(4).getBasket()));
        Company company1 = new Company("Endava");
        company1.addToBasket(pickItem("AppleWatch", Type.GADGET, catalog));
        orders.add(new CompanyOrder(company1, company1.getBasket()));
        System.out.println(orders);
        System.out.println(filterOrderByItemType(orders, Type.CLOTHES));
        System.out.println(filterUsersByCity(users, "Chisinau"));

        AdminUser admin=new AdminUser("Rambo");
        for (Order o: filterOrderByItemType(orders, Type.CLOTHES))
        admin.approveOrder(o);
        System.out.println(filterOrderByItemType(orders, Type.CLOTHES));
        for (Order or: orders)
        System.out.println(or.getItems());
        System.out.println(filterOrderByItemType(orders, Type.SHOES));
        for (Order o: filterOrderByItemType(orders, Type.SHOES))
            admin.rejectOrder(o);
        System.out.println(orders);
    }

    static Item pickItem(String title, Type type, Set<Item> catalog) {
        Item pickedItem = null;
        for (Item item : catalog)
            if (title == item.getTitle() && type == item.getType())
                pickedItem = item;
        return pickedItem;
    }

    static List<Order> filterOrderByItemType(List<Order> orders, Type type) {
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
                if (a.getCity() == city) {
                    filteredUsers.add(u);
                    break;
                }
        return filteredUsers;
    }
}
