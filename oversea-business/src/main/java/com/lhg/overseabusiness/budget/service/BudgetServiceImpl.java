package com.lhg.overseabusiness.budget.service;

import com.lhg.overseabusiness.budget.domain.Budget;
import com.lhg.overseabusiness.budget.mapper.BudgetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetServiceImpl implements IBudgetService{

    @Autowired
    private BudgetMapper budgetMapper;

    /**
     * 条件查询收支信息
     */
    @Override
    public List<Budget> selectBudgetList(Budget budget){
        return budgetMapper.selectBudgetList(budget);
    }

    /**
     * 根据payId查询收支信息
     */
    @Override
    public Budget selectBudgetByPayId(String payId){
        return budgetMapper.selectBudgetByPayId(payId);
    }

    /**
     * 新增收支信息
     */
    @Override
    public int insertBudget(Budget budget){
        return budgetMapper.insertBudget(budget);
    }

    /**
     * 更改收支信息
     */
    @Override
    public int updateBudget(Budget budget){
        return budgetMapper.updateBudget(budget);
    }

    /**
     * 根据删除收支信息
     */
    @Override
    public int deleteBudgetByPayId(String payId){
        return budgetMapper.deleteBudgetByPayId(payId);
    }
}
