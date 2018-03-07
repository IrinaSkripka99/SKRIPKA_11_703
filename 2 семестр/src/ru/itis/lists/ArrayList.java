package ru.itis.lists;

import java.util.Iterator;

/**
 * 15.02.2018
 * ArrayList
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ArrayList<T> implements List<T> {

    private static final int DEFAULT_SIZE = 10;

    private T elements[];

    private int count;

    public ArrayList() {
        this.elements = (T[])(new Object[DEFAULT_SIZE]);
        this.count = 0;
    }

    @Override
    public int indexOf(T element) {
        for (int i = 0; i < count; i++) {
            if (element.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public T get(int index) {
        if (index >= 0 && index < count) {
            return elements[index];
        } else throw new IllegalArgumentException();
    }

    @Override
    public void reverse() {

    }

    @Override
    public void showList() {

    }

    @Override
    public void addToBegin(T element) {

    }

    @Override
    public void add(T element) {
        if (count < elements.length) {
            this.elements[count++] = element;
        } else throw new IllegalArgumentException();
    }

    @Override
    public void remove(T element) {

    }

    @Override
    public boolean contains(T element) {
        return false;
    }

    @Override
    public int size() {
        return count;
    }

    private class ArrayListIterator implements Iterator<T> {
        // указывает на текущий индекс
        private int currentIndex;

        public ArrayListIterator() {
            this.currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public T next() {
            T result = elements[currentIndex];
            currentIndex++;
            return result;
        }
    }
    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }

}
