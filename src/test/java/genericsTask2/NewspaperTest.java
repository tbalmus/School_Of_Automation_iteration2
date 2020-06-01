package genericsTask2;

import com.automation.school.natal.genericsTask2.Newspaper;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class NewspaperTest {
    static Newspaper newspaper1;
    @BeforeAll
    static void setup() {
        newspaper1 = new Newspaper("TIMES", LocalDate.parse("2017-05-14"), 44, 890000);
    }
    @Test
    public void equalsTest(){
        Newspaper newspaper2=new Newspaper("TIMES", LocalDate.parse("2017-05-14"), 44, 890000);
        assertEquals(newspaper1,newspaper2, "Check if identical newspapers are equal");
    }
    @Test
    public void equalsNegativeTest1(){
        Newspaper newspaper2=new Newspaper("TIME", LocalDate.parse("2017-05-14"), 44, 890000);
        assertNotEquals(newspaper1,newspaper2, "Check if newspapers with different names are not equal");
    }
    @Test
    public void equalsNegativeTest2(){
        Newspaper newspaper2=new Newspaper("TIMES", LocalDate.parse("2017-04-14"), 44, 890000);
        assertNotEquals(newspaper1,newspaper2, "Check if newspapers with different issue date are not equal");
    }
    @Test
    public void equalsNegativeTest3(){
        Newspaper newspaper2=new Newspaper("TIMES", LocalDate.parse("2017-05-14"), 42, 890000);
        assertNotEquals(newspaper1,newspaper2, "Check if newspapers with different page numbers are not equal");
    }
    @Test
    public void equalsNegativeTest4(){
        Newspaper newspaper2=new Newspaper("TIMES", LocalDate.parse("2017-05-14"), 44, 890001);
        assertNotEquals(newspaper1,newspaper2, "Check if newspapers with different number of copies are not equal");
    }
}
