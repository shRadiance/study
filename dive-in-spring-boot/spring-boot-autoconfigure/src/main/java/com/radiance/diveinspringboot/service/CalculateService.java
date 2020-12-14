package com.radiance.diveinspringboot.service;

/**
 * 计算服务
 *
 * @author sunhao
 * @date 2020/5/31 22:51
 * @Description:
 */
public interface CalculateService {
    /**
     * 从多个整数 sum 求和
     * @param values 多个整数
     * @return sum 累加值
     */
    Integer sum(Integer... values);
}
