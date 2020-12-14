package com.radiance.gupao.p6.pattern.factory.simple;

/**
 * @author sunhao
 * @date 2020/11/4 11:26
 * @Description:
 */
public class CourseFactory1 {
    public ICourse create(String name) {
        if ("java".equals(name)) {
            return new JavaCourse();
        } else if ("python".equals(name)) {
            return new PythonCource();
        } else {
            return null;
        }
    }
}
