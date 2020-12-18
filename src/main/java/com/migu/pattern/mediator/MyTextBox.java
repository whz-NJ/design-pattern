package com.migu.pattern.mediator;

/**
 * //文本框类：具体同事类
 *
 */
public class MyTextBox extends Component {
    public void update() {
        System.out.println("客户信息增加成功后文本框清空。");
    }

    public void setText() {
        System.out.println("文本框显示：马云");

    }
}