package com.robert.mvcdemorelationships.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.robert.mvcdemorelationships.models.Donation;

@Repository
public interface DonationRepository extends CrudRepository<Donation, Long>{

}
