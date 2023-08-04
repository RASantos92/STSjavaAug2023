package com.robert.routesspringdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouteController {
	// query parameter: ...search?keyword=whatever&count=5 / usually seen when you send form information through a get request
    // localhost:8080/search?keyword=whatever
	@RequestMapping("/search")
	public String searchKeyword(@RequestParam("keyword") String keywordInMethod) {
		return "You are searching for: " + keywordInMethod;
	}
	
	// localhost:8080/search?name=pepper&age=3
    // example: 2 with required params
	@RequestMapping("/pet")
	public String getPet(@RequestParam("name") String name, @RequestParam("age") int age) {
		return "Your pet " + name + " is " + age + "years old" ;
	}
	
	// what if we want to make the params optional, what do we do?
    // example: 3
	@GetMapping("/optional/pet")
	public String getPetOptional(@RequestParam(value="name", required=false) String petName, @RequestParam(value="age", required=false) Integer age ) {
		return "Your pet " + petName + " is " + age + " years old" ;
	}
	
	//https://login.codingdojo.com/m/315/9532/64273
	@RequestMapping("/path/m/{name}/{color}")
	public String petWithColor(@PathVariable("name") String petName, @PathVariable("color") String color) {
		return petName + " is " + color;
	}

}
