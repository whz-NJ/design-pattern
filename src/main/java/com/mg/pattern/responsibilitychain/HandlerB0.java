package com.mg.pattern.responsibilitychain;

public class HandlerB0 extends Handler0 {
  @Override
  public void handle() {
    boolean handled = false;
    //...
    if (!handled && successor != null) {
      successor.handle();
    } 
  }
}
