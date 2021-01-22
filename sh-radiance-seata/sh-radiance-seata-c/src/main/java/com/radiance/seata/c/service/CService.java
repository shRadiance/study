package com.radiance.seata.c.service;

import com.radiance.seata.c.bean.dao.StaffDAO;
import com.radiance.seata.c.bean.vo.SingleTransactionalVO;

import java.util.List;

/**
 * @author sunhao
 * @date 2021/1/19 17:28
 * @Description:
 */
public interface CService {

    List<StaffDAO> select(StaffDAO staffDAO);

    int insert(List<StaffDAO> staffDAOList);

    int update(List<StaffDAO> staffDAOList);

    int delete(List<StaffDAO> staffDAOList);

    String singleTransactional(SingleTransactionalVO singleTransactionalVO);

}
