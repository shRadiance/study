package com.radiance.seata.a.controller;

import com.radiance.seata.a.bean.dao.StaffDAO;
import com.radiance.seata.a.bean.vo.DistributeTransactionVO;
import com.radiance.seata.a.bean.vo.SingleTransactionalVO;
import com.radiance.seata.a.feign.BFeign;
import com.radiance.seata.a.service.AService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunhao
 * @date 2021/1/19 10:32
 * @Description:
 */
@Slf4j
@EnableDiscoveryClient
@RestController
public class AController {

    @Autowired
    private AService aService;

    @Autowired
    private BFeign bFeign;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/seata/a")
    public String seataA(@RequestBody List<StaffDAO> staffDAOList) {
        System.out.println("seataA");
        aService.insert(staffDAOList);
        return bFeign.seataB();
    }

    @RequestMapping("/seata/a/select")
    public List<StaffDAO> select(@RequestBody StaffDAO staffDAO) {
        log.info("AController.select()");
        return aService.select(staffDAO);
    }

    @RequestMapping("/seata/a/insert")
    public int insert(@RequestBody List<StaffDAO> staffDAOList) {
        log.info("AController.insert()");
        return aService.insert(staffDAOList);
    }

    @RequestMapping("/seata/a/update")
    public int update(@RequestBody List<StaffDAO> staffDAOList) {
        log.info("AController.update()");
        return aService.update(staffDAOList);
    }

    @RequestMapping("/seata/a/delete")
    public int delete(@RequestBody List<StaffDAO> staffDAOList) {
        log.info("AController.delete()");
        return aService.delete(staffDAOList);
    }

    @RequestMapping("/seata/a/singleTransaction")
    public String singleTransaction(@RequestBody SingleTransactionalVO singleTransactionalVO) {
        log.info("AController.delete()");
        return aService.singleTransactional(singleTransactionalVO);
    }

    @RequestMapping("/seata/a/distributeTransaction")
    public String distributeTransaction(@RequestBody DistributeTransactionVO distributeTransactionVO) {
        log.info("AController.distributeTransaction()");
        return aService.distributeTransaction(distributeTransactionVO);
    }

    @RequestMapping("/eureka/server/list")
    public Object eurekaServerList() {
        List<List<ServiceInstance>> servicesList = new ArrayList<>();
        //获取服务名称
        List<String> serviceNames = discoveryClient.getServices();
        for (String serviceName : serviceNames) {
            //获取服务中的实例列表
            List<ServiceInstance> serviceInstances = discoveryClient.getInstances(serviceName);
            servicesList.add(serviceInstances);
        }
        return servicesList;
    }

}
