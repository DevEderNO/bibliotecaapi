package br.com.devederno.bibliotecaapi.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Cliente extends Entidade{
	
	@NotBlank(message = "O nome e obrigatório")
	private String nome;
	
	@NotBlank(message = "O cpf e obrigatório")
	private String cpf;
	
	@NotBlank(message = "O email e obrigatório")
	private String email;
	private String telefone;
	
	@ManyToOne
	@JoinColumn(name = "endereco_id")
	@NotNull(message = "O endereco e obrigatório")
	private Endereco endereco;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(@NotBlank(message = "O nome e obrigatório") String nome,
			@NotBlank(message = "O cpf e obrigatório") String cpf,
			@NotBlank(message = "O email e obrigatório") String email, String telefone,
			@NotNull(message = "O endereco e obrigatório") Endereco endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
