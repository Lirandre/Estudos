package com.liraandre.estudos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liraandre.estudos.DTO.GameMinDTO;
import com.liraandre.estudos.services.GameServices;

@RestController //Define a classe como um controlador
@RequestMapping(value = "/games") //Faz o mapeamento (Endereço)

public class GameController {
	
	@Autowired
	private GameServices gameService;
	
	@GetMapping
		public List <GameMinDTO> findAll(){
		
		List<GameMinDTO> result = gameService.findAll();
		return result;
		
	}

}
