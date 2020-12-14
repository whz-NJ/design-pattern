package com.migu.pattern.factory.factorymethod;

import com.migu.pattern.factory.ICourse;
import com.migu.pattern.factory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new JavaCourse();
    }
}