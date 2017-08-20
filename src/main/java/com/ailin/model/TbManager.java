package com.ailin.model;


import java.io.Serializable;
import java.util.Date;

public class TbManager implements Serializable{
    private Integer id;// 主键

    private Date createTime;// 创建时间

    private Date lastUpdate;// 最后更新时间

    private Byte visibility;// 逻辑删除

    private String userName;// 管理员名

    private String password;// 管理员密码

    private String salt;// 盐值

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

    @Override
    public String toString() {
        return "TbManager [userName=" + userName + "]";
    }
}
