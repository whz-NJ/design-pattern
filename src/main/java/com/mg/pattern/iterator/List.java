package com.mg.pattern.iterator;

public interface List<E> {
  Iterator iterator();
  int size();
  E get(int index);
  void add(E e);
  void add(int pos, E e);
  boolean remove(E e);
  void addAll(List<E> list);
}
