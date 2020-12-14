package com.radiance.gupao.p6.pattern.factory.abstrectfac;

/**
 * @author sunhao
 * @date 2020/11/4 14:27
 * @Description:
 */
public class JavaCourseFactory extends CourseFactory {
    @Override
    protected INote createNote() {
        super.init();
        return new JavaNote();
    }

    @Override
    protected IVideo cerateVideo() {
        super.init();
        return new JavaVideo();
    }
}
