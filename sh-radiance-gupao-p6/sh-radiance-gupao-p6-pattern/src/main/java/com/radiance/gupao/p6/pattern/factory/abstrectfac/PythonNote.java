package com.radiance.gupao.p6.pattern.factory.abstrectfac;

/**
 * @author sunhao
 * @date 2020/11/4 14:29
 * @Description:
 */
public class PythonNote implements INote {
    @Override
    public void edit() {
        System.out.println("编写 Python 笔记");
    }
}
