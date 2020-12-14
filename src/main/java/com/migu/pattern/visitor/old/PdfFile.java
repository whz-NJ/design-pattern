package com.migu.pattern.visitor.old;

public class PdfFile extends ResourceFile {
  public PdfFile(String filePath) {
    super(filePath);
  }

  @Override
  public void accept(Extractor extractor) {
    extractor.extract2txt(this); // 这里编译期就可以确定调用的是
                                         // 入参类型为 PPTFile 的extract2txt 方法
  }
  @Override
  public void accept(Compressor extractor) {
    extractor.compress(this); // 这里编译期就可以确定调用的是
    // 入参类型为 PPTFile 的extract2txt 方法
  }
  //...
}
