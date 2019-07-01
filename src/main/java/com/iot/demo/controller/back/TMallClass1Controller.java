package com.iot.demo.controller.back;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.iot.demo.bean.ProductInfo;
import com.iot.demo.bean.TMallClass1;
import com.iot.demo.bean.TMallClass2;
import com.iot.demo.bean.TMallTradeMark;
import com.iot.demo.bean.UserInfoBack;
import com.iot.demo.service.ProductsInfoService;
import com.iot.demo.service.TMallClass1Service;
import com.iot.demo.utils.PageBean;

@Controller
@RequestMapping("/back/TMallClass1/")
public class TMallClass1Controller {

	@Autowired
	private TMallClass1Service tMallClass1Service;
	
	@RequestMapping("/get1")
	public void getclass_1List() throws IOException
	{
		 List<TMallClass1> list=tMallClass1Service.getTMallClasslist();
	     System.out.println(list.size());
	     Gson gson=   new Gson();
	     String class1str=   gson.toJson(list);
	     
	     
	     
	     FileOutputStream out=  new FileOutputStream("F:/cc/class_1.js");
	     out.write(class1str.getBytes());
	     out.close();
	}
	
	@RequestMapping("/get2")
	public void getclass_2List() throws IOException
	{
		 List<TMallClass2> list=tMallClass1Service.getTMallClass2list();
	     System.out.println(list.size());
	     Gson gson=   new Gson();
	     String class1str=   gson.toJson(list);
	     Map<Integer, List<TMallClass2>> collect = list.stream().collect(Collectors.groupingBy(TMallClass2::getFlbh1));
	     for (int key : collect.keySet()) {
	    	 List<TMallClass2> listone=collect.get(key);
	    	     System.out.println("key= "+ key + " and value= " + collect.get(key));
	    	     String filename="F:/cc/class_2_"+listone.get(0).getFlbh1()+".js";
	    	     FileOutputStream out=  new FileOutputStream(filename);
	    	     out.write(class1str.getBytes());
	    	     out.close();
	    	    }
	}
	
	@RequestMapping("/getTMallTradeMark")
	public void getTMallTradeMarklist() throws IOException
	{
//		 List<TMallTradeMark> list=tMallClass1Service.getTMallTradeMarklist();
//	    
//	     Gson gson=   new Gson();
//	     String class1str=   gson.toJson(list);
//	     Map<Integer, List<TMallClass2>> collect = list.stream().collect(Collectors.groupingBy(TMallTradeMark::getFlbh1));
//	     for (int key : collect.keySet()) {
//	    	 List<TMallClass2> listone=collect.get(key);
//	    	     System.out.println("key= "+ key + " and value= " + collect.get(key));
//	    	     String filename="F:/cc/class_2_"+listone.get(0).getFlbh1()+".js";
//	    	     FileOutputStream out=  new FileOutputStream(filename);
//	    	     out.write(class1str.getBytes());
//	    	     out.close();
//	    	    }
	}
	
	
}
