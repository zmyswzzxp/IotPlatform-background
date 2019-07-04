package com.iot.demo.bean;

import com.iot.demo.utils.BaseBean;

public class ProductInfo extends BaseBean{
	 private Integer productId;

	    private String productName;

	    private String productPrice;

	    private String productUrl;

	    private String productState;

	    private String productIntro;

	    private Integer flbh1;

	    private Integer flbh2;

	    private Integer ppid;

	    private String productDesc;

	    public Integer getProductId() {
	        return productId;
	    }

	    public void setProductId(Integer productId) {
	        this.productId = productId;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    public void setProductName(String productName) {
	        this.productName = productName == null ? null : productName.trim();
	    }

	    public String getProductPrice() {
	        return productPrice;
	    }

	    public void setProductPrice(String productPrice) {
	        this.productPrice = productPrice == null ? null : productPrice.trim();
	    }

	    public String getProductUrl() {
	        return productUrl;
	    }

	    public void setProductUrl(String productUrl) {
	        this.productUrl = productUrl == null ? null : productUrl.trim();
	    }

	    public String getProductState() {
	        return productState;
	    }

	    public void setProductState(String productState) {
	        this.productState = productState == null ? null : productState.trim();
	    }

	    public String getProductIntro() {
	        return productIntro;
	    }

	    public void setProductIntro(String productIntro) {
	        this.productIntro = productIntro == null ? null : productIntro.trim();
	    }

	    public Integer getFlbh1() {
	        return flbh1;
	    }

	    public void setFlbh1(Integer flbh1) {
	        this.flbh1 = flbh1;
	    }

	    public Integer getFlbh2() {
	        return flbh2;
	    }

	    public void setFlbh2(Integer flbh2) {
	        this.flbh2 = flbh2;
	    }

	    public Integer getPpId() {
	        return ppid;
	    }

	    public void setPpId(Integer ppId) {
	        this.ppid = ppId;
	    }

	    public String getProductDesc() {
	        return productDesc;
	    }

	    public void setProductDesc(String productDesc) {
	        this.productDesc = productDesc == null ? null : productDesc.trim();
	    }
}