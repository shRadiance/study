package com.radiance.gupao.p6.pattern.factory.simple;

/**
 * @author sunhao
 * @date 2020/11/4 11:21
 * @Description:
 */
public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制 Java 课程");
    }

    public static void main(String[] args) {
        ICourse course = new JavaCourse();
        course.record();
    }
}
