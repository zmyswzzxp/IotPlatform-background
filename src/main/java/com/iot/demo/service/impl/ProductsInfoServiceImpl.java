package com.iot.demo.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import com.iot.demo.bean.ProductInfo;
import com.iot.demo.bean.ProductInfoExample;
import com.iot.demo.bean.ProductInfoQueryVo;
import com.iot.demo.dao.ProductInfoMapper;
import com.iot.demo.service.ProductsInfoService;
import com.iot.demo.utils.Const;
import com.iot.demo.utils.FileNameCreator;
import com.iot.demo.utils.PageBean;
import com.iot.demo.utils.PageUtil;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

@Service
public class ProductsInfoServiceImpl implements ProductsInfoService {

	@Autowired
	private ProductInfoMapper productInfoMapper;
	
	
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

	@Override
	public void addProductInfo(ProductInfo productInfo,List<String> listimage) throws Exception {
		// TODO Auto-generated method stub
		productInfo.setProductState(Const.GOODS_STATE_INIT);
		productInfoMapper.addProductInfo(productInfo);
		
		int id=productInfo.getProductId();
		//model.addAttribute("result","添加产品成功");
		Map<Object,Object> map=new HashMap<Object,Object>();
		
		map.put("chanpin_id", productInfo.getProductId());
		map.put("list_image",listimage);
		productInfoMapper.addProductImage(map);
		
	}

	@Override
	public PageBean<ProductInfoExample> getProductInfoList(ProductInfo productInfo, Integer page) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				// TODO Auto-generated method stub
						int allRow=getProductInfoCount(productInfo).intValue();
						int totalPage=PageUtil.countTotalPage(allRow, Const.PAGE_SIZE);
						int currentPage=PageUtil.countCurrentPage(page);
						int start =PageUtil.countStart(Const.PAGE_SIZE, currentPage);
						if(page>=0){
							productInfo.setStart(start);
							productInfo.setLength(Const.PAGE_SIZE);	
						}
						else{
							productInfo.setStart(-1);
							productInfo.setLength(-1);	
						}
						
						
						List<ProductInfoExample> goods2=productInfoMapper.getProductInfoListDetail(productInfo);

						List<ProductInfo> goods=productInfoMapper.getProductInfoList(productInfo);
						
						PageBean<ProductInfoExample> pageBean=new PageBean<>();
						pageBean.setAllRow(allRow);
						pageBean.setCurrentPage(currentPage);
						pageBean.setList(goods2);
						pageBean.setPageSize(Const.PAGE_SIZE);
				        pageBean.setTotalPage(totalPage);
						return pageBean;
		
	}

	@Override
	public Long getProductInfoCount(ProductInfo productInfo) {
		// TODO Auto-generated method stub
		return productInfoMapper.getProductInfoCount(productInfo);
	}

	@Override
	public void updateProductInfo(ProductInfo productInfo) {
		// TODO Auto-generated method stub
		
		productInfo.setProductState(Const.GOODS_STATE_UP);
		productInfoMapper.updateProductInfo(productInfo);
	}

	@Override
	public ProductInfo getProductInfo(ProductInfo productInfo) {
		// TODO Auto-generated method stub
		return productInfoMapper.getProductInfo(productInfo);
	}
	
	@Override
	public ProductInfoExample getproductInfoQueryVo(ProductInfoQueryVo productInfoQueryVo) {
		// TODO Auto-generated method stub
		return productInfoMapper.findProductDetail(productInfoQueryVo);
	}
	

	@Override
	public void upProductInfo(ProductInfo productInfo) throws Exception {
		// TODO Auto-generated method stub
		productInfo.setProductState(Const.GOODS_STATE_UP);
		productInfoMapper.updateProductInfo(productInfo);
	}

	@Override
	public void downProductInfo(ProductInfo productInfo) throws Exception {
		// TODO Auto-generated method stub
		productInfo.setProductState(Const.GOODS_STATE_DOWN);
		productInfoMapper.updateProductInfo(productInfo);
	}

	@Override
	public void deleteProductInfo(ProductInfo productInfo) throws Exception {
		// TODO Auto-generated method stub
		productInfoMapper.deleteProductInfo(productInfo);
	}

}
