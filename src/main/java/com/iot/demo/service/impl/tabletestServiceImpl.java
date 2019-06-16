package com.iot.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.demo.bean.testtable;
import com.iot.demo.dao.testtableMapper;
import com.iot.demo.dao.testtableMapper1;
import com.iot.demo.service.tabletestService;

@Service
public class tabletestServiceImpl implements tabletestService {

	@Autowired
	private testtableMapper testtablemapper;
	
	@Autowired
	private testtableMapper1 testtablemapper1;
	
	@Override
	public void insertesttable(testtable tbt) {
		// TODO Auto-generated method stub
		testtablemapper.inserttesttable(tbt);
	}


	@Override
	public void insertesttable1(testtable tbt) {
		// TODO Auto-generated method stub
		testtablemapper1.inserttesttable(tbt);
	}

}
