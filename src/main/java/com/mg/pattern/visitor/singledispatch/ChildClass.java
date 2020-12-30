package com.mg.pattern.visitor.singledispatch;

public class ChildClass extends ParentClass {
  @Override
  public void f() {
    System.out.println("I am ChildClass's override f().");
  }
}
