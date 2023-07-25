package com.liraandre.estudos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liraandre.estudos.DTO.GameListDTO;
import com.liraandre.estudos.DTO.GameMinDTO;
import com.liraandre.estudos.services.GameListServices;
import com.liraandre.estudos.services.GameServices;

@RestController //Define a classe como um controlador
@RequestMapping(value = "/lists") //Faz o mapeamento (Endereço)

public class GameListController {
	
	@Autowired 
	private GameListServices gameListService;
	
	
	@Autowired 
	private GameServices gameService;
	
	@GetMapping
		public List <GameListDTO> findAll(){
		
		List<GameListDTO> result = gameListService.findAll();
		return result;
		
	}
	@GetMapping(value = "/{id}")
	public GameListDTO findById(@PathVariable Long id){
		 GameListDTO result = gameListService.findById(id);
		 return result;
		
	}
	@GetMapping(value = "/{listId}/games")
	public List <GameMinDTO> findByGameList(@PathVariable Long listId){
		List <GameMinDTO> result = gameService.findByGameList(listId);
		return result;
		
	}

}
