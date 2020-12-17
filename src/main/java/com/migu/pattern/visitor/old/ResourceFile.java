package com.migu.pattern.visitor.old;

public abstract class ResourceFile {
  protected String filePath;
  public ResourceFile(String filePath) {
    this.filePath = filePath;
  }
  abstract public void accept(Extractor extractor); //Override
  abstract public void accept(Compressor extractor);
}
