package com.migu.pattern.factory.factorymethod;

import com.migu.pattern.factory.ICourse;

/**
 * @author whz
 * @create 2020-12-04 16:41
 * @desc TODO: add description here
 **/
public class Test {
  public static void main(String[] args) {

    ICourseFactory factory = new PythonCourseFactory();
    ICourse course = factory.create();
    course.record();

    factory = new JavaCourseFactory();
    course = factory.create();
    course.record();

  }
}