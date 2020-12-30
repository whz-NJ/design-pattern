package com.mg.pattern.observer.userregister2.domain;

import com.google.common.eventbus.Subscribe;
import com.mg.pattern.observer.userregister2.service.NotificationService;

public class RegNotificationObserver {
  private NotificationService notificationService;

  @Subscribe
  public void handleRegSuccess(long userId) {
    notificationService.sendInboxMessage(userId, "Welcome...");
  }
}
