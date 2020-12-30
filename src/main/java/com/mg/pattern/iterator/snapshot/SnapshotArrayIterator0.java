package com.mg.pattern.iterator.snapshot;

import com.mg.pattern.iterator.ArrayList;
import com.mg.pattern.iterator.Iterator;

public class SnapshotArrayIterator0<E> implements Iterator<E> {
  private int cursor;
  private ArrayList<E> snapshot;

  public SnapshotArrayIterator0(ArrayList<E> arrayList) {
    this.cursor = 0;
    this.snapshot = new ArrayList<>();
    this.snapshot.addAll(arrayList);
  }

  @Override
  public boolean hasNext() {
    return cursor < snapshot.size();
  }

  @Override
  public E next() {
    E currentItem = snapshot.get(cursor);
    cursor++;
    return currentItem;
  }

  @Override public E currentItem() {
    return snapshot.get(cursor);
  }
}
