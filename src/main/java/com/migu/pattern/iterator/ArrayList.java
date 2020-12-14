package com.migu.pattern.iterator;

import java.lang.reflect.Array;

public class ArrayList<E> implements List<E> {
  private Object[] elementData;
  private int size;
  public int modCount;

  private final int DELTA = 10;

  public ArrayList() {
    elementData = new Object[10];
    this.size = 0;
  }

  public ArrayList(int size) {
    if(size > 0) {
      elementData = new Object[size];
    } else {
      elementData = null;
    }
    this.size = 0;
    this.modCount = 0;
  }
  public Iterator iterator() {
    return new ArrayIterator(this);
  }

  @Override public int size() {
    return size;
  }

  @Override public E get(int index) {
    return (E)elementData[index];
  }

  private void fastRemove(int index) {
    int numMoved = size - index - 1;
    if (numMoved > 0)
      System.arraycopy(elementData, index+1, elementData, index, numMoved);
    elementData[--size] = null; // clear to let GC do its work
    modCount++;
  }

  @Override public void add(E e) {
    if(size < elementData.length) {
      elementData[size] = e;
    } else {
      int newSize = elementData.length + DELTA;
      Object[] tmpArray = new Object[newSize];
      System.arraycopy(elementData, 0, tmpArray, 0, size);
      tmpArray[size] = e;
      elementData = tmpArray;
    }
    size++;
    modCount++;
  }

  @Override public void add(int pos, E e) {
    if (pos > size || pos < 0) {
      throw new IndexOutOfBoundsException("下标"+pos+"越界");
    }

    if(size >= elementData.length) {
      int newSize = elementData.length + DELTA;
      Object[] tmpArray = new Object[newSize];
      System.arraycopy(elementData, 0, tmpArray, 0, size);
      elementData = tmpArray;
    }
    if(size - pos > 0) {
      System.arraycopy(elementData, pos, elementData, pos + 1, size - pos);
    }
    elementData[pos] = e;
    size++;
    modCount++;
  }

  @Override public void addAll(List<E> list) {
    for(int index =  0; index < list.size(); index++) {
      add(list.get(index));
    }
  }

  public boolean remove(Object o) {
    if (o == null) {
      for (int index = 0; index < size; index++)
        if (elementData[index] == null) {
          fastRemove(index);
          return true;
        }
    } else {
      for (int index = 0; index < size; index++)
        if (o.equals(elementData[index])) {
          fastRemove(index);
          return true;
        }
    }
    return false;
  }
  public E remove(int index) {
    if (index > size || index < 0) {
      throw new IndexOutOfBoundsException("下标"+index+"越界");
    }
    modCount++;
    E oldValue = (E)elementData[index];

    int numMoved = size - index - 1;
    if (numMoved > 0)
      System.arraycopy(elementData, index+1, elementData, index,
          numMoved);
    elementData[--size] = null; // clear to let GC do its work

    return oldValue;
  }
}
