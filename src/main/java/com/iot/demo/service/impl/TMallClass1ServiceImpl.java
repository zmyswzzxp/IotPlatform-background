package com.iot.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.demo.bean.ProductInfo;
import com.iot.demo.bean.TMallClass1;
import com.iot.demo.bean.TMallClass2;
import com.iot.demo.bean.TMallTradeMark;
import com.iot.demo.bean.UserInfoBack;
import com.iot.demo.dao.ProductInfoMapper;
import com.iot.demo.dao.TMallClass1Mapper;
import com.iot.demo.dao.TMallClass2Mapper;
import com.iot.demo.dao.TMallTradeMarkMapper;
import com.iot.demo.service.TMallClass1Service;
import com.iot.demo.utils.Const;
import com.iot.demo.utils.PageBean;
import com.iot.demo.utils.PageUtil;

@Service
public class TMallClass1ServiceImpl  implements TMallClass1Service{

	@Autowired
	private TMallClass1Mapper tMallClass1Mapper;
	@Autowired
	private TMallClass2Mapper tMallClass2Mapper;
	
	@Autowired
	private TMallTradeMarkMapper tMallTradeMarkMapper;

	@Override
	public List<TMallClass1> getTMallClasslist() {
		// TODO Auto-generated method stub
		return tMallClass1Mapper.getTMallClasslist();
	}

	@Override
	public List<TMallClass2> getTMallClass2list() {
		// TODO Auto-generated method stub
		return tMallClass2Mapper.getTMallClass2list();
	}
	
	@Override
	public List<TMallTradeMark> getTMallTradeMarklist() {
		// TODO Auto-generated method stub
		return tMallTradeMarkMapper.getTMallTradeMarklist();
	}
	
	

}
