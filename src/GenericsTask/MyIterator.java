package GenericsTask;

import java.util.Iterator;
import java.util.List;

public class MyIterator<T> implements Iterator {

        int indexPosition;
        List<T> internalList;

        public MyIterator(List<T> internalList) {
            this.internalList = internalList;
        }


        @Override
        public boolean hasNext() {
            if (internalList.size() >= indexPosition + 1) {
                return true;
            }
            return false;
        }

        @Override
        public T next() {
            T value = internalList.get(indexPosition);
            indexPosition++;
            return value;
        }

        @Override
        public void remove() {

        }


}
