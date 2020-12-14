package com.migu.pattern.iterator;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ArrayIterator implements Iterator {
  private int cursor;
  private ArrayList arrayList;
  private int expectedModCount;
  private int lastRet = -1; // index of last element returned; -1 if no such

  public ArrayIterator(ArrayList arrayList) {
    this.cursor = 0;
    this.arrayList = arrayList;
    this.expectedModCount = arrayList.modCount;
  }

  @Override
  public boolean hasNext() {
    checkForComodification();
    return cursor < arrayList.size();
  }

  @Override
  public Object next() {
    checkForComodification();
    lastRet = cursor;
    cursor++;
    return arrayList.get(lastRet);
  }

  @Override
  public Object currentItem() {
    checkForComodification();
    return arrayList.get(cursor);
  }

  private void checkForComodification() {
    if (arrayList.modCount != expectedModCount)
      throw new ConcurrentModificationException();
  }

  public void remove() {
    if (lastRet < 0)
      throw new IllegalStateException();
    checkForComodification();
    try {
      arrayList.remove(lastRet);
      cursor = lastRet;
      lastRet = -1;
      expectedModCount = arrayList.modCount;
    } catch (IndexOutOfBoundsException ex) {
      throw new ConcurrentModificationException();
    }
  }

}

