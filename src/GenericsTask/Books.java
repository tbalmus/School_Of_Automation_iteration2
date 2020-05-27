package GenericsTask;

import java.util.Iterator;

public class Books{
    int index;
    String title;
    String author;

    public Books(String title, String author) {
        this.index = hashCode();
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Books{" +
                "index=" + index +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
