package book_test;

import com.automation.school.ad_main.Generic.OfflineLibrary.Book;
import com.automation.school.ad_main.Generic.OfflineLibrary.GenericLibrary;
import com.automation.school.ad_main.Generic.OfflineLibrary.Video;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

//import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("Class for unit tests ")
public class TestBook {
    @BeforeAll
    public static void hint() {
        System.out.println("Test Cycle");
    }

    @BeforeEach
    public void setup() {
        System.out.println("Test is run");

    }

    // @DynamicTest
    @Test
    public void testCreateBook() {
        Book book = new Book("Ulysses", "Marcel Proust");
        assertEquals(book, book);

    }


    @DisplayName("testGetBook  unit tests ")

    @RepeatedTest(value = 2, name = "Ulysses")

    public void testGetBook() {
        Book book = new Book("Ulysses", "Marcel Proust");
        assertEquals(book, book);
        String newName = book.getName();
        assertEquals("Ulysses", newName);
    }



    @ValueSource(strings = {"Ulysses", "Marcel Proust"})
    @DisplayName("ParameterizedTest testGetBook  unit tests ")
    public void testGetBooks() {
        Book book = new Book("Marcel", "Marcel Proust");
        assertEquals(book, book);
        String newName = book.getName();
        assertEquals("Marcel", newName,"Check returned string");
        assertThat(newName).isNotNull().isEqualTo("Marcel");

    }

    @Test
    public void testBooksLibrary() {
        Book book = new Book("Ulysses", "Marcel Proust");
        GenericLibrary<Book> libraryBooks = new GenericLibrary<>();
         libraryBooks.addAnItem(book);
          String result = libraryBooks.toString(book);
        assertEquals("Book name: Ulyssesis writen by Marcel Proust Book name: Ulyssesis writen by Marcel Proust", result,"Check returned string");



    }

    @Test
    public void testCreateVideo() {
        Video video1 = new Video("John Wick", "Chad Stahelski");
        assertEquals("Video nameJohn Wick directed by Chad Stahelski", video1.toString());
        assertNotEquals("video1", video1);
        GenericLibrary<Video> libraryVideos = new GenericLibrary<>();
        libraryVideos.addAnItem(video1);
        String result = libraryVideos.toString(video1);
        assertEquals("Video nameJohn Wick directed by Chad Stahelski Video nameJohn Wick directed by Chad Stahelski",result);
        //assertArrayEquals(libraryVideos);
        //libraryVideos.(video1);
        //  a
        // assertDoesNotThrow(libraryVideos);
    }


}
