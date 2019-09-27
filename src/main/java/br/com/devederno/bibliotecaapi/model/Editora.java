package br.com.devederno.bibliotecaapi.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class Editora extends Entidade {

	@NotBlank(message = "O nome e obrigatório")
	private String nome;

	public Editora() {
		super();
	}

	public Editora(@NotBlank(message = "O nome e obrigatório") String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
