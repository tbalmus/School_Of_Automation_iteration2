package genericsTask2;

import com.automation.school.natal.genericsTask2.Library;
import com.automation.school.natal.genericsTask2.Newspaper;
import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class LibraryTestHamcrest {
    static Newspaper newspaper;
    static Library<Newspaper> library;
    static List<Newspaper> storage;
    @BeforeAll
    static void setup(){
    newspaper = new Newspaper("TIMES", LocalDate.parse("2017-03-14"), 36, 900000);
    library = new Library<>("Test Library");
    storage = library.getStorage();}
    @BeforeEach
    void setupTest(){
        library.storeMedia(newspaper);
    }
    @Test
    public void retrieveMediaTestByName() {
        library.retrieveMedia(newspaper.getName());
        assertThat("Check is newspaper was removed from storage by name",storage, not(hasItem(newspaper)));

    }

    @Test
    public void retrieveMediaTestByObject() {
        library.retrieveMedia(newspaper);
        assertThat("Check is newspaper was removed from storage by item",storage, not(hasItem(newspaper)));
    }

    @Test
    public void retrieveAllMediaTest() {
        library.retrieveMedia(storage);
        assertThat("Check that all newspapers from storage were removed", storage.size(),is(0));
    }
}