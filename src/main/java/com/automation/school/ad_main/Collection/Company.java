package com.automation.school.ad_main.Collection;

import java.util.Map;

public class Company {
    private long id;
    private String company;
    private Map<String,Address> addressesCompany; //(i.e. Key= "Home", Value = Address)
    private static int nextUniqueId = 0;

    public int getCompanyId() {
        nextUniqueId++;
        id = nextUniqueId;
        return (int) id;
    }
}
