package com.automation.school.tbalmus.OOP_additional;

public class Human implements Mammal {
    int numberOfLimbs;
    int numberOfEars;
    boolean isAware;
    int age;
    String name;
    boolean isHumanBitten;

    private double height;
    private boolean talk;

    private Human ( double height , boolean talk ) {
        this(4, 2, true, 17, "Ana", 170, true);
    }

    public Human ( int numberOfLimbs , int numberOfEars , boolean isAware ,
                   int age, String name  , double height , boolean talk ) {
        this.numberOfLimbs = numberOfLimbs;
        this.numberOfEars = numberOfEars;
        this.isAware = isAware;
        this.age = age;
        this.name = name;
        this.height = height;
        this.talk = talk;
        this.isHumanBitten = false;
    }

    public void  playWithCat( Cat cat, int sec ){
        System.out.println ("Human " + this.getName () + " plays with cat " + cat.getName () + " " + sec + " seconds \n");
        cat.reactToPlay ( this, sec);
    }

    public void setHumanBitten ( boolean bite){
        this.isHumanBitten = bite;
        System.out.println ("Is human " + this.getName () + " bitten " + this.isHumanBitten + "\n");
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
        return this.isAware;
    }

    @Override
    public int getAge () {
        return this.age;
    }

    @Override
    public String getName () {
        return this.name;
    }
}