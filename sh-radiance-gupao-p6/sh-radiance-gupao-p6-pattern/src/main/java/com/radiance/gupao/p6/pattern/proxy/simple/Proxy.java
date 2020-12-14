package com.radiance.gupao.p6.pattern.proxy.simple;

/**
 * @author sunhao
 * @date 2020/11/7 19:20
 * @Description:
 */
public class Proxy implements ISubject {

    private ISubject subject;

    public Proxy(ISubject iSubject) {
        this.subject = iSubject;
    }

    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    private void before() {
        System.out.println("called before request()");
    }

    private void after() {
        System.out.println("called after request()");
    }
}
