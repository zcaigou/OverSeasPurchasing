package com.lhg.overseabusiness.budget.mapper;

import com.lhg.overseabusiness.budget.domain.Budget;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BudgetMapper {

    /**
     * 条件查询收支信息
     */
    List<Budget> selectBudgetList(Budget budget);

    /**
     * 根据payId查询收支信息
     */
    Budget selectBudgetByPayId(String payId);

    /**
     * 新增收支信息
     */
    int insertBudget(Budget budget);

    /**
     * 更改收支信息
     */
    int updateBudget(Budget budget);

    /**
     * 根据删除收支信息
     */
    int deleteBudgetByPayId(String payId);
}
