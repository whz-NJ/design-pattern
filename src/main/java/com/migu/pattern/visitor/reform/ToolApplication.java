package com.migu.pattern.visitor.reform;

import java.util.ArrayList;
import java.util.List;

public class ToolApplication {
  private static List<ResourceFile> listAllResourceFiles(String resourceDirectory) {
    List<ResourceFile> resourceFiles = new ArrayList<>();
    //...根据后缀(pdf/ppt/word)由工厂方法创建不同的类对象(PdfFile/PPTFile/WordFile)
    resourceFiles.add(new PdfFile("a.pdf"));
    resourceFiles.add(new WordFile("b.word"));
    resourceFiles.add(new PPTFile("c.ppt"));
    return resourceFiles;
  }

  public static void main(String[] args) {
    // Extractor extractor = new Extractor();
    Visitor extractor = new Extractor();
    List<ResourceFile> resourceFiles = listAllResourceFiles("/tmp/resources");
    for (ResourceFile resourceFile : resourceFiles) {
      resourceFile.accept(extractor); // 调用 ResourceFile 接口实现类的 accept(Visitor) 方法
                                      // 具体哪个 ResourceFile 接口实现类，由 resourceFile 实际运行时类型确定
    }

    Compressor compressor = new Compressor();
    for(ResourceFile resourceFile : resourceFiles) {
      resourceFile.accept(compressor); // 调用 ResourceFile 接口实现类的 accept(Compressor) 方法
                                       // 具体哪个 ResourceFile 接口实现类，由 resourceFile 实际运行时类型确定
    }
  }
}

