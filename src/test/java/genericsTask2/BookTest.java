package genericsTask2;

import com.automation.school.natal.genericsTask2.Book;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class BookTest {
    static Book book1;
    static Book book2;
    static Logger log = LoggerFactory.getLogger(BookTest.class);

    @BeforeAll
    public static void setup() {
        book1 = new Book("Financier", LocalDate.parse("2012-12-12"), 274, "Theodore Dreiser", 2);
    }

    @DisplayName( "Compare 2 identical books" )
    @Test
    public void equalsTest() {
        book2 = new Book("Financier", LocalDate.parse("2012-12-12"), 274, "Theodore Dreiser", 2);
        assertThat("Identical books are not equal", book1.equals(book2), is(true));
        log.debug('\"' + book1.toString() + " issue date: " + book1.getIssueDate() + " page number: " + book1.getPages() +
                "\" compared to:\n\"" + book2.toString() + " issue date: " + book2.getIssueDate() + " page number: " + book2.getPages() + '\"');
    }

    @DisplayName( "Compare 2 books with different names" )
    @Test
    public void equalsNegativeTest1() {
        book2 = new Book("Financiers", LocalDate.parse("2012-12-12"), 274, "Theodore Dreiser", 2);
        assertThat("Books with different names are equal", book1.equals(book2), is(false));
        log.debug('\"' + book1.getName() + "\" compared to: \"" + book2.getName() + '\"');
    }

    @DisplayName( "Compare 2 books with different issue dates" )
    @Test
    public void equalsNegativeTest2() {
        book2 = new Book("Financier", LocalDate.parse("2012-12-11"), 274, "Theodore Dreiser", 2);
        assertThat("Books with different issue date are equal", book1.equals(book2), is(false));
        log.debug("\"" + book1.getIssueDate() + "\" compared to: \"" + book2.getIssueDate() + '\"');
    }

    @DisplayName( "Compare 2 books with different author" )
    @Test
    public void equalsNegativeTest3() {
        book2 = new Book("Financier", LocalDate.parse("2012-12-12"), 274, "Theodore Dreisero", 2);
        assertThat("Books with different author are equal", book1.equals(book2), is(false));
        log.debug("\"" + book1.getAuthor() + "\" compared to: \"" + book2.getAuthor() + '\"');
    }

    @DisplayName( "Compare 2 books with different editions" )
    @Test
    public void equalsNegativeTest4() {
        book2 = new Book("Financier", LocalDate.parse("2012-12-12"), 274, "Theodore Dreiser", 4);
        assertThat("Books with different edition are equal", book1.equals(book2), is(false));
        log.debug("\"" + book1.getEdition() + "\" compared to: \"" + book2.getEdition() + '\"');
    }

    @DisplayName( "Compare 2 books with different page number" )
    @Test
    public void equalsNegativeTest5() {
        book2 = new Book("Financier", LocalDate.parse("2012-12-12"), 205, "Theodore Dreiser", 2);
        assertThat("Books with different page number are equal", book1.equals(book2), is(false));
        log.debug("\"" + book1.getPages() + "\" compared to: \"" + book2.getPages() + '\"');
    }

}
