package com.mg.pattern.visitor.singledispatch;

public class SingleDispatchClass {
  public void overrideFunction(ParentClass p) { // 调用这个函数还是调用下面同名的 overrideFunction(ChildClass)
                                                // 由入参p的编译类型确定
    p.f();// 调用 override f()方法，这里的p运行时类型可能是 ParentClass 或 ChildClass
          // 具体是调用 ParentClass.f() 还是 ChildClass.f() 由 p 的运行时类型确定
  }

  public void overrideFunction(ChildClass c) { // 调用这个函数还是调用上面同名的 overrideFunction(ParentClass)
                                               // 由入参c的编译类型确定
    c.f(); //调用c对象实际类型的 override f()方法，这里的 c的编译类型为ChildClass，运行时类型只可能是ChildClass
  }

  public void overloadFunction(ParentClass p) { // 调用这个函数还是调用下面同名的 overloadFunction(ChildClass)
                                                // 由入参p的编译类型确定
    System.out.println("I am overloadFunction(ParentClass p).");
  }

  public void overloadFunction(ChildClass c) {  // 调用这个函数还是调用上面同名的 overloadFunction(ParentClass)
                                                // 由入参c的编译类型确定
    System.out.println("I am overloadFunction(ChildClass c).");
  }
}

