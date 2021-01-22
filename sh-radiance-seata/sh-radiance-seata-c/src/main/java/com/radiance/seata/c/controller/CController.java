package com.radiance.seata.c.controller;

import com.radiance.seata.c.bean.dao.StaffDAO;
import com.radiance.seata.c.bean.vo.SingleTransactionalVO;
import com.radiance.seata.c.service.CService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author sunhao
 * @date 2021/1/19 10:52
 * @Description:
 */
@Slf4j
@RestController
public class CController {

    @Autowired
    private CService cService;

    @RequestMapping("/seata/c")
    public String seataC() {
        System.out.println("seataC");
        return "seataC";
    }

    @RequestMapping("/seata/c/select")
    public List<StaffDAO> select(@RequestBody StaffDAO staffDAO) {
        log.info("AController.select()");
        return cService.select(staffDAO);
    }

    @RequestMapping("/seata/c/insert")
    public int insert(@RequestBody List<StaffDAO> staffDAOList) {
        log.info("AController.insert()");
        return cService.insert(staffDAOList);
    }

    @RequestMapping("/seata/c/update")
    public int update(@RequestBody List<StaffDAO> staffDAOList) {
        log.info("AController.update()");
        return cService.update(staffDAOList);
    }

    @RequestMapping("/seata/c/delete")
    public int delete(@RequestBody List<StaffDAO> staffDAOList) {
        log.info("AController.delete()");
        return cService.delete(staffDAOList);
    }

    @RequestMapping("/seata/c/singleTransaction")
    public String singleTransaction(@RequestBody SingleTransactionalVO singleTransactionalVO) {
        log.info("AController.delete()");
        return cService.singleTransactional(singleTransactionalVO);
    }

}
