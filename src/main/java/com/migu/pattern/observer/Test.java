package com.migu.pattern.observer;

/**
 * @author whz
 * @create 2020-12-07 17:49
 * @desc 测试用例
 **/
public class Test {
  public static void main(String[] args) {
    ConcreteSubject subject = new ConcreteSubject();
    subject.registerObserver(new ConcreteObserverOne());
    subject.registerObserver(new ConcreteObserverTwo());
    subject.notifyObservers(new Message());
  }

}
