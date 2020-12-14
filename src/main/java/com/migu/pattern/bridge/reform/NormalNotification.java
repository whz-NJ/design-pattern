package com.migu.pattern.bridge.reform;

public class NormalNotification extends Notification {
  public NormalNotification(MsgSender msgSender) {
    super(msgSender);
  }

  @Override public void notify(String message) {

  }
}
