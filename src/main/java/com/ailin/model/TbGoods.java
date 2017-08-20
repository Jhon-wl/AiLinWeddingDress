package com.ailin.model;


import java.io.Serializable;
import java.util.Date;

public class TbGoods implements Serializable{
    private Integer id;// ����

    private Date createTime;// ����ʱ��

    private Date putawayTime;// �ϼ�����

    private Date lastUpdate;// ������ʱ��

    private Byte visibility;// �߼�ɾ��

    private Byte isPutaway;// �Ƿ��ϼ�

    private String name;// ��Ʒ����

    private String hemline;// ȹ����ʽ

    private String description;// ��Ʒ����

    private String style;// ��Ʒ��ʽ

    private String color;// ��ɫ

    private Integer quantity;// ���

    private Integer saleCount;// ������

    private Integer weight;// ��ɴȨ��

    private String status;// ������Ʒ״̬

    private Integer price;// ��Ʒ�۸�

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
