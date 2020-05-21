package com.automation.school.ad_main.Collection;

import java.time.LocalDateTime;

public interface Order {
    double sum();
    int count();
    LocalDateTime date();
    void registrationUser(User user);
    void addItem(Item items);


}
