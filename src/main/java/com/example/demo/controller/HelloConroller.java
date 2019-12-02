package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConroller {
	@RequestMapping("/hello")
	public String printHello(){
		return "hello";
	}

}
