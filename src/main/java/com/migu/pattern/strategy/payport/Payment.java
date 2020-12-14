package com.migu.pattern.strategy.payport;

import com.migu.pattern.strategy.PayState;

public interface Payment {
   public PayState pay(String uid, double amount);

}
