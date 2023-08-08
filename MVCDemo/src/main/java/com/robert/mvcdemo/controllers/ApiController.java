package com.robert.mvcdemo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.robert.mvcdemo.models.Donation;
import com.robert.mvcdemo.services.DonationService;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	private final DonationService donationServ;

	public ApiController(DonationService donationServ) {
		this.donationServ = donationServ;
	}
	
	@GetMapping("/donations")
	public List<Donation> getAllDonations(){
		return donationServ.getAll();
	}
	
	@PostMapping("/donations")
	public Donation createDonation(@RequestParam("donationName") String donationName, @RequestParam("donor") String donor, @RequestParam("quantity") Integer quantity) {
		Donation newDonation = new Donation(donationName, donor, quantity);
		
		return donationServ.create(newDonation);
	}
	
	//-------------FIND ONE (/donations/{id})----------------
	@GetMapping("/donations/{id}")
	public Donation getOneDonation(@PathVariable("id") Long id) {
		return donationServ.getOne(id);
	}
	
	
	//-------------Edit (/donations/{id})----------------
	// 1. id from @PathVariable
	// 2. data from @RequestParam
	@PatchMapping("/donations/{id}")
	public Donation editDonation(@PathVariable("id") Long id, @RequestParam("donationName") String donationName, @RequestParam("donor") String donor, @RequestParam("quantity") Integer quantity) {
		Donation donationToBeEdited = new Donation(donationName, donor, quantity, id);
		
		return donationServ.editOne(donationToBeEdited);
	}
	
	//-------------Delete (/donations/{id})----------------
	@DeleteMapping("/donations/{id}")
	public String deleteOneDonation(@PathVariable("id") Long id) {
		return donationServ.delete(id);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	

}
