package com.lhg.overseasystem.account.service;

import com.lhg.overseasystem.account.domain.UserAccount;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IAccountService {


    /**
     * 条件查询个人账户信息
     */
    public List<UserAccount> selectAccountList(UserAccount userAccount);

    /**
     * 根据userUri和accountId查询个人账户信息
     */
    public UserAccount selectByUserUriAndAccountId(String userUri ,String accountId);

    /**
     * 新增个人账户信息
     */
    public int insertAccount(UserAccount userAccount);

    /**
     * 更改个人账户金额
     */
    public int updateAccount(String userUri ,String accountId, double accountMoney);

    /**
     * 根据userUri删除个人账户信息
     */
    public int deleteAccountByUserUri(String userUri);

    /**
     * 根据userUri和accountId删除个人账户
     */
    public int deleteByUserUriAndAccountId(String userUri ,String accountId);
}
