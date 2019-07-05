package com.iot.demo.bean;

public class ProductInfoQueryVo {

	private ProductInfo productInfo;
	public ProductInfo getProductInfo() {
		return productInfo;
	}

	public void setProductInfo(ProductInfo productInfo) {
		this.productInfo = productInfo;
	}

	private ProductImage productImage;
	private ProductImageExample productImageExample;
	private TMallClass1 tMallClass1;
	private TMallClass2 tMallClass2;
	private TMallTmClass tMallTmClass;
	
	public ProductImage getProductImage() {
		return productImage;
	}
	
	public void setProductImage(ProductImage productImage) {
		this.productImage = productImage;
	}
	
	public ProductImageExample getProductImageExample() {
		return productImageExample;
	}
	public void setProductImageExample(ProductImageExample productImageExample) {
		this.productImageExample = productImageExample;
	}
	
	public TMallClass1 gettMallClass1() {
		return tMallClass1;
	}
	
	public void settMallClass1(TMallClass1 tMallClass1) {
		this.tMallClass1 = tMallClass1;
	}
	
	public TMallClass2 gettMallClass2() {
		return tMallClass2;
	}
	
	public void settMallClass2(TMallClass2 tMallClass2) {
		this.tMallClass2 = tMallClass2;
	}
	
	public TMallTmClass gettMallTmClass() {
		return tMallTmClass;
	}
	
	public void settMallTmClass(TMallTmClass tMallTmClass) {
		this.tMallTmClass = tMallTmClass;
	}
	
}
