package com.ailin.model.info;

import java.util.Date;

public class TransferDetail {

    private String transfer_conpany;

    private String transfer_time;

    private Date transfer_begin;

    private Date transfer_end;

    private String order_number;

    @Override
    public String toString() {
        return "TransferDetail{" +
                "transfer_conpany='" + transfer_conpany + '\'' +
                ", transfer_time='" + transfer_time + '\'' +
                ", transfer_begin=" + transfer_begin +
                ", transfer_end=" + transfer_end +
                ", order_number='" + order_number + '\'' +
                '}';
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
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

    public Date getTransfer_begin() {
        return transfer_begin;
    }

    public void setTransfer_begin(Date transfer_begin) {
        this.transfer_begin = transfer_begin;
    }

    public Date getTransfer_end() {
        return transfer_end;
    }

    public void setTransfer_end(Date transfer_end) {
        this.transfer_end = transfer_end;
    }
}
