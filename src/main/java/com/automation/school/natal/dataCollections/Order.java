package com.automation.school.natal.dataCollections;

import java.time.LocalDateTime;
import java.util.List;

public interface Order {
    double sum();

    int count();

    LocalDateTime date();

    void setStatus(Status status);

    List<Item> getItems();
}
