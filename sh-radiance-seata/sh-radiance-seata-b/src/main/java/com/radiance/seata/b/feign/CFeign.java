package com.radiance.seata.b.feign;

import com.radiance.seata.b.bean.dao.StaffDAO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author sunhao
 * @date 2021/1/19 11:14
 * @Description:
 */
@FeignClient(name = "SEATAC")
@Component
public interface CFeign {

    @RequestMapping("/seata/c")
    String seataC();

    @RequestMapping("/seata/c/select")
    List<StaffDAO> select(@RequestBody StaffDAO staffDAO);

    @RequestMapping("/seata/c/insert")
    int insert(@RequestBody List<StaffDAO> staffDAOList);

    @RequestMapping("/seata/c/update")
    int update(@RequestBody List<StaffDAO> staffDAOList);

    @RequestMapping("/seata/c/delete")
    int delete(@RequestBody List<StaffDAO> staffDAOList);

}
