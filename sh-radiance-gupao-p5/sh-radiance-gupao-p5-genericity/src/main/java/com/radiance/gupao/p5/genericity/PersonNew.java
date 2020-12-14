package com.radiance.gupao.p5.genericity;

/**
 * @author sunhao
 * @date 2020/10/22 0:10
 * @Description:
 */
public class PersonNew <T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public PersonNew(T t) {
        this.t = t;
    }
}
