package com.mg.pattern.factory.factorymethod;

import com.mg.pattern.factory.ICourse;
import com.mg.pattern.factory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new JavaCourse();
    }
}