package com.migu.pattern.responsibilitychain;

public class HandlerChain0 {
  private Handler0 head = null;
  private Handler0 tail = null;

  public void addHandler(Handler0 handler0) {
    handler0.setSuccessor(null);

    if (head == null) {
      head = handler0;
      tail = handler0;
      return;
    }

    tail.setSuccessor(handler0);
    tail = handler0;
  }

  public void handle() {
    if (head != null) {
      head.handle();
    }
  }
}
