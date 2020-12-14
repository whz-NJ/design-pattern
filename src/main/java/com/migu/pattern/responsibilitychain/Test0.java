package com.migu.pattern.responsibilitychain;

// 使用举例
public class Test0 {
  public static void main(String[] args) {
    HandlerChain0 chain = new HandlerChain0();
    chain.addHandler(new HandlerA0());
    chain.addHandler(new HandlerB0());
    chain.handle();
  }
}
