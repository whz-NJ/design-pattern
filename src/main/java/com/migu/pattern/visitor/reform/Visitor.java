package com.migu.pattern.visitor.reform;

/**
 * @author whz
 * @create 2020-12-10 20:28
 * @desc TODO: add description here
 **/
public interface Visitor {
    void visit(PdfFile pdfFile);
    void visit(PPTFile pptFile);
    void visit(WordFile wordFile);
}