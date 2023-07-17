package com.liraandre.estudos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.liraandre.estudos.DTO.GameListDTO;
import com.liraandre.estudos.entities.GameList;
import com.liraandre.estudos.repositories.GameListRepository;

@Service
public class GameListServices {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public GameListDTO findById(Long id ){
		
		GameList result = gameListRepository.findById(id).get();
		return new GameListDTO(result);
		
		
	}
	@Transactional(readOnly = true)
	public List <GameListDTO> findAll(){
		
		List <GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
		
		
	}

}