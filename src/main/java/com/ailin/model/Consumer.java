package com.ailin.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *@Author SmileZhai
 *@Date 2017/8/4 9:48
 *@Description 顾客表
 */
public class Consumer {
    private Integer id;//主键用户id
    private Date createTime;//用户创建时间
    private Date lastUpdate;//用户最近更新时间
    private Byte visibility;//用户是否可用，1为可用，0为不可用
    private String userName;//用户名
    private String password;//密码
    private String salt;//盐值

    public Consumer() {
    }

    public Consumer(Integer id, Date createTime, Date lastUpdate, Byte visibility, String userName, String password, String salt, String nickName, String headImgUrl, String score, BigDecimal wallet, String gender, String email, String telephone, Date birthday, Integer defaultAddressId) {

        this.id = id;
        this.createTime = createTime;
        this.lastUpdate = lastUpdate;
        this.visibility = visibility;
        this.userName = userName;
        this.password = password;
        this.salt = salt;
        this.nickName = nickName;
        this.headImgUrl = headImgUrl;
        this.score = score;
        this.wallet = wallet;
        this.gender = gender;
        this.email = email;
        this.telephone = telephone;
        this.birthday = birthday;
        this.defaultAddressId = defaultAddressId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Byte getVisibility() {
        return visibility;
    }

    public void setVisibility(Byte visibility) {
        this.visibility = visibility;
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

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public BigDecimal getWallet() {
        return wallet;
    }

    public void setWallet(BigDecimal wallet) {
        this.wallet = wallet;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getDefaultAddressId() {
        return defaultAddressId;
    }

    public void setDefaultAddressId(Integer defaultAddressId) {
        this.defaultAddressId = defaultAddressId;
    }

    private String nickName;//昵称
    private String headImgUrl;//头像地址
    private String score;//积分
    private BigDecimal wallet;;//账户余额
    private String gender;//用户性别
    private String email;//用户邮箱
    private String telephone;//用户电话
    private Date birthday;//生日
    private Integer defaultAddressId;

//测试调用是否成功
    @Override
    public String toString() {
        return "Consumer{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", lastUpdate=" + lastUpdate +
                ", visibility=" + visibility +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", nickName='" + nickName + '\'' +
                ", headImgUrl='" + headImgUrl + '\'' +
                ", score='" + score + '\'' +
                ", wallet=" + wallet +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", birthday=" + birthday +
                ", defaultAddressId=" + defaultAddressId +
                '}';
    }
}

