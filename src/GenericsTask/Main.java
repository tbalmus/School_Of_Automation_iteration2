package GenericsTask;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        GenericFunctions<Integer> b1 = new GenericFunctions<Integer>();
//
//        b1.printArray(b1.intArray);
//        b1.printArray(b1.stringArray);
//

        Map<String, Books> bookMap = new TreeMap<>();
        bookMap.put("b1", new Books("BRAVE NEW WORLD", "ALDOUS HUXLEY"));
        bookMap.put("b2", new Books("NUMBER THE STARS", "LOIS LOWRY"));
        bookMap.put("b3", new Books("THE SUN ALSO RISES", "ERNEST HEMINGWAY"));
        bookMap.put("b4", new Books("THE DARK TOWER", "STEPHEN KING"));

        Library<Books> books = new Library<>();
        books.addItem(bookMap.get("b1"));
        books.addItem(bookMap.get("b2"));
        books.addItem(bookMap.get("b3"));
        books.addItem(bookMap.get("b4"));

        Iterator<Books> itr = books.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());


        Map<String, Video> videoMap = new TreeMap<>();
        videoMap.put("v1", new Video("North by Northwest", "Alfred Hitchcock"));
        videoMap.put("v2", new Video("Avatar", "James Cameron"));
        videoMap.put("v3", new Video("Catch Me If You Can", "Steven Spielberg"));
        videoMap.put("v4", new Video("The Irishman", "Martin Scorsese"));

        Library<Video> movies = new Library<>();
        movies.addItem(videoMap.get("v1"));
        movies.addItem(videoMap.get("v2"));
        movies.addItem(videoMap.get("v3"));
        movies.addItem(videoMap.get("v4"));

        for (Video index : movies) {
            System.out.println(index);
        }

        Map<String, Newspaper> newsMap = new TreeMap<>();
        newsMap.put("n1", new Newspaper("USA Today","Nicole Carroll"));
        newsMap.put("n2", new Newspaper("The Wall Street Journal","Matt Murray"));
        newsMap.put("n3", new Newspaper("The New York Times", "Dean Baquet"));
        newsMap.put("n4", new Newspaper("The Washington Post", "Martin Baron"));

        Library<Newspaper> newspaper = new Library<>();
        newspaper.addItem(newsMap.get("n1"));
        newspaper.addItem(newsMap.get("n2"));
        newspaper.addItem(newsMap.get("n3"));
        newspaper.addItem(newsMap.get("n4"));

        newspaper.retrieveItem(0);
        newspaper.addItem(newsMap.get("n1"));

        for (Newspaper index : newspaper) {
            System.out.println(index);
        }

    }
}
