package com.ailin.model;

import java.io.Serializable;
import java.util.Date;

public class TbNews implements Serializable {
    private Integer id;// 主键

    private Date createTime;// 创建时间

    private Date lastUpdate;// 最后更新时间

    private Byte visibility;// 逻辑删除

    private Integer shopId;// 管理员逻辑主键

    private String title;// 标题

    private String content;// 内容

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
