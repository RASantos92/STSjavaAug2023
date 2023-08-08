package com.robert.mvcdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.robert.mvcdemo.services.DonationService;

@Controller
public class HomeController {

	private final DonationService donationServ;
	public HomeController(DonationService donationServ) {
		this.donationServ = donationServ;
	}
	
	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		model.addAttribute("allDonations", this.donationServ.getAll());
		return "donations/showAll.jsp";
	}
	
	@GetMapping("/show/one/donation/{id}")
	public String showOneDonation(Model model, @PathVariable("id") Long id) {
		model.addAttribute("oneDonation", this.donationServ.getOne(id));
		return "donations/showOne.jsp";
	}

}
