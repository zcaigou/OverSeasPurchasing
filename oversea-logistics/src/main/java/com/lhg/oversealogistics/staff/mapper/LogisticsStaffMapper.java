package com.lhg.oversealogistics.staff.mapper;

import com.lhg.oversealogistics.staff.domain.LogisticsStaff;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LogisticsStaffMapper {

    /**
     *  条件查询员工信息
     */
    public List<LogisticsStaff> selectLogisticsStaffList(LogisticsStaff logisticsStaf);

    /**
     * 根据userId查询员工信息
     */
    public LogisticsStaff selectLogisticsStaffByUserId(String userId);

    /**
     * 新增员工信息
     */
    public int insertLogisticsStaff(LogisticsStaff logisticsStaf);

    /**
     *  更改员工信息
     */
    public int updateLogisticsStaff(LogisticsStaff logisticsStaf);

    /**
     * 根据userId删除员工信息
     */
    public int deleteLogisticsStaffByUserId(String userId);
}
