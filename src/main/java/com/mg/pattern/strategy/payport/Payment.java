package com.mg.pattern.strategy.payport;

import com.mg.pattern.strategy.PayState;

public interface Payment {
   public PayState pay(String uid, double amount);

}
