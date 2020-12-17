package com.migu.pattern.visitor.singledispatch;

public class SingleDispatchClass {
  public void overrideFunction(ParentClass p) {
    p.f();//调用p对象实际类型的override
  }

  public void overloadFunction(ParentClass p) { //Overload1
    System.out.println("I am overloadFunction(ParentClass p).");
  }

  public void overloadFunction(ChildClass c) { //Overload2
    System.out.println("I am overloadFunction(ChildClass c).");
  }
}

