package com.mg.pattern.bridge.reform;

public class UrgencyNotification extends Notification {

  public UrgencyNotification(MsgSender msgSender) {
    super(msgSender);
  }

  @Override public void notify(String message) {

  }
}
