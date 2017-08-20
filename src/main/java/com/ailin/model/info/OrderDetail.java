package com.ailin.model.info;

import java.text.DecimalFormat;
import java.util.List;

public class OrderDetail {

    private String order_number;

    private int pay_way;

    private String transfer_conpany;

    private String transfer_time;

    private DecimalFormat order_price;

    private int status;

    private String consumer_name;

    private String consumer_phone;

    private String province;

    private String city;

    private String street;

    private String post;

    private String detail;

    @Override
    public String toString() {
        return "OrderDetail{" +
                "order_number='" + order_number + '\'' +
                ", pay_way=" + pay_way +
                ", transfer_conpany='" + transfer_conpany + '\'' +
                ", transfer_time='" + transfer_time + '\'' +
                ", order_price=" + order_price +
                ", status=" + status +
                ", consumer_name='" + consumer_name + '\'' +
                ", consumer_phone='" + consumer_phone + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", post='" + post + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public int getPay_way() {
        return pay_way;
    }

    public void setPay_way(int pay_way) {
        this.pay_way = pay_way;
    }

    public String getTransfer_conpany() {
        return transfer_conpany;
    }

    public void setTransfer_conpany(String transfer_conpany) {
        this.transfer_conpany = transfer_conpany;
    }

    public String getTransfer_time() {
        return transfer_time;
    }

    public void setTransfer_time(String transfer_time) {
        this.transfer_time = transfer_time;
    }

    public DecimalFormat getOrder_price() {
        return order_price;
    }

    public void setOrder_price(DecimalFormat order_price) {
        this.order_price = order_price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getConsumer_name() {
        return consumer_name;
    }

    public void setConsumer_name(String consumer_name) {
        this.consumer_name = consumer_name;
    }

    public String getConsumer_phone() {
        return consumer_phone;
    }

    public void setConsumer_phone(String consumer_phone) {
        this.consumer_phone = consumer_phone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
