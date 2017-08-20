package com.ailin.model.info;

import java.text.DecimalFormat;

public class OrderList {
    private Integer order_id;

    private DecimalFormat price;

    private Byte status;

    private Integer goods_id;

    private Integer goods_name;

    private String goods_color;

    private String goods_size;

    private Integer goods_count;

    private Integer goods_price;

    private String goods_image_url;

    private Integer shop_id;

    private Integer shop_name;

    @Override
    public String toString() {
        return "OrderList{" +
                "order_id=" + order_id +
                ", price=" + price +
                ", status=" + status +
                ", goods_id=" + goods_id +
                ", goods_name=" + goods_name +
                ", goods_color='" + goods_color + '\'' +
                ", goods_size='" + goods_size + '\'' +
                ", goods_count=" + goods_count +
                ", goods_price=" + goods_price +
                ", goods_image_url='" + goods_image_url + '\'' +
                ", shop_id=" + shop_id +
                ", shop_name=" + shop_name +
                '}';
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public DecimalFormat getPrice() {
        return price;
    }

    public void setPrice(DecimalFormat price) {
        this.price = price;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public Integer getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(Integer goods_name) {
        this.goods_name = goods_name;
    }

    public String getGoods_color() {
        return goods_color;
    }

    public void setGoods_color(String goods_color) {
        this.goods_color = goods_color;
    }

    public String getGoods_size() {
        return goods_size;
    }

    public void setGoods_size(String goods_size) {
        this.goods_size = goods_size;
    }

    public Integer getGoods_count() {
        return goods_count;
    }

    public void setGoods_count(Integer goods_count) {
        this.goods_count = goods_count;
    }

    public Integer getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(Integer goods_price) {
        this.goods_price = goods_price;
    }

    public String getGoods_image_url() {
        return goods_image_url;
    }

    public void setGoods_image_url(String goods_image_url) {
        this.goods_image_url = goods_image_url;
    }

    public Integer getShop_id() {
        return shop_id;
    }

    public void setShop_id(Integer shop_id) {
        this.shop_id = shop_id;
    }

    public Integer getShop_name() {
        return shop_name;
    }

    public void setShop_name(Integer shop_name) {
        this.shop_name = shop_name;
    }
}
