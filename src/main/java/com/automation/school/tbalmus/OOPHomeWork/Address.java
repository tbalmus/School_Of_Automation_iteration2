package com.automation.school.tbalmus.OOPHomeWork;

public class Address {
    public String country;
    public String city;
    public String street;

    public Address ( String country , String city , String street ) {
        this.country = country;
        this.city = city;
        this.street = street;

    }

    public String getCity () {
        return this.city;
    }
}
