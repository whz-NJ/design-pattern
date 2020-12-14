package com.migu.pattern.iterator.snapshot;

import com.migu.pattern.iterator.Iterator;

public interface List<E> {
  E get(int index);
  void add(E e);
  void remove(E e);
}
