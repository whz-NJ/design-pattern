package com.mg.pattern.iterator.snapshot;

public interface Iterator<E> {
  boolean hasNext();
  E next();
}