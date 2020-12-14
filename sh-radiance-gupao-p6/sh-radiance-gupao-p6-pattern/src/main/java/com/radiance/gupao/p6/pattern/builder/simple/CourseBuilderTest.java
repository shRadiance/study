package com.radiance.gupao.p6.pattern.builder.simple;

/**
 * @author sunhao
 * @date 2020/11/7 14:47
 * @Description:
 */
public class CourseBuilderTest {
    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder()
                .addName("设计模式")
                .addPPT("【PPT 课件】")
                .addVideo("【回放视频】")
                .addNote("【课堂笔记】")
                .addHomework("【课后作业】");
        System.out.println(builder.build());
    }
}
