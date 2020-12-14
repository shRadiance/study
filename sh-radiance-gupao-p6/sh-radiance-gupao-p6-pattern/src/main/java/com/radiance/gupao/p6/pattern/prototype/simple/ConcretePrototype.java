package com.radiance.gupao.p6.pattern.prototype.simple;

import lombok.Data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sunhao
 * @date 2020/11/4 23:07
 * @Description:
 */
@Data
public class ConcretePrototype implements Cloneable, Serializable {

    private int age;
    private String name;
    private List<String> hobbies;

    @Override
    protected ConcretePrototype clone() {
        try {
            return (ConcretePrototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ConcretePrototype deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            return (ConcretePrototype) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ConcretePrototype deepCloneHobbies() {
        try {
            ConcretePrototype result = (ConcretePrototype) super.clone();
            result.hobbies = (List) ((ArrayList)result.hobbies).clone();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
