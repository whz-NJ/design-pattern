package com.mg.pattern.strategy;

import com.mg.pattern.strategy.payport.*;

public enum PayType {
  ALI_PAY(new AliPay()),
  WECHAT_PAY(new WechatPay()),
  UNION_PAY(new UnionPay()),
  JD_PAY(new JDPay());
  private Payment payment;  //枚举类也可以有私有成员
  PayType(Payment payment){   //枚举类也可以有构造方法
    this.payment = payment;
  }
  public Payment get(){ return  this.payment;} //枚举类也可以有普通成员方法，
  // 代替之前的switch...case
}
