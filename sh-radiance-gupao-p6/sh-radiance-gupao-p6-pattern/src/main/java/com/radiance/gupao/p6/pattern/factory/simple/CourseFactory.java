package com.radiance.gupao.p6.pattern.factory.simple;

/**
 * @author sunhao
 * @date 2020/11/4 11:26
 * @Description:
 */
public class CourseFactory {
    public ICourse create(Class<? extends ICourse> clazz) {
        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
