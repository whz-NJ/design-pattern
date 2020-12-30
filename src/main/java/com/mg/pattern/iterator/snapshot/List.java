package com.mg.pattern.iterator.snapshot;

public interface List<E> {
  E get(int index);
  void add(E e);
  void remove(E e);
}
