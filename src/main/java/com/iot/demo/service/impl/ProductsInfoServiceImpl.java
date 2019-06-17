package com.iot.demo.service.impl;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import com.iot.demo.service.ProductsInfoService;
import com.iot.demo.utils.Const;
import com.iot.demo.utils.FileNameCreator;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

@Service
public class ProductsInfoServiceImpl implements ProductsInfoService {

	
	
	
	@Override
	public String doPutToFilesServer(MultipartFile file) {
		// TODO Auto-generated method stub
		String fileName=file.getOriginalFilename();
		String url=FileNameCreator.createRandomName(Const.File_Server_URL,fileName);
		
		Client client = new Client();
		//设置请求路径
		WebResource resource = client.resource(url);
		//将文件转为byte数组
		byte[] buf;
		try {
			buf = file.getBytes();
			//发送
			resource.put(String.class,buf);
			return url;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}

}
