package com.automation.school.ad_main.Generic.OfflineLibrary;

public class Newspaper {
    private String name;
    private String date ;

    public Newspaper(String name, String date) {
        this.name = name;
        this.date = date;
    }
    public String ToString() {return  "Newspaper header: " + '"' + name + '"' +  "from" + date;}
}
