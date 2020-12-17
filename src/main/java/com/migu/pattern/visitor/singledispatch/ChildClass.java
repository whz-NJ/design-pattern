package com.migu.pattern.visitor.singledispatch;

public class ChildClass extends ParentClass {
  @Override
  public void f() {
    System.out.println("I am ChildClass's f().");
  }
}
