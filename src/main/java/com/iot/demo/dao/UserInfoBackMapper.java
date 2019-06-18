package com.iot.demo.dao;


import com.iot.demo.bean.UserInfoBack;
import com.iot.demo.bean.UserInfoBackExample;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserInfoBackMapper {
	
	public void insertUserInfoBack(UserInfoBack userinfoback);
	
	public List<UserInfoBack> getUserInfoBackList(UserInfoBack userinfoback);
    long countByExample(UserInfoBack userinfoback);
    public void addUserInfo(UserInfoBack userInfo);
    /**
	 * 删除用户信息
	 * @param userInfo
	 */
	public void deleteUserInfo(UserInfoBack userInfo);
	
	
	/**
	 * 根据条件查询用户信息
	 * @param userInfo
	 */
	public UserInfoBack getUserInfo(UserInfoBack userInfo);
	
	/**
	 * 修改用户信息
	 * @param userInfo
	 */
	public void updateUserInfo(UserInfoBack userInfo);
    
    //
//    int deleteByExample(UserInfoBackExample example);
//
//    int deleteByPrimaryKey(Integer userId);
//
//    int insert(UserInfoBack record);
//
//    int insertSelective(UserInfoBack record);
//
//    List<UserInfoBack> selectByExample(UserInfoBackExample example);
//
//    UserInfoBack selectByPrimaryKey(Integer userId);
//
//    int updateByExampleSelective(@Param("record") UserInfoBack record, @Param("example") UserInfoBackExample example);
//
//    int updateByExample(@Param("record") UserInfoBack record, @Param("example") UserInfoBackExample example);
//
//    int updateByPrimaryKeySelective(UserInfoBack record);
//
//    int updateByPrimaryKey(UserInfoBack record);
}