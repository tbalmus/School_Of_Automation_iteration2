package com.automation.school.tbalmus.CollectionHomeWork;

import java.util.HashMap;
import java.util.Map;

public class User {

    public String username;
    public long id;
    public Map < String, Address > addresses = new HashMap < String, Address > ( );

    public User ( String username , long id ) {
        this.username = username;
        this.id = id;
        this.addresses = addresses;

    }

    public void addAdress ( String key , Address value ) {
        this.addresses.put ( key , value );
    }

    public boolean hasCity ( String city ) {
        for (Map.Entry < String, Address > entry : this.addresses.entrySet ( )) {
            if (entry.getValue ( ).getCity ( ).equals ( city )) {
                return true;
            }
        }
        return false;
    }


}
