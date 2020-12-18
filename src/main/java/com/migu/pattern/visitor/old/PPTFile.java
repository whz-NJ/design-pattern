package com.migu.pattern.visitor.old;

/**
 * @author whz
 * @create 2020-12-10 20:11
 * @desc TODO: add description here
 **/
public class PPTFile extends ResourceFile {
  public PPTFile(String filePath) {
    super(filePath);
  }

  @Override
  public void accept(Extractor extractor) {
    extractor.extract2txt(this); // 这里编译期就可以确定调用的是 Extractor 类中
                                         // 入参类型为 PPTFile 的extract2txt 方法
  }
  @Override
  public void accept(Compressor extractor) {
    extractor.compress(this); // 这里编译期就可以确定调用的是 Compressor 类中
                                      // 入参类型为 PPTFile 的 extract2txt 方法
  }
  //...
}