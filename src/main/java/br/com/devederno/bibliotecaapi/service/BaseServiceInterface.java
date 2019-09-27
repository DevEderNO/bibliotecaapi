package br.com.devederno.bibliotecaapi.service;

import java.util.List;

import br.com.devederno.bibliotecaapi.model.Entidade;

public interface BaseServiceInterface<E extends Entidade> {

	E inserir(E entidade);
	E pesquisarPorId(Long id);
	E alterar(E entidade,Long id);
	void excluir(Long id);
	List<E> listar();
}
