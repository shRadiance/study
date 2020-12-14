package com.radiance.gupao.p6.pattern.factory.method;

import com.radiance.gupao.p6.pattern.factory.simple.ICourse;

/**
 * @author sunhao
 * @date 2020/11/4 11:54
 * @Description:
 */
public class CourceFactoryTest {
    public static void main(String[] args) {
        ICourseFactory factory = new PythonCourseFactory();
        ICourse course = factory.create();
        course.record();

        factory = new JavaCourseFactory();
        course = factory.create();
        course.record();
    }
}
