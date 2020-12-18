package com.migu.pattern.visitor.reform;

/**
 * 提取公共 ResourceFile 抽象类目的是想在模式调用者中统一遍历各个 XXXFile。
 */

public abstract class ResourceFile {
  protected String filePath;
  public ResourceFile(String filePath) {
    this.filePath = filePath;
  }
  abstract public void accept(Visitor visitor);
}