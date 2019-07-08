package com.iot.demo.controller.back;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductAttr {
	
	@RequestMapping("goto_attr_add")
	public String goto_attr_add(int flbh2,ModelMap map)
	{
		map.put("flbh2", flbh2);
		return "back/productattr/productattr_add";
	}
	
	
	@RequestMapping("attr_add")
	public ModelAndView attr_add(int flbh2)
	{
//		/goto_attr_add?flbh2="+class_2_id
		ModelAndView mv=new ModelAndView("redirect:/goto_attr_add");
		mv.addObject("flbh2", flbh2);
		return mv;
	}
	
	
	
	

}
