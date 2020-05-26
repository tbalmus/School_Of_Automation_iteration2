package com.automation.school.ad_main.Collection;

public class Address {
    private static String country;
    private static String city;
    private static String street;

    //public String getFullAddress;
    public Address(String country,String city,String street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }
    public static String getFullAddress()
    {
        String FullAddress = country +" " + city + " "+ street;
        return FullAddress;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyId=" + country +
                ", company='" + city + '\'' +
                ", addressesCompany=" + street + Address.getFullAddress()+
                '}';
    }

    }
