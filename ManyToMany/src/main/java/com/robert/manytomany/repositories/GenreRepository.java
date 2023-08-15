package com.robert.manytomany.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.robert.manytomany.services.models.Genre;

public interface GenreRepository extends CrudRepository<Genre, Long> {
	Optional<Genre> findByName(String name);
}
