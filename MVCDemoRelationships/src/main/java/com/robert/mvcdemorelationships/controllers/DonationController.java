package com.robert.mvcdemorelationships.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.robert.mvcdemorelationships.models.Donation;
import com.robert.mvcdemorelationships.services.DonationService;
import com.robert.mvcdemorelationships.services.UserService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/donations")
public class DonationController {
	
	private final DonationService donationServ;
	private final UserService userServ;
	public DonationController(DonationService donationServ, UserService userServ) {
		this.donationServ = donationServ;
		this.userServ = userServ;
	}
	
	@GetMapping("/create")
	public String createDonation(@ModelAttribute("donation") Donation donation, Model model) {
		model.addAttribute("allUsers", userServ.findAll());
		return "donation/create.jsp";
	}
	
	@PostMapping("")
	public String createDonation(@Valid @ModelAttribute("donation") Donation donation, BindingResult result,Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allUsers", userServ.findAll());
			return "donation/create.jsp";
		}
		donationServ.create(donation);
		return "redirect:/";
	}
	
	@GetMapping("/edit/m/{id}")
	public String editDonation(@PathVariable("id") Long id, Model model) {
		model.addAttribute("donation", donationServ.getOne(id));
		return "donation/edit.jsp";
	}
	
	@PatchMapping("/{id}")
	public String processEditDonation(@Valid @ModelAttribute("donation") Donation donation, BindingResult result) {
		if(result.hasErrors()) {
			return "donation/edit.jsp";
		}
		donationServ.editOne(donation);
		return "redirect:/";
	}
	
	
	@DeleteMapping("/{id}")
	public String deleteDonation(@PathVariable("id") Long id) {
		donationServ.delete(id);
		return "redirect:/";
	}

	
	
	
	
	
	
	
	
	
	
}
