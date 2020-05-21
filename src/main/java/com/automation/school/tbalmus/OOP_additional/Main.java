package com.automation.school.tbalmus.OOP_additional;

public class Main {
    public static void main ( String[] args ) {
        Human human = new Human( 4, 2, true, 27,
                "Tatiana",168, true);

        Cat garfield = new Cat ( 4, false, 3, 18,
                true, "Garfield", false);

        Human human1 = new Human( 4, 2, true, 24,
                "Anastasia",167, true);

        System.out.println ("Humans with name "+ human.getName ()+ "," + human1.getName () + "has "
                + human.getNumberOfLimbs () + " limbs \n" );
        System.out.println (human.getNumberOfEars () );
        System.out.println (human.getNumberOfLimbs () );
        System.out.println (human.getNumberOfLimbs () );

        human.playWithCat ( garfield, 7  );
        human1.playWithCat ( garfield, 3 );
    }
}

