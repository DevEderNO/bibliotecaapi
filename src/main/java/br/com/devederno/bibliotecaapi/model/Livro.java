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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((dataPublicacao == null) ? 0 : dataPublicacao.hashCode());
		result = prime * result + ((editora == null) ? 0 : editora.hashCode());
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		result = prime * result + ((volume == null) ? 0 : volume.hashCode());
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
		Livro other = (Livro) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (dataPublicacao == null) {
			if (other.dataPublicacao != null)
				return false;
		} else if (!dataPublicacao.equals(other.dataPublicacao))
			return false;
		if (editora == null) {
			if (other.editora != null)
				return false;
		} else if (!editora.equals(other.editora))
			return false;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		if (volume == null) {
			if (other.volume != null)
				return false;
		} else if (!volume.equals(other.volume))
			return false;
		return true;
	}

}
