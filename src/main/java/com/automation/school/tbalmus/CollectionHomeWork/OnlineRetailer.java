package com.automation.school.tbalmus.CollectionHomeWork;

import java.util.ArrayList;
import java.util.List;

public class OnlineRetailer {

    public static void main ( String[] args ) {


        User user1 = new User ( "Tatiana" , 15 );
        user1.addAdress ( "Home" , new Address ( "Moldova" , "Chisinau" , "Varsovia, nr.9, ap. 1003" ) );
        user1.addAdress ( "Work" , new Address ( "Moldova" , "Chisinau" , "Arborilor nr. 5" ) );

        User user2 = new User ( "Anastasia" , 24 );
        user2.addAdress ( "Home" , new Address ( "Romania" , "Bucuresti" , "Varsovia, nr.9, ap. 1003" ) );
        user2.addAdress ( "Work" , new Address ( "Romania" , "Sibiu" , "Arborilor nr. 5" ) );

        User user3 = new User ( "Natalia" , 5 );
        user3.addAdress ( "Home" , new Address ( "Moldova" , "Chisinau" , "Zelinschi, nr.15, ap. 54" ) );
        user3.addAdress ( "Work" , new Address ( "Moldova" , "Chisinau" , "Arborilor nr. 5" ) );

        // List of items
        List < Item > items1 = new ArrayList < Item > ( );
        items1.add ( new Item ( Type.TOYS , "Lego" , 134 ) );
        items1.add ( new Item ( Type.CLOTHES , "T-shirt" , 14 ) );
        items1.add ( new Item ( Type.GADGET , "Phone" , 345 ) );
        items1.add ( new Item ( Type.TOYS , "Cat" , 765 ) );
        items1.add ( new Item ( Type.CLOTHES , "Pants" , 39 ) );

        List < Item > items2 = new ArrayList < Item > ( );
        items2.add ( new Item ( Type.TOYS , "Dinosaur" , 1 ) );
        items2.add ( new Item ( Type.CLOTHES , "Dress" , 4 ) );

        List < Item > items3 = new ArrayList < Item > ( );
        items3.add ( new Item ( Type.TOYS , "Bear" , 19 ) );
        items3.add ( new Item ( Type.CLOTHES , "Shorts" , 27 ) );
        items1.add ( new Item ( Type.TOYS , "Puzzle" , 355 ) );
        items1.add ( new Item ( Type.CLOTHES , "Hat" , 9 ) );


        //Declared orders
        Order order1 = new Order ( user2 , items1 );
        Order order2 = new Order ( user1 , items3 );
        Order order3 = new Order ( user3 , items2 );

        List < Order > orders = new ArrayList < Order > ( );
        orders.add ( order1 );
        orders.add ( order2 );
        orders.add ( order3 );

        List < Order > ordersWithClothes = filterOrderByItemType ( orders );
        System.out.println ( "Orders containing clothes:   \n " );
        if (ordersWithClothes.size ( ) != 0) {
            for (Order order : ordersWithClothes) {
                System.out.println ( order.printOrderId ( ) + "\n" );
            }
        } else {
            System.out.println ( "No order with clothes" );
        }

        List < User > users = new ArrayList < User > ( );
        users.add ( user1 );
        users.add ( user2 );
        users.add ( user3 );

        List < User > userFromChisinau = getUsersByCity ( users , "Chisinau" );

        System.out.println ( "Users from Chisinau:   \n " );
        if (userFromChisinau.size ( ) != 0) {

            for (User user : userFromChisinau) {
                System.out.println ( user.username + "\n" );
            }
        } else {
            System.out.println ( "No users from Chisinau" );
        }
    }

    public static List < Order > filterOrderByItemType ( List < Order > listAll ) {
        List < Order > results = new ArrayList <> ( );

        for (Order order : listAll) {
            if (hasClothes ( order )) {
                results.add ( order );

            }
        }
        return results;
    }

    public static boolean hasClothes ( Order order ) {
        List < Item > items = order.getItems ( );

        for (Item item : items) {
            if (item.getItemType ( ).equals ( Type.CLOTHES )) ;
            return true;
        }

        return false;
    }

    public static List < User > getUsersByCity ( List < User > allUsers , String city ) {
        List < User > result = new ArrayList <User> (  );
        for (User user : allUsers) {
            if (user.hasCity ( city )) {
                result.add ( user );

            }
        }
        return result;
    }

}
