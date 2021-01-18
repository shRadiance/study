package com.radiance.algorithm.test;

/**
 * @author sunhao
 * @date 2021/1/8 10:51
 * @Description:
 */
public class ITestImpl implements ITest {
    @Override
    public void a() {
        System.out.println("a method form ITest");
    }

    public void b() {
        System.out.println("b method form ITestImpl");
    }

}
