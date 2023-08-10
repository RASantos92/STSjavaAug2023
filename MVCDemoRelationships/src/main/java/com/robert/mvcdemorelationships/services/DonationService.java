package com.robert.mvcdemorelationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.robert.mvcdemorelationships.models.Donation;
import com.robert.mvcdemorelationships.repositories.DonationRepository;

@Service
public class DonationService {
	
	private final DonationRepository donationRepo;
	
	public DonationService(DonationRepository donationRepo) {
		this.donationRepo = donationRepo;
	}
	
	public List<Donation> getAll(){
		return (List<Donation>) donationRepo.findAll();
	}
	
	public Donation create(Donation donation) {
		return donationRepo.save(donation);
	}
	
	public Donation getOne(Long id) {
		Optional<Donation> optionalDonation = donationRepo.findById(id);
		return optionalDonation.isPresent() ? optionalDonation.get() : null;
	}
	
	public Donation editOne(Donation donation) {
		return donationRepo.save(donation);
	}
	
	public String delete(Long id) {
		donationRepo.deleteById(id);
		return id + " has been deleted";
	}
	
	

}
