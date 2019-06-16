package com.iot.demo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.iot.demo.bean.testtable;

@Mapper
public interface testtableMapper {
	
	@Insert(value="insert into testtable(name) values(#{name})")
   public void inserttesttable(testtable tbt);
   
}
