package com.iot.demo.service;

import org.springframework.web.multipart.MultipartFile;

public interface ProductsInfoService {
	public String doPutToFilesServer(MultipartFile file);
}
