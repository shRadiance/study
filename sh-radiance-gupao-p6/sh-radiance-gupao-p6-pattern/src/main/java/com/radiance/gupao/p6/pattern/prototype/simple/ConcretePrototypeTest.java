package com.radiance.gupao.p6.pattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunhao
 * @date 2020/11/4 23:11
 * @Description:
 */
public class ConcretePrototypeTest {
    public static void main(String[] args) {
        // 创建原型对象
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAge(18);
        prototype.setName("Tom");
        List<String> hobbies = new ArrayList<>();
        hobbies.add("书法");
        hobbies.add("美术");
        prototype.setHobbies(hobbies);
        System.out.println(prototype);
        // 拷贝原型对象
//        ConcretePrototype cloneType = prototype.deepClone();
        ConcretePrototype cloneType = prototype.deepCloneHobbies();
        cloneType.getHobbies().add("技术控");

        System.out.println("原型对象: " + prototype);
        System.out.println("克隆对象: " + cloneType);
        System.out.println(prototype == cloneType);

        System.out.println("原型对象的爱好：" + prototype.getHobbies());
        System.out.println("克隆对象的爱好：" + cloneType.getHobbies());
        System.out.println(prototype.getHobbies() == cloneType.getHobbies());
    }
}
