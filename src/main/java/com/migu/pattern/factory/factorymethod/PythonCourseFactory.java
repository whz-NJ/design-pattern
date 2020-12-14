package com.migu.pattern.factory.factorymethod;

import com.migu.pattern.factory.ICourse;
import com.migu.pattern.factory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {

    public ICourse create() {
        return new PythonCourse();
    }
}