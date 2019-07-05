package com.iot.demo.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;


import com.iot.demo.bean.ProductInfo;
import com.iot.demo.bean.ProductInfoExample;
import com.iot.demo.bean.ProductInfoQueryVo;
import com.iot.demo.bean.UserInfoBack;
import com.iot.demo.utils.PageBean;

public interface ProductsInfoService {
	public String doPutToFilesServer(MultipartFile file);
	
	public void addProductInfo(ProductInfo productInfo,List<String> listimge) throws Exception;
	public PageBean<ProductInfoExample> getProductInfoList(ProductInfo productInfo,Integer page);
	public Long getProductInfoCount(ProductInfo productInfo);
	
	public void updateProductInfo(ProductInfo productInfo);
	public ProductInfo getProductInfo(ProductInfo productInfo);
	
	public void upProductInfo(ProductInfo productInfo) throws Exception;
	
	public void downProductInfo(ProductInfo productInfo) throws Exception;
	public void deleteProductInfo(ProductInfo productInfo) throws Exception;
	public ProductInfoExample getproductInfoQueryVo(ProductInfoQueryVo productInfoQueryVo);
}
