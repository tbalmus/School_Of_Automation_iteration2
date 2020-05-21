package com.automation.school.tbalmus.GenericHomeWork;

public class Cats {
    public  static <E> void printArray ( E[] arrayValues ){
        for (E cats : arrayValues){
            System.out.println ( cats );
        }
    }

    public static void main ( String[] args ) {
        Integer[] intCatId = {23, 56, 87, 25};
        String[] strCatName = {"Lola", "Mooney", "Max", "Garfield"};
        System.out.println ("This is a list of the cats to adoption: ");
        printArray (intCatId);
        printArray ( strCatName );
    }
}
