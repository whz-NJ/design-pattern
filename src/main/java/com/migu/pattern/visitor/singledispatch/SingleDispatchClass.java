package com.migu.pattern.visitor.singledispatch;

public class SingleDispatchClass {
  public void polymorphismFunction(ParentClass p) { //多态
    p.f();
  }

  public void overloadFunction(ParentClass p) { //重载
    System.out.println("I am overloadFunction(ParentClass p).");
  }

  public void overloadFunction(ChildClass c) { //重载
    System.out.println("I am overloadFunction(ChildClass c).");
  }
}

