package com.migu.pattern.visitor.reform;

public class WordFile extends ResourceFile {
  public WordFile(String filePath) {
    super(filePath);
  }

  @Override
  public void accept(Visitor visitor) { // 调用这个 accept 方法还是调用其他 ResourceFile 子类 accept 方法由
                                        // 调用者实际类型确定
    visitor.visit(this); // 这里编译期就可以确定调用的是 Visitor 接口实现类的
                                   // 入参类型为 WordFile 的 visit 方法，但具体是调用哪个
                                   // Visitor实现类的方法，由 visitor 实际运行时类型确定
  }
}