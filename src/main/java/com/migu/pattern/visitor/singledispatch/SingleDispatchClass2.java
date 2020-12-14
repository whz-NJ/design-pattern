package com.migu.pattern.visitor.singledispatch;

/**
 * @author whz
 * @create 2020-12-11 7:41
 * @desc TODO: add description here
 **/
public class SingleDispatchClass2 {
  public void polymorphismFunction(ParentClass p) {
    p.f();
  }

  public void overloadFunction(ParentClass p) {
    p.f();
  }

  public void overloadFunction(ChildClass c) {
    c.f();
  }

}