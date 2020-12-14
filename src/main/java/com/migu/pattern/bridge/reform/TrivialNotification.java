package com.migu.pattern.bridge.reform;

public class TrivialNotification extends Notification {
  public TrivialNotification(MsgSender msgSender) {
    super(msgSender);
  }

  @Override public void notify(String message) {

  }
}
