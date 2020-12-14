package com.radiance.gupao.p5.genericity;

/**
 * @author sunhao
 * @date 2020/10/22 0:28
 * @Description:
 */
public interface CalGeneric<T> {

    T add(T a, T b);

    T sub(T a, T b);

    T mul(T a, T b);

    T div(T a, T b);

}
