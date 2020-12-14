package com.migu.pattern.iterator;

/**
 * @author whz
 * @create 2020-12-07 14:33
 * @desc TODO: add description here
 **/
public class Test {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("a");
    names.add("b");
    names.add("c");
    names.add("d");

    Iterator<String> iterator = names.iterator();
    iterator.next();
    names.remove("a");
  }

}