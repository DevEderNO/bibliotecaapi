package br.com.devederno.bibliotecaapi.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class Endereco extends Entidade {
	
	@NotBlank(message = "A rua e obrigatória")
	private String rua;
	
	@NotBlank(message = "O bairro e obrigatório")
	private String bairro;
	
	private String quadra;
	private String lote;
	private String numero;
	private String complemento;
	
	@NotBlank(message = "A cidade e obrigatória")
	private String cidade;
	
	@NotBlank(message = "O estado e obrigatório")
	private String estado;
	
	@NotBlank(message = "O pais e obrigatório")
	private String pais = "Basil";
	
	public Endereco() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Endereco(@NotBlank(message = "A rua e obrigatória") String rua,
			@NotBlank(message = "O bairro e obrigatório") String bairro, String quadra, String lote, String numero,
			String complemento, @NotBlank(message = "A cidade e obrigatória") String cidade,
			@NotBlank(message = "O estado e obrigatório") String estado,
			@NotBlank(message = "O pais e obrigatório") String pais) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.quadra = quadra;
		this.lote = lote;
		this.numero = numero;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getQuadra() {
		return quadra;
	}

	public void setQuadra(String quadra) {
		this.quadra = quadra;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((lote == null) ? 0 : lote.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		result = prime * result + ((quadra == null) ? 0 : quadra.hashCode());
		result = prime * result + ((rua == null) ? 0 : rua.hashCode());
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
		Endereco other = (Endereco) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (lote == null) {
			if (other.lote != null)
				return false;
		} else if (!lote.equals(other.lote))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		if (quadra == null) {
			if (other.quadra != null)
				return false;
		} else if (!quadra.equals(other.quadra))
			return false;
		if (rua == null) {
			if (other.rua != null)
				return false;
		} else if (!rua.equals(other.rua))
			return false;
		return true;
	}
	
}
