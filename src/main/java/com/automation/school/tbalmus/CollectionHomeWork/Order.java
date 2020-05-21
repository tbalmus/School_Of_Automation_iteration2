package com.automation.school.tbalmus.CollectionHomeWork;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

    private static long idCounter = 1 ;
    private LocalDateTime dateTime;
    private User user;
    private List < Item > items;
    private long id;

    public Order ( User user , List < Item > items ) {
        id = idCounter;
        this.dateTime = LocalDateTime.now ( );
        this.user = user;
        this.items = items;
        idCounter = ++idCounter;
    }

    public long printOrderId () {
        return  this.id ;
    }

    public List < Item > getItems () {
        return this.items;
    }
}
