package customarraylist;

import java.util.AbstractList;

@SuppressWarnings("unchecked")
public class TddArrayList<E> extends AbstractList<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private final E[] backingArray;
    private int size=0;

    public TddArrayList() {
        this.backingArray=(E[])new Object[DEFAULT_CAPACITY];
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
        throwIfIndexIsOutOfBounds(index, size);
        for(int i=size-1; i>=index; i--){
            backingArray[i+1]=backingArray[i];
        }
        backingArray[index]=element;
        size++;
    }

    @Override
    public E remove(int index) {
        throwIfIndexIsOutOfBounds(index, size-1);
        E removedElement = backingArray[index];

        for(int i=index; i<size-1; i++){

                backingArray[i] = backingArray[i + 1];
        }

        backingArray[size-1]=null;
        size--;
        return removedElement;
    }

    @Override
    public E set(int index, E element) {
        throwIfIndexIsOutOfBounds(index,size-1);
        E unsetElement = backingArray[index];
        backingArray[index]=element;
        return unsetElement;
    }

    int currentCapacity(){
        return backingArray.length;
    }

    private void throwIfIndexIsOutOfBounds(int index, int maximumIndex) {
        if (index <0 || index > maximumIndex){
            throw new IndexOutOfBoundsException
                    ("index " + index + "out of bounds");
        }
    }
}
