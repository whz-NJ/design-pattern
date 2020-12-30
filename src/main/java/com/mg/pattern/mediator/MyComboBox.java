package com.mg.pattern.mediator;

/**
 * 组合框类：具体同事类
 */
public class MyComboBox extends Component {


    public void update() {
        System.out.println("组合框增加一项：比尔盖茨。");
    }

    public void select() {
        System.out.println("组合框选中项：马云");

    }
}