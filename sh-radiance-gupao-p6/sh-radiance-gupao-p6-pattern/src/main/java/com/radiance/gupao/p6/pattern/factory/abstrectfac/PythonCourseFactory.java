package com.radiance.gupao.p6.pattern.factory.abstrectfac;

/**
 * @author sunhao
 * @date 2020/11/4 14:31
 * @Description:
 */
public class PythonCourseFactory extends CourseFactory {
    @Override
    protected INote createNote() {
        super.init();
        return new PythonNote();
    }

    @Override
    protected IVideo cerateVideo() {
        super.init();
        return new PythonVideo();
    }
}
