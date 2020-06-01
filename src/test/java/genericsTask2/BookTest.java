package genericsTask2;

import com.automation.school.natal.genericsTask2.Book;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class BookTest {
    static Book book1;

    @BeforeAll
    public static void setup() {
        book1 = new Book("Financier", LocalDate.parse("2012-12-12"), 274, "Theodore Dreiser", 2);
    }

    @Test
    public void equalsTest() {
        Book book2 = new Book("Financier", LocalDate.parse("2012-12-12"), 274, "Theodore Dreiser", 2);
        assertThat("Check if same books are equal", book1.equals(book2), is(true));
    }

    @Test
    public void equalsNegativeTest1() {
        Book book2 = new Book("Financiers", LocalDate.parse("2012-12-12"), 274, "Theodore Dreiser", 2);
        assertThat("Check if books are not equal if name is different", book1.equals(book2), is(false));
    }

    @Test
    public void equalsNegativeTest2() {
        Book book2 = new Book("Financier", LocalDate.parse("2012-12-11"), 274, "Theodore Dreiser", 2);
        assertThat("Check if books are not equal if issue date is different", book1.equals(book2), is(false));
    }

    @Test
    public void equalsNegativeTest3() {
        Book book2 = new Book("Financier", LocalDate.parse("2012-12-12"), 274, "Theodore Dreisero", 2);
        assertThat("Check if books are not equal if author is different", book1.equals(book2), is(false));
    }

    @Test
    public void equalsNegativeTest4() {
        Book book2 = new Book("Financier", LocalDate.parse("2012-12-12"), 274, "Theodore Dreiser", 4);
        assertThat("Check if books are not equal if edition is different", book1.equals(book2), is(false));
    }

    @Test
    public void equalsNegativeTest5() {
        Book book2 = new Book("Financier", LocalDate.parse("2012-12-12"), 205, "Theodore Dreiser", 2);
        assertThat("Check if books are not equal if number of pages is different", book1.equals(book2), is(false));
    }
}
