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
	
}
