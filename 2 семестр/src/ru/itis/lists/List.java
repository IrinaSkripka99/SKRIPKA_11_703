package ru.itis.lists;

public interface List<T> extends Collection<T>,Iterable<T> {
    int indexOf(T element);
    T get(int index);

}
