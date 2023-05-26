package com.lhg.oversealogistics.staff.service;

import com.lhg.oversealogistics.staff.domain.LogisticsStaff;
import com.lhg.oversealogistics.staff.mapper.LogisticsStaffMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogisticsStaffServiceImpl implements ILogisticsStaffService{

    @Autowired
    private LogisticsStaffMapper logisticsStaffMapper;

    /**
     *  条件查询员工信息
     */
    @Override
    public List<LogisticsStaff> selectLogisticsStaffList(LogisticsStaff logisticsStaf){
        return logisticsStaffMapper.selectLogisticsStaffList(logisticsStaf);
    }

    /**
     * 根据userId查询员工信息
     */
    @Override
    public LogisticsStaff selectLogisticsStaffByUserId(String userId){
        return logisticsStaffMapper.selectLogisticsStaffByUserId(userId);
    }

    /**
     * 新增员工信息
     */
    @Override
    public int insertLogisticsStaff(LogisticsStaff logisticsStaf){
        return logisticsStaffMapper.insertLogisticsStaff(logisticsStaf);
    }

    /**
     *  更改员工信息
     */
    @Override
    public int updateLogisticsStaff(LogisticsStaff logisticsStaf){
        return logisticsStaffMapper.updateLogisticsStaff(logisticsStaf);
    }

    /**
     * 根据userId删除员工信息
     */
    @Override
    public int deleteLogisticsStaffByUserId(String userId){
        return logisticsStaffMapper.deleteLogisticsStaffByUserId(userId);
    }
}
