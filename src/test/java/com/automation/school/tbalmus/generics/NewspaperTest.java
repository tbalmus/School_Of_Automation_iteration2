package com.automation.school.tbalmus.generics;

import org.junit.jupiter.api.Test;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class NewspaperTest {
    List < Newspaper > list = Arrays.asList (
            new Newspaper ( 1 , "Daily News" , 10.50 ) ,
            new Newspaper ( 2 , "Times" , 13.20 ) ,
            new Newspaper ( 3 , "Weekly News" , 5.0 )
    );

    @Test
    void getPrice () {
        assertThat ( list.get ( 0 ).getPrice ( ) , is ( closeTo ( 10.0 , 0.5 ) ) );
    }

    @Test
    void findCertainNewspaper () {
        assertThat ( list , hasItem ( equalToObject ( new Newspaper ( 1 , "Daily News" , 10.50 ) ) ) );
    }

    @Test
    void verifyThatInListIsNotNullObject () {
        assertThat ( list , everyItem ( notNullValue ( ) ) );
    }
}