package com.iot.demo.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;


import com.iot.demo.bean.UserInfoBack;
import com.iot.demo.utils.PageBean;




public interface UserInfoBackService {

	public void insertUserInfo(UserInfoBack userInfo);
	public List<UserInfoBack> getUserInfoBackList(UserInfoBack userinfoback);
	public Long getUserInfoBackCount(UserInfoBack userInfo);
	
	public PageBean<UserInfoBack> getUserBackInfoList(UserInfoBack userInfo,Integer page);
	
	public void addUserInfo(UserInfoBack userInfo) throws Exception;
	
	/**
	 * 加载待修改的用户信息
	 * @param userInfo
	 * @return
	 */
	public UserInfoBack loadUpdateUserInfo(UserInfoBack userInfo);
	
	/**
	 * 修改用户信息
	 * @param userInfo
	 */
	public void updateUserInfo(UserInfoBack userInfo) throws Exception;
	/**
	 * 删除用户信息
	 * @param userInfo
	 */
	public void deleteUserInfo(UserInfoBack userInfo) throws Exception;
	
//	public PageBean<UserInfo> getUserInfoList(UserInfo userInfo,Integer page);
//	public Long getUserInfoCount(UserInfo userInfo);
//	
//	public void addUsers(MultipartFile users) throws Exception ;
//
//	public  HSSFWorkbook  createDownloadFile(List<UserInfo> users) throws IOException ;
//	public void addUserInfo(UserInfo userInfo) throws Exception ;
//	
//	public boolean validatePhone(UserInfo userInfo);
//	
//	public UserInfo loadUpdateUserInfo(UserInfo userInfo);
//	
//	public void updateUserInfo(UserInfo userInfo);
//	
//	public void deleteUserInfo(UserInfo userInfo)throws Exception ;
//	
//	public UserInfo doLogin(UserInfo userInfo);
}
