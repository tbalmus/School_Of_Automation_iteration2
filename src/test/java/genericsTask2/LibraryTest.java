package genericsTask2;

import com.automation.school.natal.genericsTask2.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


public class LibraryTest {
    static final Media book = new Book("Idiot", LocalDate.parse("2005-02-10"), 500, "Fedor Dostoyevsky", 3);
    static final Media newspaper = new Newspaper("TIMES", LocalDate.parse("2017-03-14"), 36, 900000);
    static final Media video = new Video("Java Tutorial", LocalDate.parse("2017-03-14"), 900);
    static Library<Media> library;
    static List<Media> storage;
    static Logger log = LoggerFactory.getLogger(LibraryTest.class);

    static Stream<Media> mediaProvider() {
        return Stream.of(book, newspaper, video);
    }

    @BeforeAll
    public static void setup() {
        library = new Library<>("Test Library");
        storage = library.getStorage();
    }

    @ParameterizedTest
    @Order( 1 )
    @MethodSource( "mediaProvider" )
    public void retrieveMediaTestByName(Media media) {
        library.storeMedia(media);
        library.retrieveMedia(media.getName());
        assertFalse(storage.contains(media));
    }

    @ParameterizedTest
    @Order( 2 )
    @MethodSource( "mediaProvider" )
    public void retrieveMediaTestByObject(Media media) {
        library.storeMedia(media);
        library.retrieveMedia(media);
        assertFalse(storage.contains(media));
    }

    @ParameterizedTest
    @Order( 3 )
    @MethodSource( "mediaProvider" )
    public void retrieveAllMediaTest(Media media) {
        library.storeMedia(media);
        library.retrieveMedia(storage);
        assertTrue(storage.isEmpty());
    }

    @ParameterizedTest
    @Order( 4 )
    @MethodSource( "mediaProvider" )
    public void storeBookTest(Media media) {
        library.storeMedia(media);
        assertEquals(media, storage.get(storage.size() - 1));
    }
}
