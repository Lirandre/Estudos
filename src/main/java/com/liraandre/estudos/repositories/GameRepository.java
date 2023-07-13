package com.liraandre.estudos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.liraandre.estudos.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
