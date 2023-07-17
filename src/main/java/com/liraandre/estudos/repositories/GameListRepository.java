package com.liraandre.estudos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.liraandre.estudos.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
