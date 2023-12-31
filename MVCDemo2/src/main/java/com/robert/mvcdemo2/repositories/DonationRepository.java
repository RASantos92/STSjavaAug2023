package com.robert.mvcdemo2.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.robert.mvcdemo2.models.Donation;

@Repository
public interface DonationRepository extends CrudRepository<Donation, Long>{
	
	 List<Donation> findByDonationNameContaining(String search);
}
