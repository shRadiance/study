package com.radiance.gupao.p6.pattern.proxy.staticservice;

/**
 * @author sunhao
 * @date 2020/11/12 10:20
 * @Description:
 */
public class DynamicDataSourceEntry {
    // 默认数据源
    public final static String DEFAULT_SOURCE = null;

    private final static ThreadLocal<String> local = new ThreadLocal<>();

    private DynamicDataSourceEntry() {};

    // 清空数据源
    public static void clear() {
        local.remove();
    }

    // 获取当前正在使用数据源名字
    public static String get() {
        return local.get();
    }

    // 还原当前切换的数据源
    public static void restore() {
        local.set(DEFAULT_SOURCE);
    }

    // 设置已知名字的数据源
    public static void set(String source) {
        local.set(source);
    }

    // 根据年份动态设置数据源
    public static void set(int year) {
        local.set("DB_" + year);
    }
}
