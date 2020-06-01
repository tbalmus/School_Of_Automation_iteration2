package genericsTask2;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;


@RunWith( JUnitPlatform.class )
@SelectClasses( {VideoTest.class, NewspaperTest.class, BookTest.class, LibraryTest.class} )
public class GenericSuite {
}
