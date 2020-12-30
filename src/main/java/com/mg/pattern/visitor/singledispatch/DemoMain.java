package com.mg.pattern.visitor.singledispatch;

public class DemoMain {
  public static void main(String[] args) {
    SingleDispatchClass demo = new SingleDispatchClass();
    ParentClass p = new ChildClass();
    demo.overrideFunction(p);// 首先确定是调用 SingleDispatchClass 里的 overrideFunction() 方法
                             // 具体是调用 overrideFunction(ParentClass)还是 overrideFunction(ChildClass)
                             // 由入参p的编译类型确定
    demo.overloadFunction(p);// 首先确定是调用 SingleDispatchClass 里的 overloadFunction() 方法
                             // 具体是调用 overloadFunction(ParentClass)还是 overloadFunction(ChildClass)
                             // 由入参p的编译类型确定
  }
}
