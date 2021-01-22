package com.radiance.seata.a.bean.vo;

import com.radiance.seata.a.bean.dao.StaffDAO;
import lombok.Data;

import java.util.List;

/**
 * @author sunhao
 * @date 2021/1/19 17:02
 * @Description:
 */
@Data
public class SingleTransactionalVO {

    private List<StaffDAO> insert;

    private List<StaffDAO> update;

    private List<StaffDAO> delete;

}
