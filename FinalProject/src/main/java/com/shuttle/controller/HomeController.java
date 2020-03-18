package com.shuttle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	// Controller 부분
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/test.do")
	public String test() {
		return "test";
	}
}
