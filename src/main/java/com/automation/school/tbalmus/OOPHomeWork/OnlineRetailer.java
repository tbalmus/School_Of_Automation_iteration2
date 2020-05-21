package com.automation.school.tbalmus.OOPHomeWork;

import java.util.ArrayList;
import java.util.List;

public class OnlineRetailer {

    public static void main ( String[] args ) {


        User user1 = new User ( "Tatiana" , 15 );
        user1.addAdress ( "Home" , new Address ( "Moldova" , "Chisinau" , "Varsovia, nr.9, ap. 1003" ) );
        user1.addAdress ( "Work" , new Address ( "Moldova" , "Chisinau" , "Arborilor nr. 5" ) );

        User user2 = new User ( "Anastasia" );
        user2.addAdress ( "Home" , new Address ( "Romania" , "Bucuresti" , "Unirii, nr.1, ap. 3" ) );
        user2.addAdress ( "Work" , new Address ( "Romania" , "Sibiu" , "Bucuriei nr. 17" ) );
        System.out.println ("#############" + user2.getId ());

        User user3 = new User ( "Natalia" , 5 );
        user3.addAdress ( "Home" , new Address ( "Moldova" , "Chisinau" , "Zelinschi, nr.15, ap. 54" ) );
        user3.addAdress ( "Work" , new Address ( "Moldova" , "Chisinau" , "Arborilor nr. 5" ) );


        // List of items
        List < Item > items1 = new ArrayList < Item > ( );
        items1.add ( new Item ( Type.TOYS , "Lego" , 134, 34.43 ) );
        items1.add ( new Item ( Type.CLOTHES , "T-shirt" , 14, 23.98 ) );
        items1.add ( new Item ( Type.GADGET , "Phone" , 345, 543.00 ) );
        items1.add ( new Item ( Type.TOYS , "Cat" , 765, 50.25 ) );
        items1.add ( new Item ( Type.CLOTHES , "Pants" , 39, 99.99 ) );

        List < Item > items2 = new ArrayList < Item > ( );
        items2.add ( new Item ( Type.TOYS , "Dinosaur" , 1, 123.64 ) );
       // items2.add ( new Item ( Type.CLOTHES , "Dress" , 4, 44.87 ) );

        List < Item > items3 = new ArrayList < Item > ( );
        items3.add ( new Item ( Type.TOYS , "Bear" , 19, 65.98 ) );
        items3.add ( new Item ( Type.CLOTHES , "Shorts" , 27, 293.34 ) );
        items1.add ( new Item ( Type.TOYS , "Puzzle" , 355, 85.45 ) );
        items1.add ( new Item ( Type.CLOTHES , "Hat" , 9, 500.50 ) );


        //Declared orders
        UserOrder userOrder1 = new UserOrder ( user2 , items1 );
        UserOrder userOrder2 = new UserOrder ( user1 , items3 );
        UserOrder userOrder3 = new UserOrder ( user3 , items2 );

        List < UserOrder > userOrders = new ArrayList < UserOrder > ( );
        userOrders.add ( userOrder1 );
        userOrders.add ( userOrder2 );
        userOrders.add ( userOrder3 );

        List < UserOrder > ordersWithClothes = filterOrderByItemType ( userOrders );
        System.out.println ( "Orders containing clothes:   \n " );
        if (ordersWithClothes.size ( ) != 0) {
            for (UserOrder userOrder : ordersWithClothes) {
                System.out.println ( userOrder.printOrderId ( ) +"\n" );
            }
        } else {
            System.out.println ( "No order with clothes" );
        }

        List < User > users = new ArrayList <> ( );
        users.add ( user1 );
        users.add ( user2 );
        users.add ( user3 );

        List < User > userFromChisinau = getUsersByCity ( users , "Chisinau" );

        System.out.println ( "Users from Chisinau:   \n " );
        if (userFromChisinau.size ( ) != 0) {

            for (User user : userFromChisinau) {
                System.out.println ( user.getUsername () + "\n" );
            }
        } else {
            System.out.println ( "No users from Chisinau" );
        }
    }

    public static List < UserOrder > filterOrderByItemType ( List < UserOrder > listAll ) {
        List < UserOrder > results = new ArrayList <> ( );

        for (UserOrder userOrder : listAll) {
            if (hasClothes ( userOrder )) {
                results.add ( userOrder );

            }
        }
        return results;
    }

    public static boolean hasClothes ( UserOrder userOrder ) {
        List < Item > items = userOrder.getItems ( );

        for (Item item : items) {
            if (item.getItemType ( ).equals ( Type.CLOTHES )) ;
            return true;
        }

        return false;
    }

    public static List < User > getUsersByCity ( List < User > allUsers , String city ) {
        List < User > result = new ArrayList < > (  );
        for (User user : allUsers) {
            if (user.hasCity ( city )) {
                result.add ( user );

            }
        }
        return result;
    }


}
