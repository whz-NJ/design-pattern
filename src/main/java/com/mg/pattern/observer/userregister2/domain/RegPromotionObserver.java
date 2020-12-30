package com.mg.pattern.observer.userregister2.domain;

import com.google.common.eventbus.Subscribe;
import com.mg.pattern.observer.userregister2.service.PromotionService;

public class RegPromotionObserver {
  private PromotionService promotionService; // 依赖注入

  @Subscribe
  public void handleRegSuccess(long userId) {
    promotionService.issueNewUserExperienceCash(userId);
  }
}

