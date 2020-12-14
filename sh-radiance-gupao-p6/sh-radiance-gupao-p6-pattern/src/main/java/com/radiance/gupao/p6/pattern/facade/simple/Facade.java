package com.radiance.gupao.p6.pattern.facade.simple;

/**
 * @author sunhao
 * @date 2020/11/17 13:45
 * @Description:
 */
public class Facade {
    private SubSystemA a = new SubSystemA();
    private SubSystemB b = new SubSystemB();
    private SubSystemC c = new SubSystemC();

    // 对外接口
    public void doA() {
        this.a.doA();;
    }
    // 对外接口
    public void doB() {
        this.b.doB();
    }
    // 对外接口
    public void doC() {
        this.c.doC();
    }

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doA();
        facade.doB();
        facade.doC();
    }
}
