package com.automation.school.natal.exceptions;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
            method1();
            method2();
        } catch (MyCheckedException e) {
            e.printStackTrace();
            System.out.println("Ooops... a Checked exception");

        } catch (MyUncheckedException e) {
            System.out.println("Ooops... an UnChecked exception");
        } finally {
            System.out.println("Finally block");
        }


    }

    public static void method1() throws MyCheckedException {
        throw new MyCheckedException("My Checked Exception");
    }

    public static void method2() {
        throw new MyUncheckedException("My unchecked Exception");

    }
}
