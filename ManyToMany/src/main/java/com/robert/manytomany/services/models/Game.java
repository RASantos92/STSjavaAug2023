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
import jakarta.persistence.Transient;

@Entity // declares that it is going to be apart of mysql
@Table(name = "games") // gives the table name of the model
public class Game {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // generates an auto incrementing 
	private Long id;
	
	private String title;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
	    name = "games_genres", 
	    joinColumns = @JoinColumn(name = "game_id"), 
	    inverseJoinColumns = @JoinColumn(name = "genre_id")
	)
	private List<Genre> genres;
	
	@Transient
	private String formGenres;

	public Game() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}

	public String getFormGenres() {
		return formGenres;
	}

	public void setFormGenres(String formGenres) {
		this.formGenres = formGenres;
	}
	
	
	

}
