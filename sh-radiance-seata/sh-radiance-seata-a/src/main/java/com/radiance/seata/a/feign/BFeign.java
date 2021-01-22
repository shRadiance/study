package com.radiance.seata.a.feign;

import com.radiance.seata.a.bean.dao.StaffDAO;
import com.radiance.seata.a.config.MultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author sunhao
 * @date 2021/1/19 11:12
 * @Description:
 */
//@FeignClient(name = "SEATAB", configuration = MultipartSupportConfig.class)
@FeignClient(name = "SEATAB")
@Component
public interface BFeign {

    @RequestMapping("/seata/b")
    String seataB();

    @RequestMapping("/seata/b/select")
    List<StaffDAO> select(@RequestBody StaffDAO staffDAO);

    @RequestMapping("/seata/b/insert")
    int insert(@RequestBody List<StaffDAO> staffDAOList);

    @RequestMapping("/seata/b/update")
    int update(@RequestBody List<StaffDAO> staffDAOList);

    @RequestMapping("/seata/b/delete")
    int delete(@RequestBody List<StaffDAO> staffDAOList);

}
