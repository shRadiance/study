package com.radiance.gupao.p6.pattern.singleton.register;

/**
 * @author sunhao
 * @date 2020/11/3 19:58
 * @Description:
 */
public enum EnumSingleton {
    INSTANCE;
    private Object data;
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
