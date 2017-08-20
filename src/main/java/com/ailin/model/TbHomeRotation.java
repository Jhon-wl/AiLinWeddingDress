package com.ailin.model;


import java.io.Serializable;
import java.util.Date;

public class TbHomeRotation implements Serializable{
    private Integer id;// ����

    private Date createTime;// ����ʱ��

    private Date lastUpdate;// ������ʱ��

    private Byte visibility;// �߼�ɾ��

    private Integer goodsId;// ��Ʒ�������߼����

    private Integer position;// ���ֲ�ͼ�е�λ��

    private String url;// ͼƬ����

    private Integer shopId;// �����������߼����

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
