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
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
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
		Genero other = (Genero) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		return true;
	}
	
}
