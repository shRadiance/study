package com.radiance.seata.b.controller;

import com.radiance.seata.b.bean.dao.StaffDAO;
import com.radiance.seata.b.bean.vo.SingleTransactionalVO;
import com.radiance.seata.b.feign.CFeign;
import com.radiance.seata.b.service.BService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author sunhao
 * @date 2021/1/19 10:32
 * @Description:
 */
@Slf4j
@RestController
public class BController {

    @Autowired
    private BService bService;

    @Autowired
    private CFeign cFeign;

    @RequestMapping("/seata/b")
    public String seataB() {
        System.out.println("seataB");
        return cFeign.seataC();
    }

    @RequestMapping("/seata/b/select")
    public List<StaffDAO> select(@RequestBody StaffDAO staffDAO) {
        log.info("AController.select()");
        return bService.select(staffDAO);
    }

    @RequestMapping("/seata/b/insert")
    public int insert(@RequestBody List<StaffDAO> staffDAOList) {
        log.info("AController.insert()");
        return bService.insert(staffDAOList);
    }

    @RequestMapping("/seata/b/update")
    public int update(@RequestBody List<StaffDAO> staffDAOList) {
        log.info("AController.update()");
        return bService.update(staffDAOList);
    }

    @RequestMapping("/seata/b/delete")
    public int delete(@RequestBody List<StaffDAO> staffDAOList) {
        log.info("AController.delete()");
        return bService.delete(staffDAOList);
    }

    @RequestMapping("/seata/b/singleTransaction")
    public String singleTransaction(@RequestBody SingleTransactionalVO singleTransactionalVO) {
        log.info("AController.delete()");
        return bService.singleTransactional(singleTransactionalVO);
    }

}
