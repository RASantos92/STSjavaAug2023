package com.robert.jstldemo.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/java/demo")
	public String demo() {
		return "index.jsp";
	}
	
	@GetMapping("/java/jstl/demo")
	public String jstlDemo(Model model) {
		String name = "Austin";
		Integer age = 26;
		Boolean isHungry = true;
		model.addAttribute("name", name);
		model.addAttribute("ageFromController", age);
		model.addAttribute("isHungry", isHungry);
		model.addAttribute("test", "<script></script>");
		
		ArrayList<String> users = new ArrayList<String>();
		users.add("Isaiah Smyth");
		users.add("Ryan Nam");
		users.add("Sylvia Dang");
		users.add("Austin Serb");
		
		model.addAttribute("users", users);
		
		return "jstlDemo.jsp";
	}
}
