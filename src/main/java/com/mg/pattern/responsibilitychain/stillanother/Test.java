package com.mg.pattern.responsibilitychain.stillanother;

/**
 * @author whz
 * @create 2020-12-07 16:59
 * @desc 使用举例
 **/
public class Test {
  public static void main(String[] args) {
    HandlerChain chain = new HandlerChain();
    chain.addHandler(new HandlerA());
    chain.addHandler(new HandlerB());
    chain.handle();
  }

}