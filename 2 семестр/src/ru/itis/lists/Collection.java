package ru.itis.lists;


public interface Collection<T> {
    void addToBegin(T element);
    void add(T element);
    void remove(T element);
    boolean contains(T element);
    int size();
    void reverse();
    void showList();

}
