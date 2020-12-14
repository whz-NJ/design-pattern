package com.migu.pattern.iterator.snapshot;

public interface Iterator<E> {
  boolean hasNext();
  E next();
}