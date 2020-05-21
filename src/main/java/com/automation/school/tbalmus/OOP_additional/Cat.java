package com.automation.school.tbalmus.OOP_additional;

public class Cat extends Feline {

    private boolean purr;

    public Cat ( int numberOfLimbs , boolean isAware , int age , int tailLenght ,
                 boolean meows , String popularName ) {
    this(numberOfLimbs, isAware, age, tailLenght, meows, popularName, false);
    }

    public Cat ( int numberOfLimbs , boolean isAware , int age  , int tailLenght ,
                 boolean meows , String name , boolean purr ) {
        super ( numberOfLimbs , isAware , age, tailLenght , meows , name );
        this.purr = purr;
    }

    public void reactToPlay( Human human, int sec){
        System.out.println ("Cat "+ this.getName ()+ " reacts to play." );;
        if (sec >= 5){
            human.setHumanBitten( true );
        }
        else{
            human.setHumanBitten ( false );
        }
    }
}
