package com.lhg.overseabusiness.budget.service;

import com.lhg.overseabusiness.budget.domain.Budget;

import java.util.List;

public interface IBudgetService {

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
