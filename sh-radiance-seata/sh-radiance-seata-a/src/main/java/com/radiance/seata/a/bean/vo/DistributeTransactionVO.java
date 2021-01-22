package com.radiance.seata.a.bean.vo;

import com.radiance.seata.a.bean.dao.StaffDAO;
import lombok.Data;

import java.util.List;

/**
 * @author sunhao
 * @date 2021/1/19 18:01
 * @Description:
 */
@Data
public class DistributeTransactionVO {

    private List<StaffDAO> a;
    private List<StaffDAO> b;
    private List<StaffDAO> c;

}
