package com.automation.school.tbalmus.OOPHomeWork;

import java.util.HashMap;
import java.util.Map;

public class User extends AbstractUser {

    private Map < String, Address > addresses = new HashMap < String, Address > ( );

    public User ( String username , long id ) {
        super ( username );
        setId ( id );

    }

    public User ( String username ) {
        super ( username );
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
