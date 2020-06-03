package genericsTask2;

import com.automation.school.natal.genericsTask2.Video;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class VideoTest {
    static Video video1;
    static Video video2;
    static Logger log = LoggerFactory.getLogger(VideoTest.class);

    @BeforeAll
    static void setup() {
        video1 = new Video("Java Tutorial", LocalDate.parse("2017-03-14"), 900);
    }

    @DisplayName( "Compare 2 identical videos" )
    @Test
    public void equalsTest() {
        video2 = new Video("Java Tutorial", LocalDate.parse("2017-03-14"), 900);
        assertEquals(video1, video2, "Check if identical videos are equal");
        log.debug('\"' + video1.toString() + ", length: " + video1.getLengthMinutes() + "\" compared to: \""
                + video2.toString() + ", length: " + video2.getLengthMinutes() + '\"');
    }

    @DisplayName( "Compare 2 videos with different name" )
    @Test
    public void equalsNegativeTest1() {
        video2 = new Video("Java Tutorials", LocalDate.parse("2017-03-14"), 900);
        assertNotEquals(video1, video2, "Check if videos with different name are not equal");
        log.debug('\"' + video1.getName() + "\" compared to: \"" + video2.getName() + '\"');
    }

    @DisplayName( "Compare 2 videos with different issue date" )
    @Test
    public void equalsNegativeTest2() {
        video2 = new Video("Java Tutorial", LocalDate.parse("2017-03-15"), 900);
        assertNotEquals(video1, video2, "Check if videos with different issue date are not equal");
        log.debug("\"" + video1.getIssueDate() + "\" compared to: \"" + video2.getIssueDate() + '\"');
    }

    @DisplayName( "Compare 2 videos with different length" )
    @Test
    public void equalsNegativeTest3() {
        video2 = new Video("Java Tutorial", LocalDate.parse("2017-03-14"), 800);
        assertNotEquals(video1, video2, "Check if videos with different length are not equal");
        log.debug('\"' + video1.getLengthMinutes() + "\" compared to: \"" + video2.getLengthMinutes() + '\"');
    }
}
