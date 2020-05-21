package com.automation.school.tbalmus.OOPHomeWork;

import java.time.LocalDateTime;
import java.util.List;

public class UserOrder implements Order {

    private static long idCounter = 1 ;
    private LocalDateTime dateTime;
    private User user;
    private List < Item > items;
    private long id;

    public UserOrder ( User user , List < Item > items ) {
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

    @Override
    public double sum () {
        return 0;
    }

    @Override
    public int count () {
        return 0;
    }

    @Override
    public LocalDateTime date () {
        return null;
    }
}
