package com.automation.school.tbalmus.OOP_additional;

public class Feline implements Mammal {

    int numberOfLimbs;
    final int numberOfEars = 2;
    boolean isAware;
    int age;
    String name;
    protected int tailLenght;
    protected boolean meows;

    public Feline ( int numberOfLimbs, boolean isAware , int age , int tailLenght , boolean meows , String name) {
        this.numberOfLimbs = numberOfLimbs;
        this.isAware = isAware;
        this.age = age;
        this.tailLenght = tailLenght;
        this.meows = meows;
        this.name = name;
    }


    @Override
    public int getNumberOfLimbs () {
        return this.numberOfLimbs;
    }

    @Override
    public int getNumberOfEars () {
        return this.numberOfEars;
    }

    @Override
    public boolean isAware () {
        return false;
    }

    @Override
    public int getAge () {
        return this.age;
    }

    @Override
    public String getName () {
        return this.name;
    }


    public void setNumberOfLimbs ( int numberOfLimbs ) {
        this.numberOfLimbs = numberOfLimbs;
    }

    public void setAge ( int age ) {
        this.age = age;
    }

    public void setPopularName ( String popularName ) {
        this.name = popularName;
    }

    public void setTailLenght ( int tailLenght ) {
        this.tailLenght = tailLenght;
    }

    public void setMeows ( boolean meows ) {
        this.meows = meows;
    }
}
