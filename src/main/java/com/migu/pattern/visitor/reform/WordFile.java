package com.migu.pattern.visitor.reform;

public class WordFile extends ResourceFile {
  public WordFile(String filePath) {
    super(filePath);
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this); // 这里编译期就可以确定调用的是
                                  // 入参类型为 WordFile 的 visit 方法
  }
}