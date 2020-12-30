package com.mg.pattern.iterator;

public interface Iterator<E> {
  boolean hasNext();
  E next();
  E currentItem();
  default void remove() {
    throw new UnsupportedOperationException();
  }
}

