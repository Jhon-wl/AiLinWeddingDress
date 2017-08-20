package com.ailin.model;


import java.io.Serializable;
import java.util.Date;

public class TbHomeRotation implements Serializable{
    private Integer id;// 主键

    private Date createTime;// 创建时间

    private Date lastUpdate;// 最后更新时间

    private Byte visibility;// 逻辑删除

    private Integer goodsId;// 商品主键做逻辑外键

    private Integer position;// 在轮播图中的位置

    private String url;// 图片链接

    private Integer shopId;// 商铺主键做逻辑外键

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

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    @Override
    public String toString() {
        return "TbHomeRotation [id=" + id + ", createTime=" + createTime
                + ", lastUpdate=" + lastUpdate + ", visibility=" + visibility
                + ", goodsId=" + goodsId + ", position=" + position + ", url="
                + url + ", shopId=" + shopId + "]";
    }
}
