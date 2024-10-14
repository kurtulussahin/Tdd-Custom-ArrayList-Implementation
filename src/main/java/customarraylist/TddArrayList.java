package customarraylist;

import java.util.AbstractList;

@SuppressWarnings("unchecked")
public class TddArrayList<E> extends AbstractList<E> {

    private final E[] backingArray;
    private int size=0;

    public TddArrayList() {
        this.backingArray=(E[])new Object[10];
        this.size = 0;
    }

    @Override
    public E get(int index) {
        return backingArray[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int index, E element) {

        for(int i=size-1; i>=index; i--){
            backingArray[i+1]=backingArray[i];
        }
        backingArray[index]=element;
        size++;
    }

    @Override
    public E remove(int index) {

        E removedElement = backingArray[index];

        for(int i=index; i<size-1; i++){

                backingArray[i] = backingArray[i + 1];
        }

        backingArray[size-1]=null;
        size--;
        return removedElement;
    }

    int currentCapacity(){
        return backingArray.length;
    }
}
