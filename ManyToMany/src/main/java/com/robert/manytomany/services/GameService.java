package com.robert.manytomany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robert.manytomany.repositories.GameRepository;
import com.robert.manytomany.services.models.Game;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepo;
	
	public Game getOne(Long id) {
		Optional<Game> game = gameRepo.findById(id);
		return game.isPresent() ? game.get() : null;
	}

	public List<Game> getAll() {
		return (List<Game>) gameRepo.findAll();
	}

	public Game create(Game dojo) {
		return gameRepo.save(dojo);
	}

	public Game update(Game dojo) {
		return gameRepo.save(dojo);
	}

	public void delete(Long id) {
		gameRepo.deleteById(id);
	}

}
