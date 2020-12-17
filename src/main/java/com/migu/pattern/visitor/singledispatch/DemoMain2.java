package com.migu.pattern.visitor.singledispatch;

/**
 * @author whz
 * @create 2020-12-11 7:42
 * @desc TODO: add description here
 **/
public class DemoMain2 {
  public static void main(String[] args) {
    SingleDispatchClass2 demo = new SingleDispatchClass2();
    ParentClass p = new ChildClass();
    demo.overrideFunction(p);//执行哪个对象的方法，由对象的实际类型决定
    demo.overloadFunction(p);//执行对象的哪个方法，由参数对象的声明类型决定
  }
}