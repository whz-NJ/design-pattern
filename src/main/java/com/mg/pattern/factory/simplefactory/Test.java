package com.mg.pattern.factory.simplefactory;

import com.mg.pattern.factory.ICourse;
import com.mg.pattern.factory.JavaCourse;

/**
 * @author whz
 * @create 2020-12-04 16:39
 * @desc TODO: add description here
 **/
public class Test {
  public static void main(String[] args) {

    //        ICourse course = new JavaCourse();
    //        course.record();

    //        ICourseFactory factory = new ICourseFactory();
    //        ICourse course = factory.create("com.gupaoedu.vip.pattern.factory.JavaCourse");
    //        course.record();

    CourseFactory factory = new CourseFactory();
    ICourse course = factory.create(JavaCourse.class);
    course.record();

  }
}