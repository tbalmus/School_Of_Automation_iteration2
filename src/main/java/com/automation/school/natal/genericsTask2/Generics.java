package com.automation.school.natal.genericsTask2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {

        Book book1 = new Book("Robinson Crusoe", 300, "Daniel Defoe", 1);
        Video video1 = new Video("ProTV News", 35);
        Newspaper newspaper1 = new Newspaper("Flux", 30, 35000);

        Library<Book> books = new Library<>("Book Library");
        books.storeMedia(book1);
        books.storeMedia(new Book("Idiot", LocalDate.parse("2005-02-10"), 500, "Fedor Dostoyevsky", 3));
        books.storeMedia(new Book("Financier", LocalDate.parse("2012-12-12"), 274, "Theodore Dreiser", 2));
        books.storeMedia(new Book("Anna Karenina", LocalDate.parse("1999-04-17"), 287, "Lev Tolstoy", 4));
        books.storeMedia(new Book("Ivanhoe", LocalDate.parse("2005-02-10"), 312, "Walter Scott", 4));
        books.storeMedia(new Book("Pride and Prejudice", LocalDate.parse("2008-08-29"), 412, "Jane Austen", 3));
        System.out.println(books.getName() + ":\n" + books.getStorage());
        books.retrieveMedia(books.getStorage().get(3));
        System.out.println(books.getName() + ":\n" + books.getStorage());

        List<Video> videoList = new ArrayList<>();
        videoList.add(new Video("Java Tutorial", LocalDate.parse("2017-03-14"), 900));
        videoList.add(new Video("Generics Tutorial", LocalDate.parse("2019-09-09"), 121));
        videoList.add(new Video("OOP Tutorial", LocalDate.parse("2009-07-24"), 125));
        videoList.add(new Video("BBC Digest", LocalDate.parse("2020-02-29"), 60));
        videoList.add(new Video("WW II Documentary", LocalDate.parse("2018-05-09"), 245));
        Library<Video> videos = new Library<>("Video Library", videoList);
        videos.storeMedia(video1);
        System.out.println(videos.getName() + ":\n" + videos.getStorage());
        videos.retrieveMedia(videos.getStorage());
        System.out.println(videos.getName() + ":\n" + videos.getStorage());


        List<Newspaper> npList = new ArrayList<>();
        npList.add(new Newspaper("TIMES", LocalDate.parse("2017-03-14"), 36, 900000));
        npList.add(new Newspaper("TIMES", LocalDate.parse("2017-04-14"), 40, 850000));
        npList.add(new Newspaper("TIMES", LocalDate.parse("2017-05-14"), 44, 890000));
        npList.add(new Newspaper("TIMES", LocalDate.parse("2017-06-14"), 48, 900000));
        npList.add(new Newspaper("TIMES", LocalDate.parse("2017-07-14"), 42, 910000));
        npList.add(new Newspaper("Washington Post", LocalDate.parse("2015-01-01"), 28, 150000));
        npList.add(new Newspaper("Washington Post", LocalDate.parse("2015-01-08"), 32, 170000));
        npList.add(new Newspaper("Washington Post", LocalDate.parse("2015-01-15"), 26, 180000));
        npList.add(new Newspaper("Washington Post", LocalDate.parse("2015-01-22"), 28, 150000));
        npList.add(new Newspaper("Washington Post", LocalDate.parse("2017-03-29"), 30, 190000));

        Library<Newspaper> newspapers = new Library<>("Newspapers Library", npList);
        newspapers.storeMedia(newspaper1);
        System.out.println(newspapers.getName() + ":\n" + newspapers.getStorage());
        newspapers.retrieveMedia("TIMES");
        System.out.println(newspapers.getName() + ":\n" + newspapers.getStorage());


        BookLibrary bookLibrary= new BookLibrary("Central Library", books.getStorage());
        System.out.println(bookLibrary.getName()+'\n'+bookLibrary.getStorage());
        bookLibrary.storeBook(new Book("Eat,Pray,Love",LocalDate.parse("2018-07-07"), 227,"Elizabeth Gilbert", 1));
        System.out.println(bookLibrary.getName()+'\n'+bookLibrary.getStorage());
        bookLibrary.retrieveBook("Pride and Prejudice");
        System.out.println(bookLibrary.getName()+'\n'+bookLibrary.getStorage());
    }

}
