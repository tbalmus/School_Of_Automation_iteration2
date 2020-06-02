package com.automation.school.tbalmus.generics;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.hasProperty;
import static org.junit.jupiter.api.Assertions.*;
@Tag ( "Video" )
public class VideoTest {

    @Test
    void isLongVideo () {
        Video video = new Video ( 4 , "Movie" , "Titanic" , 110 , 110.00 );
        boolean actualResult = video.getDuration ( ) >= 110;
        assertEquals ( true , actualResult , "The video is from longer or equal to 110 minutes" );

    }

    @Test
    @Tag( "Negative" )
    void isLongVideoNegative () {
        Video video = new Video ( 4 , "Movie" , "Titanic" , 110 , 110.00 );
        boolean actualResult = video.getDuration ( ) >= 120;
        assertThat ( "The video is from longer or equal to 120 minutes" , video.getDuration ( ) , greaterThanOrEqualTo ( 120 ) );

    }

    @Test
    void getDuration () {
        Video video = new Video ( 6 , "Cartoon " , "The Little Mermaid" , 90 , 99.99 );
        int actualResult = video.duration;
        assertEquals ( 90 , actualResult , "The video has a duration of 90 minutes" );
    }
}