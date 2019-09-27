package br.com.devederno.bibliotecaapi.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class Genero extends Entidade {
	
	@NotBlank(message = "A descrição e obrigatoria")
	private String descricao;

	public Genero() {
	}

	public Genero(@NotBlank(message = "A descrição e obrigatoria") String descricao) {
		super();
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
