package com.migu.pattern.proxy.jdk;

/**
 * @author whz
 * @create 2020-12-04 14:35
 * @desc TODO: add description here
 **/
public class Test {

  public static void main(String[] args) {

    try {
      Person obj = (Person) new JDK58().getInstance(new XieMou());
      System.out.println(obj.getClass());
      obj.findJob();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}