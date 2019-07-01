package com.iot.demo.service;

import java.util.List;

import com.iot.demo.bean.TMallClass1;
import com.iot.demo.bean.TMallClass2;
import com.iot.demo.bean.TMallTradeMark;
import com.iot.demo.bean.UserInfoBack;
import com.iot.demo.utils.PageBean;

public interface TMallClass1Service {

	public List<TMallClass1> getTMallClasslist();
	public List<TMallClass2> getTMallClass2list();
	public List<TMallTradeMark> getTMallTradeMarklist() ;
}
