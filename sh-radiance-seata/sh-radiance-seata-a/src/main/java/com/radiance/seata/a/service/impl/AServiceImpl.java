package com.radiance.seata.a.service.impl;

import com.radiance.seata.a.bean.dao.StaffDAO;
import com.radiance.seata.a.bean.vo.DistributeTransactionVO;
import com.radiance.seata.a.bean.vo.SingleTransactionalVO;
import com.radiance.seata.a.feign.BFeign;
import com.radiance.seata.a.feign.CFeign;
import com.radiance.seata.a.mapper.StaffMapper;
import com.radiance.seata.a.service.AService;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.List;

/**
 * @author sunhao
 * @date 2021/1/19 14:33
 * @Description:
 */
@Slf4j
@Service
public class AServiceImpl implements AService {

    @Autowired
    private StaffMapper staffMapper;

    @Autowired
    private BFeign bFeign;

    @Autowired
    private CFeign cFeign;

    @Override
    public List<StaffDAO> select(StaffDAO staffDAO) {
        List<StaffDAO> list = staffMapper.select(staffDAO);
        return list;
    }

    @Override
    public int insert(List<StaffDAO> staffDAOList) {
        int result = staffMapper.insert(staffDAOList);
        log.info("AServiceImpl.insert() result:{}", result);
        return result;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int update(List<StaffDAO> staffDAOList) {

//        int resulta = this.updatea(staffDAOList);
//        System.out.println(resulta);
        staffDAOList.get(0).setName("testyuan");
        int result = staffMapper.update(staffDAOList);
        // 手动强制回滚事务
//        TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        // 设置回滚点，手工回滚异常
//        Object savePoint = TransactionAspectSupport.currentTransactionStatus().createSavepoint();
//        TransactionAspectSupport.currentTransactionStatus().rollbackToSavepoint(savePoint);
        log.info("AServiceImpl.update() result:{}", result);
        return result;
    }

    @Transactional(rollbackFor = Exception.class)
    public int updatea(List<StaffDAO> staffDAOList) {
        staffDAOList.get(0).setName("test");
        int result = staffMapper.update(staffDAOList);
        return result;
    }

    @Override
    public int delete(List<StaffDAO> staffDAOList) {
        int result = staffMapper.delete(staffDAOList);
        log.info("AServiceImpl.delete() result:{}", result);
        return result;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public String singleTransactional(SingleTransactionalVO singleTransactionalVO) {
        if (singleTransactionalVO.getInsert() != null) {
            staffMapper.insert(singleTransactionalVO.getInsert());
        }
        if (singleTransactionalVO.getUpdate() != null) {
            staffMapper.update(singleTransactionalVO.getUpdate());
        }
        if (singleTransactionalVO.getDelete() != null) {
            staffMapper.delete(singleTransactionalVO.getDelete());
        }
        return "singleTransactional sucess";
    }

    @Transactional(rollbackFor = Exception.class)
//    @GlobalTransactional(rollbackFor = Exception.class, name = "seata-test")
    @Override
    public String distributeTransaction(DistributeTransactionVO distributeTransactionVO) {
        System.out.println("-----------XID-----------");
        System.out.println(RootContext.getXID());
        // 本地服务
        staffMapper.update(distributeTransactionVO.getA());
        // Feign远程调用B服务
        bFeign.update(distributeTransactionVO.getA());
        // Feign远程调用C服务
        cFeign.update(distributeTransactionVO.getA());
        return "distributeTransaction sucess";
    }

}
