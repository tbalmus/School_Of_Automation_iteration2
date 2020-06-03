package genericsTask2;

import com.automation.school.natal.genericsTask2.Newspaper;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class NewspaperTest {
    static Newspaper newspaper1;
    static Newspaper newspaper2;
    static Logger log = LoggerFactory.getLogger(NewspaperTest.class);

    @BeforeAll
    static void setup() {
        newspaper1 = new Newspaper("TIMES", LocalDate.parse("2017-05-14"), 44, 890000);
    }

    @DisplayName( "Compare 2 identical newspapers" )
    @Test
    public void equalsTest() {
        newspaper2 = new Newspaper("TIMES", LocalDate.parse("2017-05-14"), 44, 890000);
        assertEquals(newspaper1, newspaper2, "Check if identical newspapers are equal");
        log.debug('\"' + newspaper1.toString() + ", copies: " + newspaper1.getCopies() + ", pages: " + newspaper1.getPages() + "\" compared to: \""
                + newspaper2.toString() + ", copies: " + newspaper2.getCopies() + ", pages: " + newspaper2.getPages() + '\"');
    }

    @DisplayName( "Compare 2 newspapers with different names" )
    @Test
    public void equalsNegativeTest1() {
        newspaper2 = new Newspaper("TIME", LocalDate.parse("2017-05-14"), 44, 890000);
        assertNotEquals(newspaper1, newspaper2, "Check if newspapers with different names are not equal");
        log.debug('\"' + newspaper1.getName() + "\" compared to: \"" + newspaper2.getName() + '\"');
    }

    @DisplayName( "Compare 2 newspapers with different issue dates" )
    @Test
    public void equalsNegativeTest2() {
        newspaper2 = new Newspaper("TIMES", LocalDate.parse("2017-04-14"), 44, 890000);
        assertNotEquals(newspaper1, newspaper2, "Check if newspapers with different issue date are not equal");
        log.debug("\"" + newspaper1.getIssueDate() + "\" compared to: \"" + newspaper2.getIssueDate() + '\"');
    }

    @DisplayName( "Compare 2 newspapers with different page numbers" )
    @Test
    public void equalsNegativeTest3() {
        newspaper2 = new Newspaper("TIMES", LocalDate.parse("2017-05-14"), 42, 890000);
        assertNotEquals(newspaper1, newspaper2, "Check if newspapers with different page numbers are not equal");
        log.debug('\"' + newspaper1.getPages() + "\" compared to: \"" + newspaper2.getPages() + '\"');
    }

    @DisplayName( "Compare 2 newspapers with different number of copies" )
    @Test
    public void equalsNegativeTest4() {
        newspaper2 = new Newspaper("TIMES", LocalDate.parse("2017-05-14"), 44, 890001);
        assertNotEquals(newspaper1, newspaper2, "Check if newspapers with different number of copies are not equal");
        log.debug('\"' + newspaper1.getCopies() + "\" compared to: \"" + newspaper2.getCopies() + '\"');
    }

}
