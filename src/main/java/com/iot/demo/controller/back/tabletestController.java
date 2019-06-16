package com.iot.demo.controller.back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iot.demo.bean.testtable;
import com.iot.demo.service.tabletestService;

@Controller
public class tabletestController {
  
	@Autowired
	private tabletestService tabletestservice;
	
	@RequestMapping("/index1")
	public void testtabletest()
	{
		testtable tbmodel=new testtable();
		tbmodel.setName("swz111");
		tabletestservice.insertesttable1(tbmodel);
		
		
	}
	
}
