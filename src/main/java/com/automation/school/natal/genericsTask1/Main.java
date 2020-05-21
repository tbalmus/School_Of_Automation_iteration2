package com.automation.school.natal.genericsTask1;

public class Main {
    public static <T> void printElements(T[] array) {
        System.out.println("Here are elements of the array of " + array[0].getClass().getSimpleName() + "s");
        for (T t : array)
            System.out.print(t + " ");
        System.out.println(";");
    }

    public static void main(String[] args) {
        Integer[] array1 = new Integer[5];
        array1[0] = 2;
        array1[1] = array1[0]*array1[0];
        array1[2] = array1[1]*array1[1];
        array1[3] = array1[2]*array1[2];
        array1[4] = array1[3]*array1[3];

        String[] array2 = new String[8];
        array2[0] = "Yesterday,";
        array2[1] = "all";
        array2[2] = "my";
        array2[3] = "troubles";
        array2[4] = "seem";
        array2[5] = "so";
        array2[6] = "far";
        array2[7] = "away";

        printElements(array1);
        System.out.println();
        printElements(array2);
    }
}
