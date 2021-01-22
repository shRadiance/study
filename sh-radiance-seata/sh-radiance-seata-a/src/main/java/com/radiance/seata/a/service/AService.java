package com.radiance.seata.a.service;

import com.radiance.seata.a.bean.dao.StaffDAO;
import com.radiance.seata.a.bean.vo.DistributeTransactionVO;
import com.radiance.seata.a.bean.vo.SingleTransactionalVO;

import java.util.List;

/**
 * @author sunhao
 * @date 2021/1/19 14:32
 * @Description:
 */
public interface AService {

    List<StaffDAO> select(StaffDAO staffDAO);

    int insert(List<StaffDAO> staffDAOList);

    int update(List<StaffDAO> staffDAOList);

    int delete(List<StaffDAO> staffDAOList);

    String singleTransactional(SingleTransactionalVO singleTransactionalVO);

    String distributeTransaction(DistributeTransactionVO distributeTransactionVO);

}
