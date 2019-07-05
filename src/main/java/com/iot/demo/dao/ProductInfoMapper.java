package com.iot.demo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.iot.demo.bean.ProductImage;
import com.iot.demo.bean.ProductInfo;
import com.iot.demo.bean.ProductInfoExample;
import com.iot.demo.bean.ProductInfoQueryVo;




@Mapper
public interface ProductInfoMapper {

	public void addProductInfo(ProductInfo productInfo);
	
    public List<ProductInfo> getProductInfoList(ProductInfo productInfo);
	
	public long getProductInfoCount(ProductInfo productInfo);
	
	public void updateProductInfo(ProductInfo productInfo);
	
	public ProductInfo getProductInfo(ProductInfo productInfo);
	
	public void deleteProductInfo(ProductInfo productInfo);
	
	public void addProductImage(Map<Object,Object> map);
	public ProductInfoExample findProductDetail(ProductInfoQueryVo productInfoQueryVo);
	public List<ProductInfoExample> getProductInfoListDetail(ProductInfo productInfo);
	
}
