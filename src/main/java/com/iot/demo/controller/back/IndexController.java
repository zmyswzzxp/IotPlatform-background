package com.iot.demo.controller.back;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
	@RequestMapping("index")
	public String index()
	{
		return "hello springboot";
		
	}

}
