package com.radiance.gupao.p6.pattern.singleton.seriable;

import java.io.Serializable;

/**
 * @author sunhao
 * @date 2020/11/3 17:15
 * @Description:
 */
// 反序列化导致破坏单例模式
public class SeriableSingleton implements Serializable {
    // 序列化就是把内存中的状态通过转换成字节码的形式
    // 从而转换了一个I/O流，写入其他地方（可以是磁盘、网络I/O）
    // 内存中的状态会永久保存下来

    // 反序列化就是将已经持久化的字节码内容转换为I/O流
    // 通过I/O流的读取，进而将读取的内容转换为Java对象
    // 在转换过程中会重新创建对象new

    public final static SeriableSingleton INSTANCE = new SeriableSingleton();
    private SeriableSingleton() {}
    public static SeriableSingleton getInstance() {
        return INSTANCE;
    }
    private Object readResolve() {
        return INSTANCE;
    }
}
