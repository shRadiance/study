package com.radiance.gupao.p5.io.rpc.server.api;

import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author sunhao
 * @date 2020/9/29 0:10
 * @Description:
 */
public class RpcRequest implements Serializable {

    private String className;
    private String methodName;

    private Object[] parameters;
    private Class[] types;


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParameters() {
        return parameters;
    }

    public void setParameters(Object[] parameters) {
        this.parameters = parameters;
    }

    public Class[] getTypes() {
        return types;
    }

    public void setTypes(Class[] types) {
        this.types = types;
    }
}
