package com.migu.pattern.observer.userregister.domain;

import com.migu.pattern.observer.userregister.domain.RegObserver;
import com.migu.pattern.observer.userregister.service.PromotionService;

public class RegPromotionObserver implements RegObserver {
  private PromotionService promotionService; // 依赖注入

  @Override
  public void handleRegSuccess(long userId) {
    promotionService.issueNewUserExperienceCash(userId);
  }
}

