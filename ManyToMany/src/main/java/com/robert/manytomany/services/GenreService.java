package com.robert.manytomany.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robert.manytomany.repositories.GameRepository;
import com.robert.manytomany.repositories.GenreRepository;
import com.robert.manytomany.services.models.Game;
import com.robert.manytomany.services.models.Genre;

@Service
public class GenreService {

	@Autowired
	private GenreRepository genreRepo;
	
	@Autowired
	private GameRepository gameRepo;
	
	public Genre getOne(Long id) {
		Optional<Genre> genre = genreRepo.findById(id);
		return genre.isPresent() ? genre.get() : null;
	}

	public List<Genre> getAll() {
		return (List<Genre>) genreRepo.findAll();
	}

	public Genre create(Genre dojo) {
		return genreRepo.save(dojo);
	}

	public Genre update(Genre dojo) {
		return genreRepo.save(dojo);
	}

	public void delete(Long id) {
		genreRepo.deleteById(id);
	}
//	*************************create game with genre logic****************************
	
	public Genre getOneGenre(String genreName) {
		Optional<Genre> genre = genreRepo.findByName(genreName);
		return genre.isPresent() ? genre.get() : null;
	}
	
	public Genre createGenreIfNotInDatabase(String genreName) {
		if(this.getOneGenre(genreName) == null) {
			Genre newGenre = new Genre();
			newGenre.setName(genreName);
			return genreRepo.save(newGenre);
		}
		return this.getOneGenre(genreName);
	}
	
	
	public Game createGameWithGenre(Game game) {
		String[] genresFromForm = game.getFormGenres().split(",");
		ArrayList<Genre> genresToBeAdded = new ArrayList<Genre>();
		for(String genre: genresFromForm) {
			genresToBeAdded.add(this.createGenreIfNotInDatabase(genre));
		}
		game.setGenres(genresToBeAdded);
		return gameRepo.save(game);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
