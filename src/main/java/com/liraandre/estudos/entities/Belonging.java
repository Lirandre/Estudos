package com.liraandre.estudos.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "tb_belonging")
@NoArgsConstructor
@Getter
public class Belonging {
	
	@EmbeddedId
	private BelongingPK id = new BelongingPK();
	
	private Integer position;

	public Belonging(Game game, GameList list, Integer position) {
		
		this.id.setGame( game);
		this.position = position;
	}
	
	
}
