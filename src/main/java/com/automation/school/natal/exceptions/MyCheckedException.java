package com.automation.school.natal.exceptions;

public class MyCheckedException extends NoSuchFieldException{
    String message;

    public MyCheckedException(String message) {
        super(message);
         }
}
