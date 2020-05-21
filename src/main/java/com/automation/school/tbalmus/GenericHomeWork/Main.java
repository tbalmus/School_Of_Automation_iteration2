package com.automation.school.tbalmus.GenericHomeWork;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main ( String[] args ) {
        List < Newspaper > newspapers = new ArrayList <> ();
        newspapers.add ( new Newspaper (1 , "Daily News" ));
        newspapers.add ( new Newspaper (2 , "Times" ));
        newspapers.add ( new Newspaper (3 , "Weekly News" ));

        List < Video > videos = new ArrayList <> ();
        videos.add ( new Video (4 , "Movie", "Titanic", 110));
        videos.add ( new Video (5 , "Culinary Show", "Master Chef", 30 ));
        videos.add ( new Video (6 , "Cartoon ", "The Little Mermaid", 90));

        List < Book > books = new ArrayList <> ();
        books.add ( new Book (7 , "Dracula", "Bram Stoker"));
        books.add ( new Book (8 , "The Adventures of Sherlock Holmes", "Arthur Conan Doyle"));
        books.add ( new Book (9 , "The Mystery of the Yellow Room", "Gaston Leroux" ));

        Library <Book> library1= new Library <>("Book");
        Book newBook = new Book (10, "Java", "O'Reilly");
        library1.addItem(newBook);

        Library <Video> videoLibrary = new Library <> ( "Video" );
        videoLibrary.addItem ( new Video ( 11, "Live", "Qwe", 30 ) );
        System.out.println (videoLibrary );


        System.out.println (books.toString() + "\n");
        System.out.println ( library1 + "\n");
        System.out.println (newspapers.toString() + "\n");
        System.out.println (videos.toString() + "\n");
    }
}
