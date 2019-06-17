package com.iot.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.iot.demo.bean.ProductInfo;



@Mapper
public interface ProductInfoMapper {

	public void addProductInfo(ProductInfo productInfo);
	            
}
