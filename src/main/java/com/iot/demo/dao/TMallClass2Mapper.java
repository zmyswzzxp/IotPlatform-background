package com.iot.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.iot.demo.bean.ProductInfo;
import com.iot.demo.bean.TMallClass1;
import com.iot.demo.bean.TMallClass2;
import com.iot.demo.bean.UserInfoBack;


@Mapper
public interface TMallClass2Mapper {

	public List<TMallClass2> getTMallClass2list();
	
}
