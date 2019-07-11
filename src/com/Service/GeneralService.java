package com.Service;

public interface GeneralService<T> {
    int SIZE = 10;

    T[] showlist();

    void add(int index,T element );

    T remove(int index);

    T set(int index,T element);

    int find(String element);

    T[] sort();

    int size();
}
