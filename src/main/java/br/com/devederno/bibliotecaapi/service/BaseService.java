package br.com.devederno.bibliotecaapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devederno.bibliotecaapi.model.Entidade;

public class BaseService<E extends Entidade,R extends JpaRepository<E, Long>> implements BaseServiceInterface<E> {
	
	@Autowired
	private R repository;
	
	@Transactional
	public E inserir(E entidade) {
		entidade.setId(null);
		return repository.save(entidade);
	}
	
	public E pesquisarPorId(Long id) {
		return repository.findById(id).orElseThrow(()-> new EmptyResultDataAccessException(1));
	}
	
	@Transactional
	public E alterar(E entidade,Long id) {
		E entidadePesquisada = pesquisarPorId(id);
		BeanUtils.copyProperties(entidade, entidadePesquisada,"id");
		return repository.save(entidadePesquisada);
	}
	
	@Transactional
	public void excluir(Long id) {
		repository.deleteById(id);
	}
	
	public List<E> listar(){
		return repository.findAll();
	}

}
