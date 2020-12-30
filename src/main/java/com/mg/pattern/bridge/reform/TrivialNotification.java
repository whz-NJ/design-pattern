package com.mg.pattern.bridge.reform;

public class TrivialNotification extends Notification {
  public TrivialNotification(MsgSender msgSender) {
    super(msgSender);
  }

  @Override public void notify(String message) {

  }
}
