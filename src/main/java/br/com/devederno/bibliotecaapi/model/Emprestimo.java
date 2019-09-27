package br.com.devederno.bibliotecaapi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Emprestimo extends Entidade {

	@NotNull(message = "A data do emprestimo e obrigatória")
	private LocalDate dataDoEmprestimo;
	
	@NotNull(message = "A data de devolucao e obrigatória")
	private LocalDate dataDaDevolucao;
	
	@NotNull(message = "O valor do emprestimo e obrigatório")
	private BigDecimal valorDoEmprestimo;
	
	@ManyToOne
	@JoinColumn(name = "livro_id")
	@NotNull(message = "O livro e obrigatório")
	private Livro livro;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	@NotNull(message = "O cliente e obrigatório")
	private Cliente cliente;

	public Emprestimo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emprestimo(@NotNull(message = "A data do emprestimo e obrigatória") LocalDate dataDoEmprestimo,
			@NotNull(message = "A data de devolucao e obrigatória") LocalDate dataDaDevolucao,
			@NotNull(message = "O valor do emprestimo e obrigatório") BigDecimal valorDoEmprestimo,
			@NotNull(message = "O livro e obrigatório") Livro livro,
			@NotNull(message = "O cliente e obrigatório") Cliente cliente) {
		super();
		this.dataDoEmprestimo = dataDoEmprestimo;
		this.dataDaDevolucao = dataDaDevolucao;
		this.valorDoEmprestimo = valorDoEmprestimo;
		this.livro = livro;
		this.cliente = cliente;
	}

	public LocalDate getDataDoEmprestimo() {
		return dataDoEmprestimo;
	}

	public void setDataDoEmprestimo(LocalDate dataDoEmprestimo) {
		this.dataDoEmprestimo = dataDoEmprestimo;
	}

	public LocalDate getDataDaDevolucao() {
		return dataDaDevolucao;
	}

	public void setDataDaDevolucao(LocalDate dataDaDevolucao) {
		this.dataDaDevolucao = dataDaDevolucao;
	}

	public BigDecimal getValorDoEmprestimo() {
		return valorDoEmprestimo;
	}

	public void setValorDoEmprestimo(BigDecimal valorDoEmprestimo) {
		this.valorDoEmprestimo = valorDoEmprestimo;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
