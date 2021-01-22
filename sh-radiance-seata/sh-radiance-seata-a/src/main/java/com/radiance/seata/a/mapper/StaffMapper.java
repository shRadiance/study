package com.radiance.seata.a.mapper;

import com.radiance.seata.a.bean.dao.StaffDAO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author sunhao
 * @date 2021/1/19 13:56
 * @Description:
 */
@Mapper
public interface StaffMapper {

    List<StaffDAO> select(StaffDAO staffDAO);

    int insert(@Param("staffDAOList") List<StaffDAO> staffDAOList);

    int update(@Param("staffDAOList") List<StaffDAO> staffDAOList);

    int delete(@Param("staffDAOList") List<StaffDAO> staffDAOList);

}
