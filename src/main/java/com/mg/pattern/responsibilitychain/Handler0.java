package com.mg.pattern.responsibilitychain;

public abstract class Handler0 {
  protected Handler0 successor = null;

  public void setSuccessor(Handler0 successor) {
    this.successor = successor;
  }

  public abstract void handle();
}
