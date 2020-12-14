package com.migu.pattern.visitor.reform;

public class PPTFile extends ResourceFile {
  public PPTFile(String filePath) {
    super(filePath);
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this); // 这里编译期就可以确定调用的是
                                 // 入参类型为 PPTFile 的 visit 方法
  }
  //...
}
