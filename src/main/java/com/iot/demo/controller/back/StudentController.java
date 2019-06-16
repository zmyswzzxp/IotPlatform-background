package com.iot.demo.controller.back;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iot.demo.bean.StudentInfo;



@Controller
@RequestMapping("/studentio/")
public class StudentController {

	@RequestMapping("index")
	public String index(Model model)
	{
		
		model.addAttribute("str", "str hello springboot!!!");
		
		
		StudentInfo studentInfo=new StudentInfo();
		studentInfo.setId(1001);
		studentInfo.setName("张三");
		model.addAttribute("student",studentInfo);
		
		
		List<StudentInfo> students=new ArrayList<>();
		for	(int i=0;i<3;i++)
		{
			StudentInfo s=new StudentInfo();
			s.setId(i);
			s.setName("s"+i);
			students.add(s);
		}
		model.addAttribute("students",students);
		
		Map<String,Object> map=new HashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		model.addAttribute("map", map);
		return "index";
		
	}
}
