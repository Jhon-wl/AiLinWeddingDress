package com.ailin.model;


import java.io.Serializable;
import java.util.Date;

public class TbManager implements Serializable{
    private Integer id;// ����

    private Date createTime;// ����ʱ��

    private Date lastUpdate;// ������ʱ��

    private Byte visibility;// �߼�ɾ��

    private String userName;// ����Ա��

    private String password;// ����Ա����

    private String salt;// ��ֵ

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
