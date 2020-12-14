package com.radiance.gupao.p6.pattern.factory.abstrectfac;

/**
 * @author sunhao
 * @date 2020/11/4 14:23
 * @Description:
 */
public class JavaNote implements INote {
    @Override
    public void edit() {
        System.out.println("编写 Java 笔记");
    }
}
