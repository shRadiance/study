package com.radiance.gupao.p6.pattern.factory.abstrectfac;

/**
 * @author sunhao
 * @date 2020/11/4 14:25
 * @Description:
 */
public class JavaVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制 Java 视频");
    }
}
