package com.qyy.ssm_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	
	@GetMapping("/login")
	public String login() {
		
		System.out.println("welcome to this method");
		return "login";
	}
	

}
