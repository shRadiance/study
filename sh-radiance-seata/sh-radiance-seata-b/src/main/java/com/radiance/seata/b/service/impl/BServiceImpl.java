package com.radiance.seata.b.service.impl;

import com.radiance.seata.b.bean.dao.StaffDAO;
import com.radiance.seata.b.bean.vo.SingleTransactionalVO;
import com.radiance.seata.b.mapper.StaffMapper;
import com.radiance.seata.b.service.BService;
import io.seata.core.context.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author sunhao
 * @date 2021/1/19 17:22
 * @Description:
 */
@Slf4j
@Service
public class BServiceImpl implements BService {

    @Autowired
    private StaffMapper staffMapper;

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

    @Override
    public int update(List<StaffDAO> staffDAOList) {
        System.out.println("-----------XID-----------");
        System.out.println(RootContext.getXID());
        int result = staffMapper.update(staffDAOList);
        log.info("AServiceImpl.update() result:{}", result);
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

}
