package com.ailin.model;


import java.io.Serializable;
import java.util.Date;

public class TbGoods implements Serializable{
    private Integer id;// 主键

    private Date createTime;// 创建时间

    private Date putawayTime;// 上架日期

    private Date lastUpdate;// 最后更新时间

    private Byte visibility;// 逻辑删除

    private Byte isPutaway;// 是否上架

    private String name;// 商品名称

    private String hemline;// 裙摆样式

    private String description;// 商品描述

    private String style;// 商品款式

    private String color;// 颜色

    private Integer quantity;// 库存

    private Integer saleCount;// 销售量

    private Integer weight;// 婚纱权重

    private String status;// 订单商品状态

    private Integer price;// 商品价格

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

    public Date getPutawayTime() {
        return putawayTime;
    }

    public void setPutawayTime(Date putawayTime) {
        this.putawayTime = putawayTime;
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

    public Byte getIsPutaway() {
        return isPutaway;
    }

    public void setIsPutaway(Byte isPutaway) {
        this.isPutaway = isPutaway;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHemline() {
        return hemline;
    }

    public void setHemline(String hemline) {
        this.hemline = hemline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TbGoods [id=" + id + ", createTime=" + createTime
                + ", putawayTime=" + putawayTime + ", lastUpdate=" + lastUpdate
                + ", visibility=" + visibility + ", isPutaway=" + isPutaway
                + ", name=" + name + ", hemline=" + hemline + ", description="
                + description + ", style=" + style + ", color=" + color
                + ", quantity=" + quantity + ", saleCount=" + saleCount
                + ", weight=" + weight + ", status=" + status + ", price="
                + price + "]";
    }
}
