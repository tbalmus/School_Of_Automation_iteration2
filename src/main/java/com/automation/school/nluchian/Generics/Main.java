package com.automation.school.nluchian.Generics;


public class Main {
    public static void main(String[] args) {

        Library<Book> books = new Library<>();
        Library<Video> video = new Library<>();
        Library<Newspaper> newspaper = new Library<>();

        Book book1 = new Book("ggg", "comedy", 1);
        Book book2 = new Book("hhh", "horror", 2);
        Book book3 = new Book("jjj", "romance", 3);
        Book book4 = new Book("ddd", "action", 4);


        books.addItem(book1);
        books.addItem(book2);
        books.addItem(book3);
        books.addItem(book4);


        Video video1 = new Video("blockbuster", 2000);
        Video video2 = new Video("action", 2001);
        Video video3 = new Video("comedy", 2002);
        Video video4 = new Video("sciFi", 2003);

        video.addItem(video1);
        video.addItem(video2);
        video.addItem(video3);
        video.addItem(video4);

        Newspaper newspaper1 = new Newspaper("dailyPlanet", 5);
        Newspaper newspaper2 = new Newspaper("notDailyPlanet", 6);
        Newspaper newspaper3 = new Newspaper("alwaysDailyPlanet", 7);
        Newspaper newspaper4 = new Newspaper("whyDailyPlanet", 8);

        newspaper.addItem(newspaper1);
        newspaper.addItem(newspaper2);
        newspaper.addItem(newspaper3);
        newspaper.addItem(newspaper4);


        System.out.println("This is the list of all books " + books.getStorage());
        System.out.println("This is the list of all videos " + video.getStorage());
        System.out.println("This is the list of all newspaper " + newspaper.getStorage());

        // books.getElementByIndex(1); // refers to method getElementByIndex similar to getter (getStorage)

        video.removeItem(video3);
        System.out.println(video);
//     method removeItem is working with all the items from all 3 collections

        }
    }

