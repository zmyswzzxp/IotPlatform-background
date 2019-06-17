package com.iot.demo.service;

import org.springframework.web.multipart.MultipartFile;

import com.iot.demo.bean.ProductInfo;

public interface ProductsInfoService {
	public String doPutToFilesServer(MultipartFile file);
	
	public void addProductInfo(ProductInfo productInfo) throws Exception;
}
