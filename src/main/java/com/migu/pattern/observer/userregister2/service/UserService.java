package com.migu.pattern.observer.userregister2.service;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author whz
 * @create 2020-12-07 18:50
 * @desc TODO: add description here
 **/
public class UserService {
  private static AtomicLong userId = new AtomicLong(0);
    public long register(String telephone, String password)
    {
      return userId.addAndGet(1);
    }
}