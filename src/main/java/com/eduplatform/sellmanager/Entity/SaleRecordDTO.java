package com.eduplatform.sellmanager.Entity;

import java.util.Date;

public class SaleRecordDTO {
    private Integer id;
    private String product_name;
    private Integer product_id;
    private Integer product_cost;
    private Integer product_price;
    private Integer product_count;
    private Integer benefit;
    private Integer pure_benefit;
    private Date date;
    private Integer user_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getProduct_cost() {
        return product_cost;
    }

    public void setProduct_cost(Integer product_cost) {
        this.product_cost = product_cost;
    }

    public Integer getProduct_price() {
        return product_price;
    }

    public void setProduct_price(Integer product_price) {
        this.product_price = product_price;
    }

    public Integer getProduct_count() {
        return product_count;
    }

    public void setProduct_count(Integer product_count) {
        this.product_count = product_count;
    }

    public Integer getBenefit() {
        return benefit;
    }

    public void setBenefit(Integer benefit) {
        this.benefit = benefit;
    }

    public Integer getPure_benefit() {
        return pure_benefit;
    }

    public void setPure_benefit(Integer pure_benefit) {
        this.pure_benefit = pure_benefit;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}
