package com.iot.demo.bean;

public class TMallClass1 {
    private Integer id;

    private String flmch1;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlmch1() {
        return flmch1;
    }

    public void setFlmch1(String flmch1) {
        this.flmch1 = flmch1 == null ? null : flmch1.trim();
    }
}