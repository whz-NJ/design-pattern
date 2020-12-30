package com.mg.pattern.mediator;

/**
 * 列表框类：具体同事类
 */
public class MyList extends  Component{
    @Override
    public void update() {
        System.out.println("列表框新加同事：比尔盖茨");
    }

    public void select (){
        System.out.println("列表框选中项：马云");
    }
}