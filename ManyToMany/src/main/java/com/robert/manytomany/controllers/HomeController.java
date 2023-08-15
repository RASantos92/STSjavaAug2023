package com.robert.manytomany.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.robert.manytomany.services.GameService;
import com.robert.manytomany.services.GenreService;
import com.robert.manytomany.services.models.Game;

import jakarta.validation.Valid;

@Controller
public class HomeController {

	@Autowired
	private GameService gameServ;
	
	@Autowired
	private GenreService genreServ;
	
	
	@GetMapping("/")
	public String index(@ModelAttribute("game") Game game) {
		return "createGameWithGenre.jsp";
	}
	
	@PostMapping("/game/create/genre")
	public String createGameWithGenre(@Valid @ModelAttribute("game") Game game, BindingResult result) {
		if(result.hasErrors()) {
			return "createGameWithGenre.jsp";
		}
		genreServ.createGameWithGenre(game);
		return "redirect:/";
	}

}
