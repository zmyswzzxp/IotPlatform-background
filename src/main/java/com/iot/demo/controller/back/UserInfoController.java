package com.iot.demo.controller.back;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iot.demo.bean.UserInfoBack;
import com.iot.demo.service.UserInfoBackService;
import com.iot.demo.utils.PageBean;



@Controller
@RequestMapping("/back/userinfo/")
public class UserInfoController {
	
	@Autowired
	private UserInfoBackService userinfobackservice;
	
	
	@RequestMapping("index")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("main")
	public String main()
	{
		return "main";
		
	}
	
	
	@RequestMapping("/add")
	@CacheEvict(cacheNames="zy",allEntries=true)
	public String add(UserInfoBack userinfo,Model model)
	{
		
		try {
			userinfobackservice.addUserInfo(userinfo);
			model.addAttribute("result","添加用户信息成功zz111z");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			model.addAttribute("result","添加用户信息失败");
		}
		return "back/userinfo/userinfo_info";
		
		
		
	}
	
	@RequestMapping("/get")
	public void getUserInfoBackList()
	{
		UserInfoBack user=new UserInfoBack();
		user.setStart(2);
		user.setLength(2);
		List<UserInfoBack> users=userinfobackservice.getUserInfoBackList(user);
	 for(UserInfoBack u:users)
	 {
		 System.out.println("u.name="+u.getUserName());
		 
	 }
	}
	
	@RequestMapping("/count")
	public void getUserInfoBackCount()
	{
		UserInfoBack user=new UserInfoBack();
//		user.setStart(2);
//		user.setLength(2);
		//user.setUserName("张");
		long count=userinfobackservice.getUserInfoBackCount(user);
	 
		 System.out.println("u.name="+count);
		 
	 
	}
	
	@RequestMapping("/getlist12")
	public void getlist()
	{
		UserInfoBack user=new UserInfoBack();
		int page=2;
		PageBean<UserInfoBack> pageBean=userinfobackservice.getUserBackInfoList(user, page);
		System.out.println("当前共有"+pageBean.getAllRow()+"条记录");
		System.out.println("当前是第"+pageBean.getCurrentPage()+"页");
		System.out.println("总共有"+pageBean.getTotalPage()+"页");
		List<UserInfoBack> users =pageBean.getList();
	
	   
	   for(UserInfoBack u:users)
		 {
			 System.out.println("u.name="+u.getUserName());
			 
		 }
	
	}
	
	
	@RequestMapping("list")
	public String list(UserInfoBack userInfo,Model model,Integer page){
		PageBean<UserInfoBack> pageBean=userinfobackservice.getUserBackInfoList(userInfo, page);
	   model.addAttribute("pageBean",pageBean);
	   model.addAttribute("userInfo",userInfo);
	   
	   return "back/userinfo/userinfo_list";
	}
	
	@RequestMapping("loadadd")
	public String loadAdd()
	{
		 return "back/userinfo/userinfo_add";
	}
	
	@RequestMapping("delete")
	public String deleteUserInfo(UserInfoBack userInfo,Model model){
		try {
			userinfobackservice.deleteUserInfo(userInfo);
			model.addAttribute("result", "删除用户信息成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			model.addAttribute("result", "删除用户信息失败");
		}
		return "back/userinfo/userinfo_info";
	}
	
	
	@RequestMapping("loadupdate")
	public String loadUpdate(UserInfoBack userInfo ,Model model){
		UserInfoBack puser = userinfobackservice.loadUpdateUserInfo(userInfo);
		model.addAttribute("userinfo", puser);
		return "back/userinfo/userinfo_update";
	}
	
	@RequestMapping("update")
	@CacheEvict(cacheNames="zy",allEntries=true)
	public String updateUserInfo(UserInfoBack userInfo,Model model){
		try {
			userinfobackservice.updateUserInfo(userInfo);
			model.addAttribute("result", "修改用户信息成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			model.addAttribute("result", "修改用户信息失败");
		}
		return "back/userinfo/userinfo_info";
	}

}
