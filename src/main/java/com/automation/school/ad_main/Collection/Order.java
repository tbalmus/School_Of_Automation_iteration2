package com.automation.school.ad_main.Collection;

import java.time.LocalDateTime;

public interface Order {
    double sum(double price);
    void registrationUser(User user);
    void addItem(Item items);
}