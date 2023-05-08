package com.lhg.overseasystem.user.domain;

import com.lhg.overseacommon.domain.BaseEntity;

/**
 * 系统用户实体类
 * @author Lihg
 */
public class User extends BaseEntity {

    /** 用户编号 **/
    private Long userId;

    /** 用户唯一标识 **/
    private String userUri;

    /** 用户名称 **/
    private String userName;

    /** 登录密码 **/
    private String password;

    /** 用户性别 **/
    private String sex;

    /** 用户联系方式 **/
    private String telephone;

    /**   用户邮箱  **/
    private String email;

    /** 是否实名认证 **/
    private boolean isCertification;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserUri() {
        return userUri;
    }

    public void setUserUri(String userUri) {
        this.userUri = userUri;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isCertification() {
        return isCertification;
    }

    public void setCertification(boolean certification) {
        isCertification = certification;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userUri='" + userUri + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", isCertification=" + isCertification +
                '}';
    }
}
