package com.automation.school.ad_main.Collection;

import java.util.*;

public class MainRetailor {
    public static void main(String[] args) {
        String newLine = System.getProperty("line.separator");
        //Start
        System.out.println("Hello to  create new oder: 1) enter user name 2) add Address 3) enter item ID");
        // New user registration
        Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Hello please create new User");
        String user = myScanner.nextLine(); // Enter username and press Enter
        System.out.println("Username is: " + user);
        System.out.println("Enter Country, City and street:");
        String newAddressCountry1 = myScanner.nextLine();
        String newAddressCity1 = myScanner.nextLine();
        String newAddressStreet1 = myScanner.nextLine();
        Address address1 = new Address();
        address1.addAddress(newAddressCountry1, newAddressCity1, newAddressStreet1);
        User user1 = new User();
        user1.createUser(user);
        user1.addAddress("Home", address1);

        System.out.println("User is created :" + user1);
        // Create Adress


        String newAddressCountry2 = "Moldova";
        String newAddressCity2 = "Chishinau";
        String newAddressStreet2 = "Nunta 19";
        Address address2 = new Address();
        address2.addAddress(newAddressCountry2, newAddressCity2, newAddressStreet2);
        String newAddressCountry3 = "Moldova";
        String newAddressCity3 = "Orhey";
        String newAddressStreet3 = "Doga 19";
        Address address3 = new Address();
        address3.addAddress(newAddressCountry3, newAddressCity3, newAddressStreet3);

        Map<String, Address> addresses = new HashMap<>();
        //Adding elements to map
        addresses.put("Home", address1);
        addresses.put("Work", address2);
        addresses.put("Home", address3);


        // create list of items
        Item myToy = new Item(1, "lego", Type.TOY, 50.23);
        Item myToy2 = new Item(2, "legoGo", Type.TOY, 20.31);
        Item myToy3 = new Item(3, "legoUP", Type.TOY, 52.4);

        List<Item> listToys = new LinkedList<>();
        listToys.add(myToy);
        listToys.add(myToy2);
        listToys.add(myToy3);

        String[] arrToys = new String[listToys.size()];

        // ArrayList to Array Conversion
        for (int i = 0; i < listToys.size(); i++) {
            arrToys[i] = String.valueOf(listToys.get(i));
        }
        System.out.println("Hello please create new Order. Select item from the list " + newLine);
        for (String x : arrToys)
            System.out.print("item list:" + x + " " + newLine);

        User user2 = new User();
        user2.createUser("Oleg");
        user2.addAddress("Office", address3);
        // create User  Order
        UserOrder userOrder1 = new UserOrder();
        userOrder1.registrationUser(user2);

        userOrder1.addItem(myToy);
        userOrder1.addItem(myToy2);
        userOrder1.addItem(myToy3);
        System.out.print("Order:" + userOrder1.toString() + " " + newLine);

        UserOrder userOrder2 = new UserOrder();
        userOrder2.registrationUser(user1);
        userOrder2.addItem(myToy);
        System.out.print("Order:" + userOrder2.toString() + " " + newLine);

        // create Company order
        User user5 = new User();
        user5.createUser("user5");
        user5.addAddress("Home", address2);
        String companyName1 = "company1";
        String companyName2 = "company2";
        Company company1 = new Company();
        Company company2 = new Company();
        company1.createCompany(companyName1);
        company2.createCompany(companyName2);
        // add Address to Company
        company1.addAddress("Office", address1);
        company2.addAddress("Store", address3);
        System.out.println(company1.toString() + newLine);
        CompanyOrder companyOrder1 = new CompanyOrder();
        companyOrder1.CreateOrder(user5, company1);
        // Create company2
        CompanyOrder companyOrder2 = new CompanyOrder();
        companyOrder2.CreateOrder(user5, company2);
        // Add 2 items with toys for Company Order 1
        companyOrder2.addItem(myToy);
        companyOrder2.addItem(myToy2);
        // Add 3 items with toys for Company Order 2
        companyOrder1.addItem(myToy);
        companyOrder1.addItem(myToy2);
        companyOrder1.addItem(myToy3);

        System.out.println(companyOrder1.toString() + newLine);
        System.out.println(companyOrder2.toString() + newLine);
    }
}
