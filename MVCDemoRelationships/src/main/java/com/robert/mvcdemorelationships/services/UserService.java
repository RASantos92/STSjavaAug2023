package com.robert.mvcdemorelationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.robert.mvcdemorelationships.models.User;
import com.robert.mvcdemorelationships.repositories.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepo;
	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	
	
	public List<User> findAll(){
		return  userRepo.findAll();
	}
	
	public User getUser(Long id) {
		Optional<User> opUser = userRepo.findById(id);
		return opUser.isPresent() ? opUser.get() : null;
	}
	
	public User create(User registeringUser) {
		return userRepo.save(registeringUser);
	}

}
