package GenericsTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library <T> implements Iterable<T> {

    List<T> shelf;

    public Library() {
        this.shelf = new ArrayList<>();
    }

    void addItem(T item) {
        shelf.add(item);
    }

    T getElementByIndex(int index) {
        return shelf.get(index);
    }

    void retrieveItem (int index) {
        System.out.println("This item will be retrived from library: "+shelf.get(index));
        shelf.remove(index);
    }

    // remove

    @Override
    public Iterator<T> iterator() {
        return shelf.iterator();
    }


}
