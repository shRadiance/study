package com.radiance.gupao.p6.pattern.factory.simple;

/**
 * @author sunhao
 * @date 2020/11/4 11:24
 * @Description:
 */
public class PythonCource implements ICourse {
    @Override
    public void record() {
        System.out.println("录制 Python 课程");
    }
}
