package br.com.devederno.bibliotecaapi.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.devederno.bibliotecaapi.types.Sexo;

@Entity
public class Autor extends Entidade {
	
	@NotBlank(message = "O nome e obrigatório")
	private String nome;
	
	@NotNull(message = "O sexo e obrigatório")
	private Sexo sexo;

	public Autor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Autor(@NotBlank(message = "O nome e obrigatório") String nome,
			@NotNull(message = "O sexo e obrigatório") Sexo sexo) {
		super();
		this.nome = nome;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
}
