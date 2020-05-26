package com.automation.school.natal.dataCollections;

import java.util.*;

public class Company {
    private long id;
    private String companyName;
    private Map<String, Address> addresses;
    private List<Item> basket;


    public Company(String companyName) {
        this.id=RandomIdSetter.setRandId();
        this.companyName = companyName;
        this.addresses = new HashMap<>();
        this.basket = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Map<String, Address> getAddresses() {
        return addresses;
    }

    public List<Item> getBasket() {
        return basket;
    }

    public void setBasket(List<Item> basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Company: \"" + companyName +
                "\" id=" + id;
    }

    public void addAddress(String type, Address address) {
        this.addresses.put(type, address);
    }

    public void addToBasket(Item item) {
        this.basket.add(item);
    }
}
