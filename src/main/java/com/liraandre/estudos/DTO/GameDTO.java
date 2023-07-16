package com.liraandre.estudos.DTO;

import org.springframework.beans.BeanUtils;

import com.liraandre.estudos.entities.Game;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@NoArgsConstructor
@Getter
@Setter
public class GameDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	public GameDTO(Game entity) {
		
		BeanUtils.copyProperties(entity, this);
	}

	
	
}
