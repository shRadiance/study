package com.radiance.gupao.p6.pattern.factory.method;

import com.radiance.gupao.p6.pattern.factory.simple.ICourse;
import com.radiance.gupao.p6.pattern.factory.simple.JavaCourse;

/**
 * @author sunhao
 * @date 2020/11/4 11:51
 * @Description:
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
