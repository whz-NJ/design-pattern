package com.mg.pattern.visitor.reform;

/**
 * @author whz
 * @create 2020-12-10 20:28
 * @desc 提取Visitor 接口的目的是不想在新增新功能时修改 Visiable 接口以及 ConcretVisiableXXX 中的代码
 **/
public interface Visitor {
    void visit(PdfFile pdfFile);
    void visit(PPTFile pptFile);
    void visit(WordFile wordFile);
}