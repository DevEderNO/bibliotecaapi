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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sexo != other.sexo)
			return false;
		return true;
	}
}
