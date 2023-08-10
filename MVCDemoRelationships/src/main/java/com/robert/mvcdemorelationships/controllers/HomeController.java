package com.robert.mvcdemorelationships.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String home(Model model) {
		model.addAttribute("allDonations", donationServ.getAll());
		model.addAttribute("allUsers", userServ.findAll());
		return "home/dashboard.jsp";
	}

}
