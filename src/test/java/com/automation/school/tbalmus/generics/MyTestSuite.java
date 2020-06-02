package com.automation.school.tbalmus.generics;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith( JUnitPlatform.class )
//@IncludeTags ( "Video & !Negative" )
@SelectClasses( {BookTest.class, NewspaperTest.class, BookTest.class, VideoTest.class} )
public class MyTestSuite {
}