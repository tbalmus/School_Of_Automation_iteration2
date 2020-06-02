package com.automation.school.tbalmus.generics;

import java.util.ArrayList;

public class Main {
    public static void main ( String[] args ) {
        ArrayList < Newspaper > newspapers = new ArrayList <> ();
        newspapers.add ( new Newspaper (1 , "Daily News" , 10.50));
        newspapers.add ( new Newspaper (2 , "Times", 13.20 ));
        newspapers.add ( new Newspaper (3 , "Weekly News", 5.0));

        ArrayList < Video > videos = new ArrayList <> ();
        videos.add ( new Video (4 , "Movie", "Titanic", 110, 110.00));
        videos.add ( new Video (5 , "Culinary Show", "Master Chef", 30 , 150.50));
        videos.add ( new Video (6 , "Cartoon ", "The Little Mermaid", 90, 99.99));

        ArrayList < Book > books = new ArrayList <> ();
        books.add ( new Book (7 , "Dracula", "Bram Stoker", 49.99));
        books.add ( new Book (8 , "The Adventures of Sherlock Holmes", "Arthur Conan Doyle", 60.50));
        books.add ( new Book (9 , "The Mystery of the Yellow Room", "Gaston Leroux", 30.00 ));

        Library <Book> library1= new Library <>("Book");
        Book newBook = new Book (10, "Java", "O'Reilly", 59.99);
        library1.addItem(newBook);

        Library <Video> videoLibrary = new Library <> ( "Video" );
        videoLibrary.addItem ( new Video ( 11, "Live", "Qwe", 30, 56.00 ) );
        System.out.println (videoLibrary );


        System.out.println (books.toString() + "\n");
        System.out.println ( library1 + "\n");
        System.out.println (newspapers.toString() + "\n");
        System.out.println (videos.toString() + "\n");


        System.out.println ("The books which author's name begin with letter: " );
        ArrayList<Book> listWithAuthorsFirstLetter = new ArrayList <> (  );
        for (int i= 0; i<books.size (); i++){
            if ( books.get ( i ).authorBeginsWithCertainLetter ( 'B') || books.get ( i ).authorBeginsWithCertainLetter ( 'G' ))  {
                listWithAuthorsFirstLetter.add ( books.get ( i ) );
            }
        }
        System.out.println (listWithAuthorsFirstLetter );


        System.out.println ("The cheapest newspaper is : " );
        cheapestNewspaper (newspapers);

        System.out.println ("The longest Video is "  );
        getLongVideo ( videos );
    }
    public static Newspaper cheapestNewspaper (ArrayList<Newspaper> nPList) {
        double min = nPList.get ( 0 ).getPrice ();
        Newspaper cheapest = nPList.get ( 0 );
        for (int i=1 ; i<nPList.size () ; i++) {
            if (min >= nPList.get ( i ).getPrice ()){
                min = nPList.get ( i ).getPrice ();
                cheapest = nPList.get ( i );
            }
        }
        return cheapest;
    }
    public static void analyseNewsPaperPrices( ArrayList<Newspaper> newListNewspaper){
        for (int i= 0; i < newListNewspaper.size (); i++){
            newListNewspaper.get ( i ).isCheap();
        }
    }

    public static ArrayList< Video> getLongVideo (ArrayList<Video> videos){
        ArrayList<Video> longVideos = new ArrayList <> (  );
        for (int i = 0 ; i< videos.size (); i++){
            if (videos.get ( i ).isLongVideo ()){
                longVideos.add ( videos.get ( i ) );
            }
        }
        return longVideos;
    }
}
