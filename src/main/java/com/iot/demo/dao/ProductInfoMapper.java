package com.iot.demo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.iot.demo.bean.ProductInfo;




@Mapper
public interface ProductInfoMapper {

	public void addProductInfo(ProductInfo productInfo);
	
    public List<ProductInfo> getProductInfoList(ProductInfo productInfo);
	
	public long getProductInfoCount(ProductInfo productInfo);
	
	public void updateProductInfo(ProductInfo productInfo);
	
	public ProductInfo getProductInfo(ProductInfo productInfo);
	
	public void deleteProductInfo(ProductInfo productInfo);
}
