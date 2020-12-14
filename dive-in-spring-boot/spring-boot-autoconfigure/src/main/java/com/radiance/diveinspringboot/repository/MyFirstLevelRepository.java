package com.radiance.diveinspringboot.repository;

import com.radiance.diveinspringboot.annotation.FirstLevelRepository;
import com.radiance.diveinspringboot.annotation.SecondLevelRepository;

/**
 * 我的 {@link FirstLevelRepository}
 *
 * @author sunhao
 * @date 2020/5/31 18:38
 * @Description:
 */
@SecondLevelRepository(value = "myFirstLevelRepository") // Bean 名称
public class MyFirstLevelRepository {
}
