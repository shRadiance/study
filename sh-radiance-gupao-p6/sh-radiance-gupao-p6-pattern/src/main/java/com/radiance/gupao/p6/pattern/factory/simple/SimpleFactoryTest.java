package com.radiance.gupao.p6.pattern.factory.simple;

/**
 * @author sunhao
 * @date 2020/11/4 11:28
 * @Description:
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        ICourse course = factory.create(JavaCourse.class);
        course.record();
    }
}
