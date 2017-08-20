package com.ailin.model.info;

import java.text.DecimalFormat;

public class OrderGoodsList {

    private String goods_size;

    private int goods_count;

    private String goods_name;

    private int goods_price;

    private String goods_color;

    private String goods_image_url;

    private String shop_name;

    private String telephone;

    @Override
    public String toString() {
        return "OrderGoodsList{" +
                "goods_size='" + goods_size + '\'' +
                ", goods_count=" + goods_count +
                ", goods_name='" + goods_name + '\'' +
                ", goods_price=" + goods_price +
                ", goods_color='" + goods_color + '\'' +
                ", goods_image_url='" + goods_image_url + '\'' +
                ", shop_name='" + shop_name + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }

    public String getGoods_size() {
        return goods_size;
    }

    public void setGoods_size(String goods_size) {
        this.goods_size = goods_size;
    }

    public int getGoods_count() {
        return goods_count;
    }

    public void setGoods_count(int goods_count) {
        this.goods_count = goods_count;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public int getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(int goods_price) {
        this.goods_price = goods_price;
    }

    public String getGoods_color() {
        return goods_color;
    }

    public void setGoods_color(String goods_color) {
        this.goods_color = goods_color;
    }

    public String getGoods_image_url() {
        return goods_image_url;
    }

    public void setGoods_image_url(String goods_image_url) {
        this.goods_image_url = goods_image_url;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
