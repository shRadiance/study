package com.radiance.gupao.p6.pattern.factory.method;

import com.radiance.gupao.p6.pattern.factory.simple.ICourse;
import com.radiance.gupao.p6.pattern.factory.simple.PythonCource;

/**
 * @author sunhao
 * @date 2020/11/4 11:53
 * @Description:
 */
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCource();
    }
}
