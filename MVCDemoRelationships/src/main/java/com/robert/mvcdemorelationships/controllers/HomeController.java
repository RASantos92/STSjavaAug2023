package com.robert.mvcdemorelationships.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.robert.mvcdemorelationships.services.DonationService;
import com.robert.mvcdemorelationships.services.UserService;

@Controller
public class HomeController {
	private final DonationService donationServ;
	private final UserService userServ;
	public HomeController(DonationService donationServ,UserService userServ) {
		this.donationServ = donationServ;
		this.userServ = userServ;
	}
	
	@GetMapping("/")
	public String home() {
		return "home/dashboard.jsp";
	}

}
