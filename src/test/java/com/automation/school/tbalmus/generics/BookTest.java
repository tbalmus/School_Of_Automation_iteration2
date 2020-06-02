package com.automation.school.tbalmus.generics;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BookTest {

    @Test
    void authorBeginsWithBLetter () {
        Book book = new Book (7 , "Dracula", "Bram Stoker", 49.99);
        char actualResult = book.authorName.charAt(0);
        assertEquals('B', actualResult, "Check that the first letter of author's name is - B");
    }

    @Test
    void authorWithSLetter (){
        Book book = new Book ( 7 , "Dracula" , "Bram Stoker" , 49.99 );
        char actualResult = book.authorName.charAt ( 5 );
        assertEquals ( 'S' , actualResult , "Check that the first letter of author's name is - B" );
    }

    @Test
    void authorBeginsWithSLetterNegative () throws  Exception{
        Book book = new Book (8, "The Adventures of Sherlock Holmes", "Arthur Conan Doyle", 60.50);

        char actualResult = book.authorName.charAt(0);
        assertEquals('A', actualResult, "Check that the first letter of author's name is - A");
    }

}

