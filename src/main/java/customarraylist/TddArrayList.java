package customarraylist;

import java.util.AbstractList;

public class TddArrayList<E> extends AbstractList<E> {

    private int size=0;

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public void add(int index, E element) {
        size++;
    }
}
