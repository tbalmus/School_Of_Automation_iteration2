package com.automation.school.natal.dataCollections;

import java.util.Random;

public class RandomIdSetter {
    public static long setRandId() {
        long rand;
        do {
            rand = new Random().nextLong();
        }
        while (rand <= 0);
        return rand;
    }
}
