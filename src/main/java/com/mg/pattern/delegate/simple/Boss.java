package com.mg.pattern.delegate.simple;

public class Boss {

    public void command(String command,Leader leader){
        leader.doing(command);
    }

}