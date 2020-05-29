package genericsTask2;

import com.automation.school.natal.genericsTask2.Video;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class VideoTest {
    static Video video1;

    @BeforeAll
    static void setup() {
        video1 = new Video("Java Tutorial", LocalDate.parse("2017-03-14"), 900);
    }

    @Test
    void equalsTest() {
        Video video2 = new Video("Java Tutorial", LocalDate.parse("2017-03-14"), 900);
        assertEquals(video1, video2, "Check if identical videos are equal");
    }
    @Test
    void equalsNegativeTest1(){
        Video video2 = new Video("Java Tutorials", LocalDate.parse("2017-03-14"), 900);
        assertNotEquals(video1, video2, "Check if videos with different name are not equal");
    }
    @Test
    void equalsNegativeTest2(){
        Video video2 = new Video("Java Tutorial", LocalDate.parse("2017-03-15"), 900);
        assertNotEquals(video1, video2, "Check if videos with different issue date are not equal");
    }
    @Test
    void equalsNegativeTest3(){
        Video video2 = new Video("Java Tutorial", LocalDate.parse("2017-03-14"), 800);
        assertNotEquals(video1, video2, "Check if videos with different length are not equal");
    }
}
