package com.radiance.gupao.p6.pattern.proxy.cglib;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @author sunhao
 * @date 2020/11/17 11:17
 * @Description:
 */
public class CglibTest {
    public static void main(String[] args) {
        try {
            //利用 CGlib 的代理类可以将内存中的.class 文件写入本地磁盘
            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D://cglib_proxy_class/");

            Customer obj = (Customer) new CglibMeipo().getInstance(Customer.class);
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
