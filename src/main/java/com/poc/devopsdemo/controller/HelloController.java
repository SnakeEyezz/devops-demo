package com.poc.devopsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.devopsdemo.domain.HelloBean;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public HelloBean getMsg(){
		
		return new HelloBean("Welcome");
	}

}
