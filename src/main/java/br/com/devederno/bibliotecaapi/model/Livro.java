package br.com.devederno.bibliotecaapi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Livro extends Entidade {
	
	@NotBlank(message = "O nome e obrigatório")
	private String nome;
	
	@NotNull(message = "O volume e obrigatório")
	private Integer volume;
	
	@NotNull(message = "A data de publicação e obrigatória")
	private LocalDate dataPublicacao;
	
	@NotNull(message = "O valor e obrigatório")
	private BigDecimal valor;
	
	@ManyToOne
	@JoinColumn(name = "genero_id")
	@NotNull(message = "O genero e obrigatório")
	private Genero genero;
	
	@ManyToOne
	@JoinColumn(name = "editora_id")
	@NotNull(message = "A editora e obrigatória")
	private Editora editora;
	
	@ManyToOne
	@JoinColumn(name = "autor_id")
	@NotNull(message = "O autor e obrigatório")
	private Autor autor;

	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Livro(@NotBlank(message = "O nome e obrigatório") String nome,
			@NotNull(message = "O volume e obrigatório") Integer volume,
			@NotNull(message = "A data de publicação e obrigatória") LocalDate dataPublicacao,
			@NotNull(message = "O valor e obrigatório") BigDecimal valor,
			@NotNull(message = "O genero e obrigatório") Genero genero,
			@NotNull(message = "A editora e obrigatória") Editora editora,
			@NotNull(message = "O autor e obrigatório") Autor autor) {
		super();
		this.nome = nome;
		this.volume = volume;
		this.dataPublicacao = dataPublicacao;
		this.valor = valor;
		this.genero = genero;
		this.editora = editora;
		this.autor = autor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

}
