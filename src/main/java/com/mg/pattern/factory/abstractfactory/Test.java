package com.mg.pattern.factory.abstractfactory;

/**
 * @author whz
 * @create 2020-12-04 16:45
 * @desc TODO: add description here
 **/
public class Test {
  public static void main(String[] args) {

    JavaCourseFactory factory = new JavaCourseFactory();

    factory.createNote().edit();
    factory.createVideo().record();

  }
}