package com.lhg.overseasystem.account.domain;

public class UserAccount {

    private String accountId;

    private String userUri;

    private double accountMoney;

    private String realName;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUserUri() {
        return userUri;
    }

    public void setUserUri(String userUri) {
        this.userUri = userUri;
    }

    public double getAccountMoney() {
        return accountMoney;
    }

    public void setAccountMoney(double accountMoney) {
        this.accountMoney = accountMoney;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "accountId='" + accountId + '\'' +
                ", userUri='" + userUri + '\'' +
                ", accountMoney=" + accountMoney +
                ", realName='" + realName + '\'' +
                '}';
    }
}
