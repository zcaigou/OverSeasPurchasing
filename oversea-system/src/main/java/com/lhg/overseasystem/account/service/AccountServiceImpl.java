package com.lhg.overseasystem.account.service;

import com.lhg.overseasystem.account.domain.UserAccount;
import com.lhg.overseasystem.account.mapper.AccountMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements IAccountService{

    @Autowired
    private AccountMapper accountMapper;


    /**
     * 条件查询个人账户信息
     */
    @Override
    public List<UserAccount> selectAccountList(UserAccount userAccount){
        return accountMapper.selectAccountList(userAccount);
    }

    /**
     * 根据userUri和accountId查询个人账户信息
     */
    @Override
    public UserAccount selectByUserUriAndAccountId( String userUri , String accountId){
        return accountMapper.selectByUserUriAndAccountId(userUri,accountId);
    }

    /**
     * 新增个人账户信息
     */
    @Override
    public int insertAccount(UserAccount userAccount){
        return accountMapper.insertAccount(userAccount);
    }

    /**
     * 更改个人账户金额
     */
    @Override
    public int updateAccount(String userUri ,String accountId, double accountMoney){
        return accountMapper.updateAccount(userUri,accountId,accountMoney);
    }

    /**
     * 根据userUri删除个人账户信息
     */
    @Override
    public int deleteAccountByUserUri(String userUri){
        return accountMapper.deleteAccountByUserUri(userUri);
    }

    /**
     * 根据userUri和accountId删除个人账户
     */
    @Override
    public int deleteByUserUriAndAccountId(String userUri ,String accountId){
        return accountMapper.deleteByUserUriAndAccountId(userUri,accountId);
    }

}
