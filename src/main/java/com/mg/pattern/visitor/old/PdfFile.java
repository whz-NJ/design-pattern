package com.mg.pattern.visitor.old;

public class PdfFile extends ResourceFile {
  public PdfFile(String filePath) {
    super(filePath);
  }

  @Override
  public void accept(Extractor extractor) { // 调用这个 accept 方法还是调用其他ResourceFile子类accept方法由
                                            // 调用者实际类型确定，调用这个 accept 方法，还是调用下面的 accept(Compressor)
                                            // 由入参编译类型确定
    extractor.extract2txt(this); // 这里编译期就可以确定调用的是 Extractor 类中
                                         // 入参类型为 PdfFile 的extract2txt 方法
  }
  @Override
  public void accept(Compressor extractor) { // 调用这个accept方法还是调用其他ResourceFile子类accept方法由
                                             // 调用者实际类型确定，调用这个 accept 方法，还是调用上面的 accept(Extractor)
                                             // 由入参编译类型确定
    extractor.compress(this); // 这里编译期就可以确定调用的是 Compressor 类中
                                       // 入参类型为 PdfFile 的 extract2txt 方法
  }
  //...
}
