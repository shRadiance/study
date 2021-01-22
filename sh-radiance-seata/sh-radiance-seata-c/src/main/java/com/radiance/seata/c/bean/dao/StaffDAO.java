package com.radiance.seata.c.bean.dao;

import lombok.Data;

/**
 * @author sunhao
 * @date 2021/1/19 13:58
 * @Description:
 */
@Data
public class StaffDAO {
    /**
     * 主键id
     */
    private String id;
    /**
     * 性别 0 男 1 女
     */
    private int sex;
    /**
     * 名字
     */
    private String name;

}
