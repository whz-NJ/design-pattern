package com.mg.pattern.mediator;

/**
 * 测试类
 */
public class Client {
    public static void main(String args[]) {
        //定义中介者对象
        MyDialog mediator;
        mediator = new MyDialog();

        //定义同事对象
        MyButton addBT = new MyButton();
        MyList list = new MyList();
        MyComboBox cb = new MyComboBox();
        MyTextBox userNameTB = new MyTextBox();

        addBT.setMediator(mediator);
        list.setMediator(mediator);
        cb.setMediator(mediator);
        userNameTB.setMediator(mediator);

        mediator.addButton = addBT;
        mediator.list = list;
        mediator.cb = cb;
        mediator.userNameTextBox = userNameTB;

        addBT.changed();
        System.out.println("-----------------------------");
        list.changed();
    }
}