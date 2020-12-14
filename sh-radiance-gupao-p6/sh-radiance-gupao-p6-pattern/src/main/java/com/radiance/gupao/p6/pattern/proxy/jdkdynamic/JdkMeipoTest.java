package com.radiance.gupao.p6.pattern.proxy.jdkdynamic;

import com.radiance.gupao.p6.pattern.proxy.staticproxy.IPerson;
import com.radiance.gupao.p6.pattern.proxy.staticproxy.ZhangSan;

/**
 * @author sunhao
 * @date 2020/11/11 18:11
 * @Description:
 */
public class JdkMeipoTest {
    public static void main(String[] args) {
        JdkMeipo jdkMeipo = new JdkMeipo();
        IPerson zhangsan = jdkMeipo.getInstance(new ZhangSan());
        zhangsan.findLove();

        IPerson zhaoliu = jdkMeipo.getInstance(new ZhaoLiu());
        zhaoliu.findLove();
    }
}
