package com.ailin.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TbShopGoodsRelation implements Serializable {
    private Integer id;// 主键

    private Date createTime;// 创建时间

    private Date lastUpdate;// 最后更新时间

    private Byte visibility;// 逻辑删除

    private Integer shopId;// 商铺主键做逻辑外键

    private Integer goodsId;// 商品主键做逻辑外键

    private Integer saleCount;// 销售量

    private Integer quantity;// 库存

    private List<TbGoods> goods;

    private List<TbGoodsImage> goodsImage;

    private List<TbShop> shop;

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

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public List<TbGoods> getGoods() {
        return goods;
    }

    public void setGoods(List<TbGoods> goods) {
        this.goods = goods;
    }

    public List<TbGoodsImage> getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(List<TbGoodsImage> goodsImage) {
        this.goodsImage = goodsImage;
    }

    public List<TbShop> getShop() {
        return shop;
    }

    public void setShop(List<TbShop> shop) {
        this.shop = shop;
    }

    @Override
    public String toString() {
        return "TbShopGoodsRelation [goodsId=" + goodsId + ", goods=" + goods
                + ", goodsImage=" + goodsImage + ", shop=" + shop + "]";
    }
}
