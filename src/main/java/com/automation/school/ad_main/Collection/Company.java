package com.automation.school.ad_main.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class Company {
    private long companyId;
    public static long companyCurrentId = 0;
    private String company;
    private Map<String, Address> addressCompany; //(i.e. Key= "Home", Value = Address)


    public Company() {
        companyCurrentId++;
        this.addressCompany = new HashMap<>();
    }

    public void createCompany(String company) {
        this.companyId = new IdGenerator().set(Company.companyCurrentId);
        this.company = company;
    }
    public void addAddress(String type, Address address) {
        this.addressCompany.put(type, address);
    }
    @Override
    public String toString() {
        return "Company{" +
                "companyId=" + companyId +
                ", company='" + company + '\'' +
                ", addressesCompany=" + addressCompany +
                '}';
    }
}