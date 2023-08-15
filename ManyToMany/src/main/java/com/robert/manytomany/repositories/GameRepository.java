package com.robert.manytomany.repositories;

import org.springframework.data.repository.CrudRepository;

import com.robert.manytomany.services.models.Game;

public interface GameRepository extends CrudRepository<Game, Long>{

}
