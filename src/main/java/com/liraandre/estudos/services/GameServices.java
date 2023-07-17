package com.liraandre.estudos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.liraandre.estudos.DTO.GameDTO;
import com.liraandre.estudos.DTO.GameMinDTO;
import com.liraandre.estudos.entities.Game;
import com.liraandre.estudos.repositories.GameRepository;

@Service
public class GameServices {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id ){
		
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
		
		
	}

	
	public List <GameMinDTO> findAll(){
		
		List <Game> result = gameRepository.findAll();
		List <GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
		
	}

}