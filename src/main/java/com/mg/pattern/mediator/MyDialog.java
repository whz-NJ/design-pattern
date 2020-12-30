package com.mg.pattern.mediator;

/**
 * 具体中介者
 *
 */
public class MyDialog extends Mediator{
    //维持对多个同事对象的引用
    public MyButton addButton;
    public MyList list;
    public MyTextBox userNameTextBox;
    public MyComboBox cb;

    //封装同事对象之间的交互
    @Override
    public void componentChanged(Component c) {
        //单击按钮
        if(c == addButton) {
            System.out.println("--单击增加按钮--");
            list.update();
            cb.update();
            userNameTextBox.update();
        }
        //从列表框选择客户
        else if(c == list) {
            System.out.println("--从列表框选择客户--");
            cb.select();
            userNameTextBox.setText();
        }
        //从组合框选择客户
        else if(c == cb) {
            System.out.println("--从组合框选择客户--");
            cb.select();
            userNameTextBox.setText();
        }
    }
}