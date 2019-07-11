package com.codegym.repository.Repository;

public interface GeneralRepository<T> {
    int SIZE = 10;

    T[] showlist();

    void add(int index,T element );

    T remove(int index);

    T set(int index,T element);

    int find(String element);

    T[] sort();
}
