package com.robert.manytomany.services.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity // declares that it is going to be apart of mysql
@Table(name = "genres") // gives the table name of the model
public class Genre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // generates an auto incrementing 
	private Long id;
	
	private String name;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
	    name = "games_genres", 
	    joinColumns = @JoinColumn(name = "genre_id"), 
	    inverseJoinColumns = @JoinColumn(name = "game_id")
	)
	private List<Game> games;

	public Genre() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}
	
	

}
