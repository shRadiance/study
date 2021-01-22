package com.radiance.seata.b.service;

import com.radiance.seata.b.bean.dao.StaffDAO;
import com.radiance.seata.b.bean.vo.SingleTransactionalVO;

import java.util.List;

/**
 * @author sunhao
 * @date 2021/1/19 17:22
 * @Description:
 */
public interface BService {

    List<StaffDAO> select(StaffDAO staffDAO);

    int insert(List<StaffDAO> staffDAOList);

    int update(List<StaffDAO> staffDAOList);

    int delete(List<StaffDAO> staffDAOList);

    String singleTransactional(SingleTransactionalVO singleTransactionalVO);

}
