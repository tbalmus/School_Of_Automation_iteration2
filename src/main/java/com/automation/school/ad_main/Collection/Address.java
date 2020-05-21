package com.automation.school.ad_main.Collection;

public class Address {
    public static String country;
    public static String city;
    public static String street;
    //String data[] = {country, city, street};
    //public String getFullAddress;

    public static String getFullAddress()
    {
        String FullAddress = country +" " + city + " "+ street;
        return FullAddress;
    }

    public Address(String country,String city,String street) {
        this.country = country;
        this.city = city;
        this.street = street;

    }

}
