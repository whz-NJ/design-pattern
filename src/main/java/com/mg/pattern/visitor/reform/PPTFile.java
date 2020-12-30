package com.mg.pattern.visitor.reform;

public class PPTFile extends ResourceFile {
  public PPTFile(String filePath) {
    super(filePath);
  }

  @Override
  public void accept(Visitor visitor) { // 调用这个 accept 方法还是调用其他ResourceFile子类accept方法由
                                        // 调用者实际类型确定
    visitor.visit(this); // 这里编译期就可以确定调用的是 Visitor 接口实现类的
                                 // 入参类型为 PPTFile 的 visit 方法，但具体是调用哪个
                                 // Visitor 实现类的方法，由 visitor 实际运行时类型确定
  }
  //...
}
