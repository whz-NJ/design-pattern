package com.migu.pattern.observer.userregister.domain;

import com.migu.pattern.observer.userregister.service.NotificationService;

public class RegNotificationObserver implements RegObserver {
  private NotificationService notificationService;

  @Override
  public void handleRegSuccess(long userId) {
    notificationService.sendInboxMessage(userId, "Welcome...");
  }
}
