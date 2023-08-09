package com.robert.mvcdemo2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.robert.mvcdemo2.models.Donation;
import com.robert.mvcdemo2.services.DonationService;

import jakarta.validation.Valid;

@Controller
public class HomeController {

	private final DonationService donationServ;
	public HomeController(DonationService donationServ) {
		this.donationServ = donationServ;
	}
	
	@GetMapping("/dashboard")
	public String dashboard(Model model,@RequestParam(value="search", required=false) String search) {
		if(search == null) {
			model.addAttribute("allDonations", this.donationServ.getAll());
		}else {
			model.addAttribute("allDonations", this.donationServ.searchDonationByDonationName(search));
		}
		
		model.addAttribute("donation", new Donation());
		return "donations/showAll.jsp";
	}
	
	@PostMapping("/donations")
	public String processNewDonation(@Valid @ModelAttribute("donation") Donation newDonation, BindingResult result,Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allDonations", this.donationServ.getAll());
			return "donations/showAll.jsp";
		}
		donationServ.create(newDonation);
		return "redirect:/dashboard";
	}
	
	@GetMapping("/donations/{id}")
	public String showOneDonation(Model model, @PathVariable("id") Long id) {
		model.addAttribute("oneDonation", this.donationServ.getOne(id));
		return "donations/showOne.jsp";
	}
	
	@GetMapping("/donations/new")
	public String newDonation(@ModelAttribute("donation") Donation donation) {
		return "donations/create.jsp";
	}
	

	@GetMapping("/donations/edit/m/{id}")
	public String editDonation(Model model, @PathVariable("id") Long id) {
		model.addAttribute("donation", donationServ.getOne(id));
		
		return "donations/edit.jsp";
	}
	
	@PatchMapping("/donations/{id}")
	public String processEditDonation(@Valid @ModelAttribute("donation") Donation donation, BindingResult result) {
		if(result.hasErrors()) {
			return "donations/edit.jsp";
		}
		donationServ.editOne(donation);
		return "redirect:/dashboard";
	}
	
	@DeleteMapping("/donations/{id}")
	public String deleteDonation(@PathVariable("id") Long id) {
		donationServ.delete(id);
		return "redirect:/dashboard";
	}
	
	
	
	
	
	
	
	
	
	
}
