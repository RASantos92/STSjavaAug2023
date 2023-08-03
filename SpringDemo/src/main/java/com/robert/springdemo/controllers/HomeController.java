package com.robert.springdemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/api")
	public String test() {
		return "Hello World";
	}
	
	@RequestMapping("/api/number")
	public int apiNumber() {
		return 5;
	}
}
