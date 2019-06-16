package com.iot.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.iot.demo.bean.testtable;

@Mapper
public interface testtableMapper1 {
	 public void inserttesttable(testtable tbt);
}
