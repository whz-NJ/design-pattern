package com.mg.pattern.factory.factorymethod;

import com.mg.pattern.factory.ICourse;
import com.mg.pattern.factory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {

    public ICourse create() {
        return new PythonCourse();
    }
}