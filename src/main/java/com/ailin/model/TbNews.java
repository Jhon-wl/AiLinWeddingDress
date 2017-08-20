package com.ailin.model;

import java.io.Serializable;
import java.util.Date;

public class TbNews implements Serializable {
    private Integer id;// ����

    private Date createTime;// ����ʱ��

    private Date lastUpdate;// ������ʱ��

    private Byte visibility;// �߼�ɾ��

    private Integer shopId;// ����Ա�߼�����

    private String title;// ����

    private String content;// ����

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

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "TbNews [id=" + id + ", createTime=" + createTime
                + ", lastUpdate=" + lastUpdate + ", visibility=" + visibility
                + ", shopId=" + shopId + ", title=" + title + ", content="
                + content + "]";
    }

}
