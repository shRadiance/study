package com.radiance.gupao.p5.genericity;

/**
 * @author sunhao
 * @date 2020/10/22 0:01
 * @Description:
 */
public class Demo06 {

    public static void main(String[] args) {
        Person p = new Person();
        p.setIdCard("43xxxxxx123");

        PersonBean bean = new PersonBean();
        bean.setAddress("北京");
        bean.setName("Radiance");
        bean.setAge(28);
        PersonNew<PersonBean> pn = new PersonNew<>(bean);
        PersonNew<String> pn1 = new PersonNew<>("hello");
    }

}
