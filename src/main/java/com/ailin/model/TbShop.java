package com.ailin.model;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TbShop implements Serializable {
    private Integer id;// 主键

    private Byte visibility;// 逻辑删除

    private Date createTime;// 创建时间

    private Date lastUpdate;// 最后更新时间

    private String image;// 店铺头像

    private String name;// 店铺名称

    private Integer saleCount;// 店铺销量

    private String telephone;// 店铺电话

    private String adress;// 店铺地址

    private Integer managerId;// 管理员主键做逻辑外键

    private List<TbManager> managers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getVisibility() {
        return visibility;
    }

    public void setVisibility(Byte visibility) {
        this.visibility = visibility;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public List<TbManager> getManagers() {
        return managers;
    }

    public void setManagers(List<TbManager> managers) {
        this.managers = managers;
    }

    @Override
    public String toString() {
        return "TbShop [id=" + id + ", visibility=" + visibility
                + ", createTime=" + createTime + ", lastUpdate=" + lastUpdate
                + ", image=" + image + ", name=" + name + ", saleCount="
                + saleCount + ", telephone=" + telephone + ", adress=" + adress
                + ", managerId=" + managerId + ", managers=" + managers + "]";
    }


}
