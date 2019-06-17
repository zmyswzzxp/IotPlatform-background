package com.iot.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iot.demo.bean.UserInfoBack;

import com.iot.demo.dao.UserInfoBackMapper;

import com.iot.demo.service.UserInfoBackService;
import com.iot.demo.utils.Const;
import com.iot.demo.utils.PageBean;
import com.iot.demo.utils.PageUtil;
import org.springframework.cache.annotation.Cacheable;



@Service
public class UserInfoBackServiceImpl implements UserInfoBackService  {

	@Autowired
	private UserInfoBackMapper userInfoBackMapper;
	
	
	

	@Override
	public void insertUserInfo(UserInfoBack userInfo) {
		// TODO Auto-generated method stub
		userInfoBackMapper.insertUserInfoBack(userInfo);
		
	}

	
	@Override
	public List<UserInfoBack> getUserInfoBackList(UserInfoBack userinfoback) {
		// TODO Auto-generated method stub
		
		return userInfoBackMapper.getUserInfoBackList(userinfoback);
	}

	@Override
	public Long getUserInfoBackCount(UserInfoBack userInfo) {
		// TODO Auto-generated method stub
		return userInfoBackMapper.countByExample(userInfo);
	}

	//@Cacheable(cacheNames="zy", key="#p1")
	@Override
	public PageBean<UserInfoBack> getUserBackInfoList(UserInfoBack userInfo, Integer page) {
		// TODO Auto-generated method stub
		int allrow=getUserInfoBackCount(userInfo).intValue();
		int totalPage=PageUtil.countTotalPage(allrow, Const.PAGE_SIZE);//.countCurrentPage(allrow,Const.PAGE_SIZE);
		int currentPage=PageUtil.countCurrentPage(page);
		int start=PageUtil.countStart(Const.PAGE_SIZE, currentPage);
		userInfo.setStart(start);
		userInfo.setLength(Const.PAGE_SIZE);
		List<UserInfoBack> users=userInfoBackMapper.getUserInfoBackList(userInfo);
		
		PageBean<UserInfoBack> pageBean=new PageBean();
		pageBean.setAllRow(allrow);
		pageBean.setCurrentPage(currentPage);;
		pageBean.setList(users);
		pageBean.setPageSize(Const.PAGE_SIZE);
		pageBean.setTotalPage(totalPage);
		return pageBean;
	}

	@Override
	public void addUserInfo(UserInfoBack userInfo) throws Exception {
		// TODO Auto-generated method stub
		userInfoBackMapper.addUserInfo(userInfo);
	}

	@Override
	public void deleteUserInfo(UserInfoBack userInfo) throws Exception {
		// TODO Auto-generated method stub
		userInfoBackMapper.deleteUserInfo(userInfo);
	}

	
	
	
	@Override
	public UserInfoBack loadUpdateUserInfo(UserInfoBack userInfo) {
		return userInfoBackMapper.getUserInfo(userInfo);
	}

	@Override
	public void updateUserInfo(UserInfoBack userInfo) throws Exception{
		userInfoBackMapper.updateUserInfo(userInfo);
	}

}
