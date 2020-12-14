package com.migu.pattern.visitor.old;

/**
 * @author whz
 * @create 2020-12-10 20:23
 * @desc TODO: add description here
 **/
public class Compressor {
  public void compress(PPTFile pptFile) {
    //...
    System.out.println("Compress PPT.");
  }

  public void compress(PdfFile pdfFile) {
    //...
    System.out.println("Compress PDF.");
  }

  public void compress(WordFile wordFile) {
    //...
    System.out.println("Compress WORD.");
  }
}