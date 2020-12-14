package com.radiance.gupao.p6.pattern.factory.abstrectfac;

/**
 * @author sunhao
 * @date 2020/11/4 14:28
 * @Description:
 */
public class PythonVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制 Python 视频");
    }
}
